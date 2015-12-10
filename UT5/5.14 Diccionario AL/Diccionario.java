import  javax.swing.JOptionPane;

/**
 *  la clase Diccionario representa a un diccionario
 *  de palabras
 * 
 */

public class Diccionario
{
    private static final int MAX_PALABRAS = 10;
    private Palabra[] listaPalabras;
    private int pos;

    /**
     * Constructor de la clase Diccionario
     * @param numPalabras la cantidad de palabras m�xima
     * que guardar� el diccionario
     */
    public Diccionario(int numPalabras)
    {
        if(numPalabras > MAX_PALABRAS)
        {
            listaPalabras = new Palabra[MAX_PALABRAS];
        }else{
            listaPalabras = new Palabra[numPalabras];
        }
        pos = 0;

    }

    /**
     * 
     * @param nuevaPalabra la palabra a a�adir     
     */
    public void insertarPalabra(Palabra nuevaPalabra)
    {
        if (pos < listaPalabras.length)
        {
            listaPalabras[pos] = nuevaPalabra;
            pos++;
        }else{
            JOptionPane. showMessageDialog(null, "Diccionario lleno");
        }

    }

    /**
     *  
     */
    public int getTotalPalabras()
    {
        return pos;
    }

    /**
     * @param posicion la posici�n de la palabra
     *        a devolver. A partir de 1.
     * @return la palabra de posicion
     */
    public Palabra obtenerPalabra(int posicion)
    {
        if(posicion >= 0 && posicion < pos)
        {
            return listaPalabras[posicion];
        }
        return null;

    }

    /**
     * @param posicion la posici�n de la palabra
     *        a traducir. A partir de 1.
     * @return la traducci�n al ingl�s de la palabra
     *          de posici�n 
     */
    public String traducirPalabra(int posicion)
    {
        if (posicion >= 1 && posicion <= pos)
            return obtenerPalabra(posicion - 1).getIngles();
        else
            return null;
    }

    /**
     * Mostrar el diccionario
     */
    public void escribirDiccionario()
    {
        System.out.println(toString());
    }

    /**
     * Representaci�n textual del diccionario
     */
    public String toString()
    {
        String aux = "";
        for(int i = 0; i < pos; i++)
        {
            aux+= (listaPalabras[i].toString());
        }
        return aux;   
    }

}
