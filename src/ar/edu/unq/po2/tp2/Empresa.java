package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private List<ReciboDeHaberes> recibosHaberes = new ArrayList<ReciboDeHaberes>();
	
	public Double montoTotalRetencionesDeEmpleados() {
		Double retenciones = (double) 0;
		for(Empleado empleado : empleados) {
			retenciones += empleado.getRetenciones();
		}
		return retenciones;
	}
	
	public Double montoTotalSueldosBrutosDeEmpleados() {
		Double sueldosBrutos = (double) 0;
		for(Empleado empleado : empleados) {
			sueldosBrutos += empleado.getSueldoBruto();
		}
		return sueldosBrutos;
	}
	
	public Double montoTotalSueldosNetosDeEmpleados() {
		return montoTotalSueldosBrutosDeEmpleados() - montoTotalRetencionesDeEmpleados();
	}
	
	public void liquidacionDeSueldos() {
		for(Empleado e : empleados) {
			recibosHaberes.add(new ReciboDeHaberes(e));
		}
	}
	
	public List<Empleado> getEmpleados() {return empleados;}
	
	public List<ReciboDeHaberes> getRecibosHaberes(){return recibosHaberes;}
	
	public void contratarEmpleado(Empleado e) {empleados.add(e);}
	
	public void despedirEmpleado(Empleado e) {empleados.remove(e);}
	
}
