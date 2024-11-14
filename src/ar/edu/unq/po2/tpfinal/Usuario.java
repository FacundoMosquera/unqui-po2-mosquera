package ar.edu.unq.po2.tpfinal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import ar.edu.unq.po2.tpfinal.inmueble.Inmueble;
import ar.edu.unq.po2.tpfinal.politicas.PoliticaDeCancelacion;

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
	
	public List<Inmueble> getInmueblesPublicados() {return inmuebles;}
	
	public List<String> getComentarios() {return comentarios;}
	
	public int getPuntajePromedio() {return puntajePromedio;}
	
	public String getNombre() {return nombreCompleto;}
	
	public String getMail() {return mail;}
	
	public int getTelefono() {return telefono;}
	
//------------------------------SETTERS-----------------------------------------------------------
	
	public void recibirPuntaje(int puntaje) throws Exception {
		if (puntaje > 5 || puntaje < 1) {
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
	
	public void publicarInmueble(TipoInmueble tipoI, int superficie, String pais, String ciudad,
			int capacidad, Foto foto, SimpleDateFormat in, SimpleDateFormat out,
			Usuario propietario, PoliticaDeCancelacion politicaCancelacion, int precioxDia) throws Exception {
		if(propietario == this) {
		Inmueble nuevoInmueble = new Inmueble(tipoI, superficie, pais, ciudad, capacidad, foto, in, out,
					propietario, politicaCancelacion, precioxDia);
		inmuebles.add(nuevoInmueble);
		this.sitio.nuevoInmueble(nuevoInmueble);
		}
		else {new Exception("El propietario del inmueble y quien lo publica no coinciden");}
	}
	
	public void darDeAltaInmueble(Inmueble i) {
		inmuebles.remove(i);
		sitio.eliminarInmueble(i);
	}
}
