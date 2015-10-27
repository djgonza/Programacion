import java.util.Random;
/**
 *  
 * Clase que representa a una moneda con una cara
 */
public class Moneda
{
     
    private boolean cara;
    private Random aleatorio;

    /**
     * Constructor  
     */
    public Moneda()
    {
         this.cara = true;
         this.aleatorio = new Random();
    }

    /**
     *  
     *  Simula el lanzamiento de la moneda
     *  Se genera un nº aleatorio, si es 0 suponemos cara, si es 1 suponemos cruz
     * 
     */
    public void tirar()
    {
        this.cara = (this.aleatorio.nextInt(2) == 0);
    }
    
    /**
     * 
     */
    public  boolean esCara()
    {
         return cara;
    }

}
