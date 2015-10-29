
/**
 * Modela a un curso que tiene como máximo dos alumnos
 *  
 *  
 */
public class Curso
{
    private String nombre;
    private Alumno alumno1;
    private Alumno alumno2;

    /**
     * Constructor de objetos de la clase Curso
     * Crea el curso con el nombre indicado e inicializa
     * las referencias a los alumnos con valor null
     */
    public Curso(String nombre)
    {
        this.nombre = nombre;
        this.alumno1 = null;
        this.alumno2 = null;
        
    }

    /**
     * Añade un nuevo alumno al curso si éste no está completo
     * 
     * Los alumnos se añaden asignando las referencias en orden, es decir,
     *  cuando no hay alumnos el primero que se añade será el alumno1, 
     *  si hay un alumno el segundo que se añade será alumno2 
     *  
     * @param  alumno el alumno a añadir
     * @return   true si se ha podido añadir
     *          false en otro caso
     *          
     *  No se puede utilizar el operador &&    
     */
    public boolean addAlumno(Alumno alumno)
    {
        if(this.alumno1 == null){
            this.alumno1 = alumno;
            return true;
        }
        else if(this.alumno2 == null){
            this.alumno2 = alumno;
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * 
     * Devuelve el nº de alumnos en el curso  
     * Sin utilizar el operador &&
     */
    public int getNumeroAlumnos()
    {
        if(alumno2 != null)
            return 2;
        if(alumno1 != null)
            return 1;
        else
            return 0;

    }   

    /**
     *  Devuelve el curso actual clonado (copia exacta)
     *  Si el curso tiene alumnos los alumnos también habrá
     *  que clonarlos
     *   
     */
    public Curso clonar()
    {

        Curso aux = new Curso(this.nombre);

        if(this.alumno1 != null)
            aux.addAlumno(this.alumno1.alumnoActual());
        if(this.alumno2 != null)
            aux.addAlumno(this.alumno2.alumnoActual());
        return aux;

    }

    /**
     * Mostrar datos de los alumnos 
     * Si no hay alumnos  se muestra el correspondiente mensaje
     * 
     */
    public void printCurso()
    {
        int aux = this.getNumeroAlumnos();
        if(aux == 0)
            System.out.print("El curso no tiene alumnos");
        else
            System.out.print("El curso tiene "+aux+" alumnos");
    }

    
    
}
