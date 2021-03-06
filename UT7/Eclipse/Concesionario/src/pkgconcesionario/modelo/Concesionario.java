package pkgconcesionario.modelo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase Concesionario
 * 
 * @author
 * @version
 */

public class Concesionario {

	private String nombre; // el nombre del concesionario
	private List<Coche> coches; // coches definido como duna colecci�n del tipo
								// List

	/**
	 * Constructor de la clase Concesionario
	 */
	public Concesionario(String nombre) {
		this.nombre = nombre;
		coches = new ArrayList<>();

	}

	/**
	 * acccsor para el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Si se intenta a�adir un coche que ya est� se emite un mensaje
	 */
	public void añadir(Coche c) {
		if (coches.contains(c))
			System.out.println("Coche existente");
		else
			coches.add(c);

	}

	/**
	 * Borrar coches del conductor indicado en el par�metro
	 * 
	 */
	public void borrarDeConductor(String quien) {
		Iterator<Coche> it = coches.iterator();
		while (it.hasNext()) {
			Coche aux = it.next();
			if (aux.getConductor().equals(quien))
				it.remove();

		}

	}

	/**
	 * 
	 * Escribir la lista de coches
	 */
	public void listarCoches() {
		for (Coche coche : coches) {

			System.out.println(coche.toString());
			System.out.println();
		}

	}

	/**
	 * 
	 * Borrar de la colecci�n los taxis
	 */
	public void borrarTaxis() {
		Iterator<Coche> it = coches.iterator();
		while (it.hasNext()) {
			Coche aux = it.next();
			if (aux instanceof Taxi)
				it.remove();

		}
	}

	public void listarPropietarios() {

		// Version 1
		TreeMap<String, String> propietarios = new TreeMap<>();

		for (Coche coche : coches) {
			propietarios.put(coche.getConductor(), coche.getTipo());
		}

		for (Map.Entry<String, String> entrada : propietarios.entrySet()) {
			System.out.println(
					entrada.getKey() + " : " + entrada.getValue());
		}

	}

	/**
	 * 
	 * Hacer avanzar a todos los coches
	 */
	public void avanzarTodos() {
		for (Coche coche : coches) {
			coche.avanza();
		}

	}
}
