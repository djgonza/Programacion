
public class CuentaAhorro extends Cuenta {

	private double interes;

	public CuentaAhorro(String nombre, double importe, double interes) {

		super(nombre, importe);
		this.interes = interes;

	}

	public double aplicarinteres() {
		return getImporte() * interes;
	}

	@Override
	public String toString() {
		String print = super.toString();
		print += "Interes Aplicado (" + interes + "): " + aplicarinteres();
		return print;
	}
}
