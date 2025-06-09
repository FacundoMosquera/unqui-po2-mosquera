package ar.edu.unq.po2.tpstrategy;

public class EncriptacionPorRepresentacionNumeral extends Encriptacion {

	@Override
	public String encriptar(String texto) {
		StringBuilder encriptado = new StringBuilder();
		for(char c : texto.toLowerCase().toCharArray()) {
			int numero = (c == ' ') ? 0 : (c - 'a' + 1);  //Por código ASCII
			encriptado.append(numero);
			encriptado.append(',');
		}
		return encriptado.toString().substring(0, encriptado.length() - 1); // Saco la ',' del ultimo lugar
	}

	@Override
	public String desencriptar(String texto) {
		String[] numeros = texto.split(",");
		StringBuilder desencriptado = new StringBuilder();
		for(String n : numeros) {
			int num = Integer.parseInt(n);
			desencriptado.append((num == 0) ? ' ' : (char) ('a' + num - 1));
		}
		return desencriptado.toString();
	}

}
