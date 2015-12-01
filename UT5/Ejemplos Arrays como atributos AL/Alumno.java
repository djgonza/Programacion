/**
 * Clase que modela a un alumno
 */
public class Alumno
{
    public static final int MAX_ASIGNATURAS = 5;
    private String nombre;
    private int[] notas;
    private int pos;

    /**
     * @param nombre el nombre del alumno
     * inicializa adecuadamente los atributos
     */
    public Alumno(String nombre)
    {
        this.nombre = nombre;
        this.notas = new int[MAX_ASIGNATURAS];
        this.pos = 0;
    }

    /**
     * @param nota la nota del alumno que hay que registrar
     */
    public void registrarNota(int nota)
    {
        if(pos < notas.length)
        {
            notas[pos] = nota;
            pos++;
        }

    }

    /**
     *  
     */
    public int totalSuspensos()
    {
        int suspensos = 0;
        for(int i = 0; i < pos; i++)
        {
            if (notas[i] < MAX_ASIGNATURAS)
            {
                suspensos++;
            }
        }
        return suspensos;
    }

    /**
     *  
     */
    public String toString()
    {
        String dev = "Nombre: " + this.nombre + "\nNotas: ";
        for(int i = 0; i < pos; i++)
        {
            dev += String.format ("%2d \t", notas[i]);
        }
        return dev;
    }
} 
