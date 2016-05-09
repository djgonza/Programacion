
/**
 * Un objeto de esta clase emite saludos normales 
 * y personalizados
 * 
 *  
 */
public class Saludo
{
    private String nombre;

    /**
     * Constructor de objetos de la clase Saludo
     */
    public Saludo()
    {
        nombre = "";
        
    }

    /**
     * 
     * @param aQuien a quién se saluda
     *    
     */
    public void setNombre(String aQuien)
    {
        nombre = aQuien;
    }
    
    /**
     * Saludo normal
     *  
     */
    public String saludar()
    {
        return "Bienvenido a las GUI en Java";
    }
    
    /**
     * Saludo personalizado
     *  
     */
    public String saludarPersonalizado()
    {
        return "Hola " + nombre + ", bienvenido a las GUI en Java";
    }
}
