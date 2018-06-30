package mx.uam.tsis.bookquisition.datos;

import java.util.Collection;

import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

/**
 * Interface para el DAO de usuario 
 *
 */
public interface UsuarioDAO {
	
	/**
	 * Agrega un usuario a la BD
	 * 
	 * @param usuario
	 * @return true si se agrego exitosamente
	 */
	public boolean create(Usuario usuario);
	
	
}
