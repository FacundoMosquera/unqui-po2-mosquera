package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTest {

	String a;
	String s;
	String t;
	
	@BeforeEach 
	public void setUp() {
		a = "abc";
		s = a;
	}
	
	@Test
	public void testStrings() {
		System.out.println(s.length());
		// System.out.println(t.length());           ----------- Da error porque NULL no sabe responder el mensaje
		System.out.println(1 + a);
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf("i"));
		System.out.println("Quilmes".substring(2, 4));
		System.out.println((a.length() + a).startsWith(a));
		System.out.println(s==a);
		System.out.println(a.substring(1, 3).equals("bc"));
	}
}
