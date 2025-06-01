package ar.edu.unq.po2.tpstate;

public class Maquina {

	private Estado estadoDeLaMaquina;
	
	public Maquina() {
		this.estadoDeLaMaquina = new Apagado();
	}
	
	public void iniciar() {
		this.estadoDeLaMaquina.iniciar();
	}
	
	public void insertarUnaMoneda() {
		estadoDeLaMaquina = this.estadoDeLaMaquina.insertarUnaMoneda();
	}
	
	public void terminarJuego() {
		this.estadoDeLaMaquina = new Apagado();
	}
}
