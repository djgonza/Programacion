
/**
 * Escriba la descripci�n de la clase Vaca aqu�.
 * 
 * @author
 * @version
 */
public class Vaca extends Animal {

	/**
	 * Constructor de la clase Circulo
	 */
	public Vaca(String nombre, int patas, Persona dueño) {
		super(nombre, patas, dueño);

	}

	public void emitirSonido() {
		System.out.println("mmmmuuuuuu");

	}

	public void comer() {
		System.out.println("Comer Hierba");

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
