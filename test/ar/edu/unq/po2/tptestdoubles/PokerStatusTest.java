package ar.edu.unq.po2.tptestdoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
// variables de cartas 
	private CartaDePoker c1;
	private CartaDePoker c2;
	private CartaDePoker c3;
	private CartaDePoker c4;
	private CartaDePoker c5;
	private CartaDePoker c6; 
	private CartaDePoker c7;
	private CartaDePoker c8;
	private CartaDePoker c9;
	private CartaDePoker c10;
	private CartaDePoker c11;
	
	
// variable para la clase PokerStatus
	private PokerStatus ps;
	
	@BeforeEach
	void setUp() {
// Declaro 5 cartas iguales.
		c1 = new CartaDePoker(RangoDeCarta.CUATRO, Palo.CORAZON);
		c2 = new CartaDePoker(RangoDeCarta.CUATRO, Palo.CORAZON);
		c3 = new CartaDePoker(RangoDeCarta.CUATRO, Palo.CORAZON);
		c4 = new CartaDePoker(RangoDeCarta.CUATRO, Palo.CORAZON);
		c5 = new CartaDePoker(RangoDeCarta.CUATRO, Palo.CORAZON);
		
// Demás cartas		
		c6  = new CartaDePoker(RangoDeCarta.REINA, Palo.PICA);
		c7  = new CartaDePoker(RangoDeCarta.DOS, Palo.CORAZON);
		c8  = new CartaDePoker(RangoDeCarta.NUEVE, Palo.CORAZON);
		c9  = new CartaDePoker(RangoDeCarta.JOTA, Palo.CORAZON);
		c10 = new CartaDePoker(RangoDeCarta.DOS, Palo.DIAMANTE);
		c11 = new CartaDePoker(RangoDeCarta.AS, Palo.TREBOL);
		
		ps = new PokerStatus();
	}

	@Test
	void testElJugadorConsiguePokerAlTener4CartasIguales() {
		
		// inicializo la clase con 4 cartas iguales
		assertEquals(ps.verificar(c1, c2, c3, c4, c7), "Poker");
		
	}
	
	@Test
	void testElJugadorConsiguePokerCon5CartasIguales() {
		assertEquals(ps.verificar(c1, c2, c3, c4, c5), "Poker");
	}
	
	@Test
	void testElJugadorConsigueTrio() {
		assertEquals(ps.verificar(c1, c2, c3, c6, c7), "Trio");
	}
	

	@Test
	void testElJugadorConsigueColor() {
		assertEquals(ps.verificar(c7, c8, c9, c10, c5), "Color");
	}
	
	@Test
	void testElJugadorNoTieneNada() {
		assertEquals(ps.verificar(c1, c2, c6, c11, c9), "Nada");
	}
	
	@Test
	void testElJugadorTiene5CartasConElMismoNumeroPeroPalosVariados() {
		c1 = new CartaDePoker(RangoDeCarta.REINA, Palo.TREBOL);
		c2 = new CartaDePoker(RangoDeCarta.REINA, Palo.DIAMANTE);
		c3 = new CartaDePoker(RangoDeCarta.REINA, Palo.CORAZON);
		c4 = new CartaDePoker(RangoDeCarta.REINA, Palo.PICA);
		c5 = new CartaDePoker(RangoDeCarta.REINA, Palo.TREBOL);
		
		String resultado = ps.verificar(c1, c2, c3, c4, c5);
		assertEquals(resultado, "Nada");
		
	}
}
