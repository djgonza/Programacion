
/**
 * Un objeto de esta clase emite saludos normales 
 * y personalizados
 * 
 *  
 */
public class Saludo
{
    private String nombre;
    private String color;
    private int edad;

    /**
     * Constructor de objetos de la clase Saludo
     */
    public Saludo()
    {
        nombre = "";

    }

    /**
     * Constructor de objetos de la clase Saludo
     */
    public Saludo(String nombre, String color, int edad)
    {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;

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
        return "Hola " + nombre + 
                ", tienes " + edad  
                + " años y te gusta el color " 
                + color;
    }
}
