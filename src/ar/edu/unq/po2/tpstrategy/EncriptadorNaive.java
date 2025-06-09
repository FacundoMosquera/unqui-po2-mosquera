package ar.edu.unq.po2.tpstrategy;


import java.util.Arrays;
import java.util.Collections;


public class EncriptadorNaive {

	private Encriptacion formaDeEncriptacion;
	
	public EncriptadorNaive() {
		
	}
	
	public String encriptar(String texto) {
		if (formaDeEncriptacion == null) {
			return this.encriptacionSimple(texto);
		}
		else {return formaDeEncriptacion.encriptar(texto);}
	}
	
	
	private String encriptacionSimple(String texto) {
		String[] dividido = texto.split(" ");
		Collections.reverse(Arrays.asList(dividido));
		return String.join(" ", dividido);
	}
	
	
	public String desencriptar(String texto) {
		if(formaDeEncriptacion == null) {
			return this.desencriptacionSimple(texto);
		} else {return this.formaDeEncriptacion.desencriptar(texto);}
	}
	
	
	
	private String desencriptacionSimple(String texto) {
		return this.encriptacionSimple(texto);
	}
	
	
	public void setEncriptacion(Encriptacion nuevaForma) {
		this.formaDeEncriptacion = nuevaForma;
	}
	
	public void setEncriptacionPorDefecto() {
		this.formaDeEncriptacion = null;
	}
	
	
}
