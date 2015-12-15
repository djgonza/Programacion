import java.util.Arrays;
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

        if(numeros.length > MAX){
            this.numeros = Arrays.copyOf(this.numeros, MAX);
            total = MAX;
        }else{
            this.numeros = new int[MAX];
            for(int i=0; i<numeros.length; i++){
                this.numeros[i] = numeros[i];
            }
            total = numeros.length;

        }

    }

    /**
     * Añadir un nº al final (si es posible, es decir, 
     * la calculadora no está completa)
     *     
     */
    public void introducirNumero(int numero)
    {
        if(total < MAX)
        {
            numeros [total] = numero;
            total++;
        }

    }

    /**
     *  devuelve true si la calculadora está completa
     *
     */
    public boolean estaLlena()
    {
        return total == numeros.length;

    }

    /**
     * Acessor para la cantidad de números en la calculadora
     */
    public int getTotal()
    {
        return total;

    }

    /**
     * Contar los números mayores que uno dado
     */
    public int contarMayoresQue(int numero)
    {
        int mayores = 0;
        for(int i =0; i <= total; i++)
        {
            if(numeros[i] > numero)
                mayores++;

        }
        return mayores;

    }

    /**
     * Intercambiar el valor de dos elementos del array
     * @param i posición de un nº a intercambiar
     *        j posición del segundo nº a intercambiar
     */
    public void intercambiar(int i, int j)
    {
        if(posicionCorrecta(i) && posicionCorrecta(j)){
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
        return total > 0;

    }

    /**
     *  devuelve un array con los números de la calculadora 
     *  con todos sus dígitos en orden decreciente
     *  Usa el método privado   enOrdenDecreciente() 
     *  Si numeros = {45, 6, 965, 123, 93, 489, 321}  devuelve {6, 965, 93, 321 }
     */
    public int[] todoDigitosDecreciente() 
    {
        int[] aDevolver = new int[total];
        int p = 0;
        for(int i = 0; i < total; i++)
        {
            if(enOrdenDecreciente(numeros[i]))
            {
                aDevolver[p] = numeros[i];
                p++;
            }
        }
        return aDevolver;
    }

    /**
     *  Dado un nº n indica si todos sus dígitos están en orden decreciente
     *  Haz una versión recursiva para este método
     */
    public static boolean enOrdenDecreciente(int n)
    {   
        if(n/10 == 0){
            return true;
        }
        if(n%10<(n/10)%10){
            return enOrdenDecreciente (n/10);
        }else{
            return false;
        }
    }

    /**
     * 
     * Borra el último elemento del atributo numeros
     */
    public void borrarUltimoElemento()
    {
        if(total > 0)
            total--;

    }  

    /**
     *  Vacía la calculadora
     *
     */
    public void vaciar()
    {
        total = 0;

    }

    /**
     * 
     * Muestra los números guardados en la calculadora
     */
    public void escribirNumeros()
    { 
        System.out.println(Arrays.toString(numeros));

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
        for(int i = total; i >= 0; i--)
        {
            if(esPar(numeros[i]))
            {
                borrarUnPar(i);
                
            }
        }

    }

    /**
     * Borra el valor de una determinada posición
     * @param pos la posición del valor a borrar
     * 
     */
    private void borrarUnPar(int pos)
    {
        for (int i = pos; i < total; i++)
        {
            numeros[i] = numeros[i + 1];
        }
        total--;

    }

    /**
     * Inserta un nº en la posición indicada
     * @param numero el nº a insertar
     * @param pos la posción en la que se insertará
     */
    public  void insertarEnPosicion(int numero, int pos)
    {
        if(!estaLlena() && pos < MAX)
        {
            for(int i = total - 1; i >= pos; i--)
            {
                numeros[i+1] = numeros[i];
            }
            numeros[pos] = numero;
            total++;
        }

    }

    public static void main(String[] args)
    {
        int[] array_uno = {215,226,336,2248,1245,6543,87456,987};
        Calculadora demo = new Calculadora(array_uno);
        demo.escribirNumeros();
        System.out.println("Numeros Decrecientes:");
        System.out.println(Arrays.toString(demo.todoDigitosDecreciente()));
        demo.borrarUltimoElemento();
        System.out.println("Borrar ultimo");
        demo.escribirNumeros();
        System.out.println("Borrar los pares");
        demo.borrarPares();
        demo.escribirNumeros();
        System.out.println("Insertar en posicion 2 el numero 2");
        demo.insertarEnPosicion(2, 2);
        demo.escribirNumeros();
        System.out.println("Intercambiar el numero de posicion 3 por 0");
        demo.intercambiar( 3, 0);
        demo.escribirNumeros();

    }
}






