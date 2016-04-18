
/**
 * Define una persona. 
 * Toda persona tiene asociado un identificador, un nombre y una fecha de nacimiento
 *  Es capaz además de usar un ordenador
 *  
 *  Es una clase de la que no se crearán instancias
 *  
 *  Toda persona puede compararse por su nombre, este será su orden natural
 *  
 * 
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona implements Comparable {

	private String id;
	private String nombre;
	private LocalDate fechaNacimiento;

	/**
	 * Constructor de persona
	 * 
	 */
	public Persona(String id, String nombre, LocalDate fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Accesor para el id de la persona
	 */
	public String getId() {
		return id;
	}

	/**
	 * Accesor para el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	public int compareTo(Object obj) {

		return this.nombre.compareTo(((Persona) obj).getNombre());

	}

	/**
	 * Accesor para la fecha de nacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Accesor para la edad
	 * 
	 * @return edad
	 */

	public int getEdad() {

		return Period.between(fechaNacimiento, LocalDate.now()).getYears();

	}

	/**
	 * Redefinición del mótodo equals()
	 *
	 * Dos personas son iguales si son del mismo tipo y tienen el mismo
	 * identificador
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * 
	 * Redefinición de hashCode()
	 * 
	 * @override
	 */
	public int hashCode() {
		return id.hashCode() + nombre.hashCode();
	}

	/**
	 * Devuelve una representación de la persona (ver figura)
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nId: " + this.getId());
		sb.append("  Nombre: " + this.getNombre());
		sb.append("\nEdad: " + getEdad());
		return sb.toString();
	}

}
