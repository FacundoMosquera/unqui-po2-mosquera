package ar.edu.unq.po2.tptestdoubles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PokerStatusMockitoTest {
	
	private CartaDePoker c1;
	private CartaDePoker c2;
	private CartaDePoker c3;
	private CartaDePoker c4;
	private CartaDePoker c5;
	
	private PokerStatus p;

	@BeforeEach
	public void setUp() {
		c1 = mock(CartaDePoker.class);
		c2 = mock(CartaDePoker.class);
		c3 = mock(CartaDePoker.class);
		c4 = mock(CartaDePoker.class);
		c5 = mock(CartaDePoker.class);
		
		p = new PokerStatus();
	}

	@Test
	void testElJugadorConsiguePokerCon4CartasIguales() {
		when(c1.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c2.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c3.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c4.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c5.getNumero()).thenReturn(RangoDeCarta.AS);
		
		when(c1.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c2.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c3.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c4.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c5.getPalo()).thenReturn(Palo.TREBOL);
		
		
		assertEquals(p.verificar(c1, c2, c3, c4, c5), "Poker");
		
		verify(c1, atLeastOnce()).getPalo();
	}
	
	@Test 
	void testElJugadorConsigueColor() {
		when(c1.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c2.getNumero()).thenReturn(RangoDeCarta.NUEVE);
		when(c3.getNumero()).thenReturn(RangoDeCarta.JOTA);
		when(c4.getNumero()).thenReturn(RangoDeCarta.CINCO);
		when(c5.getNumero()).thenReturn(RangoDeCarta.AS);
		
		when(c1.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c2.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c3.getPalo()).thenReturn(Palo.CORAZON);
		when(c4.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c5.getPalo()).thenReturn(Palo.CORAZON);
		
		String resultado = p.verificar(c1, c2, c3, c4, c5);
		assertEquals(resultado, "Color");
		
	}
	
	@Test
	void testElJugadorConsigueTrio() {
		when(c1.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c2.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c3.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c4.getNumero()).thenReturn(RangoDeCarta.DOS);
		when(c5.getNumero()).thenReturn(RangoDeCarta.AS);
		
		when(c1.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c2.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c3.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c4.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c5.getPalo()).thenReturn(Palo.TREBOL);
		
		String resultado = p.verificar(c1, c2, c3, c4, c5);
		assertEquals(resultado, "Trio");
	}
	
	@Test
	void testElJugadorNoConsigueNada() {
		when(c1.getNumero()).thenReturn(RangoDeCarta.DIEZ);
		when(c2.getNumero()).thenReturn(RangoDeCarta.NUEVE);
		when(c3.getNumero()).thenReturn(RangoDeCarta.JOTA);
		when(c4.getNumero()).thenReturn(RangoDeCarta.CINCO);
		when(c5.getNumero()).thenReturn(RangoDeCarta.AS);
		
		when(c1.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c2.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c3.getPalo()).thenReturn(Palo.CORAZON);
		when(c4.getPalo()).thenReturn(Palo.DIAMANTE);
		when(c5.getPalo()).thenReturn(Palo.TREBOL);
		
		String resultado = p.verificar(c1, c2, c3, c4, c5);
		assertEquals(resultado, "Nada");
	}
	
}
