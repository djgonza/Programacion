import java.util.Arrays;

/**
 * 
 */
public class Ejercicio01
{

    /**
     *  Asumiendo que array2d es un array cuadrado (mismas
     *  filas que columnas) el método reemplaza  cada valor de la diagonal
     *  principal por la suma de los valores que están por  debajo de él
     *  en la misma columna
     *  (ver resultados)
     *   
     */
    public void reemplazarDiagonalPorSuma(int[][] array2d)
    {
        for(int i = 0; i < array2d.length - 1; i++){
            array2d[i][i] = 0;
            for(int j = i + 1; j < array2d.length; j++){
                array2d[i][i] += array2d[j][i];
            }
        }
        
    }

    /**
     *  Muestra   cadena de n en n caracteres en cada línea
     *  Asumimos que la longitud de la cadena es multiplo de 4
     *  
     *  No se puede utilizar charAt()
     */
    public void escribirCaracteres(String cadena, int n)
    {
       int cont = 0;
       while(cont < cadena.length()){
           System.out.println(cadena.substring(cont, cont+n));
           cont += n;
       }
    }

    /**
     *   
     *
     */
    public static void main(String[] args)
    {
        Ejercicio01 ej01 = new Ejercicio01();

        int[][] array2d1 = new int[][]{   {-1,  2,   10,   10, -2},
                {-14, -5,  -26,  -7,  13},
                {17,  8,   19,  10,  10},
                {10, 11,   10,  13,  19},
                {-1 , 5,   -2 , 10, -3} };

        /* ------------------------- */
        System.out.println("Antes de  reemplazarDiagonalPorSuma()");
        for (int[] fila: array2d1)
        {   
            for (int valor: fila)
            {
                System.out.print(String.format("%4d", valor));
            } 
            System.out.println();
        } 

        ej01.reemplazarDiagonalPorSuma(array2d1);
        System.out.println("Resultado reemplazarDiagonalPorSuma()");
        for (int[] fila: array2d1)
        {   
            for (int valor: fila)
            {
                System.out.print(String.format("%4d", valor));
            } 
            System.out.println();
        } 

        /* ------------------------- */
        String cadena = "prueba-de--String ";
        int n = 6;
        System.out.println("\n\nEscribiendo \"" + cadena + "\" de " + n + 
                    " en " + n);
        ej01.escribirCaracteres(cadena, n); 
        n = 3;
         System.out.println("Escribiendo \"" + cadena + "\" de " + n + 
                    " en " + n);
        ej01.escribirCaracteres(cadena, n); 

    }
}