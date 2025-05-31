package ar.edu.unq.po2.tpcomposite.ej2;

import java.util.ArrayList;
import java.util.List;

public class ParcelaCompuesta extends Parcela{

	private List<Parcela> parcelas;
	
	public ParcelaCompuesta(Parcela p1, Parcela p2, Parcela p3, Parcela p4) {
		parcelas = new ArrayList<Parcela>(4);
		parcelas.add(p1);
		parcelas.add(p2);
		parcelas.add(p3);
		parcelas.add(p4);
	}
	
	public Float getPrecio() {
		Float precio = 0f;
		for(Parcela p : parcelas) {
			precio += p.getPrecio();
		}
		return precio / 4;
	}
	
	@Override
	public void setDivision(Parcela p1, Parcela p2, Parcela p3, Parcela p4) {
		parcelas.clear();
		parcelas.add(p1);
		parcelas.add(p2);
		parcelas.add(p3);
		parcelas.add(p4);
	}
}
