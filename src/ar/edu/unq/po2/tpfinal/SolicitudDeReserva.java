package ar.edu.unq.po2.tpfinal;


import ar.edu.unq.po2.tpfinal.inmueble.ManagerConcrete;
import ar.edu.unq.po2.tpfinal.solicitud.EstadoSolicitud;
import ar.edu.unq.po2.tpfinal.solicitud.SolicitudEnEspera;


public class SolicitudDeReserva {
	
	private PeriodoDisponible periodoPedido;
	private PeriodoDisponible periodoDisponible;
	private Usuario propietario;
	private Usuario inquilino;
	private EstadoSolicitud estado;
	private ManagerConcrete manager;
	//---------------------------------------CONSTRUCTOR------------------------------------------
	public SolicitudDeReserva(PeriodoDisponible pedido, PeriodoDisponible disponible, 
			Usuario propietario, Usuario inquilino, ManagerConcrete manager) {
		this.periodoPedido = pedido;
		this.periodoDisponible = disponible;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.estado = new SolicitudEnEspera(this);
		this.manager = manager;
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
	
	public EstadoSolicitud getEstado() {
		return estado;
	}
	
	public void actualizarSolicitud(EstadoSolicitud nuevoEstado) {
		this.estado = nuevoEstado;
		this.estado.gestionarSolicitud(manager);
	}
	
	
}
