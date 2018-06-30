package mx.uam.tsis.bookquisition.negocio.dominio;

/**
 * Entidad del modelo de dominio
 * 
 */
public class Alumno {
	private String nombre;
	
	private int matricula;
	
	/**
	 * Constructor por default
	 */
	public Alumno() {
	}
	
	public Alumno(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
	}
	
	/**
	 * Cambia el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna la matricula
	 * @param matricula
	 */
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}

}
