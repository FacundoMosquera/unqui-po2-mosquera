package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class Permanente extends Empleado{
	
	private int cantHijos;
	private int antiguedad;
	private Boolean tieneConyugue;
	
	
	public Permanente(String nombre, String direccion, String estadocivil,
			LocalDate nacimiento, int sueldo, int hijos, int antiguedad, Boolean b) { 
		super(nombre, direccion, estadocivil, nacimiento, sueldo);
		this.cantHijos = hijos;
		this.antiguedad = antiguedad;
		this.tieneConyugue = b;
		
	}
	
	
	@Override
	public int sueldoBruto() {
		return getSueldoBasico() + bonoPorConyugue() + bonoPorHijos() + bonoPorAntiguedad();
	}
	
	public int bonoPorHijos() {
		return 150 * cantHijos;
	}
	
	public int bonoPorAntiguedad() {
		return 50 * antiguedad;
	}
	
	public int bonoPorConyugue() {
		int bono;
		if (tieneConyugue) {bono = 100;} else {bono = 0;}
		return bono;
	}
	
	
	public float retenciones() {
		return descuentoObraSocial() + descuentoPorHijo() + aportesJubilatorios();
	}
	
	public int descuentoPorHijo() {
		return 20 * cantHijos; 
	}
	
	public float aportesJubilatorios() {
		return (float) (sueldoBruto() * 0.15);
	}
	
}
