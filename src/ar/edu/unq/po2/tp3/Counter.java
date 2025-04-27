package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class Counter {
	
	private ArrayList<Integer> numbers;

	
	public Counter() {
		this.numbers = new ArrayList<Integer>();
	}
	
	
	public void addNumber(int n) {
		this.numbers.add(n);
	}
	
	
	public void removeNumber(int n) {
		this.numbers.remove(n);
	}
	
	
	public int getEvenOcurrences() {
		int even = 0;
		for(int number : this.numbers) {
			if(isEvenNumber(number)) {even += 1;}
		}
		return even;
	}
	
	public int getOddOcurrences() {
		int odd = 0;
		for(int number : this.numbers) {
			if( ! isEvenNumber(number)) {odd += 1;}
		}
		return odd;
	}
	
	public int getNumbersDivisibleBy(int n) {
		int divisibles = 0;
		for(int number : this.numbers) {
			if(number % n == 0) {divisibles +=1;}
		}
		return divisibles;
	}
	
	public int numberWithTheMostEvenDigits() {
		int mostEvenDigits = numbers.getFirst();
		for(int number : numbers) {
			if(this.numberOfEvenDigits(mostEvenDigits) < this.numberOfEvenDigits(number)) {
				mostEvenDigits = number;
			}
		}
		return mostEvenDigits;
	}
	
	
	public int numberOfEvenDigits(int n) {
		// Inicializo las variables
		int evenDigits = 0;
		int number = n;
		
		while(number > 0) {
			// testeo la última cifra. Si es par, le sumo 1 a la cuenta. Si es impar, no cuento. En ambos casos, le saco el último dígito al número antes de volver a evaluar.
			if(isEvenNumber(number)) {
				evenDigits += 1;
				number = number / 10;
			} else {number = number / 10;}
		}
		return evenDigits;
	}
	
	public int highestCommonNumberDivisibleBy(int x, int y) {
		/**
		 * devuelve el numero divisible más grande entre 1 y 1000 por ambos enteros dados. 
		 * Caso de que no se encuentre, se devolverá -1
		 */
		int divisibleMasGrande = 1000;
		while(divisibleMasGrande > 0 && ! (this.canBeDividedBy(divisibleMasGrande, x) && this.canBeDividedBy(divisibleMasGrande, y)) ) {
	
			divisibleMasGrande = divisibleMasGrande - 1;
		}
		return (divisibleMasGrande > 0) ? divisibleMasGrande : -1;
	}
	
	
	
	private boolean isEvenNumber(int n) {
		return (n % 2) == 0;
	}
	
	public boolean canBeDividedBy(int n, int m) {
		return (n % m) == 0;
	}
	
}