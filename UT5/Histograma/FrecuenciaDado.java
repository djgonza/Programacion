
/**
 *  class FrecuenciaDado  
 * 
 * @author  
 * @version  
 */
public class FrecuenciaDado
{
     
    private Dado dado;
    public int[] frecuencia;

    /**
     * Constructor de la clase FrecuenciaDado
     */
    public FrecuenciaDado()
    {
     dado = new Dado();
     frecuencia = new int[6];
    }

    /**
     *  
     */
    public void tirarDado(int veces)
    {
        for(int i = 0; i < veces; i++)
        {
            dado.tirarDado();
            frecuencia[dado.getCara()-1]++;
        }
        
    }
    
    /**
     *  
     */
    public void escribirFrecuencia()
    {
        for(int i= 0; i < frecuencia.length; i++)
        {
           System.out.printf("%2d %4d", i + 1, frecuencia[i]); 
           System.out.println();
        }

    }

}
