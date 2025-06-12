package ar.edu.unq.po2.tpintegrador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpintegrador.ubicacion.*;

public class UbicacionTest {
	
	//Latitud válida es entre -90 y 90
	//Longitud válida es entre -180 y 180

	@Test
	public void testConstuctorYGetters() {
		Ubicacion u = new Ubicacion(-34.6, -44.4);
		assertEquals(u.getLatitud(), -34.6);
		assertEquals(u.getLongitud(), -44.4);
	}
	
	@Test
	public void testDistanciaMismaUbicacion() {
		Ubicacion u1 = new Ubicacion(-34.6, -44.4);
		Ubicacion u2 = new Ubicacion(-34.6, -44.4);
		assertEquals(0.0, u1.distanciaA(u2));
	}
	
	@Test
	public void testDistanciaDiferentes() {
		Ubicacion u1 = new Ubicacion(-34.6, -44.4);
		Ubicacion u2 = new Ubicacion(69.3, -12.2);
		assertEquals(12074050.192458204287701293366908, u2.distanciaA(u1));
	}
	
	@Test 
	public void testSetearNuevaDistancia() {
		Ubicacion u = new Ubicacion(3.3, -23.1);
		FormulaDeDistancia f = new DistanciaEuclidiana();
		u.setFormula(f);
		//test
	}
}
