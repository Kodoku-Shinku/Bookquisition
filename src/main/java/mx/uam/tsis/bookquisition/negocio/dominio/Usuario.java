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
public class Usuario {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nombre;
	private String correo;
	private String contrasena;
	private String nombreUsuario;
	
	/**
	 * Constructor por default
	 */
	public Usuario() {
	}
	
	public Usuario(String nombre, String correo, String contrasena, String nombreUsuario) {
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.nombreUsuario = nombreUsuario;
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
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * Asigna la contrasena
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	/**
	 * Devuelve el nombre de usuario
	 * @return nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * Asigna el nombre
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

}
