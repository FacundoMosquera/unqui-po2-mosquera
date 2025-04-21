package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado{

	private int nroDeContrato;
	private String medioDePago;
	
	
	public EmpleadoContratado(String nombre, String direc, String estadocivil, LocalDate fnacimiento, Double sueldoBasico, int nroContrato, String medioDePago) {
		super(nombre, direc, estadocivil, fnacimiento, sueldoBasico);
		this.setNroDeContrato(nroContrato);
		this.setMedioDePago(medioDePago);
	}

	public Double getSueldoBruto() {return this.getSueldoBasico();}
	
	public Double getRetenciones() {return 50.0;}
	

	
	public String detalleRetencionesAplicadas() {
		return "Las retenciones que se han aplicado son: \n"
				+ "Gastos administrativos contractuales: " + this.getRetenciones().toString();
	}
	
	public String conformacionSueldoBruto() {
		return "El sueldo bruto está conformado por los siguientes montos: \n"
				+ "Sueldo básico: " + this.getSueldoBasico().toString();
	}
	
	
	
	
	
	public int getNroDeContrato() {return nroDeContrato;}
	
	public void setNroDeContrato(int nroDeContrato) {this.nroDeContrato = nroDeContrato;}
	
	public String getMedioDePago() {return medioDePago;}
	
	public void setMedioDePago(String medioDePago) {this.medioDePago = medioDePago;}
	
	
}
