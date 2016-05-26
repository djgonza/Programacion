import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 *   Esta clase guarda en un map las notas que
 *   han sacado los alumnos de un curso en un determinado
 *   control de tipo test
 *   
 *   La clave es el nombre del alumno (siempre en mayúsculas) y el valor asociado la nota
 */
public class Examen
{
    private static final String FIC_ENTRADA = "datos/respuestas-alumnos.TXT";
    private static final String FIC_SALIDA = "datos/orden-nota.txt";
    private Map<String, Double> notas;
    private CorrectorExamen corrector;

    /**
     * Constructor de la clase Examen
     * Propagar las excepciones
     */
    public Examen(CorrectorExamen corrector)
    {
        notas = new TreeMap<>();
        this.corrector = corrector;
    }

    /**
     *  Añade al map el alumno (siempre en mayúsculas) junto con su nota
     *  
     */
    public void add(String alumno, double nota)
    {
        notas.put(alumno.toUpperCase(), nota);
    }

    /**
     *  Devuelve la nota del alumno indicado
     *  Si no existe el alumnose lanza la excepción personalizada
     *  AlumnoNoExistenteException
     */
    public double notaDe(String alumno)
    {
        alumno = alumno.toUpperCase();
        if (!notas.containsKey(alumno))
        {
            throw new AlumnoNoExistenteException("No existe ese alumno en el curso");
        }
        return notas.get(alumno);
    }

    /**
     *  Calcula y devuelve cuántos han aprobado el test
     */
    public int aprobados()
    {
        int total = 0;
        for (String alumno: notas.keySet())
        {
            if (notas.get(alumno) >= 5)
            {
                total++;
            }
        }
        return total;

    }

    /**
     *  Representación textual del map
     *  Con el conjunto de entradas
     *  Cada alumno con su nota, nombre formateado a 15 posiciones alineado a la derecha, 
     *  nota formateada a 6 posiciones (2 de ellas decimales)
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Double> entrada: notas.entrySet())
        {
            sb.append(String.format("%15s - %6.2f", entrada.getKey(), entrada.getValue()));
            sb.append("\n");
        }
        return sb.toString();

    }

    /**
     *  Devolver una colección ArrayList con los nombres de los alumnos
     *  ordenados de mayor a menor nota
	 *  Habrá que ordenar con un comparador la colección de entradas (ver enunciado)
     *  puesto que no podemos ordenar un map por sus valores
     */
    public List<String> ordenadosPorNota()
    {
        List<Map.Entry<String, Double>> lista = 
            new ArrayList<Map.Entry<String, Double>>(notas.entrySet());
        Collections.sort(lista, new Comparator<Map.Entry<String, Double>>()
            {
                public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2)
                {
                    return (int) (Math.signum(e2.getValue() - e1.getValue()));
                }
            });
        List<String> resul =  new ArrayList<>();
        for (Map.Entry<String, Double> e: lista)
        {
            resul.add(e.getKey());
        }
        return resul;
    }

    /**
     * Guarda en un fichero de texto el nombre de cada alumno y su nota
     * en orden decreciente de nota
     * 
     * En cada línea aparece l nombre del alumno y la nota, ambos formateados
     * (nombre ocupará 15 posiciones y estará ajustado a la derecha, nota formateado
     * a 2 decimales ocupando 10 espacios y ajustado a la derecha)
     * 
     * Se propagan las excepciones
     */
    public void guardarOrdenadosPorNota() throws IOException
    {
        File f = new File(FIC_SALIDA);
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(f)));
        List<String> ordenadosNota = ordenadosPorNota();
        for (String al: ordenadosNota)
        {
            salida.printf("%15s%10.2f\n", al, notaDe(al));
        }
        salida.close();

    }

    /**
     *  Lee del fichero FIC_ENTRADA las respuestas que ha dado cada alumno al control
     *  y guarda en el map la nota de cada alumno en el test
     *  
     *  Cada línea del fichero contiene los datos de un alumno
     *  de la forma 
     *      nombrealumno:respuesta:respuesta:respuesta:......
     *      
     *  Asumimos los datos correctos
     *  Por ejemplo    pedro:a:b:c: :d:a:a: :b:b
     *   
     *  Con BufferedReader y capturando las excepciones
     */
    public void leerDeFichero()
    {
        BufferedReader entrada = null;
        try
        {
            File f = new File(FIC_ENTRADA);
            entrada = new BufferedReader(new FileReader(f));
            
            String linea = entrada.readLine();
            while (linea != null)
            {
                String[] datos = linea.split(":");
                char[] respuestasAlumno = parsearRespuestasAlumnos(Arrays.copyOfRange(datos, 1, datos.length)); 
                double nota = corrector.evaluarTest(respuestasAlumno);
                add(datos[0], nota); 
                linea = entrada.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }
        finally
        {
            if (entrada != null)
            {
                try
                {

                    entrada.close();
                }
                catch (IOException e)
                {
                    System.out.println(e.getMessage());

                } 
            }


        }
    }
    
    /**
     *  Obtener las respuestas como array de caracteres
     */
    private char[] parsearRespuestasAlumnos(String[] datos)
    {
        char[] respuestas = new char[datos.length];
        for (int i = 0; i < datos.length; i++)
        {
            respuestas[i] = datos[i].charAt(0);
        }
        return respuestas;
    }

    /**
     *  
     */
    public void print()
    {
        System.out.println(this.toString());
    }


//     /**
//      *  Crea el corrector, crea el objeto Examen,
//      *  lee del fichero las respuestas de los alumnos y
//      *  guarda los resultados en el fichero de salida
//      *  
//      *  Propaga  las excepciones que se produzcan
//      */
//     public static void main(String[] args) throws FileNotFoundException, IOException
//     {
//         CorrectorExamen corrector = new CorrectorExamen();
//         Examen examen = new Examen(corrector);
//         examen.leerDeFichero();
//         examen.guardarOrdenadosPorNota();
//     }

}
