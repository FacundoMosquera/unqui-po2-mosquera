package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private Double multiplicadorDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
		multiplicadorDescuento = 0.9d;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean b) {
		super(nombre, precio, b);
		multiplicadorDescuento = 0.9d;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		multiplicadorDescuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean b, Double descuento) {
		super(nombre, precio, b);
		multiplicadorDescuento = descuento;
	}
	
	public Double getDescuento() {return multiplicadorDescuento;}
	public void setDescuento(Double descuento) {this.multiplicadorDescuento = descuento;}
	

	@Override
	public Double getPrecio() {
		return this.precioBase * this.multiplicadorDescuento;
	}
	
}
