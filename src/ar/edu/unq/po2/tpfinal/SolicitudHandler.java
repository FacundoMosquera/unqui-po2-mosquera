package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.solicitud.EstadoSolicitud;
import ar.edu.unq.po2.tpfinal.solicitud.SolicitudEnEspera;

public class SolicitudHandler {
	private Usuario propietario;
	private Usuario inquilino;
	private SolicitudDeReserva solicitud;
	private SolicitudEnEspera estado;
	
	
	public SolicitudHandler(SolicitudDeReserva s) {
		this.propietario = s.getPropietario();
		this.inquilino = s.getInquilino();
		this.solicitud = s;
		this.estado = (SolicitudEnEspera) s.getEstado();
		this.notificarUsuarios(s);
	}
	
	public void notificarUsuarios(SolicitudDeReserva s) {
		this.propietario.solicitudRecibida(s, this);
	}
	
	public void aceptarSolicitud() {
		estado.aprobarSolicitud();
	}
	
	public void rechazarSolicitud() {
		estado.rechazarSolicitud();
	}
	
	public SolicitudDeReserva getSolicitud() {
		return solicitud;
	}
}
