package ar.edu.unq.po2.tpsolid;

public interface ICliente {

	public void conectar();
	public void recibirPaquetes();
	public void enviarPaquete(Paquete p);
	public void desconectarse();
}
