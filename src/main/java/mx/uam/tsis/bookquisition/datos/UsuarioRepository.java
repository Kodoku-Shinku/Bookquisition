package mx.uam.tsis.bookquisition.datos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByNombre(String nombre);
	
	List<Usuario> findAll();

}
