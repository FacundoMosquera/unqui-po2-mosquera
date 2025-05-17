package ar.edu.unq.po2.tp5;

public abstract class Factura implements Item {

	private Agencia agencia;
	
	public Factura(Agencia a) {
		agencia = a;
	}
	
	
	public Agencia getAgencia() {return agencia;}
}
