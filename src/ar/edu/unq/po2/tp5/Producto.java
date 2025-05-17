package ar.edu.unq.po2.tp5;

public class Producto implements Item{
	
	protected Double precio;
	private String nombre;
	private Mercado mercado;
	
	public Producto(Double precio, String nombre, Mercado m) {
		this.precio = precio;
		this.nombre = nombre;
		mercado = m;
	}
	
	
	
	public void accionExtra() {
		mercado.reducirUnoDelStackDe(this);
	}
	
	public Mercado getMercado() {return mercado;}
	
	public String getNombre() {return nombre;}
	
	public Double getMonto() {return this.getPrecio();}
	
	private Double getPrecio() {return precio;}
}
