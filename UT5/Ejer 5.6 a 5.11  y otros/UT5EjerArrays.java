import java.util.Random;
/**
 *  
 */
public class UT5EjerArrays
{
    
    private Random generador;
    /**
     * Constructor  
     */
    public UT5EjerArrays()
    {
        this.generador = new Random();
    }

    /**
     * Ejer 5.4 
     */
    public  void escribirArray()
    {
        // declarar e inicializar
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0; i<numeros.length; i++ )
        {
            System.out.println(numeros[i]);
        }

    }

    /**
     * Ejer 5.5 
     * diaSemana ha de ser un valor entre 1 y 7
     * devolver el nombre del día de la 
     * semana  correspondiente   al   parámetro   que  se  pasa  al   método
     * Si  el  valor  del parámetro es incorrecto se devolverá la cadena “Día incorrecto”;
     */ 
    public String  encontrarNombreDia(int diaSemana)
    {
        // declarar e inicializar un array con los nombres de los días de la semana
        String[ ] nombres = {"Lunes", "Martes", "Miércoles", "Jueves",
                "Viernes", "Sabado", "Domingo"};

        if(diaSemana <1 || diaSemana >7)
        {
            return "Día incorrecto";
        }

        return nombres[diaSemana -1];
    }

    /**
     *  
     * Ejer 5.6 - Calcular la media de los valores del
     * array recibido como argumento
     *  
     */
    public double calcularMedia(double[] notas)
    {
        double suma = 0;
        for(int i = 0; i < notas.length; i++)
        {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    /**
     *  
     * Ejer 5.7 - Calcular y devolver el máximo
     *  
     */
    public int maximo(int[] enteros)
    { 
        int max = enteros[0];
        for(int i=1; i < enteros.length; i++)
        {

            if (enteros[i] > max)
            {
                max = enteros[i];
            }

        }
        return max;
    }

    /**
     *  
     * Ejer 5.8 -  devolver otro 
     * array con los valores pares encontrados en el original
     *  V1 - Contamos primeros los pares, creamos un array con
     *  longitud la cantidad de pares, dejamos los pares y lo devolvemos
     */
    public int[] paresV1(int[] enteros)
    {
        //Creamos un contador para almacenar el numero de pares que hay
        int contador = 0;
        //recorremos el array
        for(int i=0; i < enteros.length; i++)
        {
            //si el numero es par sumamos uno
            if (enteros[i]%2 == 0)
            {
                contador++;
            }
        }

        //creamos un nuevo array con la longitud del contador
        int[] pares = new int[contador];

        //reseteamos el contador
        contador = 0;
        //volvemos a recorrer el array original
        for(int i=0; i < enteros.length; i++)
        {
            //asigamos al nuevo array los valores pares encontrados
            if (enteros[i]%2 == 0)
            {
                pares[contador] = enteros[i];
                contador++;
            }
        }
        return pares;
    }

    /**
     *  
     * Ejer 5.8 -  devolver otro 
     * array con los valores pares encontrados en el original
     *  V2 -  Creamos un nuevo array de tamaño el original y dejamos los pares
     *  Devolvemos una copia de ese array con exactamente los pares guardados
     *  (para hacer la copia System.arraycopy() o Arrays.copyOf() )
     */
    public int[] paresV2(int[] enteros)
    {

        return null;

    }

    /**
     *  
     * Ejer 5.9 -  rotar una posición a la derecha el array numeros
     *  Rotar sobre un nuevo array
     */
    public int[] rotarDerechaV1(int[] enteros)
    {
        int[] nuevoArray = new int[enteros.length];
        nuevoArray[0] = enteros[enteros.length-1];
        for(int i=0; i<enteros.length-1; i++){

            nuevoArray[i+1] = enteros[i];

        }
        return nuevoArray;
    }

    /**
     *  
     * Ejer 5.9 -  rotar una posición a la derecha el array numeros
     *  Rotar sobre el mismo array array
     */
    public void rotarDerechaV2(int[] enteros)
    {
        int aux = enteros[enteros.length];
        for(int i = 0; i < enteros.length; i++){
            //enteros[]
        }
        
    }

    /**
     *  Ejer 5.10 
     *  crea un nuevo array con el doble de tamaño que el original
     *  guarda en el nuevo array cada elemento del original copiado dos veces
     *  Si numeros = {2, 3, 4, 5, 6} el array expandido será {2, 2, 3, 3, 4, 4, 5, 5, 6, 6} 
     *   
     */
    public int[]  expandir(int[] numeros)
    {

        return null;
    }

    /**
     *  
     * Ejer 5.11 -  generar 100  aleatorios entre 1 y 9 y devolver la frecuencia de aparición del valor 1, del 
     * valor 2, del valor 3, …
     *  
     */
    public int[] calcularFrecuencias( )
    {
        int[] frecuencia = new int[9];
        int j = 0;
        for (int i = 0; i < 100; i++){
            int aleatorio = generador.nextInt(9) + 1;
            System.out.printf("%2d", aleatorio);
            frecuencia[aleatorio-1]++;
            if(j%10==0)
                System.out.println();
            j++;
        }
        return frecuencia;

    }
}
