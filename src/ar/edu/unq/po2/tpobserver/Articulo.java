package ar.edu.unq.po2.tpobserver;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<Autor> autores;
	private String tipoDeArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;
	
	public Articulo(String titulo, List<Autor> autores, String tipo, String lugarPublicacion, List<String> palabrasClaves) {
		this.setTitulo(titulo);
		this.setAutores(autores);
		this.setTipoDeArticulo(tipo);
		this.setLugarPublicacion(lugarPublicacion);
		this.setPalabrasClaves(palabrasClaves);
	}

	//Getters
	
	public String getTitulo() {return titulo;}

	public List<Autor> getAutores() {return autores;}

	public String getLugarPublicacion() {return lugarPublicacion;}

	public String getTipoDeArticulo() {return tipoDeArticulo;}

	public List<String> getPalabrasClaves() {return palabrasClaves;}

	public List<String> getAfiliaciones() {
		return autores.stream().map(a -> a.getAfiliacion()).toList();
	}
	
	
	//Setters
	
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public void setTipoDeArticulo(String tipoDeArticulo) {this.tipoDeArticulo = tipoDeArticulo;}

	public void setPalabrasClaves(List<String> palabrasClaves) {this.palabrasClaves = palabrasClaves;}

	public void setLugarPublicacion(String lugarPublicacion) {this.lugarPublicacion = lugarPublicacion;}
	
	public void setAutores(List<Autor> autores) {this.autores = autores;}
	
	
	
}
