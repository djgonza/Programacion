
/**
 * Representa a un alumno de un curso
 * y su nota final en una determinada asignatura
 * 
 */
public class Alumno
{
    private String nombre;
    private int nota;
    
    /**
     * Constructor de objetos de la clase Alumno
     */
    public Alumno(String nombre, int nota)
    {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     * 
     * Accesor para el nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
     /**
     * 
     * Accesor para la nota
     */
    public int getNota()
    {
        return nota;
    }
    
    
     /**
     * 
     * Mutador para la nota
     */
    public void setNota(int nota)
    {
        this.nota = nota;
    }
    
    /**
     * Devuelve true si el alumno actual ha tenido
     * una nota mejor que el recibido como parametro
     *  Hazlo sin if, con una sola sentencia
     */
    public boolean notaMejorQue(Alumno alumno)
    {
        return this.nota > alumno.getNota();
    }

    /**
     *  Devuelve un clon del alumno
     *  Con una sola sentencia
     */
    public Alumno clon()
    {
        return new Alumno(this.nombre, this.nota);
    }

    /**
     *  devuelve el alumno actual
     */
    public Alumno alumnoActual()
    {
         return this;
    }

    
     /**
     * 
     * Representacion textual del alumno
     * Devuelve el nombre y  la nota formateados  
     * Hay que utilizar String.format() - La columna de la izquierda   esta ajustada a la derecha en un
     * espacio de 15 posiciones y la de la derecha (el tamano) esta ajustada a la izquierda
     * en un espacio de 4 posiciones
     */
    public String toString()
    { 
        return String.format("%15s:%-4d", this.nombre, this.nota);
        
    }
    
    /**
     * Mostrar datos del alumno 
     */
    public void printAlumno()
    {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Dvd", 25);
        alumno.printAlumno();
    }
    
    
}
