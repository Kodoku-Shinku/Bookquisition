package mx.uam.tsis.bookquisition.negocio.dominio;

/**
 * Entidad del modelo de dominio
 * 
 */
public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String descripcion;
	private String genero;
	
	/**
	 * Constructor por default
	 */
	public Libro() {
	}

	public Libro(int id, String titulo, String autor, String descripcion, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
		this.genero = genero;
	}
	/**
	 * Devuelve el id
	 * @return id
	 */
	public int getId() {
		return id;
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
	 * Asigna el id del libro
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
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
