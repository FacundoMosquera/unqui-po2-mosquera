package ar.edu.unq.po2.tpstreamsyenum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Club {

	List<ActividadSemanal> actividades;
	
	public Club() {
		actividades = new ArrayList<>();
	}
	
	public void agregarActividad(ActividadSemanal a) {
		actividades.add(a);
	}
	
	public void eliminarActividad(ActividadSemanal a) {
		actividades.remove(a);
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol() {
		return actividades
				.stream()
				.filter(a -> a.getDeporte() == Deporte.FUTBOL)
				.toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeComplejidad(int n) {
		return actividades
				.stream()
				.filter(a -> a.getDeporte().getComplejidad() == n)
				.toList();
	}
	
	public int cantidadDeHorasTotalesDeActividades() {
		return actividades
				.stream()
				.mapToInt(a -> a.getDuracion())
				.sum();
	}
	

	public Optional<ActividadSemanal> actividadMenorCostoDe(Deporte d) {
		return actividades
				.stream()
				.filter(a -> a.getDeporte() == d)
				.min(Comparator.comparingInt(a -> a.getCostoDeLaActividad()));
	}
	
	public Map<Deporte, ActividadSemanal> lasActividadesMasEconomicasDeCadaDeporte() {
		List<Deporte> deportes = actividades.stream().map(a -> a.getDeporte()).distinct().toList();
		Map<Deporte, ActividadSemanal> resultado = new HashMap<>();
		for(Deporte d : deportes) {
			resultado.put(d, actividades.stream().filter(a -> a.getDeporte() == d).min(Comparator.comparingInt(ActividadSemanal::getCostoDeLaActividad)).get());
		}
		return resultado;
	}
	
	public Map<Deporte, ActividadSemanal> lasActividadesMasEconomicasV2() {
		return actividades
				.stream()
				.collect(Collectors
						.groupingBy(ActividadSemanal::getDeporte, Collectors.collectingAndThen(Collectors
								.minBy(Comparator.comparingInt(ActividadSemanal::getCostoDeLaActividad)), Optional::get)));
	}
}
