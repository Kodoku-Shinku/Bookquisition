package mx.uam.tsis.bookquisition.negocio.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	private String apellido;
	private String correo;
	private String contrasena;
	private String nombreUsuario;
	private String pais;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Libro> libros=null;
	
	/**
	 * Constructor por default
	 */
	
	public Usuario() {
	}
	
	public Usuario(String nombre,String apellido, String correo, String contrasena, String nombreUsuario, String pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
		this.nombreUsuario=nombreUsuario;
		this.pais = pais;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
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
	 * Devuelve el correo
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Devuelve la contrasena
	 * @return contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	
	/**
	 * Asigna el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Asigna el correo
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * Asigna la contrasena
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public void setPais (String pais) {
		this.pais = pais;
	}

	public List<Libro> getLibros() {
		if (libros == null) {
			return libros = new ArrayList<Libro>();
		}else {
			return libros;
		}
		
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}	
	
	


}
