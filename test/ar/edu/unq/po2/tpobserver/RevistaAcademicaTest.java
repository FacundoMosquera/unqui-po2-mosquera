package ar.edu.unq.po2.tpobserver;

import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RevistaAcademicaTest {

	private RevistaAcademica revista;
	private Articulo art1;
	private Articulo art2;
	private Investigador investigador;
	
	
	@BeforeEach
	void setUp() {
		revista = new RevistaAcademica();
		investigador = mock(Investigador.class);
		art1 = mock(Articulo.class);
		art2 = mock(Articulo.class);
		
	}
	
	
	@Test
	void testRevistaNotificaCorrectamente() {
		revista.nuevoInteresado(investigador, a -> a.getLugarPublicacion().equals( "MIT"));
		revista.nuevoInteresado(investigador, a -> a.getPalabrasClaves().contains("Funcional") || a.getTipoDeArticulo().equals("Investigación"));
		
		when(art1.getLugarPublicacion()).thenReturn("Harvard");
		when(art1.getPalabrasClaves()).thenReturn(Arrays.asList("Base de Datos", "Objetos", "Persistencia"));
		when(art1.getTipoDeArticulo()).thenReturn("Investigación");
		
		when(art2.getLugarPublicacion()).thenReturn("MIT");
		when(art2.getPalabrasClaves()).thenReturn(Arrays.asList("Funcional"));
		when(art2.getTipoDeArticulo()).thenReturn("Investigación");
		
		revista.agregarNuevoArticulo(art1);
		revista.agregarNuevoArticulo(art2);
		
		verify(investigador).update(art1);
		verify(investigador).update(art2);
		
	}
	
	
}
