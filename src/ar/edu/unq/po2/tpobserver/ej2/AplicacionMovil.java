package ar.edu.unq.po2.tpobserver.ej2;

public class AplicacionMovil implements SportFan{

	
	
	@Override
	public void update(Partido p) {
		System.out.println("Nuevo partido de " + p.getDeporte().toString() + " jugado por " + p.getContrincantes().toString());
		
	}

}
