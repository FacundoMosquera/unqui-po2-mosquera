package ar.edu.unq.po2.tpstreamsyenum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClubTest {

	private Club club;
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
		
		club = new Club();
		club.agregarActividad(lunjabalina);
		club.agregarActividad(lunfutbol);
		club.agregarActividad(miefutbol);
		club.agregarActividad(vietennis);
	}
	
	
	@Test
	void testTodasLasActividadesDeFutbol() {
		assertEquals(club.todasLasActividadesDeFutbol().size(), 2);
	}
	
	@Test
	void testTodasLasActividadesDeComplejidad() {
		assertEquals(club.todasLasActividadesDeComplejidad(0).size(), 0);
		assertEquals(club.todasLasActividadesDeComplejidad(2).size(), 2);
		assertEquals(club.todasLasActividadesDeComplejidad(4).size(), 1);
		assertEquals(club.todasLasActividadesDeComplejidad(3).size(), 1);
	}
	
	@Test
	void testHorasTotalesEnActividades() {
		assertEquals(club.cantidadDeHorasTotalesDeActividades(), 7);
	}
	
	@Test
	void testActividadesConMenorCosto() {
		assertEquals(club.actividadMenorCostoDe(Deporte.FUTBOL).get(), miefutbol);
		assertEquals(club.actividadMenorCostoDe(Deporte.TENNIS).get(), vietennis);
		assertThrows(Exception.class, () -> club.actividadMenorCostoDe(Deporte.RUNNING).get());
	}
	
	@Test
	void testLasActividadesMasEconomicasDeCadaDeporte() {
		assertEquals(club.lasActividadesMasEconomicasDeCadaDeporte().size(), 3);
		assertEquals(club.lasActividadesMasEconomicasDeCadaDeporte().get(Deporte.FUTBOL), miefutbol);
		
		
		assertEquals(club.lasActividadesMasEconomicasV2().size(), 3);
		assertEquals(club.lasActividadesMasEconomicasV2().get(Deporte.FUTBOL), miefutbol);
	}
}
