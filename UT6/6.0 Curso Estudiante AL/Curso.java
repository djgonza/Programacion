import java.util.ArrayList;
import java.util.Iterator;
/**
 * Un objeto de esta clase mantiene una colección
 * Arraylist de objetos estudiante
 * 
 */

public class Curso
{

    private  ArrayList<Estudiante> curso;

    /**
     * Constructor  
     */
    public Curso()
    {
        curso = new ArrayList<>();

    }

    /**
     * Añade un estudiante a la colección
     */
    public void añadirEstudiante(String nombre, int nota)
    {

        curso.add(new Estudiante(nombre, nota));
    }

    /**
     * nº de alumnos en el curso
     */
    public int cuantosAlumnos()
    {
        return curso.size();

    }

    /**
     * Representación en formato texto del curso
     * 
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Estudiante aux: curso)
        {
            sb.append(aux.toString());
        }
        return sb.toString();
    }

    /**
     * Calcual la media de notas del curso. Utiliza for mejorado
     */
    public double getMedia()
    {
        double media = 0;

        for(Estudiante aux: curso)
        {
            media += aux.getNota();
        }
        return media / cuantosAlumnos();

    }

    /**
     * Nombre del alumno con nota máxima. Con for mejorado
     */ 
    public String alumnoNotaMaximaV1()
    {
        return "";
    }

    /**
     * Nombre del alumno con nota máxima. Utiliza un iterador
     */ 
    public String alumnoNotaMaximaV2()
    {
        Iterator<Estudiante> it = curso.iterator(); 
        int max = 0;
        String nombreMax = "";
        while(it.hasNext())
        {
            Estudiante estudiante = it.next();
            if(estudiante.getNota() > max)
            {
                max = estudiante.getNota();
                nombreMax = estudiante.getNombre();
            }
        }
        return nombreMax;

    }

    /**
     * Borrar el primer estudiante de la colección. Esta no puede estar vacía
     */   
    public void borrarPrimero(Iterator<Estudiante> it)
    {
        if(!curso.isEmpty())
        {
            curso.remove(0);
        }

    }

    /**
     * Borrar los alumnos que han suspendido. Con un interador
     */
    public void borrarSuspensos()
    {

        Iterator<Estudiante> it = curso.iterator(); 

        while(it.hasNext())
        {
            Estudiante estudiante = it.next();
            if(estudiante.getNota() < 5)
            {
                it.remove();
            }
        }

    }

    /**
     * 
     * Devuelve true si hay algún notable. Con for mejorado  
     */
    public boolean hayAlgunNotable()
    {
        for(Estudiante alumno: curso)
        {
            if(alumno.getNota() >= 7)
            {
                return true;
            }

        }
        return false;

    }

    /**
     * 
     * cuantos estudiantes tienen un nombre que empieza por la cadena indicada
     *  
     */
    public int  empiezanPor(String str)
    {
        int cont = 0;
        for(Estudiante estudiante: curso){
            if(estudiante.getNombre().startsWith(str)){
                cont++;
            }
        }
        return cont;
    }

    /**
     * 
     * Devuelve el suspenso más alto del curso    
     */
    public int suspensoMasAlto()
    {
        int susp = 0;
        for(Estudiante estudiante: curso){
            int notaEstudiante = estudiante.getNota();
            if(notaEstudiante > susp && notaEstudiante < 5) {
                susp = notaEstudiante;
            }
        }
        return susp;

    }

    /**
     * 
     * Calcula y devuelve el total de suspensos. Con un iterador.     
     */
    public int totalSuspensosIterador()
    {
        Iterator<Estudiante> it = curso.iterator();
        int cont = 0;
        while(it.hasNext())
        {
            Estudiante estudiante = it.next();

            if(estudiante.getNota() > 0 && estudiante.getNota() < 5)
            {
                cont++;
            }
        }
        return cont;

    }

    /**
     * 
     * Calcula y devuelve como un string las dos notas más altas del curso.
     * Con un while normal.
     */
    public String dosNotasMasAltas()
    {
        //         int i = 0;
        //         Estudiante notaUno = null;
        //         Estudiante notaDos = null;
        //         while(curso.size() > i){
        //             int nota = curso.get(i).getNota();
        //             if(notaUno == null || nota > notaUno.getNota()){
        //                  notaDos = notaUno;
        //                 notaUno = curso.get(i);
        //                
        //             }
        //             
        //             i++;
        //         }
        //         
        //         return notaUno.toString() + " " + notaDos.toString();
        
        int i = 0;
        int notaUno= 0;
        int notaDos = 0;
        while(curso.size() > i){
            int nota = curso.get(i).getNota();
            if(nota > notaUno)
            {
                notaDos = notaUno;
                notaUno = nota;
                
            } else
            if(notaDos < notaUno && notaDos < nota)
            {
                notaDos = nota;
            }
            
            i++;
        }
        
        return notaUno + " " + notaDos;
        
        
    }

}
