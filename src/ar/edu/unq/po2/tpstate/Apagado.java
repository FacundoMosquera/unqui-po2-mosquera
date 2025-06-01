package ar.edu.unq.po2.tpstate;

public class Apagado extends Estado{

	public void iniciar() {
		System.out.println("Inserte una moneda y vuelva a apretar el botón");
	}
	
	public Estado insertarUnaMoneda() {
		return new UnJugador();
	}
}
