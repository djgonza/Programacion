
/**
 * Modela a una bola de un determinado color
 */
public class Bola
{
    private final int NEGRO = 1;
    private final int BLANCO = 2;
    
    private int color;
    
    /**
     * 
     */
    public Bola()
    {
        this.color = 1;
    }
    
    /**
     *  
     */
    public Bola(int c)
    {
        this.color = c;
    }

    /**
     * Devuelve true si la bola es negra, false en otro caso
     */
    public boolean esNegra()
    {
        return this.color == NEGRO;
    }

    /**
     * Accesor para el color de la bola
     */
    public int getColor()
    {
         return this.color;
    }

    /**
     * Representación textual de la bola
     */
    public String  toString()
    {
        String strResul = "Bola";
        
        if (this.color == NEGRO)
        {
            strResul += "Negra";
        }
        else
        {
            strResul += "Blanca";
        }
        return strResul;
    }
    
    /**
     *  
     */
    public boolean mismoColorQue (Bola otra)
    {
           return this.color == otra.color;
    }

}
