package ar.edu.unq.po2.tpintegrador.ubicacion;

public class Ubicacion {
	
	private double latitud;
	private double longitud;
	private FormulaDeDistancia formula;
	
	public Ubicacion(double latitud, double longitud) {
		this.latitud  = latitud;
		this.longitud = longitud;
		this.formula  = new DistanciaEuclidiana(); 
	}
	
	public double distanciaA(Ubicacion ubicacion) {
		return this.formula.distanciaEntre(this, ubicacion);
	}
	
	public double getLatitud() {
		return latitud;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setFormula(FormulaDeDistancia f) {
		this.formula = f;
	}
}
