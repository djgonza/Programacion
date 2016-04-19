
/**
 * Clase FactorialNegativoExcepcion 
 * 
 * @author 
 * @version 
 */
public class FactorialNegativoExcepcion extends Exception
{
	private int num;
	
	/**
	 * Constructor de la clase FactorialNegativoExcepcion
	 */
	public FactorialNegativoExcepcion(int num)
	{
		this.num = num;
	}

	/**
	 * 
	 * @param  
	 * @return
	 */
	public String toString()
	{
		return "Factorial negativo " + num;
	}
}
