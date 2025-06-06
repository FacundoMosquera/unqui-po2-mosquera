package ar.edu.unq.po2.tptemplatemethodyadapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	private Pasante pasante;
	private EmpleadoTemporario temporario;
	private EmpleadoPlanta planta;
	
	@BeforeEach
	void setUp() {
		pasante    = new Pasante(80);
		temporario = new EmpleadoTemporario(160, false, true);
		planta     = new EmpleadoPlanta(2);  
	}
	
	
	 @Test
	 void testPasanteCalculaSuSueldo() {
		 assertEquals(pasante.sueldo(), 2784d);
	 }
	 
	 @Test 
	 void testTemporarioCalculaSuSueldo() {
		 assertEquals(temporario.sueldo(), 1653d);
	 }
	 
	 @Test
	 void testEmpleadoPlantaCalculaSuSueldo() {
		 assertEquals(planta.sueldo(), 2871d);
	 }
	
}
