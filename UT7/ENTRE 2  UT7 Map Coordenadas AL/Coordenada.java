
/**
 *  Representa una coordenada con un valor de x y de y
 *  
 */
public class Coordenada  
{

    private int x;
    private int y;

    /**
     * Constructor  
     */
    public Coordenada(int x, int y)
    {
        this.x = x;
        this.y = y;

    }

    /**
     *  Accesor para la coordenada x
     * 
     */
    public int getX()
    {
        return x;
    }

    /**
     *  Accesor para la coordenada y
     * 
     */
    public int getY()
    {
        return y;
    }

    /**
     *  Mutador para la coordenada x
     * 
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     *   Mutador para la coordenada y
     * 
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * 
     */
    public  String toString()
    {
        return "(" + x + " , " + y + ")";
    }

    /**
     *  
     *
     */
    public boolean equals(Object obj)
    {
       
    }

    /**
     *  
     *
     */
    public int hashCode()
    {
        
    }
 

   

}
