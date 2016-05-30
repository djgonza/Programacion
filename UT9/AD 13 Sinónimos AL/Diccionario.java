import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileNotFoundException;
/**
 * Clase Diccionario 
 * Modela un diccionario en el que cada palabra
 * tiene asociada una lista de sinónimos
 * El diccionario está ordenado y los sinónimos de
 * cada palabra también
 */

public class Diccionario
{
    // el map asocia palaba y lista de sinónimos
    // los sinónimos se incluyen en una colección ordenada en la que 
    // no se admiten duplicados
    private Map<String, Set<String>> diccionario;

    /**
     * Constructor de la clase Diccionario
     * Crea el map y lo inicializa con los datos del fichero
     * "datos.txt". LLama para ello al método cargarDiccionario()
     * 
     * Propaga las posibles excepciones (no las captura)
     */
    public Diccionario()  throws FileNotFoundException
    {
        diccionario = new TreeMap<>();
        cargarDiccionario("prueba.txt");

        //System.out.println(diccionario);
    }

    /**
     * Carga del diccionario a partir de un fichero de texto
     * 
     * Cada línea contiene palabra - relación de sinónimos separados
     * por espacios en blanco
     * Propaga las posibles excepciones (no las captura)
     * @param nombre el nombre del fichero 
     */
    private void cargarDiccionario(String nombre) throws FileNotFoundException
    {
        File f = new File(nombre);
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            tratarLinea(sc.nextLine());

        }
        sc.close();
    }

    /**
     *  Procesa una línea de texto extrayendo cada palabra
     *  y sus sinónimos
     *  @param linea la línea de texto a procesar
     */
    private void tratarLinea(String Ulinea)
    {
        String[] linea = Ulinea.split(" ");
        TreeSet<String> temp = new TreeSet<>();
        for(int i = 1; i<linea.length; i++)
        {
            temp.add(linea[i]);
        }
        diccionario.put(linea[0], temp);

    }

    /**
     *  Indica si existe o no una palabra en el diccionario
     *
     * @param palabra la palabra a comprobar si existe ya
     *          o no en el diccionario
     * @return true si está, false en otro caso
     */
    public boolean existePalabra(String palabra)
    {
        if(diccionario.containsKey(palabra))
            return true;
        return false;

    }

    /**
     * Total de palabras en el diccionario
     *
     * @return el nº total de palabras en el diccionario
     */
    public int palabrasEnDiccionario()
    {
        int cont = 0;
        for(String clave: diccionario.keySet())
        {
            cont += diccionario.get(clave).size()+1;
        }
        return cont;
    }

    /**
     * Dada una palabra devuelve el total de sinónimos
     *
     * @param palabra la palabra cuyo nº de sinónimos queremos devolver
     * @return el nº de sinónimos de palabra, -1 si la palabra no existe
     */
    public int totalSinonimosDe(String palabra)
    {
        return diccionario.get(palabra).size();
    }

    /**
     * Dada una palabra devuelve el conjunto de sinónimos
     *
     * @param palabra la palabra cuyos sinónimos queremos devolver
     * @return el conjunto de sinónimos de palabra, null si la
     *          palabra no existe
     */
    public Set<String> sinonimosDe(String palabra)
    {
        Set<String> aux = new TreeSet<>();
        for(String valor: diccionario.get(palabra))
        {
            aux.add(valor);
        }
        return aux;

    }

}
