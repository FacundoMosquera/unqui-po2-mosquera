package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.ArrayList;
import java.util.List;

public class LeafShape extends ComponentShape {
	
	private Integer value;
	
	public LeafShape(Integer n) {
		this.value = n;
	}
	
	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>(1);
		values.add(value);
		return values;
	}

	
}
