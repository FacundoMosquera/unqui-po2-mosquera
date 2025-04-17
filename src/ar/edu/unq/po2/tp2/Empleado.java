package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private Double sueldoBasico;
	
	public String getEstadoCivil() {
		return estadoCivil;
	}


	public Empleado(String nombre, String direc, String estadocivil, LocalDate fnacimiento, Double sueldobasic) {
		this.nombre = nombre;
		this.direccion = direc;
		this.estadoCivil = estadocivil;
		this.fechaDeNacimiento = fnacimiento;
		this.sueldoBasico = sueldobasic;
	}
	
	public Double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period p = Period.between(this.fechaDeNacimiento, fechaActual);
		return p.getYears();
	}
	
	public String getDireccion() {
		return direccion;
	}
	

	
	public Double getSueldoNeto() {
		return this.getSueldoBruto() - this.getRetenciones();
	}
	
	public abstract Double getRetenciones();
	
	public abstract Double getSueldoBruto();
	
	public abstract String detalleRetencionesAplicadas();
	
	public abstract String conformacionSueldoBruto();
	
}
