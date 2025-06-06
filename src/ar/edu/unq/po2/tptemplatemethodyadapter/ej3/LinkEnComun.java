package ar.edu.unq.po2.tptemplatemethodyadapter.ej3;

import java.util.List;
import java.util.function.Predicate;

public class LinkEnComun extends WikiFiltro {
	
	@Override
	public Predicate<WikipediaPage> condition(WikipediaPage p) {
		return (w) -> this.havePageInCommon(p, w);
	}
	
	private boolean havePageInCommon(WikipediaPage p1, WikipediaPage p2) {
		List<WikipediaPage> linksP1 = p1.getLinks();
		List<WikipediaPage> linksP2 = p2.getLinks();
		
		boolean haveCommonPage = false;
		for(WikipediaPage page : linksP1) {
			if(linksP2.contains(page))
				return true;
		}
		return haveCommonPage;
		
	}
}
