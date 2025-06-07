package ar.edu.unq.po2.tpstreamsyenum;

public class ActividadSemanal {

	private Dia diaDeLaSemana;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(Dia dia, int duracionDeLaActividad, Deporte deporte) {
		this.deporte       = deporte;
		this.diaDeLaSemana = dia;
		this.duracion      = duracionDeLaActividad;
	}
	
	public Dia getDia() {
		return diaDeLaSemana;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getCostoDeLaActividad() {
		int costo = (this.getCostoDelDia(this.diaDeLaSemana) * duracion) + this.getCostoDelDeporte(this.deporte);
		return costo;
	}
	
	private int getCostoDelDia(Dia dia) {
		if(dia.ordinal() < 3) 
			return 500;
		return 1000;
	}
	
	private int getCostoDelDeporte(Deporte deporte) {
		return 200 * deporte.getComplejidad(); 
	}
	
	
}
