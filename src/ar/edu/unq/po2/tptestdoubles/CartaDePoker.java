package ar.edu.unq.po2.tptestdoubles;

public class CartaDePoker implements Comparable<CartaDePoker> {

	private final RangoDeCarta numero;
	private  final Palo palo;
	
	public CartaDePoker(RangoDeCarta numero, Palo palo) {
		this.numero = numero;
		this.palo = palo; 
		}
	
	public Palo getPalo() { return palo; }
	
	public RangoDeCarta getNumero() {return numero;}
	
	public boolean esMismoPalo(CartaDePoker c) {
		return this.palo == c.getPalo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		CartaDePoker c = (CartaDePoker) obj;
		
		return this.getNumero() == c.getNumero() && this.esMismoPalo(c);
		
}
	
	public boolean esMasAltaQue(CartaDePoker c) { 
		return this.getNumero().compareTo(c.getNumero()) > 0;
	}
	
	public boolean tieneMismoNumero(CartaDePoker c) {
		return this.getNumero().compareTo(c.getNumero()) == 0;
	}

	@Override
	public int compareTo(CartaDePoker o) {

		if(this.tieneMismoNumero(o))
			return 0;
		if(this.esMasAltaQue(o))
			return 1;
		return -1;
		
	}
	
	
}
