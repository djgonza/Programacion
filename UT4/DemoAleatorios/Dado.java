
/**
 * Modela un dado de de 6 caras
 * 
 * @author 
 * @version 
 */

import java.util.Random;

public class Dado
{
    private int cara;
    private Random generador;

    /**
     * Constructor de la clase Dado
     */
    public Dado()
    {
        this.cara = 1;
        this.generador = new Random();
    }

    /**
     * Accesor
     * @return  el valor actual de la cara del dado  
     */
    public int getCara()
    {

        return cara;
    }

    /**
     * Simula el lanzamiento del dado
     */

    public void tirarDado()
    {
        //this.cara = (int) (Math.random() * 6 + 1); 
        cara = generador.nextInt(6) + 1;
        
    }
}
