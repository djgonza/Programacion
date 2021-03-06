import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Clase GestorFiguras
 * 
 * 
 */

public class GestorFiguras {

	private TreeSet<Figura> figuras; // la colecci�n de figuras

	/**
	 * Constructor de la clase GestorFiguras
	 */
	public GestorFiguras() {
		figuras = new TreeSet<>();

	}

	/**
	 * 
	 * @param f
	 *            una nueva figura a a�adir
	 * 
	 */
	public void addFigura(Figura f) {
		if (!figuras.contains(f))
			figuras.add(f);

	}

	public void testMovible() {
		Movible[] figMovible = new Movible[5];
		figMovible[0] = new Circulo(3, 5, Color.BLACK, 7);
		figMovible[1] = new Cuadrado(3, 5, Color.BLACK, 7);
		figMovible[1].moverHorizontal(10);
		System.out.println(figMovible[1].toString());
	}

	/**
	 * 
	 * Mostrar todas las figuras
	 */
	public void listarFiguras() {

		this.listarFiguras(figuras);
	}

	/**
	 * 
	 */
	private void listarFiguras(Set<Figura> figuras) {

		for (Figura figura : figuras) {
			System.out.println(figura.toString() + '\n');

		}
	}

	/**
	 * 
	 * 
	 * @return la figura de mayor �rea
	 */
	public Figura mayorArea() {

		Figura aDevolver = null;
		double area = 0.0;
		for (Figura figura : figuras) {
			double areaCalculada = figura.calcularArea();
			if (areaCalculada > area) {
				area = areaCalculada;
				aDevolver = figura;
			}
		}
		return aDevolver;

	}

	/**
	 * 
	 * @param color
	 *            el color de la figura a borrar
	 * 
	 */
	public void borrarDeColor(Color color) {

		Iterator<Figura> it = figuras.iterator();
		while (it.hasNext()) {
			Figura aux = it.next();
			if (aux.getColor().equals(color))
				it.remove();
		}
	}

	/**
	 * 
	 * @param f
	 *            la figura con la que comparar, se borrar las que son iguales a
	 *            ella
	 * 
	 */
	public void borrarIguales(Figura f) {
		Iterator<Figura> it = figuras.iterator();
		while (it.hasNext()) {
			Figura aux = it.next();
			if (aux.equals(f))
				it.remove();
		}

	}

	public void ordenarPorArea() {
		Set<Figura> tmp = new TreeSet<Figura>(figuras);
		// Collections.sort(tmp);
		listarFiguras(tmp);
	}

	public void ordenarPorPerimetro() {
		List<Figura> tmp = new ArrayList<Figura>(figuras);
		Collections.sort(tmp, new Comparator<Figura>() {
			public int compare(Figura uno, Figura dos) {
				if (uno.calcularPerimetro() < dos.calcularPerimetro())
					return -1;
				if (uno.calcularPerimetro() > dos.calcularPerimetro())
					return 1;

				return 0;
			}

		});

		for (Figura figura : tmp) {
			System.out.println(figura);
			System.out.println();
		}

	}

}
