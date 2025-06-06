package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	@SuppressWarnings("unused")
	private String nombreEmpleado;
	@SuppressWarnings("unused")
	private String direccionEmpleado;
	@SuppressWarnings("unused")
	private LocalDate fechaDeEmision;
	@SuppressWarnings("unused")
	private Double sueldoBruto;
	@SuppressWarnings("unused")
	private Double sueldoNeto;
	@SuppressWarnings("unused")
	private String desgloseDeConceptos;
	
	public ReciboDeHaberes(Empleado e) {
		this.nombreEmpleado = e.getNombre();
		this.direccionEmpleado = e.getDireccion();
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = e.getSueldoBruto();
		this.sueldoNeto = e.getSueldoNeto();
		this.desgloseDeConceptos = e.conformacionSueldoBruto() + "\n" + e.detalleRetencionesAplicadas();
	}
	
}
