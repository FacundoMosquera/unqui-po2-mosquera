package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.List;

public interface IShapeShifte {

	public IShapeShifte compose(IShapeShifte s);
	
	public int deepest();
	
	public IShapeShifte flat();
	
	public List<Integer> values();
	
}
