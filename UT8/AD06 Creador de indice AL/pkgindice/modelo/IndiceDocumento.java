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
    private Map< String,List<Integer>> indice;  // representa el �ndice del documento

    /**
     * Constructor de la clase IndiceDocumento
     */
    public IndiceDocumento()
    {
        indice =  new TreeMap<>();
    }

    /**
     * A�ade una palabra al �ndice junto con la l�nea en la que aparece
     * Si la palabra aparece por primera vez se crear� una nueva entrada en el �ndice
     * en caso contario, se a�ade el n� de l�nea a la palabra ya existente (solo si no est�)
     * Siempre se a�ade en may�sculas
     * 
     * @param  palabra la palabra a a�adir
     * @param  num el n� de l�nea donde aparece la palabra
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
     * A�ade las m�ltiples palabras que est�n en l�nea
     * (separadas por blancos) al �ndice,
     * todas ellas en  el n� de l�nea indicada por num
     * Utiliza Scanner y un bucle para extraer los tokens de la l�nea
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
     * Representaci�n textual del �ndice
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
     * Mostrar en pantalla el �ndice del documento
     */
    public void listarIndiceDocumento()
    {
        System.out.println(toString());
    }

}
