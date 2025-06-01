package ar.edu.unq.po2.tpstate;

public class UnJugador extends Estado{

	public void iniciar() {
		System.out.println("Nueva partida para un jugador");
	}
	
	public Estado insertarUnaMoneda() {
		return new DosJugadores();
	}
}
