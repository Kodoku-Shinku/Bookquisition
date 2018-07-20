package mx.uam.tsis.bookquisition.negocio.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidad del modelo de dominio
 * 
 */
@Entity
public class Libro {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	
	private String autor;
	
	private String descripcion;
	
	private String genero;
	
	private String imagen;
	
	/**
	 * Constructor por default
	 */
	public Libro() {
	}

	public Libro(String titulo, String autor, String descripcion, String genero, String imagen) {
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
		this.genero = genero;
		this.imagen = imagen ;
	}
	
	/**
	 * Devuelve el Uri de la imagen del libro
	 * @return Uri de la imagen
	 */
	public String getImagen() {
		return imagen;
	}
	/**
	 * Asigna el Uri de la imagen  del libro
	 * @param Uri
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	/**
	 * Devuelve el titulo del libro
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	

	/**
	 * Devuelve el autor del libro
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * Devuelve la descripcion del libro
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * devuelve el genero del libro
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Asigna el titulo del libro
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Asigna el autor del libro
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Asigna la descripcion del libro
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Asigna el genero del libro
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
