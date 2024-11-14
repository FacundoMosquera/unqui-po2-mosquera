package ar.edu.unq.po2.tpfinal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeriodoDisponible {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
//--------------------------------------------CONSTRUCTOR--------------------------------------------
	public PeriodoDisponible(LocalDate inicio, LocalDate fin) throws Exception {
		if(inicio.isBefore(fin) || inicio.isEqual(fin)) {
		this.setFechaInicio(inicio);
		this.setFechaFin(fin);
		}
		else {new Exception("La fecha de inicio no puede venir después de la final");}
	}

	
//-------------------------------------------GETTERS---------------------------------------------------
	public LocalDate getFechaFin() {return fechaFin;}

	public LocalDate getFechaInicio() {return fechaInicio;}

//-------------------------------------------SETTERS----------------------------------------------------

	public void setFechaFin(LocalDate fin) throws Exception {
		if(getFechaInicio().isBefore(fin) || getFechaInicio().isEqual(fin) ) {
			this.fechaFin = fin;
			}
		new Exception("La fecha fin no puede ser anterior a la fecha inicio");
		}

	public void setFechaInicio(LocalDate inicio) throws Exception {
		if(getFechaFin().isAfter(inicio) || getFechaFin().isEqual(inicio)) {
		this.fechaInicio = inicio;}
		else {new Exception("La fecha inicio no puede ser posterior a la fin");}
		}
	
//--------------------------------------------FUNCIONES-------------------------------------------------

	public boolean estaIncluido(PeriodoDisponible pAComparar) {
		return this.estaIncluidoInicio(pAComparar.getFechaInicio()) && this.estaIncluidoFin(pAComparar.getFechaFin());
	}
	
	private boolean estaIncluidoInicio(LocalDate inicio) {
		LocalDate selfInicio = this.getFechaInicio();
		return selfInicio.isBefore(inicio) || selfInicio.isEqual(inicio);
	}
	
	private boolean estaIncluidoFin(LocalDate fin) {
		LocalDate selfFin = this.getFechaFin();
		return selfFin.isAfter(fin) || selfFin.isEqual(fin);
	}
	
	public List<PeriodoDisponible> dividir(PeriodoDisponible periodo) throws Exception {
		List<PeriodoDisponible> lista = new ArrayList<PeriodoDisponible>();
		lista = this.dividirInicio(periodo, lista);
		lista = this.dividirFin(periodo, lista);
		return lista;
	}
	
	private List<PeriodoDisponible> dividirInicio(PeriodoDisponible periodo, List<PeriodoDisponible> lista) throws Exception {
		LocalDate inPropia = this.getFechaInicio();
		LocalDate otraIn = periodo.getFechaInicio();
		int diferenciaDias = inPropia.until(otraIn).getDays();
		if(diferenciaDias != 0) {
			LocalDate nuevaFechaFin = inPropia.plusDays(diferenciaDias - 1);
			lista.add(new PeriodoDisponible(inPropia, nuevaFechaFin));
		}
		return lista;
	}
	
	private List<PeriodoDisponible> dividirFin(PeriodoDisponible periodo, List<PeriodoDisponible> lista) throws Exception {
		LocalDate finPropia = this.getFechaFin();
		LocalDate otraFin = periodo.getFechaFin();
		int diferenciaDias = otraFin.until(finPropia).getDays();
		if(diferenciaDias != 0) {
			LocalDate nuevaFechaInicio = finPropia.minusDays(diferenciaDias - 1);
			lista.add(new PeriodoDisponible(finPropia, nuevaFechaInicio));
		}
		return lista;
	}
	
	
}
