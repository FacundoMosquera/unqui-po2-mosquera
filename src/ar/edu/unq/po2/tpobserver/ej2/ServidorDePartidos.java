package ar.edu.unq.po2.tpobserver.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ServidorDePartidos implements SportFan {

	private List<SuscripcionDeportiva> suscripcion;
	private List<Partido> misPartidos;
	
	public ServidorDePartidos() {
		suscripcion = new ArrayList<>();
		misPartidos = new ArrayList<>();
	}
	
	
	
	@Override
	public void update(Partido p) {
		misPartidos.add(p);
		this.notificar(p);
		
	}
	
	public void notificar(Partido p) {
		suscripcion
		.stream()
		.filter(s -> s.cumple(p))
		.forEach( s -> s.getInteresado().update(p));
		
	}
	
	public void nuevaSuscripcion(SportFan fan, Predicate<Partido> interes) {
		suscripcion.add(new SuscripcionDeportiva(fan, interes));
	}

	
	
}
