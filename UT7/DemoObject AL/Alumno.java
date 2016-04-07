
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
        
         return true;
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
        //Class c = this.getClass();        
        return this.getClass().getName() + "\n" + nombre + " - " + nota;
    }

    /**
     * 
     */
    public  void print()
    {
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println(Alumno.class);
    }

}

