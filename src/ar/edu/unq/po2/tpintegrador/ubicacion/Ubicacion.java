package ar.edu.unq.po2.tpintegrador.ubicacion;

public interface Ubicacion {

	public double getLatitud();
	
	public double getLongitud();
	
	public double distanciaA(Ubicacion u);
	
}
