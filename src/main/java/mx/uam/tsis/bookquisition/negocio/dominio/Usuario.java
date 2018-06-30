package mx.uam.tsis.bookquisition.negocio.dominio;

/**
 * Entidad del modelo de dominio
 * 
 */
public class Usuario {
	private int id;
	private String nombre;
	private String correo;
	private int contrasena;
	
	/**
	 * Constructor por default
	 */
	public Usuario() {
	}
	
	public Usuario(int id, String nombre, String correo, int contrasena) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
	}
	/**
	 * Devuelve el id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Asigna un id
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Devuelve el nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el correo
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * Asigna el correo
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * Devuelve la contrasena
	 * @return contrasena
	 */
	public int getContrasena() {
		return contrasena;
	}
	/**
	 * Asigna la contrasena
	 * @param contrasena
	 */
	public void setContrasena(Integer contrasena) {
		this.contrasena = contrasena;
	}

}
