package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTest {

	private Rectangulo rectangulo1;
	private Point inicio;
	
	@BeforeEach
	public void setUp() {
		inicio = new Point(1, 5);
	}

	
	@Test
	public void testIniciarlizarConNumeroNegativo() throws Exception{
		assertThrows(Exception.class, () -> rectangulo1 = new Rectangulo(inicio, -43, -20));
	}
	
	
	
}
