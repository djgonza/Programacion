import java.awt.Color;
import java.awt.Point;

/**
 * Clase Figura
 * 
 * 
 */

public abstract class Figura implements Movible, Comparable<Figura> {

	private Point centro;
	private Color color;

	/**
	 * Constructor de la clase Figura Toda figura tiene un centro y un color
	 * 
	 */
	public Figura(int x, int y, Color c) {
		this.centro = new Point(x, y);
		this.color = c;

	}

	@Override
	public void moverHorizontal(int desp) {
		centro.move((int) centro.getX() + desp, (int) centro.getY());

	}

	@Override
	public void moverVertical(int desp) {
		centro.move((int) centro.getX(), (int) centro.getY() + desp);

	}

	/**
	 * 
	 * Accesor para el centro de la figura
	 * 
	 * @return el centro de la figura
	 */
	public Point getCentro() {
		return centro;

	}

	/**
	 * 
	 * Accesor para el color de la figura
	 * 
	 * @return el color de la figura
	 */
	public Color getColor() {
		return color;

	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	/**
	 * 
	 * Representaci�n textual de una figura
	 * 
	 * 
	 */
	public String toString() {
		return "Area: " + Math.floor(calcularArea()) + '\n' + "perimetro: "
				+ Math.floor(calcularPerimetro()) + '\n' + "Color: "
				+ color;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null || this.getClass() != obj.getClass())
			return false;

		if (obj == this)
			return true;

		Figura otro = (Figura) obj;

		return otro.color.equals(this.color)
				&& otro.centro.equals(this.centro);

	}

	@Override
	public int compareTo(Figura otro) {
		if (this.calcularArea() < otro.calcularArea())
			return -1;
		if (this.calcularArea() > otro.calcularArea())
			return 1;
		return 0;

	}

}
