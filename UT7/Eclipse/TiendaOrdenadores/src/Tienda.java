import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 
 * @author
 * @version
 */
public class Tienda {
	private ArrayList<Ordenador> ordenadores;
	private String nombre;

	/**
	 * Constructor
	 */
	public Tienda(String nombre) {

		this.nombre = nombre;
		ordenadores = new ArrayList<>();

	}

	/**
	 *  
	 */
	public void addOrdenador(Ordenador ord) {

		ordenadores.add(ord);

	}

	/**
	 * 
	 */
	public int cuantosPortatiles() {
		int contador = 0;
		for (Ordenador ordenador : ordenadores) {
			if (ordenador instanceof Portatil)
				contador++;

		}
		return contador;

	}

	/**
	 * 
	 */
	public String masBarato() {

		double precio = Integer.MAX_VALUE;
		String codigo = "";

		for (Ordenador ordenador : ordenadores) {
			if (ordenador.getPrecio() < precio) {
				precio = ordenador.getPrecio();
				codigo = ordenador.getCodigo();
			}

		}

		return codigo;

	}

	/**
	 * 
	 */
	public void borrarMasBarato() {

		Iterator<Ordenador> it = ordenadores.iterator();
		String codigoMasBarato = masBarato();

		while (it.hasNext()) {
			Ordenador ordenador = it.next();
			if (ordenador.getCodigo().equals(codigoMasBarato)) {

				it.remove();
				return;
			}

		}

	}

	/**
	 * 
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (Ordenador ordenador : ordenadores) {
			sb.append(ordenador.toString());
			sb.append('\n');

		}

		return sb.toString();

	}

}
