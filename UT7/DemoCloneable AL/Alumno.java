
/**
 *  
 */
public class Alumno   
{

    private String nombre;
    private int nota;

    /**
     * Constructor  
     */
    public Alumno(String nombre, int nota)
    {
        this.nombre = nombre;
        this.nota = nota;
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
        Alumno a = (Alumno) obj;
       
        return this.nombre.equalsIgnoreCase(a.getNombre()) &&
            this.nota == a.getNota();
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

