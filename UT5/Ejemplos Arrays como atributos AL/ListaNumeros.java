
/**
 *  
 * Modela una lista de números 
 * Tiene un atributo que es un array
 */
public class ListaNumeros
{
    private int[] numeros;
    private int pos;

    /**
     * @param n el tamaño máximo del array
     */
    public ListaNumeros(int n)
    {
        numeros = new int[n];
        pos = 0;  // longitud lógica
    }

    /**
     * Constructor sobrecaragdo
     * Creamos el array a partir de otro que se recibe como parámetro
     */
    public ListaNumeros(int[]  array)
    {
        numeros = array;
        pos =  array.length;
    }

    /**
     * Añadir un nº a la lista solo si no está completa
     */
    public void addNumero(int valor)
    {
        if (pos < numeros.length)
        {   
            numeros[pos] = valor;
            pos++;
        }
    }

    /**
     * Representación textual de la lista
     */
    public  String toString()
    {
        String str = "";
        for (int i = 0; i < pos; i++)
            str += numeros[i] + "\t";
        return str;
    }

    /**
     * Comprueba si la lista de números está completa o no
     */
    public  boolean estaLlena()
    {
         
    }
    
    /**
     *  Calcual y devuelve la suma de todos los nºs
     */
    public int suma()
    {

    }


    /**
     * Añadir un nº a la lista en una posición
     */
    public void insertarEnPosición(int valor, int p)
    {
       
        
        
        
    }

    /**
     * Añadir un nº a la lista de forma que quede ordenada
     */
    public void insertarEnOrden(int valor)
    {
      
        
        
        
    }

    /**
     * Borrar un elemento de una posición
     */
    public void borrar(int posicion)
    {
       
        
        
        
    }

    /**
     * desplazar a la izquierda a partir de posicion + 1
     */
    private void desplazarIzquierda(int posicion)
    {
      
        
        

    }

    /**
     * Borrar varios elementos
     */
    public void borrarImpares()
    {
       
        
        
        
    }

}
