package ar.edu.unq.po2.tpfinal;

public class SolicitudDeReserva {
	
	private PeriodoDisponible periodoPedido;
	private PeriodoDisponible periodoDisponible;
	private Usuario propietario;
	private Usuario inquilino;
	
	//---------------------------------------CONSTRUCTOR------------------------------------------
	public SolicitudDeReserva(PeriodoDisponible pedido, PeriodoDisponible disponible, 
			Usuario propietario, Usuario inquilino) {
		this.periodoPedido = pedido;
		this.periodoDisponible = disponible;
		this.propietario = propietario;
		this.inquilino = inquilino;
	}
	
	//---------------------------------------GETTERS-----------------------------------------------
	public PeriodoDisponible getPeriodoDisponible() {
		return periodoDisponible;
	}
	
	public PeriodoDisponible getPeriodoPedido() {
		return periodoPedido;
	}
	
	public Usuario getPropietario() {
		return propietario;
	}
	
	public Usuario getInquilino() {
		return inquilino;
	}
	
	
}
