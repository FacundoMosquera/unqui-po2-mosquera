package ar.edu.unq.po2.tp3;

public class Point {

	private int coordenadaX;
	private int coordenadaY;
	
	public Point() {
		this.setCoordenadaX(0);
		this.setCoordenadaY(0);
	}
	
	public Point(int x, int y) {
		this.setCoordenadaX(x);
		this.setCoordenadaY(y);
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public Point sumarPunto(Point p) {
		Point nuevoPunto = new Point(this.coordenadaX + p.getCoordenadaX(), this.coordenadaY + p.getCoordenadaY());
		return nuevoPunto;
		
	}
	
	
}
