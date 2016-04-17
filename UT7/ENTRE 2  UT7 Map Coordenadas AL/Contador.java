
/**
 *  Modela un contador  
 *  
 */
public class Contador
{
     
    private int valor; 

    /**
     * Constructor de la clase Contador
     */
    public Contador()
    {
        valor = 0;
    }

    /**
     *  accesor para el valor del contador
     */
    public int getValor()
    {
        return valor;
    }
    
     /**
     *  Mutador 
     */
    public void setValor(int valor)
    {
        this.valor = valor;
    }

    /**
     *  incrementa en uno el valor del contador
     */
    public void incrementar()
    {
         valor ++;
    }
    
    /**
     *  Rerpesentación textual del valor del contador
     */
    public String toString()
    {
        return  String.valueOf(valor);
    }

}
