
/**
 *    
 */
public abstract class Ordenador implements Comparable<Ordenador>, Cloneable
{

    private String codigo;
    private double precio;
 

    /**
     * Constructor  
     */
    public Ordenador(String codigo, double precio)
    {
        this.codigo = codigo;
        this.precio = precio;
        
    }

    /**
     *  
     * 
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     *  
     * 
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     *  
     * 
     */
    public abstract String getSlogan();
    

    /**
     * 
     */
    public  void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    /**
     * 
     */
    public  void setPrecio(double precio)
    {
        this.precio = precio;
    }

   
    /**
     * Redefinición de equals()
     */
    public  boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;   
        if ( this.getClass() != obj.getClass())
            return false;       
        Ordenador ord = (Ordenador) obj;

        return this.codigo.equalsIgnoreCase(ord.getCodigo());
    }

    /**
     * @override
     */
    public  int hashCode()
    {
        return codigo.hashCode() * 11 + (int) precio;
    }

    /**
     * implementación del método del interface Comparable
     */
    public  int compareTo(Ordenador ord)
    {
        if (this.precio < ord.getPrecio())
            return -1;
        if (this.precio > ord.getPrecio())
            return 1; 
        return 0;
    }

    /**
     * @override
     */
    public  Ordenador clone()
    {
        try
        {
            return (Ordenador) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }

    /**
     * Aplicar un descuento a todos los ordenadores, variará dependiendo del tipo
     */
    public abstract double calcularDescuento();

    /**
     * 
     */
    public  String toString()
    {
        return "Clase: " + this.getClass().getName() + "\nCódigo: " + codigo + "\n" +
        "Precio: " + precio + "\n" +
        "Slogan: " + getSlogan() + "\n" +
        "Descuento aplicado " + calcularDescuento() + "\n";
    }

}
