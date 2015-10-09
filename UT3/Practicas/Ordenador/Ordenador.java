
/**
 *  class Ordenador  
 * 
 * @author  
 * @version  
 */
public class Ordenador
{
     
    private int maxMemoria;
    private int memoriaInstalada;

    /**
     * Constructor de la clase Ordenador
     */
    public Ordenador(int maxMemoria)
    {
        this.maxMemoria = maxMemoria;
        this.memoriaInstalada = 0;
        
        if (maxMemoria <= 0)
            this.maxMemoria = 1024;
        
    }

    /**
     *  
     */
    public int getMaxMemoria ()
    {
         return this.maxMemoria;
    }
    
    /**
     *  
     */
    public int  getMemoriaDisponible()
    {
        return this.maxMemoria - memoriaInstalada;
        
    }
    
    /**
     *  
     */
    public void vaciarMemoria()
    {
        this.memoriaInstalada = 0;
    }
    
    /**
     *  
     */
    public boolean instalarMemoria(int memoria)
    {   
        if(getMemoriaDisponible() >= memoria)
        {
            this.memoriaInstalada += memoria;
            return true;
        
        }
        
        return false;
    }
    
    /**
     *  
     */
    public boolean instalar256Mb()
    {
        if(getMemoriaDisponible() >= 256)
        {
            this.memoriaInstalada += 256;
            return true;
        
        }
        
        return false;
    }
    
    /**
     *  
     */
    public void printInformacion()
    {
       System.out.println("Este ordenador puede tener hasta " + getMaxMemoria() + " Mb de memoria." +
                          "\nTodavía es posible instalar " + getMemoriaDisponible() + " Mb");
    }

    
    
}
