package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testMultioperador {

	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() {
		//Inicializo la variable
		multioperador = new Multioperador();

		//Añado los números
		multioperador.addNumber(34.5);
		multioperador.addNumber(334.0);
		multioperador.addNumber(-12.3);
		multioperador.addNumber(0.554);
		multioperador.addNumber(24.8);
		multioperador.addNumber(-5.0);
	}
	
	@Test 
	public void testSum() {
		assertEquals(multioperador.sum(), 376.554);
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(multioperador.subtraction(), -307.554);
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(multioperador.multiplication(), 9736483.2984);
	}
	
}
