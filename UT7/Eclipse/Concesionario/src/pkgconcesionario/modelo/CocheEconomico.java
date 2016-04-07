package pkgconcesionario.modelo;
import java.awt.Point;

/**
 * Clase CocheEconomico
 * 
 * @author
 * @version
 */

public class CocheEconomico extends Coche {

	public CocheEconomico(String conductor, String tipo, String color,
			Point posicion) {
		super(conductor, tipo, color, posicion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanza() {

		if (Math.random() >= 0.5) {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 20, posicion.getY());
		} else {
			Point posicion = super.getPosicion();
			posicion.setLocation(posicion.getX() + 25, posicion.getY());
		}

	}

}
