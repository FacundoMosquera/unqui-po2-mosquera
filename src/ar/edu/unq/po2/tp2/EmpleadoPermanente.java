package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private int antiguedad;
	private int cantHijos;
	private boolean tieneConyugue;
	
	public EmpleadoPermanente(String nombre, String direc, String estadocivil, LocalDate fnacimiento, Double sueldoBasico, int antiguedad, int nroHijos, boolean conyugue) {
		super(nombre, direc, estadocivil, fnacimiento, sueldoBasico);
		this.antiguedad = antiguedad;
		this.cantHijos = nroHijos;
		this.tieneConyugue = conyugue;
	}
	
	
	public Double getSueldoBruto() {
		int bonoConyugue = ((this.tieneConyugue) ? 100 : 0);
		int bonoHijos = this.cantHijos * 150;
		int bonoAntiguedad = this.antiguedad * 50;
		return this.getSueldoBasico() + bonoConyugue + bonoHijos + bonoAntiguedad;
	}
		
	public Double getRetenciones() {
		Double sueldoBruto = this.getSueldoBruto();	
		Double obraSocial = sueldoBruto * 0.1 + 20 * cantHijos;
		Double aportesJubilatorios = (sueldoBruto * 15) / 100;
		return obraSocial + aportesJubilatorios;
	}
	
	public String detalleRetencionesAplicadas() {
		Double sueldoBruto = this.getSueldoBruto();
		Double obraSocial = (sueldoBruto *10) / 100 + 20 * this.cantHijos;
		Double aportesjubilatorios = (sueldoBruto * 15) / 100;
		return "Las retenciones que se han aplicado son: \n"
				+ "Obra social: " + obraSocial.toString() + "\n"
				+ "AportesJubilatorios: " + aportesjubilatorios.toString() ;
	}
	
	public String conformacionSueldoBruto() {
		Integer bonoHijos = this.cantHijos * 150;
		Integer bonoConyugue = ((this.tieneConyugue) ? 100 : 0);
		Integer bonoAntiguedad = this.antiguedad * 50;
		return "El sueldo bruto está conformado por los siguientes montos: \n" 
				+ "Sueldo básico: " + this.getSueldoBasico().toString() + "\n"
				+ "Bono por antiguedad: " + bonoAntiguedad.toString() + "\n"
				+ "Bono por conyugue: " + bonoConyugue.toString() + "\n"
				+ "Bono por hijos: " + bonoHijos.toString();
	}
}
