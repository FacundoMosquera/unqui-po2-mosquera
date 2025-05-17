package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private Double montoDelCarritoDeCompras;
	private List<Item> carritoDeCompras;
	
	public Caja() {
		montoDelCarritoDeCompras = 0.0d;
		carritoDeCompras = new ArrayList<Item>();
	}
	
	public void registrarProducto(Item i) {
		montoDelCarritoDeCompras += i.getMonto();
		carritoDeCompras.add(i);	
	}
	
	public void confirmarCompra() {
		for(Item i : carritoDeCompras) {
			//si el item debe avisarle a una entidad, lo hace 
			i.accionExtra();
		}
		//deja la caja lista para un nuevo cliente
		this.reiniciarCaja();
	}
	
	public void eliminarProductoDeLaCaja(Item i) {
		if(carritoDeCompras.contains(i)) {
			montoDelCarritoDeCompras -= i.getMonto();
			carritoDeCompras.remove(i);
		}
	}
	
	public void reiniciarCaja() {
		/* 
		 * Reinicia el monto a cero y vacía el carrito de compras para simular
		 * atender un nuevo cliente
		 */
		montoDelCarritoDeCompras = 0.0d;
		carritoDeCompras.clear();
	}
	
	public Double getMontoTotalAPagar() {return montoDelCarritoDeCompras;}
}
