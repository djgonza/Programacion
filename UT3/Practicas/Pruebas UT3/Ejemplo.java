
/**
 *  class Ejemplo  
 * 
 * @author  
 * @version  
 */
public class Ejemplo
{
     
    private int a;
    private int b;
    
    /**
     * Constructor de la clase Ejemplo
     */
    public Ejemplo(int queA, int queB)
    {
        a = queA;
        b = queB;
    }

    /**
     *  
     */
    public void intercambiar()
    {
         int aux = a;
         a = b;
         b = aux;
    }
    
    /**
     *  
     */
    public void promptAntes()
    {
        System.out.println("Antes del intercambio");
        System.out.println("Atributo a = " + a);
        System.out.println("Atributo b = " + b);
    }
    
    /**
     *  
     */
    public void promptDespues()
    {
        System.out.println("Despúes del intercambio");
        System.out.println("Atributo a = " + b);
        System.out.println("Atributo b = " + a);
    }
    
    /**
     *  
     */
    public void escribir()
    {
        promptAntes();
        promptDespues();
    }

}
