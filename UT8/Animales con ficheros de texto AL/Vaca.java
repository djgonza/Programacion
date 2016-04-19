
/**
 *  
 */
public class Vaca extends Animal
{
	
	/**
	 * Constructor  
	 */
	public Vaca(String nombre, int patas, Persona dueño)
	{
		super(nombre, patas, dueño); //llamar al constructor de la superclase
		
	}

		
	/**
	 *  
	 * @override     
	 */
	public String emitirSonido()
	{
		return "MUUUUUUU";
	}
	
	/**
	 *  
	 * @override     
	 */
	public String comer()
	{
		return "Hierba";
	}
	
	 
	
	
        
}

