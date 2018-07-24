package mx.uam.tsis.bookquisition.datos;


import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	Usuario findByNombre(String nombre);
	
				
	Usuario findByNombreUsuario(String nombreUsuario);
    
	/**
     * Regresa una coleccion que contiene a todos los usuario
     * 
     */
    Collection<Usuario> findAll();


	Usuario findByCorreo(String correo);


}
