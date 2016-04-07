
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
    public Punto()
    {
        this.x = 0;
        this.y = 0;

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
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }

        if(obj == this)
        {
            return true;
        }

        if(this.getClass() != obj.getClass())
        {
            return false;
        }

        Punto otro = (Punto) obj;
        return this.x == otro.getX() && this.y == otro.getY();

        //         if(obj = null || this.getClass() != obj.getClass() )
        //             return false;
        //         if(obj == this)
        //             return true
        // 
        //         return this.x == (Punto) otro.getX() && this.y == (Punto) otro.getY();

    }

    /**
     * 
     */
    public String toString()
    {
        return x + "," + y;
    }

}
