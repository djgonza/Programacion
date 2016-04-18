
/**
 *  Representa a un instituto de formación profesional
 *  en el que trabajan profesores y estudian alumnos.
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Instituto {
	private String nombre;
	private List<Persona> personas;

	/**
	 * Constructor de la clase Instituto
	 */
	public Instituto(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList<>();

	}

	/**
	 * Accesor para el nombre del instituto
	 *
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Añadir una nueva persona al instituto. Solo se añade si no está
	 * 
	 * @param p
	 *            la persona a añadir
	 * 
	 */
	public void altaPersona(Persona p) {
		if (!personas.contains(p))
			personas.add(p);
	}

	/**
	 * Devuelve el nº de estudiante en el instituto
	 * 
	 * 
	 */
	public int cuantosEstudiantes() {

		int cont = 0;
		for (Persona persona : personas) {
			if (persona instanceof Estudiante)
				cont++;
		}
		return cont;

	}

	/**
	 * Muestra todas la personas ordenadas de mayor a menor edad Sin modificar
	 * la colección original
	 * 
	 */
	public void mostrar() {

		ArrayList<Persona> temp = new ArrayList<>();
		temp.addAll(personas);
		temp.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return (int) Math.signum(o2.getEdad() - o1.getEdad());
			}

		});
		System.out.println(temp);

	}

	/**
	 * Profesores que dan conferencias un determinado día de la semana La lista
	 * de profesores se devuelve ordenada por nombre
	 * 
	 */
	public List<Profesor> quienDaConferenciasEn(Dia d) {

		List<Profesor> temp = new LinkedList<>();
		for (Persona persona : personas) {
			if (persona instanceof Profesor)
				temp.add((Profesor) persona);
		}
		return temp;
	}

	/**
	 * Borra los estudiantes de edad menor a la indicada y devuelve los borrados
	 * en una lista
	 * 
	 */
	public List<Persona> borrarEstudiantes(int edad) {

		List<Persona> temp = new ArrayList<>();

		Iterator<Persona> it = personas.iterator();

		while (it.hasNext()) {

			Persona persona = it.next();

			if (persona instanceof Estudiante) {
				if (((Estudiante) persona).getEdad() < edad) {
					temp.add(persona);
					it.remove();
				}
			}

		}

		return temp;

	}

}
