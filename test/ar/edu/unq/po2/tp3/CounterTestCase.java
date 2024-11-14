package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CounterTestCase {
	
	private Counter counter;
	
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	Counter counter = new Counter();
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
	
	
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
	int amount = counter.getOddNumbers();
	// I check the amount is the expected one
	assertEquals(amount, 9);
	}
}