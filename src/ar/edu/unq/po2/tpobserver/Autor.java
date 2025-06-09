package ar.edu.unq.po2.tpobserver;

public class Autor {

	private String nombre;
	private String apellido;
	private String afiliacion;
	
	
	public Autor(String nombre, String apellido, String afiliacion) {
		this.nombre     = nombre;
		this.apellido   = apellido;
		this.afiliacion = afiliacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAfiliacion() {
		return afiliacion;
	}
	public void setAfiliacion(String afiliacion) {
		this.afiliacion = afiliacion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
