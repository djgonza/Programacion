package pkgconcesionario.modelo;
import java.awt.Point;

/**
 * Modela un cohe
 */

public abstract class Coche {
	private String conductor;
	private String tipo;
	private String color;
	private Point posicion;

	/**
	 * Constructor
	 */

	public Coche(String conductor, String tipo, String color,
			Point posicion) {
		this.conductor = conductor;
		this.tipo = tipo;
		this.color = color;
		this.posicion = posicion;
	}

	public abstract void avanza();

	/**
	 * accesor para el conductor
	 */
	public String getConductor() {
		return conductor;
	}

	/**
	 * accesor para el tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * accesor para el color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * accesor para la posici�n
	 */
	public Point getPosicion() {
		return posicion;
	}

	/**
	 * mutador para el conductor
	 */
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * mutador para el color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * mutador para la posici�n
	 */
	public void setPosicion(Point posicion) {
		this.posicion = posicion;
	}

	/**
	 * Representaci�n textual del coche
	 */
	public String toString() {
		return this.getClass() + "\nConductor: " + conductor + "\nTipo: "
				+ tipo + "\nColor: " + color + "\nPosicion: "
				+ posicion.toString();
	}

	/**
	 * @override Dos coches son iguales si pertenecen a la misma clase y adem�s
	 *           tienen el mismo conductor, color y son del mismo tipo de coche
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (obj == this)
			return true;

		Coche otro = (Coche) obj;
		return otro.getColor().equals(this.getColor())
				&& otro.getConductor().equals(this.getConductor())
				&& otro.getTipo().equals(this.getTipo());

	}

}
