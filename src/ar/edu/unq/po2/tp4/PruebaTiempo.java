package ar.edu.unq.po2.tp4;

import java.time.LocalDate;


public class PruebaTiempo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LocalDate dia = LocalDate.now();
		LocalDate dia2 = LocalDate.now();
		LocalDate diaAnterior =  LocalDate.of(2024,11,27);
		LocalDate ignorar = LocalDate.of(2024,11,28);
		System.out.println(dia.until(ignorar).getDays() - 1);
		System.out.println(dia.until(dia2).getDays());
		
	}

}
