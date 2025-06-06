package ar.edu.unq.po2.tptemplatemethodyadapter;

public class EmpleadoTemporario extends Empleado {
	
	private int horasTrabajadas;
	private boolean estaCasado;
	private boolean tieneHijos;
	
	public EmpleadoTemporario(int horas, boolean casado, boolean hijos) {
		this.horasTrabajadas  = horas;
		this.estaCasado   = casado;
		this.tieneHijos   = hijos;
	}
	
	@Override
	public double getSueldoBasico() {
		return 1000d;
	}
	
	public double getBono() {
		if (estaCasado || tieneHijos)
			return horasTrabajadas * 5d + 100d;
		return horasTrabajadas * 5d;
	}
	
}
