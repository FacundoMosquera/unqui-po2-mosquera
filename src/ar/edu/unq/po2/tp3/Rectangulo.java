package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	int altura;
	int base;
	
	Point EsquinaSuperiorIzq;
	Point EsquinaSuperiorDer;
	Point EsquinaInferiorIzq;
	Point EsquinaInferiorDer;

	
	public Rectangulo(Point ubicacion, int altura, int base) {
		this.EsquinaSuperiorIzq = ubicacion;
		this.EsquinaSuperiorDer = ubicacion.sumarPunto(new Point(base, 0));
		this.EsquinaInferiorIzq = ubicacion.sumarPunto(new Point(0, -altura));
		this.EsquinaInferiorDer = ubicacion.sumarPunto(new Point(base, -altura));
		
		this.base = base;
		this.altura = altura;
	}
	
	public int calcularArea() {
		return base * altura; 
	}
	
	public int calcularPerimetro() {
		return 2*(base + altura);
	}
	
	public boolean esHorizontal() {
		return base > altura;
	}
}
