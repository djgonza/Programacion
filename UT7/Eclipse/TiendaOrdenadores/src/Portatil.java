
/**
 * 
 * 
 * @author
 * @version
 */
public class Portatil extends Ordenador {

	private double peso;

	public Portatil(String codigo, double precio, String slogan, double peso) {
		super(codigo, precio, slogan);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = super.toString();

		temp += "Peso = " + peso;

		return temp;

	}

}