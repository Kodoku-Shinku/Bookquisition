package mx.uam.tsis.bookquisition.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uam.tsis.bookquisition.datos.LibroRepository;
import mx.uam.tsis.bookquisition.negocio.dominio.Libro;

/**
 * En este servicio se lleva a cabo toda la logica de negocio
 * relacionada con los Libros
 * 
 *
 */
@Service
public class LibroService {

	@Autowired
	private LibroRepository repository;
	
	public Libro getLibro(String titulo) {
		return repository.findByTitulo(titulo);
	}
	
	public List<Libro> getLibros(){
		return repository.findAll();
	}
	
	public boolean agregarLibro(Libro libro) {
		repository.save(libro);
		return true;
	}
	
	public boolean eliminarUsuario(String titulo) {
		Libro libro = repository.findByTitulo(titulo);
		if(libro!= null) {
			repository.delete(libro);
			return true;
		}else
		return false;
	}

}
