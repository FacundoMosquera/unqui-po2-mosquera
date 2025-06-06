package ar.edu.unq.po2.tptemplatemethodyadapter.ej8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IteratorAdapterTest {

	private Enumeration<String> adapter;
	
	
	@BeforeEach
	void setUp() {
		List<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		Iterator<String> iterator = lista.iterator();
		adapter = new IteratorAdapter<String>(iterator);
	}
	
	
	@Test
	void testIteratorAdapterRespondeCorrectamente() {
		assertTrue(adapter.hasMoreElements());
		assertEquals(adapter.nextElement(), "A");
		
		assertTrue(adapter.hasMoreElements());
		assertEquals(adapter.nextElement(), "B");
		
		assertTrue(adapter.hasMoreElements());
		assertEquals(adapter.nextElement(), "C");
		
		assertFalse(adapter.hasMoreElements());
		
		assertThrows(Exception.class, () -> adapter.nextElement());
	}
	
	
}
