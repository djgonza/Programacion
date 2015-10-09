
/**
 *  class Contador  
 * 
 * @author  
 * @version  
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
     *  getter valor
     */
    public int getContador()
    {
         return this.valor;
    }
    
    /**
     *  metodo para incrementar valor
     */
    public void incrementar(int valor)
    {
        this.valor += valor;
    }
    
    /**
     *  metodo para decrementar valor
     */
    public void decrementar(int valor)
    {
        this.valor -= valor;
    }
    
    /**
     *  metodo para resetear el valor
     */
    public void reset()
    {
        this.valor = 0;
    }
    
     /**
     *  mostrar detalles del contador
     */
    public void printContador()
    {
        System.out.println("Valor: " + this.valor);
    }


}
