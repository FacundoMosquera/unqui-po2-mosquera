package ar.edu.unq.po2.tpobserver;

import java.util.function.Predicate;

public class Suscripcion {

	private Interesado interesado;
	private Predicate<Articulo> filtro;
	
	public Suscripcion(Interesado interesado, Predicate<Articulo> filtro) { 
		this.interesado = interesado;
		this.setFiltro(filtro);
	}

	public Predicate<Articulo> getFiltro() {
		return filtro;
	}

	public void setFiltro(Predicate<Articulo> filtro) {
		this.filtro = filtro;
	}
	
	public Interesado getInteresado() {
		return interesado;
	}
	
	public void notificarInteresado(Articulo a) {
		this.interesado.update(a);
	}
	
	public boolean cumple(Articulo articulo) {
		return this.filtro.test(articulo);
	}
}
