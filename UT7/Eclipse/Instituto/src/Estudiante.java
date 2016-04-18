import java.time.LocalDate;

/**
 * Clase que representa a un estudiante Un estudiante es una persona que incluye
 * además la nota media final obtenida en el curso
 * 
 */
public class Estudiante extends Persona {

	private int notaFinal;

	/**
	 * Constructor de la clase Estudiante Simularemos la nota generando un
	 * aleatorio entre 1 y 1o (con Math.random())
	 */
	public Estudiante(String id, String nombre, LocalDate fechaNacimiento) {
		super(id, nombre, fechaNacimiento);
		this.notaFinal = (int) (Math.round(9) + 1);
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	/**
	 * Redefinición del método toString()
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Clase: " + this.getClass());
		sb.append("\nUtiliza el ordenador para hacer prácticas");
		sb.append(super.toString());
		sb.append("\nNota: " + notaFinal);
		return sb.toString();

	}

}
