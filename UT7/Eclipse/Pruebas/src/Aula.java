
public class Aula implements Comparable<Aula> {

	private int superficie;
	private String nombre;

	public int getSuperficie() {

		return superficie;

	}

	@Override
	public int compareTo(Aula aux) {

		return (int) Math.signum(this.superficie - aux.getSuperficie());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + superficie;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (superficie != other.superficie)
			return false;
		return true;
	}

}
