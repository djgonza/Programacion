
/**
 *  
 */
public class Alumno 
{
     
    private String nombre;
    private int nota;
    private Coche coche;

    /**
     * Constructor  
     */
    public Alumno(String nombre, int nota, Coche c)
    {
        this.nombre = nombre;
        this.nota = nota;
        this.coche = c;
    }

    /**
     *  
     * 
     */
    public String getNombre()
    {
        return nombre;
    }
    
      /**
     *  
     * 
     */
    public int getNota()
    {
        return nota;
    }

    /**
     *  
     * 
     */
    public Coche getCoche()
    {
        return coche;
    }
    
     /**
     *  
     * 
     */
    public void setCoche(Coche c)
    {
       this.coche = c;
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
        Alumno a = (Alumno) obj;
        if ( this.getClass() != a.getClass())
            return false;
        Alumno al = (Alumno) obj;
        return this.nombre.equalsIgnoreCase(al.getNombre()) && this.nota == al.getNota();
    }

    /**
     * Redefinición de hashCode
     */
    public int hashCode()
    {
        return  nota + nombre.hashCode() * 11; 
    }

    /**
     * redefinición de clone con copia profunda
     */
    public  Alumno clone() throws CloneNotSupportedException
    {
        
    }

    /**
     *  
     * 
     */
    public String toString()
    {
        return this.getClass().getName() + "\n" + nombre + " - " + nota +
                    "\nCoche " + coche.toString();
    }

    /**
     * 
     */
    public  void print()
    {
        System.out.println(this.toString());
    }

}

