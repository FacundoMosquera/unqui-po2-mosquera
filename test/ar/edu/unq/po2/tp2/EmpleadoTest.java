package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmpleadoTest {
	
	Empleado eduardo;
	Empleado javier;

	@BeforeEach
	public void setUp() {
		eduardo = new EmpleadoPermanente("Eduardo Montiel", "Belgrano 368", "Casado", LocalDate.of(1977, 5, 19), 1250000.00 , 25, 3, true );
		javier = new EmpleadoTemporal("Javier Negri", "Lavalle 502", "Soltero", LocalDate.of(1984, 11, 28), 800000.00, LocalDate.of(2026, 1, 1), 20);
	}
	
	@Test 
	public void testEdad() {
		
		assertEquals(eduardo.getEdad(), 47 );
		assertEquals(javier.getEdad(), 40);
	}
	
	@Test
	public void testSueldoBruto() {
		assertEquals(eduardo.getSueldoBruto(), 1251800);
		assertEquals(javier.getSueldoBruto(),800800);
	}
	
	@Test
	public void testRetenciones() {
		assertEquals(eduardo.getRetenciones(), 313010);
		assertEquals(javier.getRetenciones(), 160260);
	}
	
	@Test
	public void testSueldoNeto() {
		assertEquals(eduardo.getSueldoNeto(), 938790);
		assertEquals(javier.getSueldoNeto(), 640540);
	}
	
	
}
