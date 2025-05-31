package ar.edu.unq.po2.tpcomposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpcomposite.ej6.*;

public class IShapeTest {

	private IShapeShifte a;
	private IShapeShifte b;
	private IShapeShifte c;
	private IShapeShifte d;
	private IShapeShifte eSub1;
	private IShapeShifte eSub2;
	
	@BeforeEach
	public void setUp() {
		a     = new LeafShape(1);
		b     = new LeafShape(2);
		d     = new LeafShape(3);
		eSub1 = new LeafShape(5);
		eSub2 = new LeafShape(6);
		c     = a.compose(b); 
	}
	
	@Test
	public void testLeafRespondenCorrectamente() {
		assertEquals(a.deepest(), 0);
		List<Integer> value = a.values(); 
		assertEquals(value.size(),1);
		assertEquals(a.flat(), a);
	}
	
	@Test
	public void testCompositeC() {
		assertEquals(c.deepest(), 1);
		assertEquals(c.values().size(), 2);
	}
	
	@Test
	public void testAlturaDeF() {
		IShapeShifte e  = eSub1.compose(eSub2);
		IShapeShifte dc = d.compose(c);
		IShapeShifte f  = dc.compose(e);
		
		assertEquals(f.deepest(), 3);
	}
	
	@Test
	public void testAlturaDeFDespuesDeFlat() {
		IShapeShifte e  = eSub1.compose(eSub2);
		IShapeShifte dc = d.compose(c);
		IShapeShifte f  = dc.compose(e);
		IShapeShifte g  = f.flat();
		
		assertEquals(g.deepest(), 1);
	}
	
	@Test
	public void testValoresDeG() {
		IShapeShifte e  = eSub1.compose(eSub2);
		IShapeShifte dc = d.compose(c);
		IShapeShifte f  = dc.compose(e);
		IShapeShifte g  = f.flat();
		
		System.out.println(g.values());
		assertEquals(g.values().size(), 5);
	}
}
