package ar.edu.unq.po2.tpfinal.inmueble;

import java.util.List;

import ar.edu.unq.po2.tpfinal.PeriodoDisponible;
import ar.edu.unq.po2.tpfinal.SolicitudDeReserva;
import ar.edu.unq.po2.tpfinal.Usuario;
import ar.edu.unq.po2.tpfinal.reserva.Reserva;

public class ManagerConcrete extends Manager{
	
	private Inmueble inmueble;
	private List<PeriodoDisponible> periodosDisponibles;
	private List<Reserva> reservas;
	private List<SolicitudDeReserva> solicitudes;
	
	
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
		solicitudes.add(new SolicitudDeReserva(periodo, periodoAModificar, 
				this.inmueble.getPropietario(), inquilino));
		//falta avisar dueño e inquilino
	}
	
	protected void solicitudAceptada(SolicitudDeReserva solicitud) throws Exception {
		PeriodoDisponible tiempoAlquiler = solicitud.getPeriodoPedido();
		PeriodoDisponible periodoDisponible = solicitud.getPeriodoDisponible();
		periodosDisponibles.remove(periodoDisponible);
		List<PeriodoDisponible> periodoResultante = periodoDisponible.dividir(tiempoAlquiler);
		periodosDisponibles.addAll(periodoResultante);
		reservas.add(new Reserva(tiempoAlquiler, solicitud.getPropietario(), solicitud.getInquilino(), this.inmueble));
		solicitudes.remove(solicitud);
		//falta avisar dueño e inquilino
	}
	
}
