package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{

	private Double tasaEnPesos;
	
	public Impuesto(Double tasa, Agencia a) {
		super(a);
		this.tasaEnPesos = tasa;
	}

	@Override
	public Double getMonto() {
		return tasaEnPesos;
	}

	@Override
	public void accionExtra() {
		this.getAgencia().registrarPago(this);
	}
	

}
