package ar.edu.unq.po2.tpfinal.inmueble;

import java.util.List;

import ar.edu.unq.po2.tpfinal.PeriodoDisponible;
import ar.edu.unq.po2.tpfinal.SolicitudDeReserva;
import ar.edu.unq.po2.tpfinal.SolicitudHandler;
import ar.edu.unq.po2.tpfinal.Usuario;
import ar.edu.unq.po2.tpfinal.reserva.Reserva;

public class ManagerConcrete extends Manager{
	
	private Inmueble inmueble;
	private List<PeriodoDisponible> periodosDisponibles;
	private List<Reserva> reservas;
	private List<SolicitudDeReserva> solicitudes;
	private List<SolicitudHandler> notificadores;
	
	
	protected ManagerConcrete(Inmueble i) {
		this.inmueble = i;
	}
	
	protected boolean esFechaAlquilable(PeriodoDisponible periodo) {
		return periodosDisponibles.stream().anyMatch(p -> p.estaIncluido(periodo));
	}
	
	protected void crearSolicitud(PeriodoDisponible periodo, Usuario inquilino) {
		List<PeriodoDisponible> disponibles = periodosDisponibles.stream()
											.filter(p -> p.estaIncluido(periodo)).toList();
		PeriodoDisponible periodoAModificar = disponibles.get(0);
		SolicitudDeReserva solicitud = new SolicitudDeReserva(periodo, periodoAModificar, 
				this.inmueble.getPropietario(), inquilino, this);
		solicitudes.add(solicitud);
		SolicitudHandler notificador = new SolicitudHandler(solicitud);
		notificadores.add(notificador);
	}
	
	public void solicitudAceptada(SolicitudDeReserva solicitud) throws Exception {
		PeriodoDisponible tiempoAlquiler = solicitud.getPeriodoPedido();
		PeriodoDisponible periodoDisponible = solicitud.getPeriodoDisponible();
		periodosDisponibles.remove(periodoDisponible);
		List<PeriodoDisponible> periodoResultante = periodoDisponible.dividir(tiempoAlquiler);
		periodosDisponibles.addAll(periodoResultante);
		reservas.add(new Reserva(tiempoAlquiler, solicitud.getPropietario(), solicitud.getInquilino(), this.inmueble));
		solicitudes.remove(solicitud);
		notificadores.remove(notificadorDe(solicitud));
	
	}
	
	public void solicitudRechazada(SolicitudDeReserva solicitud) {
		solicitudes.remove(solicitud);
		notificadores.remove(notificadorDe(solicitud));
		
	}
	
	public SolicitudHandler notificadorDe(SolicitudDeReserva solicitud) {
		List<SolicitudHandler> resultado = notificadores.stream().filter(n -> n.getSolicitud() == solicitud).toList();
		return resultado.get(0);
	}
	
}
