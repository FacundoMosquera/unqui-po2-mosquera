package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(Double precio, String nombre, Mercado m) {
		super(precio, nombre, m);
		
	}

	@SuppressWarnings("unused")
	private Double getPrecio() {
		return this.precio * 0.9;
	}
	
}
