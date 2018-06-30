package mx.uam.tsis.bookquisition.presentacion;

import mx.uam.tsis.bookquisition.negocio.UsuarioService;
import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador MVC de la pagina
 * 
 * 
 */
@Controller (value="usuarioController")
public class UsuarioController {
	
	@Autowired
	private UsuarioService servicioUsuario;
       
}