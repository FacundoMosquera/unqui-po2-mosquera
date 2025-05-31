package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentShape implements IShapeShifte {

	public IShapeShifte compose(IShapeShifte s) {
		List<IShapeShifte> shapes = new ArrayList<IShapeShifte>(2);
		shapes.add(this);
		shapes.add(s);
		return new CompositeShape(shapes);
		
	}
	
	public int deepest() {
		return 0;
	}
	
	public IShapeShifte flat() {
		return this;
	}
	
	public abstract List<Integer> values();
	

}
