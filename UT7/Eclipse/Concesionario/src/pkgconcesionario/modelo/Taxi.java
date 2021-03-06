package pkgconcesionario.modelo;
import java.awt.Point;

/**
 * Representa a un taxi
 */

public class Taxi extends Coche {

	private int numeroPlazas;

	public Taxi(String conductor, String tipo, String color,
			Point posicion, int numeroPlazas) {
		super(conductor, tipo, color, posicion);
		this.numeroPlazas = numeroPlazas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanza() {

		if (Math.random() >= 0.33) {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 35, posicion.getY());
		} else {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 15, posicion.getY());
		}

	}

}
