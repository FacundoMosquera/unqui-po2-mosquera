package ar.edu.unq.po2.tpfinal.patronobserver;


public interface Observable {

	 
	 public void addObservador(Observador o);
	 public void removeObservador(Observador o);
	 public void notificar();
}
