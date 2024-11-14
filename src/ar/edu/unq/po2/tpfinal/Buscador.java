package ar.edu.unq.po2.tpfinal;

import java.util.List;

import ar.edu.unq.po2.tpfinal.filtro.Filtro;
import ar.edu.unq.po2.tpfinal.inmueble.Inmueble;

public class Buscador {
	
	public List<Inmueble> filtrar(List<Filtro> filtros, List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltrados = inmuebles;
		for(Filtro filtro : filtros) {
			inmueblesFiltrados = filtro.filtrar(inmueblesFiltrados);
		}
		return inmueblesFiltrados;
	}
	
}
