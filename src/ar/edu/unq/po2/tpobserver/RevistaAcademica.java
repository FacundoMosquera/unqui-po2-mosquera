package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RevistaAcademica {

	private List<Articulo> articulos;
	private List<Suscripcion> suscripciones;
	
	public RevistaAcademica() {
		articulos     = new ArrayList<>();
		suscripciones = new ArrayList<>();
	}
	
	public void agregarNuevoArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.notificar(articulo);
	}
	
	public void eliminarArticulo(Articulo articulo) {
		articulos.remove(articulo);
	}
	
	public void nuevoInteresado(Interesado interesado, Predicate<Articulo> filtro) {
		List<Suscripcion> susPrevia = suscripciones.stream().filter(s -> s.getInteresado() == interesado).toList();
		if(susPrevia.isEmpty()) {
			suscripciones.add(new Suscripcion(interesado, filtro));
		} else {
			Predicate<Articulo> filtroAnterior = susPrevia.get(0).getFiltro();
			Suscripcion newSub = new Suscripcion(interesado, a -> filtroAnterior.test(a) || filtro.test(a));
			suscripciones.remove(susPrevia.get(0));
			suscripciones.add(newSub);
		}
		
	}
	
	public void eliminarSuscripcion(Suscripcion s) {
		suscripciones.remove(s);
	}
	
	
	
	private void notificar(Articulo articulo) {
		suscripciones
		.stream()
		.filter(s -> s.cumple(articulo))
		.forEach(s -> s.notificarInteresado(articulo));;
	}
	
	
}
