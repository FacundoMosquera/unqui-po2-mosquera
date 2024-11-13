package ar.edu.unq.po2.tpfinal;

import java.util.List;

import ar.edu.unq.po2.tpfinal.filtro.Filtro;

public abstract class SitioWeb {
	
	private List<Usuario> usuariosRegistrados;
	private List<Inmueble> inmueblesRegistrados;
	private Buscador searchEngine;
	
	public void nuevoUsuario(String nombre, String mail, int nroTelefono) {
		Usuario usuario = new Usuario(nombre, mail, nroTelefono, this);
		usuariosRegistrados.add(usuario);
		
	}
	
	public void nuevoInmueble(Inmueble inmueble) {
		inmueblesRegistrados.add(inmueble);
	}
	
	public List<Inmueble> buscarInmuebles(List<Filtro> filtros) {
		List<Inmueble> mueblesFiltrados = searchEngine.filtrar(filtros, inmueblesRegistrados);
		return mueblesFiltrados;
	}
	
}
