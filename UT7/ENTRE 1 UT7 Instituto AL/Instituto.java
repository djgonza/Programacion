
/**
 *  Representa a un instituto de formación profesional
 *  en el que trabajan profesores y estudian alumnos.
 * 
 * 
 */
import java.util.List;
import java.util.ArrayList;
 
public class Instituto
{
    private String nombre;
    private List<Persona> personas;

    /**
     * Constructor de la clase Instituto
     */
    public Instituto(String nombre)
    {
        this.nombre = nombre;
        
    }

    /**
     *  Accesor para el nombre del instituto
     *
     * 
     */
    public String getNombre()
    {
        return nombre;
    }
    
    
    /**
     * Añadir una nueva persona al instituto.
     * Solo se añade si no está
     * 
     * @param  p la persona a añadir
     *   
     */
    public void altaPersona(Persona p)
    {
        
    }
    
    /**
     *  Devuelve el nº de estudiante en el instituto
     *   
     *   
     */
    public int cuantosEstudiantes()
    {
         
        return 0;
    }
    
    /**
     *  Muestra todas la personas  ordenadas de mayor a menor edad
     *  Sin modificar la colección original
     *   
     */
    public void mostrar()
    {
       
        
        
    }
    
    /**
     *  Profesores que dan conferencias un determinado día de la semana
     *  La lista de profesores se devuelve ordenada por nombre
     * 
     */
    public List<Profesor> quienDaConferenciasEn(Dia d)
    {
        
         return null;
    }
    
    /**
     *  Borra los estudiantes de edad menor a la indicada
     * y devuelve los borrados en una lista
     * 
     */
    public List<Persona> borrarEstudiantes(int edad)
    {
         
        return null;
    }
    
    
    
}
