/**
 * Define una persona. 
 * Toda persona tiene asociado un identificador, un nombre y una fecha de nacimiento
 *  Es capaz además de usar un ordenador
 *  
 *  Es una clase de la que no se crearán instancias
 *  
 *  Toda persona puede compararse por su nombre, este será su orden natural
 *  
 * 
 */
 
import java.time.LocalDate;
 

public  class Persona  
{
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;

    /**
     * Constructor de persona
     *  
     */
    public Persona(String id, String nombre, LocalDate fechaNacimiento)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Accesor para el id  de la persona
     */
    public String getId() 
    {
        return id;
    }

    /**
     * Accesor para el nombre de la persona
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * Accesor para la fecha de nacimiento
     */
    public LocalDate getFechaNacimiento() 
    {
        return fechaNacimiento;
    }  
 

    

    /**
     *  Redefinición del mótodo equals()
     *
     * Dos personas son iguales si son del mismo tipo y tienen el mismo identificador
     */
    public boolean equals(Object obj)
    {
        
        return true;
    }

    /**
     * 
     *  Redefinición de hashCode()
     * @override    
     */
    public int hashCode()
    {
        return id.hashCode() + nombre.hashCode();
    }

    

    /**
     * Devuelve una representación de la persona (ver figura)
     */
    public String toString() 
    {
        
       return "";
    }

}

