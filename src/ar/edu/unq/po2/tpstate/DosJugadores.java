package ar.edu.unq.po2.tpstate;

public class DosJugadores extends Estado {

	public void iniciar() {
		System.out.println("Partida iniciada para dos jugadores");
	}
	
	public Estado insertarUnaMoneda() {
		return new DosJugadores();
	}
	
}
