import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
/**
 * La clase Secuencia almacena un serie de 
 * números enteros ordenados.
 */

public class Secuencia
{
    private ArrayList<Integer> lista;

    /**
     * Construye una lista a partir de la colección 
     * recibida como parámetro
     */        
    public Secuencia(ArrayList<Integer> otra)
    {
        if(otra == null)
            throw new IllegalArgumentException("Colección vacía");
        else

        {
            lista = new ArrayList<Integer>();
            lista.addAll(otra);
        }
    }

    /**
     * accesor para la secuencia ArrayList almacenada
     * devuelve  una copia, no el propio original. Para ello
     * crea una nueva colección de enteros y vuelve a utilizar addAll()
     */

    public ArrayList<Integer> getSecuencia()
    {
        ArrayList<Integer> copia = new ArrayList<Integer>();
        copia.addAll(lista);
        return copia;

    }  

    /**
     * Obtiene la fusión (la unión) de dos listas 
     * de números ordenadas, la represetnada por el atributo lista y 
     * la representada por el parámetro otra
     * 
     */
    public ArrayList<Integer> fusionarCon(ArrayList<Integer> otra)
    {
        otra.addAll(lista);
        Collections.sort(otra);
        return otra;   
    }

    /**
     * Obtiene la intersección de lista y el parámetro otra. La  intersección 
     * contiene los elementos comunes y no repetidos de ambas (en orden)
     */
    public  ArrayList<Integer> interseccionCon( ArrayList<Integer> otra)
    {
        otra.retainAll(lista);
        ArrayList<Integer> aDevolver = eliminarDuplicados(otra);
        aDevolver.sort(null);
        return aDevolver;

    }

    /**
     *  Elimina los duplicados de una lista
     *
     */
    private ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista)
    {
        HashSet<Integer> aux = new HashSet<Integer>(lista);
        ArrayList<Integer> auxDos = new ArrayList<Integer>();
        Iterator it = aux.iterator();
        auxDos.addAll(aux);
        //         while(it.hasNext()){
        //             auxDos.add(it.next());
        //         }
        return auxDos;
    }

    /**
     * Representación textual de la secuencia guardada
     * por el objeto actual
     */
    public String toString()
    {
        return lista.toString();
    }

}
