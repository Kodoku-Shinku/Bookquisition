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

}