import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela un diccionario en el que cada palabra tiene asociados una serie de
 * sin�nimos
 * 
 */

public class Tesauro {
	// a cada clave se le asocia un conjunto de sin�nimos
	// los sin�nimos no se repiten
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
	 *            la palabra a a�adir sinonimo el sin�nimo de la palabra
	 */
	public void a�adirSinonimo(String palabra, String sinonimo) {
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
	 * a�ade una palabra junto con todos sus sin�nimos
	 * 
	 * @param linea
	 *            contiene la palabra y sus sin�nimos el separador entre
	 *            palabras es el blanco la primera palabra es la clave, el resto
	 *            sin�nimos
	 */
	public void a�adirSinonimo(String linea) {
		String[] sinonimos = linea.split(" ");
		for (int i = 1; i < sinonimos.length; i++) {
			a�adirSinonimo(sinonimos[0], sinonimos[i]);
		}
	}

	/**
	 * 
	 * @param sin
	 *            el sin�nimo a borrar de cada conjunto de sin�nimos
	 * @return el conjunto de claves en las que estaba el sin�nimo borrado. Si
	 *         no se borr� ninguno devuelve el conjunto vac�o
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
	 * @param representaci�n
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
