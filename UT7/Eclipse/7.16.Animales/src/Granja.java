/**
 * Clase Granja
 * 
 * @author
 * @version
 */
public class Granja {
	public int pos;

	private Animal[] animales;

	/**
	 * Constructor de la clase Granja
	 */
	public Granja(int cuantos) {
		animales = new Animal[cuantos];
		pos = 0;
	}

	/**
	 * 
	 * Si el array est� completo lanzar la excepci�n RuntimeException
	 */
	public void addAnimal(Animal a) {
		if (pos < animales.length) {
			animales[pos] = a;
			pos++;
		} else
			throw new RuntimeException("Granja completa");

	}

	/**
	 * 
	 * devuelve el animal de la posici�n i Si i es incorrecto lanzar la
	 * excepci�n IllegalArgumentException
	 */
	public Animal getAnimal(int i) {
		if (i < pos)
			return animales[i];
		else
			throw new IllegalArgumentException("Posición incorrecta");
	}

	/**
	 * Contar cu�ntos perros hay en la granja
	 */
	public int cuantosPerros() {
		int cont = 0;
		for (int i = 0; i < pos; i++) {
			if (animales[i] instanceof Perro)
				cont++;

		}
		return cont;
	}

	/**
	 * Borrar los gatos de la granja
	 */
	public void borrarGatos() {
		int i = 0;
		while (i < pos) {
			if (animales[i] instanceof Gato) {
				for (int j = i; j < pos - 1; j++) {
					animales[j] = animales[j + 1];
				}

				pos--;
			} else
				i++;
		}

	}

	/**
	 * Cu�ntas vacas iguales a v hay en la granja
	 */
	public int vacasIgualesA(Vaca v) {
		int cont = 0;
		for (int i = 0; i < pos; i++) {
			if (animales[i] instanceof Vaca) {
				if (animales[i].equals(v))
					cont++;

			}

		}
		return cont;

	}

	/**
	 * 
	 * mostrar la granja
	 */
	public void mostrarAnimales() {
		for (int i = 0; i < pos; i++) {
			System.out.println(animales[i].toString());

		}
	}
}
