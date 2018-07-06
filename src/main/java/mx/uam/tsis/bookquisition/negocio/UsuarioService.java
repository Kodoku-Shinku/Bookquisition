package mx.uam.tsis.bookquisition.negocio;

import java.util.Collection;
import java.util.List;

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
	
	public Usuario getUsuario(String nombre) {
		return repository.findByNombre(nombre);
	}
	
	public List<Usuario> getUsuarios(){
		return repository.findAll();
	}
	
	public boolean agregarUsuario(Usuario usuario) {
		repository.save(usuario);
		return true;
	}
	
	public boolean eliminarUsuario(String nombre) {
		Usuario usuario = repository.findByNombre(nombre);
		if(usuario!= null) {
			repository.delete(usuario);
			return true;
		}else
		return true;
	}
	
}
