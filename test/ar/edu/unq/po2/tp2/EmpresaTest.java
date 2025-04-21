package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

	
	Empresa pixelem;
	
	//----- variables de empleados
	Empleado eduardo;
	Empleado javier;
	Empleado rafael;
	
	
	@BeforeEach
	public void setUp() {
		pixelem = new Empresa();
		eduardo = new EmpleadoPermanente("Eduardo Montiel", "Belgrano 368", "Casado", LocalDate.of(1977, 5, 19), 1250000.00 , 25, 3, true );
		javier = new EmpleadoTemporal("Javier Negre", "Lavalle 502", "Soltero", LocalDate.of(1984, 11, 28), 800000.00, LocalDate.of(2026, 1, 1), 20);
		rafael = new EmpleadoContratado("Rafael Sánchez", "Avellaneda 1020", "Soltero", LocalDate.of(1999, 2, 22), 500000.0, 1, "Cheque");
		pixelem.contratarEmpleado(eduardo);
		pixelem.contratarEmpleado(javier);
		pixelem.contratarEmpleado(rafael);
	}
	
	@Test 
	public void testCalculoTotalSueldosNetos() {
		assertEquals(pixelem.montoTotalSueldosNetosDeEmpleados(), eduardo.getSueldoNeto() + javier.getSueldoNeto() + rafael.getSueldoNeto());
	}
	
	@Test 
	public void testLiquidacionDeSueldos() {
		pixelem.liquidacionDeSueldos();
		assert(pixelem.getRecibosHaberes().size() == 3);
		pixelem.liquidacionDeSueldos();
		assert(pixelem.getRecibosHaberes().size() == 6);
			
	}
	
}
