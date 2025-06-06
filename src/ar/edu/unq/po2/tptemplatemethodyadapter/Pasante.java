package ar.edu.unq.po2.tptemplatemethodyadapter;

public class Pasante extends Empleado {

	private int horasExtras;
	
	public Pasante(int horas) {
		this.horasExtras  = horas;
	}
	
	
	
	@Override
	public double getSueldoBasico() {
		return 0d;
	}
	
	@Override
	public double getBono() {
		return (double) (40 * horasExtras);
	}

}

