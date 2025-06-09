package ar.edu.unq.po2.tpstrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorNaiveTest {

	private EncriptadorNaive encriptador;
	private String texto;
	
	
	
	@BeforeEach
	void setUp() {
		encriptador = new EncriptadorNaive();
		texto = "Hola Mundo desde Java";
	}
	
	@Test
	void testEncriptacionPorDefecto() {
		String textoEncriptado = encriptador.encriptar(texto);
		
		assertEquals(textoEncriptado, "Java desde Mundo Hola");
		assertEquals(encriptador.desencriptar(textoEncriptado), "Hola Mundo desde Java");
		
	}
	
	@Test
	void testEncriptacionReemplazoDeVocales() {
		encriptador.setEncriptacion(new EncriptacionPorReemplazoDeVocales());
		
		String textoEncriptado = encriptador.encriptar(texto);
		
		assertEquals(textoEncriptado, "Hule Mandu disdi Jeve");
		assertEquals(encriptador.desencriptar(textoEncriptado), "Hola Mundo desde Java");
	}
	
	@Test
	void testEncriptacionPorRepresentacionNumeral() {
		encriptador.setEncriptacion(new EncriptacionPorRepresentacionNumeral());
		
		String textoEncriptado = encriptador.encriptar(texto);
		
		assertEquals(textoEncriptado, "8,15,12,1,0,13,21,14,4,15,0,4,5,19,4,5,0,10,1,22,1");
		assertEquals(encriptador.desencriptar(textoEncriptado), "Hola Mundo desde Java".toLowerCase());
	}
}
