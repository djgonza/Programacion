import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Esta clase guarda en un map (HashMap) una serie de coordenadas y su
 * frecuencia de aparición dentro de un fichero La clave es un objeto Coordenda
 * y el valor asociado un objeto Contador
 * 
 * Por ej, si el map contiene [(5, 9) -> 6] quiere decir que la coordenada (5,
 * 9) ha aparecido 6 veces
 */
public class FrecuenciaCoordenadas {

	private Map<Coordenada, Contador> map;

	/**
	 * Constructor de la clase FrecuenciaCoordenadas
	 */
	public FrecuenciaCoordenadas() {
		map = new HashMap<>();
	}

	/**
	 * Añade una nueva coordenada al map. Si ya existe se incrementa su
	 * frecuencia, si no existe se crea una nueva entrada en el map (con la
	 * frecuencia 1)
	 */
	public void addCoordenada(Coordenada c) {

		if (map.containsKey(c))
			map.get(c).incrementar();
		else {
			Contador temp = new Contador();
			temp.incrementar();
			map.put(c, temp);
		}

	}

	/**
	 * Mostrar cada coordenada junto con su frecuencia
	 */
	public void mostrarCoordenadas() {

		System.out.println(
				String.format("%20s %-20s", "Coordenada", "Frecuencia"));
		for (Entry<Coordenada, Contador> el : map.entrySet()) {
			System.out.println(String.format("%20s : %-10s", el.getKey(),
					el.getValue()));
		}

	}

	/**
	 * Obtiene un conjunto ordenado (TreeSet) con todas las coordenadas
	 * diferentes que han aparecido de mayor a menor valor de coordenada Usa un
	 * constructor adecuado de la clase TreeSet
	 * 
	 * 
	 */
	public Set<Coordenada> obtenerConjuntoOrdenado() {

		return new TreeSet<Coordenada>(map.keySet());

	}

	/**
	 * Calcula y devuelve una colección List (ArrayList) con las coordenadas de
	 * frecuencia máxima
	 * 
	 * Haz un solo recorrido del map con el conjunto de entradas
	 */
	public List<Coordenada> coordenadasFrecuenciaMaxima() {

		List<Coordenada> temp = new ArrayList<>();
		int mayor = 0;

		for (Entry<Coordenada, Contador> el : map.entrySet()) {
			int valor = el.getValue().getValor();
			if (valor > mayor) {
				temp.clear();
				mayor = valor;
				temp.add(el.getKey());
			} else if (valor == mayor) {
				temp.add(el.getKey());
			}
			
		}

		temp.sort(Comparator.reverseOrder());

		return temp;

	}

	/**
	 * Lee datos del fichero coordenadas.txt y a partir de esos datos se añaden
	 * las coordenadas al map
	 */
	public void leerCoordenadasDeFichero() {
		try {
			File f = new File("coordenadas.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String[] strCoordenadas = sc.nextLine().split(",");
				Coordenada c = new Coordenada(
						Integer.parseInt(strCoordenadas[0]),
						Integer.parseInt(strCoordenadas[1]));
				addCoordenada(c);
			}
			sc.close();
		} catch (IOException e) {
			System.out.println(
					"Error al procesar fichero " + e.getMessage());
		}

	}

	/**
	 * Punto de entrada a la aplicación - Código de prueba
	 */
	public static void main(String[] args) {
		FrecuenciaCoordenadas demo = new FrecuenciaCoordenadas();
		demo.leerCoordenadasDeFichero();
		demo.mostrarCoordenadas();
		System.out.println(
				" \n\nCoordenadas con mayor frecuencia de aparición "
						+ demo.coordenadasFrecuenciaMaxima().toString());
		System.out.println(
				"\n\nValores del TreeSet (en orden decreciente de coordenada)\n"
						+ demo.obtenerConjuntoOrdenado().toString());
	}

}
