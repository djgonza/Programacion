
/**
 *  class Aula  
 * 
 * @author  
 * @version  
 */
public class Aula
{
     
    private String nombreAula;
    private int capacidad;

    /**
     * Constructor de la clase Aula
     */
    public Aula(String nombreAula, int capacidad)
    {
        this.nombreAula = nombreAula;
        this.capacidad = capacidad;
    }

    /**
     *  
     */
    public String getNombreAula()
    {
         return this.nombreAula;
    }
    
    /**
     *  
     */
    public int getCapacidad()
    {
         return this.capacidad;
    }
    
    /**
     *  
     */
    public void setNombreAula(String nombreAula)
    {
         this.nombreAula = nombreAula;
    }
    
    /**
     *  
     */
    public void setCapacidad(int capacidad)
    {
         this.capacidad = capacidad;
    }
}
