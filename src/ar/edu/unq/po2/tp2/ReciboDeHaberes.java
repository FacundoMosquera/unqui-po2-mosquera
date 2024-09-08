package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private int sueldoBruto;
	private float sueldoNeto;
	private String desgloceDeConceptos;
	
	public ReciboDeHaberes(Empleado empleado) {
		this.nombreEmpleado = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = empleado.sueldoBruto();
		this.sueldoNeto = empleado.getSueldoNeto();
		this.desgloceDeConceptos = "Empleado: " + this.nombreEmpleado + " " + "Direccion: " + this.direccion + "/n"
										+ "Sueldo Bruto: "      + String.valueOf(this.sueldoBruto) + "/n"
										+ "Sueldo Neto: "       + String.valueOf(this.sueldoNeto) + "/n"
										+ "Total Retenciones: " + String.valueOf(empleado.retenciones()) + "/n"
										+ "Recibo emitido el: " + String.valueOf(this.fechaDeEmision);
				
	}
	
	public String desgloceDeConceptos() {
		return this.desgloceDeConceptos;
	}
	
}
