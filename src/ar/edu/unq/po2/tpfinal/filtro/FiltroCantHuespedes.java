package ar.edu.unq.po2.tpfinal.filtro;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.Inmueble;

public class FiltroCantHuespedes extends Filtro{
	
	private int cantHuespedes;
	
	public FiltroCantHuespedes(int paraNHuespedes) {
		this.cantHuespedes = paraNHuespedes;
	}
	
	@Override
	public List<Inmueble> filtrar(List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.getCapacidad() >= cantHuespedes) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}

}
