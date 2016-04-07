import java.util.ArrayList;
/**
 *  
 * 
 * @author  
 * @version  
 */
public class ListaAlumnos
{
     
    private ArrayList<Alumno> alumnos;

    /**
     * Constructor  
     */
    public ListaAlumnos()
    {
         alumnos = new ArrayList<Alumno>();
    }

    /**
     *  
     * 
     * @param   
     * 
     */
    public void addAlumno(Alumno al)
    {
         if (!alumnos.contains(al))
            alumnos.add(al);
    }
    
    /**
     * 
     */
    public  void printAlumnos()
    {
        for (Alumno al: alumnos)
            System.out.println(al.toString());
    }

}
