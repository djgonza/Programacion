
/**
 *  class Hucha  
 * 
 * @author  
 * @version  
 */
public class Hucha
{
     
    private double dinero;

    /**
     * Constructor de la clase Hucha
     */
    public Hucha()
    {
        dinero = 0;
    }

    /**
     *  consultar cantidad dinero
     */
    public double getDinero()
    {
         return this.dinero;
    }
    
    /**
     *  meter dinero
     */
    public void meterDinero(double cantidad)
    {
        this.dinero += cantidad;
    }
    
    /**
     *  sacar dinero
     */
    public void sacarDinero(double cantidad)
      {
        this.dinero -= cantidad;
    }

    /**
     *  mostrar cantidad
     */
    public void printDetalles()
    {
        System.out.println("Cantidad Acumulada: " + this.dinero);
    }
}
