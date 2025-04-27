package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PointTest {

	Point p;
	
	@BeforeEach
	public void setUp() {
		p = new Point(3,4);
	}
	
	@Test
	public void testSumaDePuntos() {
		Point puntoASumar = new Point(2,2);
		Point nuevoPunto = p.sumarPunto(puntoASumar);
		
		assertEquals(nuevoPunto.getCoordenadaX(), 5);
		assertEquals(nuevoPunto.getCoordenadaY(), 6);
	}
}
