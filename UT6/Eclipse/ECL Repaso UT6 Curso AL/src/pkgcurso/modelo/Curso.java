package pkgcurso.modelo;

import java.util.Set;
import java.util.TreeMap;

public class Curso {
	private String nombre;
	private TreeMap<String, Integer> mapCurso;

	public Thread thread = new Thread("hilo 0");
	public Thread thread1 = new Thread("hilo 1");

	/**
	 * constructor
	 * 
	 * @param nombre
	 *            el nombre del curso
	 */
	public Curso(String nombre) {
		this.nombre = nombre;
		this.mapCurso = new TreeMap<>();
	}

	/**
	 * añadir nombre del alumno asociado a su nota
	 * 
	 * @param nombre
	 * @param nota
	 */
	public void addAlumno(String nombre, int nota) {
		mapCurso.put(nombre, nota);
	}

	/**
	 * calcula y devuelve la media del curso
	 * 
	 * @con el conjunto de entradas
	 */
	public double mediaCurso() {
		return 0;
	}

	/**
	 * calcula y devuelve el total de aprobados
	 * 
	 * @return
	 */
	public int totalAprobados() {
		return 0;
	}

	/**
	 * calcula y devuelve un map donde las claves son ahora las diferentes notas
	 * y cada clave se asocia con la lsita de alumnos que han obtneido esa nota
	 */
	// public TreeMap<Integer, ArrayList<String>> obtenerEstadisticas() {
	//
	// }

	/**
	 * representación textual del curso. Usar conjunto de claves
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Set<String> claves = mapCurso.keySet();
		for (String string : claves) {
			sb.append(string + " - " + mapCurso.get(string) + '\n');
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error, Sintaxis: java Curso <nombre-curso>");
			return;
		}
		Curso curso = new Curso(args[0]);
		curso.addAlumno("Eduardo", 4);
		curso.addAlumno("Javier", 8);
		curso.addAlumno("Leyre", 9);
		curso.addAlumno("Alazne", 8);
		curso.addAlumno("Gorka", 3);
		curso.addAlumno("Alvaro", 9);

		System.out.println(curso.toString());
		// System.out.println("Total aprobados: " + curso.totalAprobados());
		// System.out.println("Media curso: " + String.format("%5.2f",
		// curso.mediaCurso()));

		// TreeMap<Integer, ArrayList<String>> resul =
		// curso.obtenerEstadisticas();
		// System.out.println(resul);
	}

}
