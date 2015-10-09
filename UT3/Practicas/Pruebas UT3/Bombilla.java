
/**
 * Clase para definir una bombilla
 */
public class Bombilla
{
     
    private int potencia;
    private boolean estado;

    /**
     * Constructor de la clase Bombilla
     */
    public Bombilla(int quePotencia)
    {
        
        potencia = quePotencia;
        estado = false;
    }

    /**
     *  
     */
    public int getPotencia()
    {
         return potencia;
    }
    
    /**
     *  
     */
    public boolean getEstado()
    {
        return estado;
    }

    /**
     *  
     */
    public void setPotencia(int quePotencia)
    {
        potencia = quePotencia;
    }
    
    /*public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }*/

    /**
     *  
     */
    public void cambiarEstado()
    {
        estado = !estado;
    }
    /*public void setEstado()
    {
        if(estado){
            estado = false;
        }else{
            estado = true;
        }
    }*/

}
