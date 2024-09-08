package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private int sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
	public float getSueldoNeto() {
		return sueldoBruto() - retenciones();
	}
	
	
	public float obraSocial() {
		return (float) 0.10;
	}
	
	
	public int edad() {
		return (Period.between(fechaDeNacimiento, LocalDate.now())).getYears(); 
	}
	
	public float descuentoObraSocial() {
		return sueldoBruto() * obraSocial();
	}
	
	public abstract int sueldoBruto();
	
	public abstract float retenciones();
	
}
