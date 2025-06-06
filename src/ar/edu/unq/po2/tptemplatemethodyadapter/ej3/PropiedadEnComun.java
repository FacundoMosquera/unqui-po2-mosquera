package ar.edu.unq.po2.tptemplatemethodyadapter.ej3;

import java.util.Map;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class PropiedadEnComun extends WikiFiltro {

	@Override
	public Predicate<WikipediaPage> condition(WikipediaPage p) {
		return (w) -> this.propertiesInCommon(p, w);
	}
	
	/*
	private boolean propertiesInCommon(WikipediaPage p1, WikipediaPage p2) {
		String[] infoboxP1 = p1.getInfobox().keySet().toArray(new String[0]);
		Map<String, WikipediaPage> infoboxP2 = p2.getInfobox();
		boolean havePropertiesInCommon = false;
		int i = 0;
		while(!havePropertiesInCommon && i < infoboxP1.length) {
			havePropertiesInCommon = infoboxP2.containsKey(infoboxP1[i]);
			i++;
		}
		return havePropertiesInCommon;	
	}
	*/
	
	
	private boolean propertiesInCommon(WikipediaPage p1, WikipediaPage p2) {
		return p1.getInfobox().keySet().stream().anyMatch((s) -> p2.getInfobox().containsKey(s));
	}

}
