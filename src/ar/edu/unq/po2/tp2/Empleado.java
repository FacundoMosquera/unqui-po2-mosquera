package ar.edu.unq.po2.tp2;

import java.util.Date;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNacimiento;
	private int sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, int sueldoBasico) {
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

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
	
	
}
