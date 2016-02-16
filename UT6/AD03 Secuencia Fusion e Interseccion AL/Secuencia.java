import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
/**
 * La clase Secuencia almacena un serie de 
 * n�meros enteros ordenados.
 */

public class Secuencia
{
    private ArrayList<Integer> lista;

    /**
     * Construye una lista a partir de la colecci�n 
     * recibida como par�metro
     */        
    public Secuencia(ArrayList<Integer> otra)
    {
        if(otra == null)
            throw new IllegalArgumentException("Colecci�n vac�a");
        else

        {
            lista = new ArrayList<Integer>();
            lista.addAll(otra);
        }
    }

    /**
     * accesor para la secuencia ArrayList almacenada
     * devuelve  una copia, no el propio original. Para ello
     * crea una nueva colecci�n de enteros y vuelve a utilizar addAll()
     */

    public ArrayList<Integer> getSecuencia()
    {
        ArrayList<Integer> copia = new ArrayList<Integer>();
        copia.addAll(lista);
        return copia;

    }  

    /**
     * Obtiene la fusi�n (la uni�n) de dos listas 
     * de n�meros ordenadas, la represetnada por el atributo lista y 
     * la representada por el par�metro otra
     * 
     */
    public ArrayList<Integer> fusionarCon(ArrayList<Integer> otra)
    {
        otra.addAll(lista);
        Collections.sort(otra);
        return otra;   
    }

    /**
     * Obtiene la intersecci�n de lista y el par�metro otra. La  intersecci�n 
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
     * Representaci�n textual de la secuencia guardada
     * por el objeto actual
     */
    public String toString()
    {
        return lista.toString();
    }

}
