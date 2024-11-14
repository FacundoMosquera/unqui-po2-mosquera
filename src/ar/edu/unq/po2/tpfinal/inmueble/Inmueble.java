package ar.edu.unq.po2.tpfinal.inmueble;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;

import ar.edu.unq.po2.tpfinal.FormaDePago;
import ar.edu.unq.po2.tpfinal.Foto;
import ar.edu.unq.po2.tpfinal.PeriodoDisponible;
import ar.edu.unq.po2.tpfinal.TipoInmueble;
import ar.edu.unq.po2.tpfinal.Usuario;
import ar.edu.unq.po2.tpfinal.politicas.PoliticaDeCancelacion;

public class Inmueble {
	
//-------------------------------------------Variables---------------------------------------------
	private TipoInmueble tipoInmueble;
	private int superficie;
	private String pais;
	private String ciudad;
	private List<String> servicios;
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
	private List<Integer> puntajes;
	private int puntajePromedio;
	private List<PeriodoDisponible> periodoAlquilable;
	private Manager manager;
	
//--------------------------------------------CONSTRUCTOR------------------------------------------	
	public Inmueble(TipoInmueble tipoI, int superficie, String pais, String ciudad,
			int capacidad, Foto foto, SimpleDateFormat in, SimpleDateFormat out,
			Usuario propietario, PoliticaDeCancelacion politicaCancelacion, int precioxDia) {
		this.tipoInmueble = tipoI;
		this.superficie = superficie;
		this.pais = pais;
		this.ciudad = ciudad;
		this.servicios = new ArrayList<String>();
		this.capacidad = capacidad;
		this.fotos = new ArrayList<Foto>();
		this.fotos.add(foto);
		this.checkIn = in;
		this.checkOut = out;
		this.formasDePago = new ArrayList<FormaDePago>();
		this.vecesAlquilado = 0;
		this.comentarios = new ArrayList<String>();
		this.categoriasInmueble = new ArrayList<String>();
		this.propietario = propietario;
		this.politicaDeCancelacion = politicaCancelacion;
		this.precioPorDia = precioxDia;
		this.puntajes = new ArrayList<Integer>();
		this.periodoAlquilable = new ArrayList<PeriodoDisponible>();
		this.manager = new ManagerConcrete(this);
	}
	
//--------------------------------------------GETTERS----------------------------------------------
	public int precioPorDia() {return precioPorDia;}
	
	public String getCiudad() {return ciudad;}
	
	public String getPais() {return pais;}
	
	public int getCapacidad() {return capacidad;}
	
	public SimpleDateFormat getCheckIn() {return checkIn;}
	
	public SimpleDateFormat getCheckOut() {return checkOut;}
	
	public int getVecesAlquilado() {return vecesAlquilado;}

	public List<String> getComentarios() {return comentarios;}
	
	public int puntajePromedio() {return puntajePromedio;}
	
	public List<Integer> getPuntajes() {return puntajes;}
	
	public List<String> getServicios() {return servicios;}
	
	public int getSuperficie() {return superficie;}
	
	public List<Foto> getFotos() {return fotos;}
	
	public List<FormaDePago> getFormasDePago() {return formasDePago;}
	
	public Usuario getPropietario() {return propietario;}
	
	public List<String> getCategoriasInmueble() {return categoriasInmueble;}
	
	public PoliticaDeCancelacion getPoliticaDeCancelacion() {return politicaDeCancelacion;}
	
	public TipoInmueble getTipoDeInmueble() {return tipoInmueble;}
	
	public List<PeriodoDisponible> getPeriodoAlquilable(){return periodoAlquilable;}
	
	public void visualizar() {
		
	}
	

	
//--------------------------------------------SETTERS----------------------------------------------
	public void aumentarVecesAlquilado() {
		this.vecesAlquilado++;
	}
	
	public void nuevoComentario(String comentario) {
		comentarios.add(comentario);
	}

	public void nuevoPuntaje(int puntajeDado) {
		puntajes.add(puntajeDado);
		this.actualizarPromedio();
	}
	
	private void actualizarPromedio() {
		int resultado = puntajes.stream().reduce(0, (acumulado, nuevo) -> acumulado + nuevo);
		puntajePromedio = resultado / puntajes.size();
	}
	
	public void addCategoriaInmueble(String categoria) {
		categoriasInmueble.add(categoria);
	}
	
	public void addFormaDePago(FormaDePago f) {
		if( !(formasDePago.contains(f))) { formasDePago.add(f);}
	}
	
	public void addFoto(Foto nuevaFoto) throws Exception {
		if (fotos.size() > 4) {new Exception("Limite de fotos alcanzado");}
		else {fotos.add(nuevaFoto);}
	}
	
	public void removeFoto(Foto foto) {fotos.remove(foto);} // no hace nada si no se encuentra
	
	public void setPoliticaDeCancelacion(PoliticaDeCancelacion politicaNueva) {
		politicaDeCancelacion = politicaNueva;
		}
	
	public void removeCategoriaInmueble(String s) {
		// si no está, array la deja como estaba
		categoriasInmueble.remove(s);
	}
	
	public void setTipoDeInmueble(TipoInmueble t) {tipoInmueble = t;}
	
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
	
	public void addPeriodoAlquilable(PeriodoDisponible periodo) {periodoAlquilable.add(periodo);}
	
	public void removePeriodoAlquilable(PeriodoDisponible periodo) {periodoAlquilable.remove(periodo);}
	
	//------------------------------------------FUNCIONES---------------------------------------------------
	
	public void solicitudDeAlquiler(PeriodoDisponible periodo, Usuario inquilino) throws Exception {
		this.chequearSolicitudValida(inquilino);
		if( this.manager.esFechaAlquilable(periodo) ) {this.manager.crearSolicitud(periodo, inquilino);}
		else {new Exception("El inmueble no se alquila durante ese período.");}
	}
	
	public void chequearSolicitudValida(Usuario inquilino) throws Exception {
		if(this.propietario == inquilino) {new Exception("El propietario no puede alquilarse a sí mismo");}
	}
	
	
	
}
