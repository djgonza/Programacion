
/**
 *  class Dinero  
 * 
 * @author  
 * @version  
 */
public class Dinero
{
    //constantes
    final int DIEZ = 10;
    final int CINCO = 5;
    final int DOS = 2;
    final int UNO = 1;
    
    private int euros;

    /**
     * Constructor de la clase Dinero
     */
    public Dinero(int euros)
    {
        this.euros = euros;
    }

    /**
     *  setter euros
     */
    public void setEuros(int euros)
    {
         this.euros = euros;
    }
    
    /**
     *  getter euros
     */
    public int getEuros()
    {
         return this.euros;
    }
    
    /**
     *  mostrar detalles
     */
    public void printDescomposicionMonedas()
    {
        System.out.println("Dinero: " + this.euros + "€");
        
        int cantidadRestante = euros;
        System.out.println("10: " + cantidadRestante / DIEZ);
        cantidadRestante %= DIEZ;
        System.out.println("5: " + cantidadRestante / CINCO);
        cantidadRestante %= CINCO;
        System.out.println("2: " + cantidadRestante / DOS);
        cantidadRestante %= DOS;
        System.out.println("1: " + cantidadRestante / UNO);
        cantidadRestante %= UNO;
    }
    
}
