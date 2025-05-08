package ar.edu.unq.po2.tp4;

public class Producto {
	
	protected Double precioBase;
	private String nombre;
	private boolean precioCuidado;
	
	public Producto(String nombre, Double precio) {
		this.precioBase = precio;
		this.nombre = nombre;
		this.precioCuidado = false;
	}
	
	public Producto(String nombre, Double precio, boolean b) {
		this.precioBase = precio;
		this.nombre = nombre;
		this.precioCuidado = b;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return precioBase;
	}
	
	
}
