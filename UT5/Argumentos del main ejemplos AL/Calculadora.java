
/**
 * clase Calculadora
 *  
 */
public class Calculadora
{
    public static final int MAX = 15;
    private int[] numeros;
    private int total;

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora()
    {
        numeros = new int[MAX]; 
        total = 0;
    }

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora(int[] numeros)
    {
        if (numeros.length <= MAX)
            inicializar(numeros.length, numeros);
        else
            inicializar(MAX, numeros);

    }

    /**
     * Crea e inicializa el atributo numeros
     * @param  tam el tamaño del array a crear
     *          numeros el array a partir del 
     *          que se inicializa 
     */
    private void inicializar(int tam, int[] numeros)
    {
        this.numeros = new int[tam]; 
        for (int i = 0; i < tam; i++)
            this.numeros[i] = numeros[i];
        total = tam;  
    }

    /**
     * @param  numero a añadir en la calculadora
     *     
     */
    public void introducirNumero(int numero)
    {
        if (total < numeros.length)
        {
            numeros[total] = numero;
            total++;
        }
    }

    /**
     * Acessor para la cantidad de números en la calculadora
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Contar los núemros mayores que uno dado
     */
    public int contarMayoresQue(int numero)
    {
        int mayores = 0;
        for (int i = 0; i < total; i++)
            if (numeros[i] > numero)
                mayores++;
        return mayores;
    }

    /**
     * Intercambiar el valor de dos elementos del array
     * @param i posición de un nº a intercambiar
     *        j posición del segundo n� a intercambiar
     */
    public void intercambiar(int i, int j)
    {
        if (posicionCorrecta(i) && posicionCorrecta(j))
        {
            int aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
        }
    }

    /**
     * @param pos la posición a comprobar
     * @return true si es correcta
     */
    private boolean posicionCorrecta(int pos)
    {
        return pos >= 0 && pos < total;
    }

    /**
     * 
     * @return true si la calculadora tiene algún número
     */
    private boolean hayNumeros()
    {
        return total != 0;
    }

    /**
     * 
     * Borra el último elemento del atributo numeros
     */
    public void borrarUltimoElemento()
    {
        if (hayNumeros())
            total--;
    }      

    /**
     * 
     * Muestra los números guardados en la calculadora
     */
    public void escribirNumeros()
    {
        System.out.println("Posicion" + "\t" + "Valor");
        for (int i = 0; i < total; i++)
            System.out.println(i + " - \t\t" + numeros[i]);
    }

    /**
     * @param n el nº a comprobar
     * @return true si n es par
     */
    private boolean esPar(int n)
    {
        return n % 2 == 0;
    }

    /**
     * Borra los números de valor par
     */
    public void borrarPares()
    {
        int i = 0;
        while (i < total)
            if (esPar(numeros[i]))
                borrarUnPar(i);
            else
                i++;
    }

    /**
     * Borra el valor de una determinada posición
     * @param pos la posición del valor a borrar
     * 
     */
    private void borrarUnPar(int pos)
    {
        for (int i = pos + 1; i < total; i++)
            numeros[i - 1] = numeros[i];
        total--;
    }

    /**
     * Insaerta un nº en la posición indicada
     * @param numero el nº a insertar
     * @param pos la posción en la que se insertará
     */
    public  void insertarEnPosicion(int numero, int pos)
    {
        if (pos < 0 || pos > total)
            throw new IllegalArgumentException();
        if (total < MAX)
        {
            // insertar 
            // hacer hueco para el nuevo n�mero
            for (int j = total; j > pos; j--)
                numeros[j] = numeros[j - 1];
            // insertar el n�
            numeros[pos] = numero;
            total++;
        }

    }

}
