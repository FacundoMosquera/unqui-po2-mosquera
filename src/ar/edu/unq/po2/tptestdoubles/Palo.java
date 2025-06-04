package ar.edu.unq.po2.tptestdoubles;

public enum Palo {

	PICA, DIAMANTE, CORAZON, TREBOL;
	
	public String color() {
		if (this == Palo.PICA || this == Palo.TREBOL)
			return "Negro";
		return "Rojo";
		
	}
}
