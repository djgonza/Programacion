
/**
 * 
 * 
 * @author
 * @version
 */
public class SobreMesa extends Ordenador {

	private String descripcion;

	public SobreMesa(String codigo, double precio, String slogan, String descripcion) {
		super(codigo, precio, slogan);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = super.toString();

		return temp += "Descripci�n " + descripcion;
	}

}