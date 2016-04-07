
/**
 *  
 */
public class Pais  
{
    private String nombre;
    private double superficie;
    private int habitantes;
    
    /**
     * 
     */
    public  Pais(String nombre, double superficie, int habitantes)
    {
        this.nombre = nombre;
        this.superficie = superficie;
        this.habitantes = habitantes;
    }

     /**
     * 
     */
    public  String getNombre()
    {
        return nombre;
    }
    
    /**
     * 
     */
    public  double getSuperficie()
    {
        return superficie;
    }

     /**
     * 
     */
    public  void setSuperficie(double superficie)
    {
       this.superficie = superficie;
       
    }
    
     /**
     * 
     */
    public  int getHabitantes()
    {
        return habitantes;
    }

     /**
     * 
     */
    public  void setHabitantes(int habitantes)
    {
       this.habitantes = habitantes;
       
    }
    
   
     

    /**
     * 
     */
    public  String toString()
    {
        return this.getClass().getName() + "\nPaís: " + nombre + 
                       "\nSuperficie: " + superficie +
                        "\nHabitantes: " + habitantes;
    }
}