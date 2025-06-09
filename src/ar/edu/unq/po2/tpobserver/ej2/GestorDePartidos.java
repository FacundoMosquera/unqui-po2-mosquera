package ar.edu.unq.po2.tpobserver.ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorDePartidos {

	private Map<Deporte, List<SportFan>> fans;
	
	public GestorDePartidos() {
		fans = new HashMap<>();
	}
	
	public void nuevoSportFan(SportFan fan, Deporte deporte) {
		if(fans.containsKey(deporte))
			fans.get(deporte).add(fan);
		else {fans.put(deporte, new ArrayList<>(List.of(fan)));}
	}
	
	public void eliminarSportFan(SportFan fan, Deporte deporte) {
		if(fans.containsKey(deporte))
			fans.get(deporte).remove(fan);
	}
	
	public void nuevoPartido(Partido partido) {
		for(SportFan fan : fans.getOrDefault(partido.getDeporte(), new ArrayList<>())) {
			fan.update(partido);
		}
	}
}
