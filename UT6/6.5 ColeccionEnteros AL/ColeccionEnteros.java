import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;
/**
 * Colección de objetos Integer
 */

public class ColeccionEnteros
{
    private LinkedList<Integer> miLista;

    /**
     * Constructor  
     * llamamos a inicializarColeccion()
     */
    public ColeccionEnteros()
    {
        miLista = new LinkedList<>();
        inicializarColeccion();

    }

    /**
     *  Usar Arrays.asList() para convertir el array
     *   en una colección y usar luego addAll
     *
     */
    public ColeccionEnteros(Integer[] valores) 
    {
        miLista = new LinkedList<>();
        miLista.addAll(Arrays.asList(valores));

    }

    /**
     *  inicializa la colección con valores aleatorios  entre 0 y 20 (inclusive)
     *   Parar cuando sale el 0 o se han generado 10 valores
     */
    private void inicializarColeccion()
    {
        int aleatorio = (int) (Math.random() * 21);
        int contador = 1;
        while(aleatorio != 0 && contador <= 10)
        {
            miLista.add(aleatorio);
            contador++;
            aleatorio = (int) (Math.random() * 21);

        }

    }

    /**
     *  Añade el valor siempre al principio
     */
    public void add(int valor)
    {
        miLista.add(0, valor);   
    }

    /**
     * Suma los elementos de la colección
     * Con iterador
     */
    public int sumar()
    {
        Iterator<Integer> it = miLista.iterator();
        int suma = 0;
        while(it.hasNext()){
            suma += it.next();
        }
        return suma;

    }

    //     /**
    //      * 
    //      * Suma los elementos de la colección
    //      * Con for mejorado
    //      */
    //     public int sumarV2()
    //     {
    // 
    //     }

    /**
     * Ordenar la colección, no se modifica el original
     * Utilizaremos utilidades de la clase Collections
     */
    public LinkedList<Integer> ordenar()
    {
        LinkedList<Integer> tmp = new LinkedList<>();
        tmp.addAll(miLista);
        Collections.sort(tmp);
        return tmp;

    }
    
    /**
     * Muestra la lista ordenada
     */
    public void escribir()
    {
        System.out.println(this.toString());

    }

    /**
     *  probando retainAll()
     *
     */
    public void elementosComunes(LinkedList<Integer> otra)
    {
        miLista.retainAll(otra);

    }

    /**
     *  probando removeAll()
     *
     */
    public void elementosDiferentes(LinkedList<Integer> otra)
    {

        miLista.removeAll(otra);
    }

    /**
     * Representación textual de la colección
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Integer obj : miLista)
        {
            sb.append(obj + "\t");
        }
        return sb.toString();

        //tmb se puede hacer así 
        //         StringBuilder sb = new StringBuilder();
        //         for(int i : miLista)
        //         {
        //             sb.append(i + "\t");
        //         }
        //         return sb.toString();

    }
}
