package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	private List<Double> numbers;
	
	public Multioperador() {
		this.numbers = new ArrayList<Double>();
	}
	
	public void addNumber(Double n) {
		this.numbers.add(n);
	}
	
	public void removeNumber(Double n) {
		this.numbers.remove(n);
	}
	
	public Double sum() {
		Double amount = 0.0;
		for(Double number : numbers) {
			amount += number;
		}
		return amount;
	}
	
	public Double subtraction() {
		Double amount = numbers.getFirst();
		for(int i=1;i < numbers.size(); i++) {
			amount = amount - numbers.get(i); 
		}
		return amount;
	}
	
	public Double multiplication() {
		Double amount = 1.0;
		for(Double number : numbers) {
			amount = amount * number ;
		}
		return amount;
	}
	
}
