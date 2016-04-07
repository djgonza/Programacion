import java.awt.Color;

/**
 * Modela un tri�ngulo
 * 
 */

public class Triangulo extends Figura {
	private double ladoUno;
	private double ladoDos;
	private double ladoTres;

	public Triangulo(int x, int y, Color c, double ladoUno, double ladoDos,
			double ladoTres) {
		super(x, y, c);
		this.ladoUno = ladoUno;
		this.ladoDos = ladoDos;
		this.ladoTres = ladoTres;
	}

	public double getLadoUno() {
		return ladoUno;
	}

	public void setLadoUno(double ladoUno) {
		this.ladoUno = ladoUno;
	}

	public double getLadoDos() {
		return ladoDos;
	}

	public void setLadoDos(double ladoDos) {
		this.ladoDos = ladoDos;
	}

	public double getLadoTres() {
		return ladoTres;
	}

	public void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}

	@Override
	public double calcularArea() {
		double p = (ladoUno + ladoDos + ladoDos) / 2;
		return Math
				.sqrt(p * (p - ladoUno) * (p - ladoDos) * (p - ladoTres));
	}

	@Override
	public double calcularPerimetro() {

		return ladoUno + ladoDos + ladoTres;
	}

	@Override
	public String toString() {
		String toStringSuper = "Triangulo";
		return toStringSuper + '\n' + "LadoA: " + ladoUno + '\n'
				+ "LadoB: " + ladoDos + '\n' + "LadoC: " + ladoTres + '\n'
				+ super.toString();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj)
				&& ((Triangulo) obj).getLadoUno() == this.ladoUno
				&& ((Triangulo) obj).getLadoDos() == this.ladoDos
				&& ((Triangulo) obj).getLadoTres() == this.ladoTres;
	}

}
