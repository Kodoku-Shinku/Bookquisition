package mx.uam.tsis.bookquisition.negocio;

import java.util.Collection;

import mx.uam.tsis.bookquisition.datos.UsuarioDAO;
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
	private UsuarioDAO dao;
	
}
