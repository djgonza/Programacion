
/**
 * 
 * 
 * @author
 * @version
 */
public class Portatil extends Ordenador {

	private double peso;

	public Portatil(String codigo, double precio, double peso) {

		super(codigo, precio);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSlogan() {
		return "Ideal para viajes";

	}

	public double calcularDescuento() {
		return super.getPrecio() * 0.02;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = super.toString();

		temp += " Peso = " + peso;

		return temp;

	}

}
