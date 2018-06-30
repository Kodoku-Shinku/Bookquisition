package mx.uam.tsis.bookquisition.servicios;

import java.util.Collection;

import mx.uam.tsis.bookquisition.negocio.AlumnoService;
import mx.uam.tsis.bookquisition.negocio.dominio.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * Controlador para el API rest
 * 
 */
@RestController
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService servicioAlumnos;

	/**
	 *  Metodo para obtener todos los alumnos 
	 */
    @RequestMapping(value="/alumnos", method=RequestMethod.GET)
    public Collection <Alumno> dameAlumnos() {
        return servicioAlumnos.getAlumnos();
    }

	
    /**
     * Metodo para obtener un alumno, mediante el url /alumnos/{matricula}
     * 
     * 
     * @param matricula
     * @return
     */
    @RequestMapping(value="/alumnos/{matricula}", method=RequestMethod.GET)
    public Alumno buscaAlumno(@PathVariable int matricula) {
        Alumno al = servicioAlumnos.getAlumno(matricula);
       	return al;
    }
    
    @RequestMapping(value="/alumnos", method = RequestMethod.POST)
    public ResponseEntity<Alumno> agregaAlumno(@RequestBody Alumno alumno) {
    	
    	//Invocar addAlumno en el servicio
    	boolean retorno = servicioAlumnos.addAlumno(alumno);
    	if(retorno) {
    		return new ResponseEntity<Alumno>(alumno, HttpStatus.CREATED);
    		} else {
    			return new ResponseEntity<Alumno>(alumno, HttpStatus.BAD_REQUEST);
    		}
    }

}