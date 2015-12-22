import java.util.Arrays;
/**
 *  Clase que guarda un array bidimensional
 *  y permite hacer ciertas operaciones sobre él
 */
public class Array2D
{
    public static char LLAVE_APERTURA = '{';
    public static char LLAVE_CIERRE = '}';
    private int[][] matriz;

    /**
     * Constructor  
     */
    public Array2D()
    {
        matriz = new int[][]{  {1, 2, 3, 4},
            {14, 5, 26, 7},
            {17, 8, 19, 10},
            {10, 11, 12, 13} } ;
    }

    /**
     * Constructor  - crea  un array de 2 dimensiones con las filas y columnas
     * indicadas
     * @param filas  nº de filas del array 
     *  @param columnas nº de columnas del array
     */
    public Array2D(int filas, int columnas)
    {
        matriz = new int[filas][columnas];
        inicializar();
    }

    /**
     *  Inicializa la matriz con valores aleatorios entre 3 y 30 inclusive
     * Usa el mutador setValor
     */
    public void inicializar()
    {
        for(int filas = 0; filas < matriz.length; filas++)
        {
            for(int columnas = 0; columnas < matriz[filas].length;columnas++)
            {
                matriz[filas][columnas]= (int)(Math.random()* 30 + 3);
            }

        }

    }

    /**
     * @return el nº total de filas de la matriz 
     */
    public int getFilas()
    {
        return matriz.length;
    }

    /**
     * @return el nº total de columnas de la matriz 
     */
    public int getColumnas()
    {
        return matriz[0].length;
    }

    /**
     *  deja un valor en la fila y columna indicadas como parámetro
     *  asumimos f y c correctos
     *
     */
    public void setValor(int f, int c, int valor)
    {
        matriz[f][c] = valor;
    }

    /**
     *  Representación textual de la matriz
     *
     */
    public String toString()
    {
        String cadena = "";
        for(int filas = 0; filas < matriz.length; filas++)
        {
            cadena += Arrays.toString(matriz[filas]) + "\n";
        }

        return cadena;
    }

    /**
     *  
     * Escribir la matriz bidimensional en pantalla
     */
    public void escribir()
    {
        System.out.println(this.toString());
    }

    /**
     * @param f la fila cuyos valores hay que sumar
     *          suponemos f correcto
     */
    public   int sumarFila(int f)
    {
        int resul = 0;
        for(int fila = 0; fila < matriz[f].length; fila++)
        {
            resul += matriz[f][fila];
        }
        return resul;
    }

    /**
     * @param c la columna cuyos valores hay que sumar
     *          suponemos c correcto
     */
    public   int sumarColumna(int c)
    {
        int resul = 0;
        for(int fila = 0; fila < matriz.length; fila++)
        {
            resul += matriz[fila][c];
        }
        return resul;

    }

    /**
     * Calcula y devuelve un array en el que cada elemento es la suma de las filas de matriz
     */
    public  int[] sumarFilas()
    {
        int[] aux = new int[matriz.length];

        for(int col = 0; col < matriz.length; col++)
        {
            for(int fila = 0; fila < matriz[col].length; fila++)
            {
                aux[fila] += matriz[fila][col];
            }

        }

        return aux;
    }

    /**
     * Calcula y devuelve un array en el que cada elemento es la suma de las columnas de matriz
     */
    public  int[] sumarColumnas()
    {
        int[] aux = new int[matriz.length];

        for(int fila = 0; fila < matriz[0].length; fila++)
        {
            for(int col = 0; col < matriz.length; col++)
            {
                aux[col] += matriz[fila][col];
            }

        }

        return aux;
    }

    /**
     * @return calcula y devuelve la suma de la diagonal principal (suponiendo la
     * matriz cuadrada)
     */
    public   int sumarDiagonalPrincipal()
    {
        int resul = 0;
        for(int i = 0; i < matriz.length; i++){
            resul += matriz[i][i];
        }

        return resul; 

    }

    /**
     * @return calcula y devuelve la suma de la diagonal secundaria (suponiendo la
     * matriz cuadrada)
     */
    public   int sumarDiagonalSecundaria()
    {
        int resul = 0;
        for(int i= 0; i < matriz.length; i++)
        {
            resul+= matriz[i][matriz[i].length - 1 - i];
        }

        return resul; 

    }

    /**
     *   1  22  3   44
     *   3  7   5   11
     *   4  5   6   9
     *   La traspuesta es
     *   1   3   4
     *   22  7   5
     *   3   5   6
     *   44  11   9
     */
    public  int[][] traspuesta()
    {
        int[][] aux = new int[matriz[0].length][matriz.length];

        for(int filas = 0; filas < matriz.length; filas++)
        {
            for(int col = 0; col < matriz[filas].length; col++)
            {
                aux[filas][col]= matriz[col][filas];
            }
        }

        return aux;

    }

    /**
     * Calcula y devuelve la posición de la columna con suma máxima
     * Puedes ayudarte del método sumarColumna()
     */
    public  int columnaSumaMaxima()
    {
        int suma = 0;
        int devuelve = 0;
        for(int i= 0; i < matriz.length; i++)
        {
            int sumaColumna = sumarColumna(i);
            if(sumaColumna > suma)
                suma = sumaColumna;
                devuelve = i;
        }

        return suma;//devuelve;
    }

    /**
     * Intercambia la columna de suma máxima con la primera columna
     * Si son la misma no hace falta el intercambio
     */
    public  void intercambiar()
    {
        int aux = columnaSumaMaxima();
        int[] aux2 = sumarColumnas();
        if(aux != aux2[0]) {
            int[] aux3 = new int[matriz.length];
            for(int j = 0; j < matriz.length; j++){
                aux3[j] = matriz[j][0];
            }
            for(int j = 1; j < aux2.length; j++){
                if(aux2[j] == aux){
                    for (int i = 0; i < matriz.length; i++){
                        matriz[i][0] = matriz[i][j];
                        matriz[i][j] = aux3[i];
                    }
                }
            }

        }

    }
    
    /**
     *  Devuelve un ragged array donde la 1ª fila contiene el primer elemento de la 1ª fila de matriz,
     *  la 2ª fila los 2 primeros elementos de la 2ª fila de matriz, la 3ª fila los 3 primeros elementos de la 3ª fila de matriz, ...
     *  1    2   3   4   
     *  14   5   26  7   
     *  17   8   19  10  
     *  10   11  12  13  
     *  Resultado
     *  [1]
     *  [14, 5]
     *  [17, 8, 19]
     *  [10, 11, 12, 13]
     *  
     */
    public int[][] arrayRagged()
    {
        int[][] devuelve = new int [matriz.length][matriz[0].length];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j <= i; j++){
                devuelve[i][j] = matriz[i][j];
            }
        }
        return devuelve;
    }

    /**
     *  Muestra el array pero de la forma indicada. Cada nº formateado a 5 posiciones.
     *  Usa las constantes definidas en la clase
     *  
     *  {   {    1,     2,     3,     4    }
     *      {   14,     5,    26,     7    }
     *      {   17,     8,    19,    10    }
     *      {   10,    11,    12,    13    }    }

     */
    public void escribirConLlaves()
    {
        String resul = LLAVE_APERTURA + "";
        for(int i = 0; i < matriz.length; i++){
            resul += String.format("%5c", LLAVE_APERTURA);
            for(int j = 0; j < matriz[0].length; j++){
                resul += String.format("%5d,", matriz[i][j]);
            }
            resul += String.format("%5c\n", LLAVE_CIERRE);
        }
        resul += LLAVE_CIERRE;
        System.out.println(resul);
        
        
    }

    /**
     *  Calcula y devuelve el total de impares en el array
     *  Hay que hacer uso del método contarImpares(int[], int n)
     *
     */
    public int contarImpares()
    {
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            suma += contarImpares(matriz[i], matriz[i].length);
        }
        
        
        
        return suma;
        
        
    }

    /**
     *  Cuenta los impares en el array unidimensional array de tamaño n
     *  y lo hace de forma recursiva
     *
     */
    private int contarImpares(int[] array, int n)
    {
       if (n == 0)
       return 0;
       if (array[n - 1] %2 != 0)
       return 1 + contarImpares(array, n - 1);
       return contarImpares(array, n - 1);

    }

    /**
     *  Devuelve el subarray obtenido a partir de matriz entre las filas fila1 y fila2
     *  y columnas col1 y col2 (ambas inclusive)
     *  Asumimos todos los valores correctos
     *  13   20  30  25  16  
     *  12   27  24  17  27  
     *  3    12  11  28  29  
     *  21   11  20  25  8   

     *  Subarray desde filas  1 a  3 y columnas 2 a 3
     *  [24, 17]
     *  [11, 28]
     *  [20, 25]
     *  
     *
     */
    public  int [][] obtenerSubArray(int fila1, int fila2, int col1, int col2)
    {
        int filas = 0;
        int columnas = 0;
        int [][] sub = new int[fila2 - fila1 + 1][col2 - col1 + 1];
        for(int i= fila1; i <= fila2; i++){
            for(int j= col1; j <= col2; j++){
                sub[filas][columnas] = matriz[i][j] ;
                columnas++;
            }
            columnas = 0;
            filas++;
        }
        return sub;
    } 

    /**
     *  
     */
    public static void main(String[] args)
    {
        Array2D demo = new Array2D(8,8);
        demo.escribir();
        System.out.println(demo.sumarFila(2));
        System.out.println(demo.sumarColumna(2));
        System.out.println("Suma filas");
        System.out.println(Arrays.toString(demo.sumarFilas()));
        System.out.println("Suma columnas");
        System.out.println(Arrays.toString(demo.sumarColumnas()));
        System.out.println("Suma diagonal");
        System.out.println(demo.sumarDiagonalPrincipal());
        System.out.println("Suma diagonal secundaria");
        System.out.println(demo.sumarDiagonalSecundaria());
        System.out.println("Traspuesta");
        //creamos una variable local en la que guardamos el array bidimensional que nos devuelve el metodo
        int [][] aux = demo.traspuesta();
        for(int i= 0; i < aux.length; i++)
        {
        System.out.println(Arrays.toString(aux[i])); 
        }
        System.out.println(demo.columnaSumaMaxima());
        demo.intercambiar();
        demo.escribir();
        aux = demo.arrayRagged();
        for(int i= 0; i < aux.length; i++)
        {
            System.out.println(Arrays.toString(aux[i])); 
        }
        
        demo.escribirConLlaves();
        System.out.println(demo.contarImpares());
        
        int [][] sub = demo.obtenerSubArray(2, 4, 3, 6);
        for(int i= 0; i < sub.length; i++)
        {
            System.out.println(Arrays.toString(sub[i])); 
        }
    }

}
