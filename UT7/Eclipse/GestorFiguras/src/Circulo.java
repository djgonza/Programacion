import java.awt.Color;

/**
 * Modela un c�rculo de radio determinado
 * 
 * 
 */

public class Circulo extends Figura {
	private double radio;

	/**
	 * Constructor de la clase Circulo
	 * 
	 */
	public Circulo(int x, int y, Color c, double radio) {
		super(x, y, c);
		this.radio = radio;

	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (radio * radio);

	}

	@Override
	public double calcularPerimetro() {

		return 2 * Math.PI * radio;
	}

	@Override
	public String toString() {

		String toStringSuper = "Circulo";
		return toStringSuper + '\n' + "Radio: " + radio + '\n'
				+ super.toString();
	}

	public static void main(String[] args) {
		Circulo demo = new Circulo(5, 5, Color.BLUE, 5);
		System.out.println(demo);
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj)
				&& ((Circulo) obj).getRadio() == this.radio;
	}

}
