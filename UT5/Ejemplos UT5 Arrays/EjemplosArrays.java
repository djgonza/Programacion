import java.util.Arrays;
/**
 *  Ejemplos de la UT5
 *  
 */
public class EjemplosArrays
{

    /**
     * Constructor  
     */
    public EjemplosArrays()
    {

    }


   

    /**
     *  Invierte los valores de un array
     *  Arrays como argumentos
     */
    public void  invertir(int[ ]  valores)
    {
        int longitud = valores.length;
        int aux;
        int limiteDerecha = longitud - 1;
        for (int i = 0; i < (longitud / 2); i++)
        {
            aux = valores[i];
            valores[i] = valores[limiteDerecha];
            valores[limiteDerecha] = aux; 
            limiteDerecha--;
        }
    }

    /**
     *  Invierte los valores de un array
     *  Arrays como valor de retorno
     */
    public int[]  invertirV2(int[ ]  valores)
    {
        int longitud = valores.length;
        int [] resultado = new int[longitud];

        for (int i = 0; i <  longitud ; i++)
        {
            resultado[i] = valores[longitud - i - 1];
        }
        return resultado;
    }

    /**
     * muestra en pantalla los valores de un array
     * Arrays como argumentos
     */
    public void   escribir(int[ ] valores)
    {
        for (int i = 0; i < valores.length;  i++)
        {
            System.out.print(valores[i]  +  ",");    
        }
        System.out.println();
    }
 
 

    /**
     * Búsqueda lineal
     */
    public boolean  buscarLineal(int[ ] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int i = 0;
        while  (i < numeros.length  &&  ! encontrado)
        {   
            if (numeros[i] == valorBuscado)
                encontrado = true;
            else
                i++;
        }
        return encontrado;
    }

    /**
     * Búsqueda lineal
     */
    public boolean  buscarLinealV2(int[ ] numeros, int valorBuscado)
    {

        int i = 0;
        while  (i < numeros.length)
        {   
            if (numeros[i] == valorBuscado)
                return true;
            else
                i++;
        }
        return false;
    }

    /**
     * Búsqueda dicotómica o binaria
     */
    public boolean  buscarDicotomica(int[ ] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length - 1;
        int mitad;
        while  (izquierda<= derecha  &&  ! encontrado)
        {
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                encontrado = true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad -  1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }

    /**
     * Búsqueda dicotómica o binaria
     */
    public boolean  buscarDicotomicaV2(int[ ] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length - 1;
        int mitad;
        while  (izquierda<= derecha)
        {
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                return true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad -  1;
            else
                izquierda = mitad + 1;
        }
        return false;
    }

    /**
     *  
     *
     */
    public int[] copiarV2(int[] original)
    {
        int[] copia = new int[original.length];
        System.arraycopy(original, 0, copia, 0, original.length);
        return copia;
    }

    /**
     *  
     *
     */
    public int[] copiarV3(int[] original)
    {
        int[] copia = Arrays.copyOf(original, original.length);
        return copia;
    }

}
