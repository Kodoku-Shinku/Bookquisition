package mx.uam.tsis.bookquisition.servicios;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import mx.uam.tsis.bookquisition.negocio.LibroService;
import mx.uam.tsis.bookquisition.negocio.UsuarioService;
import mx.uam.tsis.bookquisition.negocio.dominio.Libro;
import mx.uam.tsis.bookquisition.negocio.dominio.Usuario;

/*
 * Controlador para el API rest
 * 
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LibroRestController {

	@Autowired
	private LibroService servicioLibro;
	@Autowired
	private UsuarioService servicioUsuario;

	
	/**
	 *  Metodo para obtener todos los Libros
	 */
    @RequestMapping(value="/libros", method=RequestMethod.GET)
    public Collection<Libro> dameLibros() {
        return servicioLibro.dameLibros();
    }
    
    /**
     * Metodo para obtener un usuario, mediante el url /libros/{titulo}
     * 
     * 
     * @param titulo
     * @return Libro
     */
    @RequestMapping(value="/libros/{titulo}", method=RequestMethod.GET)
    public Libro dameLibro(@PathVariable String titulo) {
        Libro libro = servicioLibro.dameLibro(titulo);
       	return libro;
    }
    
    
    @RequestMapping(value="/libros", method = RequestMethod.POST)
	public ResponseEntity<Libro> agregarLibro(@RequestBody Libro libro) {
	    	
    	//Invocar addAlumno en el servicio
        boolean retorno = servicioLibro.agregarLibro(libro);
		if(retorno) {
    		return new ResponseEntity<Libro>(libro, HttpStatus.CREATED);
    	} else {
    		return new ResponseEntity<Libro>(libro, HttpStatus.BAD_REQUEST);
    	}
	}
    
    @RequestMapping(value="/libros/{correo}", method = RequestMethod.PUT)
	public ResponseEntity<Libro> agregarLibro(@RequestBody Libro libro, @PathVariable String correo) {
	    	
    	//Invocar addAlumno en el servicio
        boolean retorno = servicioLibro.agregarLibro(libro);
		if(retorno) {
			servicioUsuario.agregarLibroAUsuario(correo, libro);
    		return new ResponseEntity<Libro>(libro, HttpStatus.CREATED);
    	} else {
    		return new ResponseEntity<Libro>(libro, HttpStatus.BAD_REQUEST);
    	}
	}
    
    @RequestMapping(value="/libros/{titulo}", method = RequestMethod.DELETE)
    public ResponseEntity<Libro> eliminarLibro(@PathVariable String titulo) {
	    	
	    	//Invocar addAlumno en el servicio
	        boolean retorno = servicioLibro.eliminarLibro(titulo);
			if(retorno) {
	    		return new ResponseEntity<Libro>(HttpStatus.OK);
	    	} else {
	    		return new ResponseEntity<Libro>( HttpStatus.NOT_FOUND);
	    	}
	}
    
}
