package ar.edu.unq.po2.tpstreamsyenum;

import java.util.List;

public enum Color {

	ROJO("DescripcionRojo", "Alto"), GRIS("DescripcionGris", "Alto"), AMARILLO("DescripcionGris", "Medio"), MIEL("DescripcionMiel", "Bajo");
	
	private String descripcion;
	private String peligrosidad;
	
	Color(String descripcion, String peligrosidad) {
		this.descripcion  = descripcion;
		this.peligrosidad = peligrosidad;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getPeligrosidad() {
		return this.peligrosidad;
	}
	
	public Color siguienteMancha() {
		Color[] colores = Color.values();
		if(this.ordinal() == colores.length - 1)
			return Color.ROJO;
		return colores[this.ordinal() + 1];
	}
	
}
