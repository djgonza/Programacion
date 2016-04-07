
/**
 * Escriba la descripci�n de la clase Perro aqu�.
 * 
 * @author
 * @version
 */
public class Perro extends Animal {
	private String lugarFavorito;

	/**
	 * Constructor de la clase Circulo
	 */
	public Perro(String nombre, int patas, Persona dueño,
			String lugarFavorito) {

		super(nombre, patas, dueño);
		this.lugarFavorito = lugarFavorito;
	}

	public String getLugarFavorito() {
		return lugarFavorito;
	}

	public void setLugarFavorito(String lugarFavorito) {
		this.lugarFavorito = lugarFavorito;
	}

	public void emitirSonido() {
		System.out.println("guauu guau");

	}

	public void comer() {
		System.out.println("Comer Huesos");

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj) && ((Perro) (obj))
				.getLugarFavorito() == this.getLugarFavorito();
	}

	@Override
	public String toString() {
		return super.toString() + "Lugar preferido " + lugarFavorito;

	}

}
