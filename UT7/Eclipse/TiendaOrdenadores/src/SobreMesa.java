
/**
 * 
 * 
 * @author
 * @version
 */
public class SobreMesa extends Ordenador {

	private String descripcion;

	public SobreMesa(String codigo, double precio, String descripcion) {
		super(codigo, precio);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSlogan() {
		return "El que más pesa pero el que menos cuesta";

	}

	public double calcularDescuento() {
		return super.getPrecio() * 0.1;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = super.toString();

		return temp += " Descripci�n " + descripcion;
	}

}
