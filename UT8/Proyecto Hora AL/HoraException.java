
/**
 *  class HoraException  
 * 
 * @author  
 * @version  
 */
public class HoraException extends Exception
{
     private String mensaje;

    /**
     * Constructor de la clase HoraException
     */
    public HoraException(String mensaje)
    {
        super(mensaje);
        this.mensaje = mensaje;
     
    }

    /**
     *  
     */
    public String toString()
    {
         return mensaje;
    }
}
