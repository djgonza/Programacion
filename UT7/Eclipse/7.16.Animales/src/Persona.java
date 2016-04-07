
/**
 * Representa una persona
 */
public class Persona {

	private String nombre;
	private int edad;

	/**
	 * Constructor de la clase Persona
	 */
	public Persona(String queNombre, int queEdad)

	{
		nombre = queNombre;
		edad = queEdad;

	}

	/**
	 * accesor para el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * accesor para la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @override
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (obj == this)
			return true;
		Persona otro = (Persona) obj;
		return otro.getNombre().equals(this.getNombre())
				&& otro.getEdad() == this.getEdad();

	}

	/**
	 * @override
	 */
	public int hashCode() {
		return nombre.hashCode() * 11 + edad;
	}

	/**
	 * @override
	 */
	public String toString() {
		return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
	}
}
