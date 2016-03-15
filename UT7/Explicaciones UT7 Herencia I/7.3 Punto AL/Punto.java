
/**
 *  
 */
public class Punto
{
     
    private int x;
    private int y;

    /**
     * Constructor  
     */
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
         
    }

    /**
     *  
     * 
     */
    public int getX()
    {
         return x;
    }
    
    /**
     *  
     * 
     */
    public int getY()
    {
         return y;
    }
    
    /**
     *  
     * 
     */
    public void setX(int x)
    {
         this.x = x;
    }
    
    /**
     *  
     * 
     */
    public void setY(int y)
    {
         this.y = y;
    }
    
    /**
     * 
     */
    public String toString()
    {
        return x + "," + y;
    }
    
    /**
     *  
     */
    public static void main(String[] args)
    {
        Punto a = new Punto(3, 5);
        Punto3D b = new Punto3D();
        b= (Punto3D) a;

    }


}
