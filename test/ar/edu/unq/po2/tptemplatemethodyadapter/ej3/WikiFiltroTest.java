package ar.edu.unq.po2.tptemplatemethodyadapter.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WikiFiltroTest {

	private LinkEnComun link;
	private MismaLetraInicial sameLetter;
	private PropiedadEnComun  samePropertie;
	
	private WikipediaPage p1;
	private WikipediaPage p2;
	private WikipediaPage p3;
	private WikipediaPage p4;
	private WikipediaPage p5;
	
	private List<WikipediaPage> paginas;
	
	
	@BeforeEach
	void setUp() {
		link = new LinkEnComun();
		sameLetter = new MismaLetraInicial();
		samePropertie = new PropiedadEnComun();
		
		p1 = mock(WikipediaPage.class);
		p2 = mock(WikipediaPage.class);
		p3 = mock(WikipediaPage.class);
		p4 = mock(WikipediaPage.class);
		p5 = mock(WikipediaPage.class);
		
		paginas = new ArrayList<>();
		this.paginas.add(p2);
		this.paginas.add(p3);
		this.paginas.add(p4);
		this.paginas.add(p5);
	}
	
	@Test
	void testSeUsaElFiltroDeLinkEnComunYEncuentraMatches() {
		List<WikipediaPage> lista1    = new ArrayList<>();
		List<WikipediaPage> miniLista = new ArrayList<>();
		miniLista.add(p2);
		lista1.add(p2);
		lista1.add(p3);
		lista1.add(p4);
		when(p1.getLinks()).thenReturn(lista1);
		when(p2.getLinks()).thenReturn(new ArrayList<WikipediaPage>());
		when(p3.getLinks()).thenReturn(miniLista);
		when(p4.getLinks()).thenReturn(lista1);
		when(p5.getLinks()).thenReturn(new ArrayList<WikipediaPage>());
		
		assertEquals(link.getSimilarPages(p1, paginas).size(), 2);
		
		
	}
	
	@Test 
	void testSeUsaElFiltroPropiedadEnComunYEncuentraMatches() {
		Map<String, WikipediaPage> infoboxP1 = Map.of("capital", p2);
		Map<String, WikipediaPage> infoboxP3 = Map.of("capital", p4); 
		Map<String, WikipediaPage> infoboxP4 = Map.of("poblacion", p1); 
		
		paginas.remove(p2);
		paginas.remove(p5);
		
		when(p1.getInfobox()).thenReturn(infoboxP1);
		when(p3.getInfobox()).thenReturn(infoboxP3); 
		when(p4.getInfobox()).thenReturn(infoboxP4);
		
		assertEquals(samePropertie.getSimilarPages(p1, paginas).size(), 1);
	}
	
	@Test
	void testSeUsaElFiltroMismaLetraInicialYEncuentraMatches() {
		
		when(p1.getTitle()).thenReturn("Argentina");
		when(p2.getTitle()).thenReturn("Alemania");
		when(p3.getTitle()).thenReturn("España");
		when(p4.getTitle()).thenReturn(" ");
		when(p5.getTitle()).thenReturn("");
		

		assertEquals(sameLetter.getSimilarPages(p1, paginas).size(), 1);
		
	}
}
