
/**
 * Clase Animal
 * 
 * @author
 * @version
 */

public abstract class Animal {

	private String nombre;
	private int patas;
	private Persona dueño;

	/**
	 * Constructor de la clase Figura
	 */
	public Animal(String nombre, int patas, Persona dueño) {
		this.nombre = nombre;
		this.patas = patas;
		this.dueño = dueño;

	}

	public abstract void emitirSonido();

	public abstract void comer();

	/**
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	* 
	*/
	public int getNumeroPatas() {
		return patas;
	}

	/**
	* 
	*/
	public Persona getDueño() {
		return dueño;
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
		Animal otro = (Animal) obj;
		return otro.getNombre().equals(this.getNombre())
				&& otro.getDueño().equals(this.getDueño())
				&& otro.getNumeroPatas() == this.getNumeroPatas();

	}

	/**
	 * @override
	 */
	public int hashCode() {
		return nombre.hashCode() * 11 + patas + dueño.hashCode();
	}

	/**
	 * 
	 * @param
	 * @return
	 */
	public String toString() {
		return "Nombre " + nombre + "Número de patas " + patas + "Dueño "
				+ dueño;

	}

	/**
	 * 
	 */
	public void escribir() {
		System.out.println(toString());
	}

}
