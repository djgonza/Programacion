
public class CuentaCorriente extends Cuenta {

	private double importeMinimo;
	private double recargo;

	public CuentaCorriente(String nombre, double importe, double importeMinimo, double recargo) {
		super(nombre, importe);
		this.importeMinimo = importeMinimo;
		this.recargo = recargo;
	}

	public double recargo() {
		if (getImporte() > importeMinimo) {
			return recargo;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {

		String print = "Situacion inicial de la cuenta de ahorro:\n";
		print += super.toString();
		print += "Importe minimo: " + importeMinimo;
		print += "Recargo: " + recargo;
		return print;
	}

}
