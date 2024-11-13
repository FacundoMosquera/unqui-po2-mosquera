package ar.edu.unq.po2.tpfinal.filtro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.Inmueble;

public class FiltroInAndOut extends Filtro {

	private SimpleDateFormat checkIn;
	private SimpleDateFormat checkOut;
	
	//El chequeo de horas y minutos se debe hacer en la interfaz visual
	public FiltroInAndOut(SimpleDateFormat in, SimpleDateFormat out) {
		this.checkIn = in;
		this.checkOut = out;
	}
	
	public List<Inmueble> filtrar(List<Inmueble> inmuebles) {
		List<Inmueble> inmueblesFiltradosPorIN = this.filtrarIN(inmuebles, this.checkIn);
		List<Inmueble> inmueblesFiltrados = this.filtrarOUT(inmueblesFiltradosPorIN, this.checkOut);
		return inmueblesFiltrados;
	}
	
	private List<Inmueble> filtrarIN(List<Inmueble> inmuebles, SimpleDateFormat in){
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.getCheckIn().equals(in)) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}
	
	private List<Inmueble> filtrarOUT(List<Inmueble> inmuebles, SimpleDateFormat out){
		List<Inmueble> inmueblesFiltrados = new ArrayList<Inmueble>();
		for(Inmueble inmueble : inmuebles) {
			if(inmueble.getCheckOut().equals(out)) {inmueblesFiltrados.add(inmueble);}
		}
		return inmueblesFiltrados;
	}
	
}
