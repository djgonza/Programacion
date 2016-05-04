package pkgindice.modelo;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase IndiceDocumento 
 * 
 */

public class IndiceDocumento
{
    private Map< String,List<Integer>> indice;  // representa el índice del documento

    /**
     * Constructor de la clase IndiceDocumento
     */
    public IndiceDocumento()
    {
        indice =  new TreeMap<>();
    }

    /**
     * Añade una palabra al índice junto con la línea en la que aparece
     * Si la palabra aparece por primera vez se creará una nueva entrada en el índice
     * en caso contario, se añade el nº de línea a la palabra ya existente (solo si no está)
     * Siempre se añade en mayúsculas
     * 
     * @param  palabra la palabra a añadir
     * @param  num el nº de línea donde aparece la palabra
     *  
     */
    public void addPalabra(String palabra, int num)
    {
        String clave = palabra.toUpperCase();
        if(!indice.containsKey(clave))
        {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(num);
            indice.put(clave, tmp);
        }
        else
        {
            indice.get(clave).add(num);
        }

    }

    /**
     * Añade las múltiples palabras que están en línea
     * (separadas por blancos) al índice,
     * todas ellas en  el nº de línea indicada por num
     * Utiliza Scanner y un bucle para extraer los tokens de la línea
     * 
     */
    public void addTodasPalabras(String linea, int num)
    {
        Scanner sc = new Scanner(linea);
        while(sc.hasNext()) {
            addPalabra(sc.next(), num);
        }

    }

    /**
     * Representación textual del índice
     * Usa conjunto de entradas y StringBuilder
     */

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String,List<Integer>>> entradas = indice.entrySet();
        for(Map.Entry<String,List<Integer>> entrada: entradas)
        {
            sb.append(entrada.getKey() + " ");
            for(int numero: entrada.getValue())
            {
                sb.append(numero+",");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    /**
     * Mostrar en pantalla el índice del documento
     */
    public void listarIndiceDocumento()
    {
        System.out.println(toString());
    }

}
