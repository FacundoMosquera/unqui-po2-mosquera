package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{

	private LocalDate fechaFinDesignacion;
	private int cantHorasExtras;
	
	public EmpleadoTemporal(String nombre, String direc, String estadocivil, LocalDate fnacimiento, Double sueldoBasico, LocalDate finContrato, int horasExtras) {
		super(nombre, direc, estadocivil, fnacimiento, sueldoBasico);
		this.setFechaFinDesignacion(finContrato);
		this.cantHorasExtras = horasExtras;
	}
	
	@Override
	public Double getRetenciones() {
		Double sueldoBruto = this.getSueldoBruto();
		Double obraSocial = (sueldoBruto * 10) / 100;
		int retencionPorEdad = ((this.getEdad() > 50) ? 25 : 0);
		Double aportesJubilatorios = (sueldoBruto * 10) / 100 + 5 * cantHorasExtras;
		return obraSocial + retencionPorEdad + aportesJubilatorios;
	}
	
	@Override
	public Double getSueldoBruto() {
		return this.getSueldoBasico() + 40* cantHorasExtras;
	}
	
	@Override
	public String detalleRetencionesAplicadas() {
		Double sueldoBruto = this.getSueldoBruto();
		Double obraSocial = sueldoBruto * 0.1;
		Integer retencionPorEdad = ((this.getEdad() > 50) ? 25 : 0);
		Float aportesjubilatorios = (float) (((sueldoBruto * 10) / 100) + 5 * cantHorasExtras);
		return "Las retenciones que se han aplicado son: \n"
				+ "Obra social: " + obraSocial.toString() + "\n"
				+ "Aportes jubilatorios: " + aportesjubilatorios.toString() 
				+ "Retención por edad: " + retencionPorEdad.toString();
	}
	
	@Override
	public String conformacionSueldoBruto() {
		Integer horasExtras = this.cantHorasExtras;
		return "El sueldo bruto está conformado por los siguientes montos: \n" 
				+ "Sueldo básico: " + this.getSueldoBasico().toString() + "\n"
				+ "Horas extras: " + horasExtras.toString();
	}

	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(LocalDate fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}
	
}
