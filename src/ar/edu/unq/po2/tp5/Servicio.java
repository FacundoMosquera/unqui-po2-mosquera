package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private Double costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio(Double costoUd, int udConsumidas, Agencia agencia) {
		super(agencia);
		this.costoPorUnidad = costoUd;
		this.unidadesConsumidas = udConsumidas;
	}
	
	
	@Override
	public Double getMonto() {
		return costoPorUnidad * unidadesConsumidas;
	}

	@Override
	public void accionExtra() {
		this.getAgencia().registrarPago(this);	
	}
	
	public Double getCostoPorUnidad() {return costoPorUnidad;}
	public int getUnidadesConsumidas() {return unidadesConsumidas;}

}
