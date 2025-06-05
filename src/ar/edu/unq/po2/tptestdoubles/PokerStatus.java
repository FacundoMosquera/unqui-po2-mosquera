package ar.edu.unq.po2.tptestdoubles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PokerStatus {

	private Map<String, Integer> cartas;
	private Map<String, Integer> colores;
	
	public PokerStatus() {
			
	}
	
	/*
	public String verificar(String c1, String c2, String c3, String c4, String c5) {
			String[] c = {c1, c2, c3, c4, c5};
			cartas = new HashMap<String, Integer>();
			Map<String, Integer> palos = new HashMap<>();
				
			for(String carta : c) {
				//Agrego cada carta en el mapa junto con el numero de las veces que aparece.
				cartas.put(carta, cartas.getOrDefault(carta, 0) + 1);
				
				//Agrego el último string de cada carta, que indica el palo de la misma. Si ya esta agregada
				// sumo 1 a la cantidad de veces q aparece
				
				String palo = carta.substring(carta.length() - 1);
				palos.put(palo , palos.getOrDefault(palo, 0) + 1);
			}
			
			if(cartas.values().contains(3)) {
				return "Trio";
			} else if(cartas.values().contains(4) || cartas.values().contains(5)) {
				return "Poker";
			} else if (palos.values().stream().anyMatch( p -> p == 5 )) {
				return "Color";
			} else {return "Nada";}
			
	}
	
*/
	
	public String verificar(CartaDePoker c1, CartaDePoker c2, CartaDePoker c3, CartaDePoker c4, CartaDePoker c5) { 
		List<CartaDePoker> aIterar = new ArrayList<CartaDePoker>();
		aIterar.add(c1);
		aIterar.add(c2);
		aIterar.add(c3);
		aIterar.add(c4);
		aIterar.add(c5);
		cartas   = new TreeMap<>();
		colores  = new HashMap<>();
		
		//El valor del map representa las veces que aparece la carta/palo.
		for(CartaDePoker c : aIterar) {
			String cartaString = c.getNumero().name() + "-" + c.getPalo().name();
			cartas.put(cartaString, cartas.getOrDefault(cartaString, 0) + 1);
			colores.put(c.getPalo().color(), colores.getOrDefault(c.getPalo().color(), 0) + 1);
		}
		
		
		if (cartas.values().stream().anyMatch(n -> n > 3))
			return "Poker";
		if(colores.values().contains(5))
			return "Color";
		if (cartas.values().contains(3))
			return "Trio";
		return "Nada";
	}
	
}
