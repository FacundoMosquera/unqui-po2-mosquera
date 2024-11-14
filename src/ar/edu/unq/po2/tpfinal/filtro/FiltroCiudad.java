package ar.edu.unq.po2.tpfinal.filtro;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.inmueble.Inmueble;

public class FiltroCiudad extends Filtro{
	
	private String ciudad;
	
	@Override
	public List<Inmueble> filtrar(List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.getCiudad() == ciudad) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}
	
	public FiltroCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
