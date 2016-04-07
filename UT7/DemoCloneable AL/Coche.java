
/**
 * 
 */
public class Coche  
{
    private String modelo;

    /**
     * Constructor  
     */
    public Coche(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     *  
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * Redefinición de equals()
     */
    public  boolean equals(Object obj)
    {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.getClass() !=  obj.getClass())
            return false;
        Coche c = (Coche) obj;

        return this.modelo.equalsIgnoreCase(c.getModelo());
    }

    /**
     * redefinición de clone
     */
    public   Coche clone()  
    {
        try
        {
            Coche clonado =  (Coche) super.clone();         
            return clonado;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }

    }

}
