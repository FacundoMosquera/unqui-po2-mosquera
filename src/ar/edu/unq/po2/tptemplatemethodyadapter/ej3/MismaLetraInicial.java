package ar.edu.unq.po2.tptemplatemethodyadapter.ej3;

import java.util.function.Predicate;

public class MismaLetraInicial extends WikiFiltro {

	@Override
	public Predicate<WikipediaPage> condition(WikipediaPage p) {
		return (w) -> !p.getTitle().isEmpty() &&
					  !w.getTitle().isEmpty() &&
					  p.getTitle().charAt(0) == w.getTitle().charAt(0);
	}
	
}
