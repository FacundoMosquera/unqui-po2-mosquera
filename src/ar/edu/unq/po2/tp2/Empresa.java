package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private List<Empleado> empleadosContratados;
	private List<ReciboDeHaberes> listaDeRecibos;
	
	public Empresa(String n, String c) {
		this.nombre = n;
		this.cuit = c;
		this.empleadosContratados = new ArrayList<Empleado>();
		this.listaDeRecibos = new ArrayList<ReciboDeHaberes>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCUIT() {
		return cuit;
	}
	
	public void contratarEmpleado(Empleado ingresante) {
		empleadosContratados.add(ingresante);
	}
	
	public void despedirEmpleado(Empleado despedido) {
		int indice;
		if (empleadosContratados.contains(despedido)) {
			indice = empleadosContratados.indexOf(despedido);
			empleadosContratados.remove(indice);
		} else { System.out.println("Error: el empleado pertenece a la empresa"); }
	}
	
	//---------------------------CALCULANDO TOTALES---------------------
	
	public int totalSueldosBrutos() {
		int sueldos = 0;
		for(Empleado empleado : empleadosContratados) {
			sueldos += empleado.sueldoBruto();
		}
		return sueldos;
	}
	
	public float totalSuedosNetos() {
		float sueldos = 0;
		for(Empleado empleado : empleadosContratados) {
			sueldos += empleado.getSueldoNeto();
		}
		return sueldos;
	}
	
	public float totalRetenciones() {
		float sumaRetenciones = 0;
		for(Empleado empleado : empleadosContratados) {
			sumaRetenciones += empleado.retenciones();
		}
		return sumaRetenciones;
	}
	
	
	//---------------------LIQUIDACIÓN SUELDOS------------------------
	public void liquidacionDeSueldos() {
		for(Empleado e : empleadosContratados) {
			this.listaDeRecibos.add(new ReciboDeHaberes(e));
		}
	}
	
	
}
