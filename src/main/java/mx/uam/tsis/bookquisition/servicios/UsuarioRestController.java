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
import org.springframework.web.bind.annotation.CrossOrigin;


/*
 * Controlador para el API rest
 * 
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService servicioUsuario;
    
    
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
    
   

	
	/**
	 *  Metodo para obtener todos los usuario 
	 */
    @RequestMapping(value="/usuarios", method=RequestMethod.GET)
    public Collection <Usuario> dameUsuario() {
        return servicioUsuario.dameUsuario();
    }
    
    /**
     * Metodo para obtener un usuario ,mediante el url /usuario/{nombreUsuario}
     * 
     * 
     * @param nombreUsuario
     * @return
     */
    @RequestMapping(value="/usuario/{nombreUsuario}", method=RequestMethod.GET)
    public Usuario buscaUsuario(@PathVariable String nombreUsuario) {
        Usuario al = servicioUsuario.dameUsuario(nombreUsuario);
       	return al;
    }
    /**
     * Metodo para obtener un usuario, mediante el url /usuario/{correo}/{contrasena}
     * 
     * 
     * @param correo y contraseña
     * @return
     */
    @RequestMapping(value="/usuario/{correo}/{contrasena}", method=RequestMethod.GET)
    public Usuario buscaUsuario(@PathVariable String correo,@PathVariable String contrasena) {
        Usuario usuario = servicioUsuario.dameUsuarioCorreo(correo, contrasena);
        if(usuario != null) {            
            return usuario;
        } else {
            return null;
        }
    }
    
    /**
     * Metodo para eliminar un usuario, mediante el url /usuario/{nombreUsuario}
     * @param nombreUsuario
     * @return
     */
    @RequestMapping(value="/usuario/{nombreUsuario}", method = RequestMethod.DELETE)
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable String nombreUsuario) {
            System.out.println("metodo delete");
            //Invocar addAlumno en el servicio
            boolean retorno = servicioUsuario.eliminarUsuario(nombreUsuario);
            
            if(retorno) {
                System.out.println(HttpStatus.OK.toString());
                return new ResponseEntity<Usuario>(HttpStatus.OK);
            } else {
                return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
            }
    }


}