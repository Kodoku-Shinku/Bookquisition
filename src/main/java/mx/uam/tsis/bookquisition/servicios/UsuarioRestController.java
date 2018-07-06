package mx.uam.tsis.bookquisition.servicios;

import java.util.Collection;

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
	
	@RequestMapping(value="/usuarios", method = RequestMethod.POST)
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario) {
        System.out.println("metodo post");
        //Invocar addAlumno en el servicio
        System.out.println(usuario.getNombreUsuario());
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
     * Metodo para obtener un alumno, mediante el url /alumnos/{matricula}
     * 
     * 
     * @param matricula
     * @return
     */
    @RequestMapping(value="/usuario/{nombreUsuario}", method=RequestMethod.GET)
    public Usuario buscaUsuario(@PathVariable String nombreUsuario) {
        Usuario al = servicioUsuario.dameUsuario(nombreUsuario);
       	return al;
    }
    
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