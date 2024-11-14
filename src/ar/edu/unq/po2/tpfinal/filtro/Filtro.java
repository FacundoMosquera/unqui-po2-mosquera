package ar.edu.unq.po2.tpfinal.filtro;

import java.util.List;

import ar.edu.unq.po2.tpfinal.inmueble.Inmueble;

public abstract class Filtro {
	
	public abstract List<Inmueble> filtrar(List<Inmueble> inmuebles);

}
