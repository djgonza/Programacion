import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela un diccionario en el que cada palabra tiene asociados una serie de
 * sinónimos
 * 
 */

public class Tesauro {
	// a cada clave se le asocia un conjunto de sinónimos
	// los sinónimos no se repiten
	private HashMap<String, HashSet<String>> tesauro;

	/**
	 * Constructor de la clase Tesauro
	 */
	public Tesauro() {
		tesauro = new HashMap<>();
	}

	/**
	 * 
	 * @param palabra
	 *            la palabra a añadir sinonimo el sinónimo de la palabra
	 */
	public void añadirSinonimo(String palabra, String sinonimo) {
		HashSet<String> sinonimos = tesauro.get(palabra);
		// if(sinonimos.equals(null)){
		if (sinonimos == null) {
			sinonimos = new HashSet<>();
			sinonimos.add(sinonimo);
		} else {
			sinonimos.add(sinonimo);
		}

		tesauro.put(palabra, sinonimos);
	}

	/**
	 * añade una palabra junto con todos sus sinónimos
	 * 
	 * @param linea
	 *            contiene la palabra y sus sinónimos el separador entre
	 *            palabras es el blanco la primera palabra es la clave, el resto
	 *            sinónimos
	 */
	public void añadirSinonimo(String linea) {
		String[] sinonimos = linea.split(" ");
		for (int i = 1; i < sinonimos.length; i++) {
			añadirSinonimo(sinonimos[0], sinonimos[i]);
		}
	}

	/**
	 * 
	 * @param sin
	 *            el sinónimo a borrar de cada conjunto de sinónimos
	 * @return el conjunto de claves en las que estaba el sinónimo borrado. Si
	 *         no se borró ninguno devuelve el conjunto vacío
	 */
	public HashSet<String> borrarSinonimo(String sin) {
		HashSet<String> clavesRetornadas = new HashSet<>();
		Set<String> claves = tesauro.keySet();

		for (String clave : claves) {
			if (tesauro.get(clave).remove(sin)) {
				clavesRetornadas.add(clave);
			}
		}

		return clavesRetornadas;
	}

	/**
	 * 
	 * @param representación
	 *            textual del map
	 * @return
	 */
	public String toString() {
		Set<String> claves = tesauro.keySet();
		StringBuilder sb = new StringBuilder();
		for (String clave : claves) {
			sb.append(clave);
			sb.append(": ");
			sb.append(tesauro.get(clave).toString());
			sb.append('\n');
		}

		return sb.toString();
	}

	/**
	 * 
	 * Visualiza el tesauro
	 */
	public void escribirTesauro() {
		System.out.println(toString());
	}
}
