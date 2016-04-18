
/**
 * Representa una coordenada con un valor de x y de y
 * 
 */
public class Coordenada implements Comparable<Coordenada> {

	private int x;
	private int y;

	/**
	 * Constructor
	 */
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	 * Accesor para la coordenada x
	 * 
	 */
	public int getX() {
		return x;
	}

	/**
	 * Accesor para la coordenada y
	 * 
	 */
	public int getY() {
		return y;
	}

	/**
	 * Mutador para la coordenada x
	 * 
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Mutador para la coordenada y
	 * 
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 */
	public String toString() {
		return "(" + x + " , " + y + ")";
	}

	/**
	 *  
	 *
	 */
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Coordenada cord = (Coordenada) obj;
		return cord.getX() == this.x && cord.getY() == this.y;

	}

	/**
	 *  
	 *
	 */
	public int hashCode() {

		int hash = 7;
		hash = 71 * hash + this.x;
		hash = 71 * hash + this.y;
		return hash;

	}

	@Override
	public int compareTo(Coordenada o) {

		if (this.equals(o))
			return 0;
		if (this.x == (o.getX()))
			return this.y < o.y ? 1 : -1;
		else
			return this.x < o.getX() ? 1 : -1;

	}

}
