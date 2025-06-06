package ar.edu.unq.po2.tptemplatemethodyadapter;

public abstract class Empleado {

	public final double sueldo() {
		Double resultado = (this.getSueldoBasico() + this.getBono()) - this.getRetenciones();
		this.accionExtra();
		return resultado;
	}
	
	public abstract double getSueldoBasico();
	
	public double getBono() {
		return 0d;
	}
	
	public double getRetenciones() {
		return (this.getSueldoBasico() + this.getBono()) * 0.13;
	}
	
	public void accionExtra() {
		
	}
	
}
