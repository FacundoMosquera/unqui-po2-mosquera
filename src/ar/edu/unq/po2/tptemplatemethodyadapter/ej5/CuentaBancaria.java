package ar.edu.unq.po2.tptemplatemethodyadapter.ej5;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	// Concreto
	public String getTitular() {
		return this.titular;
	}
	
	// Concreto
	public int getSaldo() {
		return this.saldo;
	}
	
	// Concreto
	protected void setSaldo(int monto) {
		this.saldo = monto;
	}

	// Concreto
	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}
	
	// Primitivo
	public abstract boolean puedeExtraer(int monto);
	
	// Concreto
	public final void extraer(int monto) {
		if(puedeExtraer(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extracción");
			this.accionExtra();
		}
	}
	
	// Hook method
	public void accionExtra() {
		
	}
}
