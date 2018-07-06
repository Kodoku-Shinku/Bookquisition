package mx.uam.tsis.bookquisition.datos;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import mx.uam.tsis.bookquisition.negocio.dominio.Libro;


public interface LibroRepository extends CrudRepository<Libro, String>{

	Libro findByTitulo(String Titulo);

	Collection<Libro> findAll();
}
