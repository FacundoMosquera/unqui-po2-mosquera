package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

	private Counter counter;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares 
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/**
	 * Verifica la cantidad de pares
	 */
	@Test 
	public void testOddNumbers() {
		
		//Obtengo la cantidad de impares
		int amount = counter.getOddOcurrences();
		
		//Verifico que la cantidad sea la correcta
		assertEquals(amount, 9);
	}
	
	@Test 
	public void testEvenNumbers() {
		
		//Obtengo la cantidad de pares
		int amount = counter.getEvenOcurrences();
		
		//Verifico que la cantidad sea la correcta
		assertEquals(amount, 1);
	}
	
	@Test 
	public void testDivisibility() {
		
		
		//Obtengo la cantidad de divisibles por 1, 3 y 4
		int divisibleBy1 = counter.getNumbersDivisibleBy(1);
		int divisibleBy3 = counter.getNumbersDivisibleBy(3);
		int divisibleBy4 = counter.getNumbersDivisibleBy(4);
		
		//Verifico que la cantidad sea la correcta
		assertEquals(divisibleBy1, 10);
		assertEquals(divisibleBy3, 2);
		assertEquals(divisibleBy4, 1);
	}
	
	@Test
	public void testMostEvenDigits() {
		//Al ser todos numeros con 1 cifra, debería devolver el 4 ya que es el primer y único par en la lista
		assertEquals(counter.numberWithTheMostEvenDigits(), 4);
		
		//Añado un número con 3 cifras pares. Por lo que debería ser el mayor
		counter.addNumber(23456);
		assertEquals(counter.numberWithTheMostEvenDigits(), 23456);
		
	}
	
	@Test
	public void testComunDivisibleMasAlto() {
		assertEquals(counter.highestCommonNumberDivisibleBy(3, 9), 999);
		assertEquals(counter.highestCommonNumberDivisibleBy(7, 999), -1);
	}
	
}
