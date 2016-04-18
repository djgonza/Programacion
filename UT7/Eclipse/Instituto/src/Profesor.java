import java.time.LocalDate;

/**
 * Clase que representa a un profesor Un profesor es una persona que pertence a
 * un departamento Un profesor además es conferenciante y da conferencias un
 * determinado día
 * 
 */
public class Profesor extends Persona implements Conferenciante {

	private Dia daConferencias;
	private String departamento;

	/**
	 * Constructor de la clase Profesor
	 */
	public Profesor(String id, String nombre, LocalDate fechaNacimiento, String departamento, Dia daConferencias) {
		super(id, nombre, fechaNacimiento);
		this.daConferencias = daConferencias;
		this.departamento = departamento;
	}

	/**
	 * Redefinición del método toString()
	 *
	 * 
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Clase: " + this.getClass());
		sb.append("\nEl profesor " + getNombre() + " utiliza el ordenador para poner notas");
		sb.append(super.toString());
		sb.append("\nDa conferencias el: " + daConferencias);
		return sb.toString();

	}

	@Override
	public Dia getDiaConferencia() {
		return daConferencias;
	}

}
