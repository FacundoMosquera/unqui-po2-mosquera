package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class Counter {
	
	private ArrayList<Integer> numeros;
	
	public void addNumber(int n) {
		this.numeros.add(n);
	}
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public int getEvenNumbers() {
		int even = 0;
		for(int number : this.numeros) {
			if(number % 2 == 0) {even += 1;}
		}
		return even;
	}
	
	public int getOddNumbers() {
		int odd = 0;
		for(int number : this.numeros) {
			if(number % 2 != 0) {odd += 1;}
		}
		return odd;
	}
	
}