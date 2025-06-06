package ar.edu.unq.po2.tptemplatemethodyadapter;

public class EmpleadoPlanta extends Empleado {

	private int cantDeHijos;
	
	public EmpleadoPlanta(int hijos) {
		this.cantDeHijos = hijos;
	}
	
	@Override
	public double getSueldoBasico() {
		return 3000d;
	}
	
	public double getBono() {
		return cantDeHijos * 150;
	}
}
