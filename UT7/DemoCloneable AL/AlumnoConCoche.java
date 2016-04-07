
/**
 * 
 */
public class AlumnoConCoche 
{
    private String nombre;
    private int nota;
    private Coche coche;

    /**
     * Constructor  
     */
    public AlumnoConCoche(String nombre, int nota, Coche coche)
    {
        this.nombre = nombre;
        this.nota = nota;
        this.coche = coche;
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
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

        /**
     *  
     * 
     */
    public void setNota(int nota)
    {
        this.nota = nota;
    }

     /**
     *  
     * 
     */
    public void setCoche(Coche coche)
    {
        this.coche = coche;
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
        AlumnoConCoche a = (AlumnoConCoche) obj;

        return this.nombre.equalsIgnoreCase(a.getNombre()) &&
                this.nota == a.getNota() && this.coche.equals(a.getCoche());
    }

    /**
     * Redefinición de hashCode
     */
    public int hashCode()
    {
        return  nota + nombre.hashCode() * 11; 
    }

   

    /**
     *  
     * 
     */
    public String toString()
    {
        return this.getClass().getName() + "\n" + nombre + " - " + nota;
    }

    /**
     * 
     */
    public  void print()
    {
               System.out.println(this.toString());
       
    }
}
