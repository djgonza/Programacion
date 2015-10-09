
/**
 *  class Cantante  
 * 
 * @author  
 * @version  
 */
public class Cantante
{
     
    private boolean feliz;

    /**
     * Constructor de la clase Cantante
     */
    public Cantante()
    {
        feliz = true;
    }

    /**
     *  
     */
    public void cantar()
    {
         if(feliz)
             System.out.println("Cantando bajo la lluvia");
         else
             System.out.println("No tiene amigo para cantar");
    }
    
    /**
     *  
     */
    public boolean estaTriste()
    {
         if(feliz)
            return false;
        return true;
            
        //return !feliz;
    }
    
     /**
     *  
     */
    public void cambiarEstadoAnimo()
    {
         feliz = !feliz;
    }
}
