package pkgconcesionario.modelo;
import java.awt.Point;

/**
 * clase CocheDeportivo
 * 
 * @author
 * @version
 */

public class CocheDeportivo extends Coche {
	// sin atributos, solo los heredados

	public CocheDeportivo(String conductor, String tipo, String color) {
		super(conductor, tipo, color, new Point(0, 200));

		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanza() {

		if (Math.random() >= 0.7) {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 50, posicion.getY());
		} else {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 30, posicion.getY());
		}

		// TODO Auto-generated method stub

	}

}
