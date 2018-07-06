package mx.uam.tsis.bookquisition.negocio;

import java.util.Collection;

import mx.uam.tsis.bookquisition.datos.UsuarioDAO;
import mx.uam.tsis.bookquisition.datos.UsuarioRepository;
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
		    	System.out.println(usuario.getNombreUsuario());
		    	System.out.println("clase usuario servicio");
		    	repository.save(usuario);
			    return true;
		    }else {
		    	System.out.println(usuarioAux.getNombreUsuario());
		    	System.out.println("El alumno existe o no se creo exitosamente");
		    	return false;
		    }
		    

	}

	public Collection<Usuario> dameUsuario() {
		//Recupera a todos los usuario regisgtrados 
		return repository.findAll();
	}

	public Usuario dameUsuario(String nombreUsuario) {
		Usuario usuario = repository.findByNombreUsuario(nombreUsuario);
		return usuario;
	}

	public boolean eliminarUsuario(String nombreUsuario) {
		System.out.println("AlumnoService remove");
	    //recupera al alumno por la matricula independientemente del nombre, puesto que la maatricula es unica
	    Usuario usuarioAux=repository.findByNombreUsuario(nombreUsuario);
	    if (usuarioAux!=null){
	    	repository.delete(usuarioAux);
	    	
	    	System.out.println("El alumno se borro exitosamente");
	    	return true;
	    }else {
	    	System.out.println("Fallo al eliminar alumno");
	    	return false;
	    }
		
	}
	
}
