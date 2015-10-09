
/**
 *  class Conversor  
 * 
 * @author  
 * @version  
 */
public class Conversor
{
     
    private double grados;

    /**
     * Constructor de la clase Conversor
     */
    public Conversor()
    {
        this.grados = 0;
    }

    /**
     *  setter grados
     */
    public void setGrados(double grados)
    {
         this.grados = grados;
    }
    
    /**
     *  getter grados
     */
    public double getGrados()
    {
         return this.grados;
    }
    
    /**
     *  conversor farenheit a centigrados
     */
    public double aCentigrados()
    {
        return (5 * (this.grados - 32)) / 9;
    }
    
    /**
     *  conversor centigrados a farenheit
     */
    public double aFarenheit()
    {
        return ((9 * this.grados) + 32) / 5;
    }


}
