package ar.edu.unq.po2.tpfinal.inmueble;

import ar.edu.unq.po2.tpfinal.PeriodoDisponible;
import ar.edu.unq.po2.tpfinal.Usuario;

public abstract class Manager {
	
	abstract void crearSolicitud(PeriodoDisponible periodo, Usuario inquilino);
	abstract boolean esFechaAlquilable(PeriodoDisponible periodo);
	
	
}
