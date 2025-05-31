package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends ComponentShape {

	private List<IShapeShifte> shapes;
	
	public CompositeShape(List<IShapeShifte> s) {
		shapes = s;
	}
	
	
	@Override
	public IShapeShifte compose(IShapeShifte s) {
		List<IShapeShifte> shapes = new ArrayList<IShapeShifte>(2);
		shapes.add(this);
		shapes.add(s);
		return new CompositeShape(shapes);
	}

	@Override
	public int deepest() {
		int height = 0;
		for(IShapeShifte s : shapes) {
			height = Math.max(height, s.deepest());
		}
		return 1 + height;
	}

	@Override
	public IShapeShifte flat() {
		List<Integer> values = this.values();
		List<IShapeShifte> shapes = new ArrayList<IShapeShifte>();
		for(Integer n : values) {
			shapes.add(new LeafShape(n));
		}
		return new CompositeShape(shapes);
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for(IShapeShifte s : shapes) {
			values.addAll(s.values());
		}
		return values;
	}


}
