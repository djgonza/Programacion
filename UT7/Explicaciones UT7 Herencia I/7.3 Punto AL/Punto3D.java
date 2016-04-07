
/**
 *   
 */
public class Punto3D  extends Punto
{
     
    private int z;

    /**
     * Constructor  
     */
    public Punto3D()
    {
        super();
        z = 0;
         
    }
    
    /**
     *  
     */
    public void print()
    {
        System.out.println(getX() + " - " + getY() + " - " + z );

    }
    
    /**
     *  
     */
    public int getZ()
    {
        return z;

    }

    
     /**
     *  
     */
    public boolean equals(Object obj)
    {
        if(super.equals(obj))
        {
            Punto3D otro = (Punto3D) obj;
            return this.z == otro.getZ();
        }
        return false;
        
        

    }


    
}
