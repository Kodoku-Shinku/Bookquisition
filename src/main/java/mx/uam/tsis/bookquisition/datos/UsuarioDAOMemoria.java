package mx.uam.tsis.bookquisition.datos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

/**
 * El DAO
 * 
 */
@Repository (value="UsuarioDAO")
public class UsuarioDAOMemoria implements UsuarioDAO {

	@Override
	public boolean create(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
