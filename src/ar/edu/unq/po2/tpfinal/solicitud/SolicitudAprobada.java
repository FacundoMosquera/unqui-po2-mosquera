package ar.edu.unq.po2.tpfinal.solicitud;

import ar.edu.unq.po2.tpfinal.SolicitudDeReserva;
import ar.edu.unq.po2.tpfinal.inmueble.ManagerConcrete;

public class SolicitudAprobada implements EstadoSolicitud {
	private SolicitudDeReserva solicitud;
	
	public SolicitudAprobada(SolicitudDeReserva s) {
		this.solicitud = s;
	}
	
	public void gestionarSolicitud(ManagerConcrete m) {
		try {
			m.solicitudAceptada(solicitud);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
