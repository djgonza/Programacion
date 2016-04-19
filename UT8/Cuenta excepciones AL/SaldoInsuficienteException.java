
/**
 *   
 */
public class SaldoInsuficienteException extends Exception
{
     
    private String mensaje;

    /**
     * Constructor  
     */
    public SaldoInsuficienteException(String mensaje)
    {
         this.mensaje = mensaje;
    }

    /**
     *  
     * 
     */
    public String toString()
    {
         return mensaje;
    }
}
