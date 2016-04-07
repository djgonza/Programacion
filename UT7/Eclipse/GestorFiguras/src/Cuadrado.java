import java.awt.Color;

/**
 * Representa a un cuadrado
 * 
 * 
 */

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(int x, int y, Color c, double lado) {
		super(x, y, c);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {

		return lado * 4;
	}

	@Override
	public String toString() {
		String toStringSuper = "Cuadrado";
		return toStringSuper + '\n' + "Lado: " + lado + '\n'
				+ super.toString();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj)
				&& ((Cuadrado) obj).getLado() == this.lado;
	}

}
