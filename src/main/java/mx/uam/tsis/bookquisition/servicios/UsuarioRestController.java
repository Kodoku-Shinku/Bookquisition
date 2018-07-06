package mx.uam.tsis.bookquisition.servicios;

import java.util.Collection;
import java.util.List;

import mx.uam.tsis.bookquisition.negocio.UsuarioService;
import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

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
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService servicioUsuario;
	
	/**
	 *  Metodo para obtener todos los usuarios 
	 */
    @RequestMapping(value="/usuarios", method=RequestMethod.GET)
    public List<Usuario> dameUsuarios() {
        return servicioUsuario.getUsuarios();
    }
    
    /**
     * Metodo para obtener un usuario, mediante el url /usuarioss/{nombre}
     * 
     * 
     * @param nombre
     * @return Usuario
     */
    @RequestMapping(value="/usuarios/{nombre}", method=RequestMethod.GET)
    public Usuario buscaAlumno(@PathVariable String nombre) {
        Usuario usuario = servicioUsuario.getUsuario(nombre);
       	return usuario;
    }
    
    @RequestMapping(value="/usuarios", method = RequestMethod.POST)
	public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario) {
	    	
	    	//Invocar addAlumno en el servicio
	        boolean retorno = servicioUsuario.agregarUsuario(usuario);
			if(retorno) {
	    		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	    	} else {
	    		return new ResponseEntity<Usuario>(usuario, HttpStatus.BAD_REQUEST);
	    	}
	}
    
    @RequestMapping(value="/usuarios/{nombre}", method = RequestMethod.DELETE)
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable String nombre) {
	    	
	    	//Invocar addAlumno en el servicio
	        boolean retorno = servicioUsuario.eliminarUsuario(nombre);
			if(retorno) {
	    		return new ResponseEntity<Usuario>(HttpStatus.OK);
	    	} else {
	    		return new ResponseEntity<Usuario>( HttpStatus.NOT_FOUND);
	    	}
	}

}