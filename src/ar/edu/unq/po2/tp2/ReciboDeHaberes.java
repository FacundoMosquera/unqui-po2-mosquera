package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private String nombreEmpleado;
	private String direccionEmpleado;
	private LocalDate fechaDeEmision;
	private Double sueldoBruto;
	private Double sueldoNeto;
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
