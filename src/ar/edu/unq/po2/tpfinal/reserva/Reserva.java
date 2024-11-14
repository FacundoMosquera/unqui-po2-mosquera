package ar.edu.unq.po2.tpfinal.reserva;

import ar.edu.unq.po2.tpfinal.PeriodoDisponible;
import ar.edu.unq.po2.tpfinal.Usuario;
import ar.edu.unq.po2.tpfinal.inmueble.Inmueble;

public class Reserva {
	
	private Usuario propietario;
	private Usuario inquilino;
	private Inmueble inmueble;
	private PeriodoDisponible periodoReserva;
	private EstadoReserva estadoReserva;
	
	public Reserva(PeriodoDisponible periodoReserva, Usuario propietario, Usuario inquilino, Inmueble inmueble) {
		this.periodoReserva = periodoReserva;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.inmueble = inmueble;
		this.estadoReserva = new ReservaEnEspera(this);
	}
	
	

}
