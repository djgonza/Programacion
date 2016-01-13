import java.util.Arrays;
/**
 * Un objeto de esta clase contiene una lista de n�meros 
 * que no se repiten
 *  
 * @version UT5 Ej.5.19
 */
public class ArraySinRepetidos
{
    private static final int MAX = 10;
    private int[] elementos;
    private int siguiente;

    /**
     * Constructor 
     */
    public ArraySinRepetidos()
    {
        this.elementos = new int[MAX];
        this.siguiente = 0;
    }

    /**
     * Detecta si el array est� completo
     * @return true si est� completo

     */
    public boolean estaCompleto()
    {
        return siguiente == MAX;

    }

    /**
     * A�ade un nuevo valor al final del array si �ste no est� completo
     * y no est� ya el elemento
     * 
     * @param nuevoElemento el valor a a�adir

     */
    public void insertar(int nuevoElemento)
    {
        if(!estaElemento(nuevoElemento)){
            elementos[siguiente] = nuevoElemento;
            siguiente++;
        }
    }

    /**
     * Detecta si un valor est� o no en el array
     * Se hace una b�squeda lineal
     * @param  numero el valor a buscar
     * @return   true si est� el valor, false en otro caso
     */
    public boolean estaElemento(int numero)
    {
        for(int i=0; i<siguiente; i++){
            if(elementos[i] == numero){
                return true;
            }
        }
        return false;
    }

    /**
     * inserta nuevoElemento en el lugar que le corresponda en el array de 
     * manera que quede ordenado. El elemento solo se a�ade si el array no 
     * est� lleno y no contiene ya ese valor
     */
    public void insertarEnOrden(int nuevoElemento){
        if(estaCompleto() || estaElemento(nuevoElemento)){
            return;
        }
        for(int i=0; i<siguiente; i++){
            if(nuevoElemento > elementos[i] && nuevoElemento < elementos[i+1]){
                for(int j=siguiente; j>i; j--){
                    elementos[j] = elementos[j-1];
                }
                elementos[i] = nuevoElemento;
            }
        }
    }

    /**
     * busca numero en el array por el m�todo de la b�squeda binaria o dicot�mica
     */
    public boolean estaElementoBinaria(int numero){
        //Arrays.sort(elementos);
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = siguiente - 1;
        while (izquierda<= derecha && ! encontrado)
        {
            int mitad = (izquierda + derecha) / 2;
            if (elementos[mitad] == numero)
                encontrado = true;
            else if (elementos[mitad] > numero)
                derecha = mitad - 1;
            else
            izquierda = mitad + 1;
        }
        return encontrado;
    }

    /**
     * busca numero en el array por el m�todo de la b�squeda binaria o 
     * dicot�mica pero ahora utilizando un m�todo de la clase Arrays 
     * (!cuidado! La versi�n del m�todo que utilices tiene que buscar 
     * el valor en un rango del array)
     */
    public boolean estaElementoBinariaV2(int numero){
        //Arrays.sort(elementos);
        if(Arrays.binarySearch(elementos, 0, siguiente, numero) < 0){
            return false;
        }
        return true;
    }
    
    /**
     * Limpia elementos
     */
    public void clear(){
        siguiente = 0;
    }

    /**
     * Devuelve la representaci�n textual del array de la forma {4, 6, 8, 13, 9}
     */
    public String toString()
    {
        String aDevolver = "{";
        for(int i=0; i<siguiente; i++){
            aDevolver += elementos[i]+", ";
        }
        return aDevolver;
    }

}
