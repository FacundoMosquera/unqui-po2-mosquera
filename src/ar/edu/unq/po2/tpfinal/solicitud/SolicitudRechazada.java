package ar.edu.unq.po2.tpfinal.solicitud;

import ar.edu.unq.po2.tpfinal.SolicitudDeReserva;
import ar.edu.unq.po2.tpfinal.inmueble.ManagerConcrete;

public class SolicitudRechazada implements EstadoSolicitud {

	private SolicitudDeReserva solicitud;
	
	public SolicitudRechazada(SolicitudDeReserva s) {
		this.solicitud = s;
	}
	
	@Override
	public void gestionarSolicitud(ManagerConcrete m) {
		m.solicitudRechazada(solicitud);
	}
}
