package ar.edu.unq.po2.tpfinal.solicitud;

import ar.edu.unq.po2.tpfinal.SolicitudDeReserva;
import ar.edu.unq.po2.tpfinal.inmueble.ManagerConcrete;

public class SolicitudEnEspera implements EstadoSolicitud {
	
	private SolicitudDeReserva solicitud;
	
	public SolicitudEnEspera(SolicitudDeReserva s) {
		this.solicitud = s;
	}
	
	
	public void aprobarSolicitud() {
		solicitud.actualizarSolicitud(new SolicitudAprobada(solicitud));
	}
	
	public void rechazarSolicitud() {
		solicitud.actualizarSolicitud(new SolicitudRechazada(solicitud));
	}

	@Override
	public void gestionarSolicitud(ManagerConcrete m) {
		
	}
}
