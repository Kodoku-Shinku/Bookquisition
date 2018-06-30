package mx.uam.tsis.bookquisition.negocio;

import java.util.Collection;

import mx.uam.tsis.bookquisition.datos.AlumnoDAO;
import mx.uam.tsis.bookquisition.negocio.dominio.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * En este servicio se lleva a cabo toda la logica de negocio
 * relacionada con los alumnos
 * 
 *
 */
@Service
public class AlumnoService {
	
	@Autowired
	private AlumnoDAO dao;
	
	/**
	 * Recupera un alumno a partir de la matricula
	 * 
	 * @param matricula
	 * @return el alumno o null
	 */
	public Alumno getAlumno(int matricula) {
		// reglas de negocio se aplican aqui
		return dao.retrieve(matricula);
	}
	
	/**
	 * Recupera todos los alumnos
	 * 
	 * @return coleccion de alumnos
	 */
	public Collection<Alumno> getAlumnos() {
		// reglas de negocio se aplican aqui
		return dao.retrieveAll();
	}
	/**
	 * Agrega un alumno
	 * 
	 * @param alumno El alumno a agregar
	 * @return true si se agrego exitosamente, false sino
	 */
	public boolean addAlumno(Alumno alumno) {
		
		// Agregar al alumno al mecanismo de persistencia tomando en 
        // cuenta la siguiente regla de negocio: No se puede 
        // agregar un alumno con la misma matricula más de una vez
		Alumno al = dao.retrieve(alumno.getMatricula());
		if (al == null) {
			return dao.create(alumno);
		}else {
			return false;
		}
	}
}
