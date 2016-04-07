
/**
 * 
 * 
 * @author
 * @version
 */
public abstract class Ordenador {

	private String codigo;
	private double precio;

	/**
	 * Constructor
	 */
	public Ordenador(String codigo, double precio) {
		this.codigo = codigo;
		this.precio = precio;

	}

	public abstract String getSlogan();

	public abstract double calcularDescuento();

	/**
	 *  
	 * 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	*  
	* 
	*/
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	* 
	*/
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * 
	 */
	public String toString() {
		return "Código: " + codigo + "\n" + "Precio: " + precio
				+ " Descuento " + calcularDescuento();
	}

}
