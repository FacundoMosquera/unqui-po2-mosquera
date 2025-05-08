package meet.google;

import ar.edu.unq.po2.tp4.*;

public class ProductoPrimeraNecesidad extends Producto {

	private Float multiplicadorDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
		multiplicadorDescuento = 0.9f;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean b) {
		super(nombre, precio, b);
		multiplicadorDescuento = 0.9f;
	}
	
	@Override
	public Double getPrecio() {
		return this.precioBase * this.multiplicadorDescuento;
	}
	
}
