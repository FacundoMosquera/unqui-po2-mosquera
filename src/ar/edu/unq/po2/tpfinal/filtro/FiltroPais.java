package ar.edu.unq.po2.tpfinal.filtro;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.Inmueble;

public class FiltroPais extends Filtro {
	
	private String pais;
	
	public FiltroPais(String pais) {this.pais = pais;}
	
	@Override
	public List<Inmueble> filtrar(List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>(); 
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.getPais() == pais) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}


}
