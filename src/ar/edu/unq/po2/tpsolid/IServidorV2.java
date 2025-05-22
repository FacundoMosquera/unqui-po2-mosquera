package ar.edu.unq.po2.tpsolid;

import java.util.List;

public interface IServidorV2 {

	public void conectar(ICliente c);
	public void enviar(Paquete p);
	public float tasaDeTransferencia();
	public void resetear();
	public void realizarBackUp();
	public List<Paquete> recibirNuevosPaquetes();
}
