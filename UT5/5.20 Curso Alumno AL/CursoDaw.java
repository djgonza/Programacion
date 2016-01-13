
/**
 *  Modela un grupo de alumnos de un curso
 */
import javax.swing.JOptionPane;
import java.util.Arrays;
public class CursoDaw
{

    //private static final int MAX_ALUMNOS = 10;

    private String nombreCurso;
    private Alumno[] alumnos;
    private int total;

    /**
     * Constructor de la clase CursoDai
     */
    public CursoDaw(String nombreCurso, int maximo)
    {
        this.nombreCurso = nombreCurso;
        total = 0;
        alumnos = new Alumno[maximo];

    }

    /**
     *   Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje con JOptionPane.  
     */
    public void addAlumno(String nombre, int nota)
    {
        if (total < alumnos.length)
        {
            alumnos[total] = new Alumno(nombre, nota);
            total++;
        }else{
            JOptionPane.showMessageDialog(null, "Curso Completo!");
        }
    }

    /**
     *    Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje con JOptionPane.  
     */
    public void addAlumno(Alumno alumno)
    {
        if (total < alumnos.length)
        {
            alumnos[total] = alumno;
            total++;
        }else{
            JOptionPane.showMessageDialog(null, "Curso Completo!");
        } 
    }

    /**
     * devuelve la cantidad de aprobados en el curso
     */ 
    public int totalAprobados()
    { 
        int aprobados = 0;
        for(int i=0; i<total; i++){
            if(alumnos[i].getNota() >= 5)
                aprobados++;
        }
        return aprobados;
    }

    /**
     * devuelve un array de String con los nombres de los alumnos que han aprobado todo
     */ 
    public String[] alumnosConTodoAprobado()
    {
        String[] nombresAprobados = new String[totalAprobados()];
        int cont = 0;
        for(int i=0; i<total; i++){
            if(alumnos[i].getNota() >= 5){
                nombresAprobados[cont] = alumnos[i].getNombre();
                cont++;
            }
        }
        return nombresAprobados;   
    }

    /**
     * ordena el curso de mayor a menor nota por el método de selección directa (se modifica el array original)
     */
    public void ordenarPorSeleccionDirecta()
    {
        for(int i = 0; i < total-1; i++){
            int mayor = i;
            for(int j = i+1; j < total; j++){
                if (alumnos[j].getNota() > alumnos[mayor].getNota())
                    mayor = j;
            }
            Alumno aux = alumnos[i];
            alumnos[i] = alumnos[mayor];
            alumnos[mayor] = aux;

        }

    }

    /**
     * Borrar los alumnos que han obtenido un 3 devolviendo la cantidad de alumnos borrados
     */
    public int borrarLosDeNota3()
    {
        int cont = 0;
        int i = 0;
        while(i < total){
            if(alumnos[i].getNota() <= 3){
                for(int j=i; j<total; j++){
                    alumnos[j] = alumnos[j+1];
                }
                i--;
                total--;
                cont++;
            }
            i++;
        }
        return cont;
    }

    /**
     * Representación textual del curso
     */
    public String toString()
    { 
        String resul = "";
        for(int i=0; i<total; i++){
            resul+=alumnos[i].getNombre() + " | " + alumnos[i].getNota() + "\n";

        }
        return resul;
    }

    /**
     *  crea una copia del array alumnos
     *  Ordena la copia de menor a mayor nota por el método de inserción directa y lo devuelve.
     */
    public Alumno[] ordenarPorInsercionDirecta()
    {
        Alumno[] aDevolver = Arrays.copyOf(alumnos, total);
        
        for (int i = 0; i < total; i++)
        {
            int aux = i;
            
            for (int j = i; j < total; j++)
            {
                if(aDevolver[j].getNota() < aDevolver[aux].getNota()){
                    aux = j;
                }
            }
            Alumno aux2 = aDevolver[i];
            aDevolver[i] = aDevolver[aux];
            aDevolver[aux] = aux2;
        }

        
        return aDevolver;

    }

    /**
     *  obtiene un array con los nombres de los alumnos que han aprobado todo
     *  Ordena alfabéticamente ese  array usando un método de la clase Arrays
     */
    public String[] ordenarPorNombreAprobados()
    {
      String[] resul = new String[total];
       for (int i = 0; i < total; i++){
           resul[i] = alumnos[i].getNombre();
           
       }
        Arrays.sort(resul);
        return resul;
       

    }

}
