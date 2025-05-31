package ar.edu.unq.po2.tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpcomposite.ej2.Parcela;
import ar.edu.unq.po2.tpcomposite.ej2.ParcelaCompuesta;
import ar.edu.unq.po2.tpcomposite.ej2.Soja;
import ar.edu.unq.po2.tpcomposite.ej2.Trigo;

public class ParcelaTest {
	
	
	private ParcelaCompuesta parcelaPrincipal;
	private Parcela p1;
	private Parcela p2;
	private Parcela p3;
	private Parcela p4;
	
	@BeforeEach
	public void setUp() {
		p1 = new Soja();
		p2 = new Trigo();
		p3 = new ParcelaCompuesta(new Soja(), new Soja(), new Trigo(), new Trigo());
		p4 = new Soja();
		parcelaPrincipal = new ParcelaCompuesta(p1, p2, p3, p4);
	}

	@Test
	public void testPrecioTotalDelEnunciado() {
		System.out.println(parcelaPrincipal.getPrecio());
		assertEquals(parcelaPrincipal.getPrecio(), 1700f);
		
	}
}
