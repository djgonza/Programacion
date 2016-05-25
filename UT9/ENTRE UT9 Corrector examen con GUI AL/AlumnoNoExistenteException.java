
/**
 *    
 */
public class AlumnoNoExistenteException extends RuntimeException
{
    private String mensaje;

    /**
     * Constructor de la clase AlumnoNoExistenteException
     */
    public AlumnoNoExistenteException(String mensaje)
    {
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
