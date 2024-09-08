package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Temporal extends Empleado {
	
	private LocalDate fechaFinContrato;
	private int cantHorasExtras;
	
	public Temporal(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, int sueldoBasico, 
			LocalDate finContrato, int extras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinContrato = finContrato;
		this.cantHorasExtras = extras;
	}
	

	
	@Override
	public int sueldoBruto() {
		return getSueldoBasico() + bonoPorHorasExtras();
	}
	
	public int bonoPorHorasExtras() {
		return 40 * cantHorasExtras;
	}
	
	public Boolean esMayorDe50() {
		return edad() > 50;
	}
	
	@Override
	public float retenciones() {
		return descuentoObraSocial() + descuentoPorMayor() + aportesJubilatorios() + descuentoHorasExtras();
	}
	
	public int descuentoPorMayor() { 
		return esMayorDe50() ? 25 : 0;
	}
	
	public float aportesJubilatorios() {
		return (float) (sueldoBruto() * 0.10);
	}
	
	public int descuentoHorasExtras() {
		return 5 * cantHorasExtras;
	}
	
}
