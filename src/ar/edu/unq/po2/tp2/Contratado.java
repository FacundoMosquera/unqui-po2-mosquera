package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado {
	
	private int nroContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String direccion , String estadocivil, LocalDate fdeNacimiento, int sueldo,
			int nroContrato, String medioPago ) {
		super(nombre, direccion, estadocivil, fdeNacimiento, sueldo);
		this.nroContrato = nroContrato;
		this.medioDePago = medioPago;
		
	}

	public int getNroContrato() {
		return nroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}
	
	public int sueldoBruto() {
		return getSueldoBasico();
	}
	
	public int gastosAdministrativosContractuales() {
		return 50;
	}
	
	public float retenciones() {
		return this.gastosAdministrativosContractuales();
	}
	
	
}
