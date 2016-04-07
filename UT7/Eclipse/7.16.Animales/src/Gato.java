
/**
 * Escriba la descripci�n de la clase Gato aqu�.
 * 
 * @author
 * @version
 */
public class Gato extends Animal {

	private String jugete;

	/**
	 * Constructor
	 * 
	 */
	public Gato(String nombre, int patas, Persona dueño, String jugete) {
		super(nombre, patas, dueño);
		this.jugete = jugete;
	}

	public String getJugete() {
		return jugete;
	}

	public void setJugete(String jugete) {
		this.jugete = jugete;
	}

	public void emitirSonido() {
		System.out.println("miauu");

	}

	public void comer() {
		System.out.println("Comer Pescado");

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj)
				&& ((Gato) (obj)).getJugete() == this.getJugete();
	}

	@Override
	public String toString() {
		return super.toString() + "Jugete preferido" + jugete;

	}

}
