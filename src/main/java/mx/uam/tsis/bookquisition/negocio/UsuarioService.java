package mx.uam.tsis.bookquisition.negocio;

import java.util.Collection;
import java.util.List;

import mx.uam.tsis.bookquisition.datos.UsuarioDAO;
import mx.uam.tsis.bookquisition.datos.UsuarioRepository;
import mx.uam.tsis.bookquisition.negocio.dominio.Libro;
import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * En este servicio se lleva a cabo toda la logica de negocio
 * relacionada con los usuarios
 * 
 *
 */
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	/**
	 * Agrega un usuario
	 * 
	 * @param alumno El usuario a agregar
	 * @return true si se agrego exitosamente, false sino
	 */
	public boolean agregarUsuario(Usuario usuario) {
		    //recupera al usuario por el nombre de usuario registrado
		    Usuario usuarioAux=repository.findByNombreUsuario(usuario.getNombreUsuario());
		    
		    if (usuarioAux==null){
		    	repository.save(usuario);
			    return true;
		    }else {
		    	return false;
		    }
		    

	}

	/**
	 * 
	 * @return todos los usuarios registrados
	 */
	public Collection<Usuario> dameUsuario() {
		//Recupera a todos los usuario regisgtrados 
		return repository.findAll();
	}

	/**
	 * Regresan el usuario con determinado nombbre de usuario
	 * @param nombreUsuario
	 * @return
	 */
	public Usuario dameUsuario(String nombreUsuario) {
		Usuario usuario = repository.findByNombreUsuario(nombreUsuario);
		return usuario;
	}
	
	/**
	 * Regresa al usuario con el email 
	 * @param correo
	 * @param contrasena
	 * @return
	 */
	public Usuario dameUsuarioCorreo(String correo, String contrasena) {
		Usuario usuario = repository.findByCorreo(correo);
		if (usuario != null && usuario.getContrasena().equals(contrasena)){
			return usuario;
		}
		return null;

	}

	
	public boolean eliminarUsuario(String nombreUsuario) {
		System.out.println("AlumnoService remove");
	    //recupera al alumno por la matricula independientemente del nombre, puesto que la maatricula es unica
	    Usuario usuarioAux=repository.findByNombreUsuario(nombreUsuario);
	    if (usuarioAux!=null){
	    	repository.delete(usuarioAux);
	    	
	    	return true;
	    }else {
	    	
	    	return false;
	    }
		
	}
	
	/**
	 * Agrega un libro a un usuario
	 * @param correo
	 * @return true si lo agrega, false si no
	 */
	public boolean agregarLibroAUsuario(String correo, Libro libro){
		Usuario usuario = repository.findByCorreo(correo);
		if (usuario != null) {
			if(!usuario.getLibros().contains(libro)) {
				usuario.getLibros().add(libro);
				repository.save(usuario);
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
}
