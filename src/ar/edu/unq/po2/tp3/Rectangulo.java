package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	int altura;
	int base;
	
	Point esquinaSuperiorIzq;
	Point esquinaSuperiorDer;
	Point esquinaInferiorIzq;
	Point esquinaInferiorDer;

	
	public Rectangulo(Point ubicacion, int altura, int base) throws Exception {
		// Verifico que no sean valores negativos
		if(base < 0 || altura < 0) {throw new Exception("Las dimensiones del rectangulo no pueden ser negativos"); } else {
		
		// Creo los puntos del rectangulo
		this.esquinaSuperiorIzq = ubicacion;
		this.esquinaSuperiorDer = ubicacion.sumarPunto(new Point(base, 0));
		this.esquinaInferiorIzq = ubicacion.sumarPunto(new Point(0, -altura));
		this.esquinaInferiorDer = ubicacion.sumarPunto(new Point(base, -altura));
		
		// Asigno los valores a las variables para los métodos
		this.base = base;
		this.altura = altura;
		}
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
	
	public int getBase() {return base;}
	
	public int getAltura() {return altura;}
	
	public Point getEsquinzaSuperiorIzq() {return esquinaSuperiorIzq;}
	public Point getEsquinaSuperiorDer() {return esquinaSuperiorDer;}
	public Point getEsquinaInferiorDer() {return esquinaInferiorDer;}
	public Point getEsquinaInferiorIzq() {return esquinaInferiorIzq;}
	
}
