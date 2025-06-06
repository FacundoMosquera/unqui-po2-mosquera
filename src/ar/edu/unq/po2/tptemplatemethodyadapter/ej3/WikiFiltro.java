package ar.edu.unq.po2.tptemplatemethodyadapter.ej3;

import java.util.List;

import java.util.function.*;

public abstract class WikiFiltro {

	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		return wikipedia.stream().filter(this.condition(page)).toList();
	}
	
	public Predicate<WikipediaPage> condition(WikipediaPage p) {
		return (w) -> true;
	}

	
	
}
