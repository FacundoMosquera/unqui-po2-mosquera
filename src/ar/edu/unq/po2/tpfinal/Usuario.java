package ar.edu.unq.po2.tpfinal;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Usuario {
	private String nombreCompleto;
	private String mail;
	private int telefono;
	private Date fechaDeRegistro;
	private List<Integer> puntajes;
	private int puntajePromedio;
	private List<String> comentarios;
	private List<Inmueble> inmuebles;
	private SitioWeb sitio;
	
	//Constructor
	public Usuario(String nombre, String mail, int nroTelefono, SitioWeb sw) {
		this.nombreCompleto = nombre;
		this.mail = mail;
		this.telefono = nroTelefono;
		this.fechaDeRegistro = new Date();
		this.puntajes = new ArrayList<Integer>();
		this.puntajePromedio = 0;
		this.comentarios = new ArrayList<String>();
		this.inmuebles = new ArrayList<Inmueble>();
		this.sitio = sw;
		
	}
	
//-------------------------GETTERS-----------------------------------------------------------------	
	
	public int cantidadTiempoRegistrado() {
		return fechaDeRegistro.compareTo(new Date());
	}
	
	
	public List<Inmueble> getInmueblesPublicados() {
		return inmuebles;
	}
	
	
	public List<String> getComentarios() {
		return comentarios;
	}
	
	public int getPuntajePromedio() {
		return puntajePromedio;
	}
	
	public String getNombre() {
		return nombreCompleto;
	}
	
	public String getMail() {
		return mail;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
//------------------------------SETTERS-----------------------------------------------------------
	
	public void recibirPuntaje(int puntaje) throws Exception {
		if (puntaje > 10 || puntaje < 1) {
			throw new Exception("El puntaje introducido es inválido");
		}
		else {
			this.puntajes.add(puntaje);
			this.calcularPuntajePromedio();
		}
	}
	
	private void calcularPuntajePromedio() {
		int promedio = 0;
		for(int puntaje : this.puntajes) {
			promedio += puntaje;
		}
		promedio = promedio / (puntajes.size());
		this.puntajePromedio = promedio;
	}
	
	public void recibirComentario(String comment) {
		this.comentarios.add(comment);
	}
	
	public void publicarInmueble() {
		
	}
	
}
