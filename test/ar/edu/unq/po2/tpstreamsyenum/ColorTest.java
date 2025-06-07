package ar.edu.unq.po2.tpstreamsyenum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ColorTest {

	
	@Test
	void testElSiguienteDeRojoEsGris() {
		assertEquals(Color.ROJO.siguienteMancha(), Color.GRIS);
	}
	
	
	@Test
	void testMielEsElUltimoYElSiguienteEsRojo() {
		assertEquals(Color.MIEL.siguienteMancha(), Color.ROJO);
	}
	
	
}
