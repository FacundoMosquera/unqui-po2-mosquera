package ar.edu.unq.po2.tpobserver.ej2;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contrincantes;
	private Deporte deporte;
	
	public Partido(String resultado, List<String> contrincantes, Deporte deporte) {
		this.resultado     = resultado;
		this.contrincantes = contrincantes;
		this.deporte       = deporte; 
	}
	
	
	
	public Deporte getDeporte() {
		return deporte;
	}

	
	public List<String> getContrincantes() {
		return contrincantes;
	}
	
	
	public String getResultado() {
		return resultado;
	}
	
	
	
	
}
