package ar.edu.unq.po2.tp4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PruebaHoras {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat horario = new SimpleDateFormat("HH:mm");
		String quehora =horario.format(now);
		System.out.println(quehora);
	}

}
