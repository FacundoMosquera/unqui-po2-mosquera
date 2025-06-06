package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private List<Producto> productos;
	@SuppressWarnings("unused")
	private String nombreDelSupermercado;
	@SuppressWarnings("unused")
	private String direccion;
	
	
	public Supermercado(String nombre, String direccion) {
		this.productos = new ArrayList<Producto>();
		this.nombreDelSupermercado = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public void eliminarProducto(Producto p) {
		this.productos.remove(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = 0.0d;
		for(Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
	
}
