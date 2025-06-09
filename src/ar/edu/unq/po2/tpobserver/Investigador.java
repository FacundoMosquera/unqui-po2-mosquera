package ar.edu.unq.po2.tpobserver;

public class Investigador implements Interesado {

	
	public void update(Articulo articulo) {
		System.out.println("Nuevo articulo: " + articulo.getTitulo());
	}
	
}
