package ar.edu.unq.po2.tpstreamsyenum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ActividadSemanalTest {

	private ActividadSemanal lunfutbol;
	private ActividadSemanal miefutbol;
	private ActividadSemanal lunjabalina;
	private ActividadSemanal vietennis;
	
	
	@BeforeEach
	void setUp() {
		lunfutbol   = new ActividadSemanal(Dia.LUNES, 2, Deporte.FUTBOL);
		miefutbol   = new ActividadSemanal(Dia.MIERCOLES, 1, Deporte.FUTBOL);
		lunjabalina = new ActividadSemanal(Dia.LUNES, 2, Deporte.JABALINA);
		vietennis   = new ActividadSemanal(Dia.VIERNES, 2, Deporte.TENNIS);
	}
	
	@Test
	void testCostoDeLaActividad() {
		assertEquals(lunfutbol.getCostoDeLaActividad(), 1400);
		assertEquals(miefutbol.getCostoDeLaActividad(), 900);
		assertEquals(lunjabalina.getCostoDeLaActividad(), 1800);
		assertEquals(vietennis.getCostoDeLaActividad(), 2600);
	}
	
	@Test
	void testStreamTodasLasActividadesDeFutbol() {
		List<ActividadSemanal> agenda = Arrays.asList(lunfutbol, miefutbol, lunjabalina, vietennis);
		assertEquals(agenda
				.stream()
				.filter((a) -> a.getDeporte() == Deporte.FUTBOL)
				.toList()
				.size(),  2);
	}
	
}
