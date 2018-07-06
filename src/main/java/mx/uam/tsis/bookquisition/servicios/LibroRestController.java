package mx.uam.tsis.bookquisition.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.uam.tsis.bookquisition.negocio.LibroService;
import mx.uam.tsis.bookquisition.negocio.dominio.Libro;
import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

/*
 * Controlador para el API rest
 * 
 */
@RestController
public class LibroRestController {

	@Autowired
	private LibroService servicioLibro;

	
	/**
	 *  Metodo para obtener todos los Libros
	 */
    @RequestMapping(value="/libros", method=RequestMethod.GET)
    public List<Libro> dameUsuarios() {
        return servicioLibro.getLibros();
    }
    
    /**
     * Metodo para obtener un usuario, mediante el url /libros/{titulo}
     * 
     * 
     * @param titulo
     * @return Libro
     */
    @RequestMapping(value="/libros/{titulo}", method=RequestMethod.GET)
    public Libro buscaAlumno(@PathVariable String titulo) {
        Libro libro = servicioLibro.getLibro(titulo);
       	return libro;
    }
    
    
    @RequestMapping(value="/libros", method = RequestMethod.POST)
	public ResponseEntity<Libro> agregarUsuario(@RequestBody Libro libro) {
	    	
	    	//Invocar addAlumno en el servicio
	        boolean retorno = servicioLibro.agregarLibro(libro);
			if(retorno) {
	    		return new ResponseEntity<Libro>(libro, HttpStatus.CREATED);
	    	} else {
	    		return new ResponseEntity<Libro>(libro, HttpStatus.BAD_REQUEST);
	    	}
	}
    
}
