package ar.edu.unq.po2.tpfinal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unq.po2.tpfinal.politicas.PoliticaDeCancelacion;

public class Inmueble {
	
//-------------------------------------------Variables---------------------------------------------
	private TipoInmueble tipoInmueble;
	private int superficie;
	private String pais;
	private String ciudad;
	private List<TipoServicio> servicios;
	private int capacidad;
	private List<Foto> fotos;
	private SimpleDateFormat checkIn;
	private SimpleDateFormat checkOut;
	private List<FormaDePago> formasDePago;
	private int vecesAlquilado;
	private List<String> comentarios;
	private List<String> categoriasInmueble;
	private Usuario propietario;
	private PoliticaDeCancelacion politicaDeCancelacion;
	private int precioPorDia;
	
//--------------------------------------------CONSTRUCTOR------------------------------------------	
	public Inmueble(TipoInmueble tipoI, int superficie, String pais, String ciudad,
			int capacidad, Usuario propietario, PoliticaDeCancelacion politicaCancelacion, int precioxDia) {
		this.tipoInmueble = tipoI;
		this.superficie = superficie;
		this.pais = pais;
		this.ciudad = ciudad;
		this.servicios = new ArrayList<TipoServicio>();
		this.capacidad = capacidad;
		this.fotos = new ArrayList<Foto>();
		this.formasDePago = new ArrayList<FormaDePago>();
		this.vecesAlquilado = 0;
		this.comentarios = new ArrayList<String>();
		this.categoriasInmueble = new ArrayList<String>();
		this.propietario = propietario;
		this.politicaDeCancelacion = politicaCancelacion;
		this.precioPorDia = precioxDia;
	}
	
//--------------------------------------------GETTERS----------------------------------------------
	public int precioPorDia() {
		return precioPorDia;
	}
	
	public void visualizar() {
		
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String getPais() {
		return pais;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public SimpleDateFormat getCheckIn() {
		return checkIn;
	}
	
	public SimpleDateFormat getCheckOut() {
		return checkOut;
	}
//--------------------------------------------SETTERS----------------------------------------------
	
	

}
