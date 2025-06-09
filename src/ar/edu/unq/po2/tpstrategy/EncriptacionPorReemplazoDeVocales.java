package ar.edu.unq.po2.tpstrategy;

import java.util.HashMap;
import java.util.Map;

public class EncriptacionPorReemplazoDeVocales extends Encriptacion {
	
	private Map<Character, Character> siguienteChar;
	private Map<Character, Character> anteriorChar;
	
	
	public EncriptacionPorReemplazoDeVocales() {
		siguienteChar = new HashMap<>();
		siguienteChar.put('a', 'e');
		siguienteChar.put('e', 'i');
		siguienteChar.put('i', 'o');
		siguienteChar.put('o', 'u');
		siguienteChar.put('u', 'a');
		
		anteriorChar = new HashMap<>();
		for(Map.Entry<Character, Character> entry : siguienteChar.entrySet()) {
			anteriorChar.put(entry.getValue(), entry.getKey());
		}
	}
	
	
	
	@Override
	public String encriptar(String texto) {
		StringBuilder encriptado = new StringBuilder();
		for(char c : texto.toCharArray()) {
			encriptado.append(siguienteChar.getOrDefault(c, c));
		}
		return encriptado.toString();
	}

	@Override
	public String desencriptar(String texto) {
		StringBuilder desencriptado = new StringBuilder();
		for(char c : texto.toCharArray()) {
			desencriptado.append(anteriorChar.getOrDefault(c, c));
		}
		return desencriptado.toString();
	}

	
}
