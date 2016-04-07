
/**
 *  
 * 
 * @author  
 * @version  
 */
public  class Coche 
{
    private int velocidad;
    
    /**
     * 
     */
    public  Coche(int velocidad)
    {
        this.velocidad = velocidad;
    }

    /**
     * 
     */
    public  int getVelocidad()
    {
        return velocidad;
    }

     /**
     * 
     */
    public  void setVelocidad(int velocidad)
    {
       this.velocidad = velocidad;
       
    }
    

   
    
    /**
     * 
     */
    public  String toString()
    {
        return this.getClass() + "\nVelocidad: " + velocidad;
    }

}