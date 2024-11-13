package ar.edu.unq.po2.tpfinal.filtro;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.Inmueble;

public class FiltroPrecio extends Filtro {
	private int precioMin;
	private int precioMax;
	
	public FiltroPrecio(int min, int max) throws Exception {
		if (min < 0 || max < 0) {
			throw new Exception("El precio ingresado es inválido");
			}
		else {
			this.precioMin = min;
			this.precioMax = max;
		}
	}
	
	@Override 
	public List<Inmueble> filtrar(List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltradosPorMin = this.filtrarMin(inmuebles, precioMin);
		List<Inmueble> inmueblesFiltrados = this.filtrarMax(inmueblesFiltradosPorMin, precioMax);
		return inmueblesFiltrados;
		
	}
	
	private List<Inmueble> filtrarMin(List<Inmueble> inmuebles, int precio) {
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.precioPorDia() > precio) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}
	
	private List<Inmueble> filtrarMax(List<Inmueble> inmuebles, int precio) {
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.precioPorDia() < precio) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}
	
}
