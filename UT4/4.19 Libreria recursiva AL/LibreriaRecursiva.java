
/**
 * Clase de utilidades
 * Contienen métodos estáticos recursivos
 *  
 */
public class LibreriaRecursiva
{

    /**
     * Calcula y devuelve el factorial
     * de n
     */
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     * Calcula y devuelve el sumatorio
     * de n    (ej. si n = 7 entonces 7 + 6 + 5 + 4 + 3 + 2 + 1)
     */
    public static int sumatorio(int n)
    {
        if(n == 0){
            return 0;
        }
        return n + sumatorio(n - 1);
    }

    /**
     * Calcula y devuelve el mcd
     * de a y b utilizando el algoritmo
     * de Euclides. Si el resto de a entre b es 0 el mcd es b
     * sino el mcd se calcula con b como nuevo dividendo  y divisor el resto
     */
    public static int mcd(int a, int b)
    {

        if(a % b == 0)
            return b;
        return mcd(b, a%b);

    }

    /**
     * Calcula y devuelve la potencia
     * de base elevado a expon 
     */
    public static int potencia(int base, int expon)
    {
        if(expon == 0)
            return 1;
        return base * potencia (base, expon -1);

    }

    /**
     * Cuenta los dígitos de n
     */
    public static int contarDigitos(int n)
    {

        if(n / 10 == 0)
            return 1;
        return 1 + contarDigitos(n/10);

    }

    /**
     * Calcular la suma de los digitos de n
     */
    public static int sumarDigitos(int n)
    {

        if(n/10 == 0)
            return n;
        return n%10 + sumarDigitos(n/10);

    }

    /**
     *  Devuelve true si n contiene algún 7, false en otro caso
     *
     */
    public static boolean tiene7(int n)
    {
        if(n%10 == 7){
            return true;
        }else if(n == 0){
            return false;
        }else{
            return tiene7(n/10);
        }
    }

    /**
     *  1 + 1/2 + 1/3 + 1/4 + .....
     *  Calcula la serie anterior para los n primeros términos
     */
    public static double serie01(int n)
    {
        double m = n;
        if(m==1)
            return 1;
        return (1/m) + serie01(n-1);

    }

    /**
     *  3   6   12  15  18  21  24
     *  Escribe los n primeros multiplos de 3 de forma recursiva
     */
    public static void serieMultiplos3(int n)
    {

        if(n>0){
            serieMultiplos3(n-1);
            System.out.print(" " + (n*3));
        }

    }

    /**
     *  10  13  16  19
     *  Escribe la serie anterior para los n primeros términos
     */
    public static void serie02(int n)
    {

        if(n>0){
            serie02(n-1);
            System.out.print(" " + (7 + (n*3)));
        }

    }

    /**
     * Calcula y devuelve el n-simo término
     * de la serie de Fibonacci  0   1   1   2    3    5   8   13   21 .....
     */
    public static int fibonnaci(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fibonnaci(n-1) + fibonnaci(n-2);

    }

    /**
     * Cuenta los dígitos pares de n
     */
    public static int contarDigitosPares(int n)
    {

        if(n%2==0 && n/10 > 0)
            return 1 + contarDigitosPares (n / 10);
        else if(n%2!=0 && n/10 > 0)
            return contarDigitosPares (n / 10);
        else if(n%2!=0)
            return 0;
        else
            return 1;

    }

    /**
     * Cuenta las apariciones de d en el
     * número n
     */
    public static int contarApariciones(int n, int d)
    {
        if(n>0)
            if(n%10 == d)
                return 1 + contarApariciones(n/10, d);
            else
                return contarApariciones(n/10, d);
        return 0;

    }

    /**
     *  Multiplicar a * b mediante sumas
     *
     * 
     */
    public static int producto(int a, int b)
    {
        if(a==0)
            return 0;
        return b + producto(a - 1, b);

    }

    /**
     *  Sumar a + b
     *
     * 
     */
    public static int sumar(int a, int b)
    {
        if(a==0)
            return b;
        return 1 + sumar(a-1, b);

    }

    /**
     * 
     * Sumar un intervalo, por ejemplo, sumar(5, 9) es 5 + 6 + 7 + 8 + 9 = 35
     *  Asumimos desde <= hasta 
     */
    public static int sumarIntervalo(int desde, int hasta)
    {
        if(desde == hasta)
            return desde;
        return desde + sumarIntervalo(desde + 1, hasta);

    }

    /**
     *  calcula y devuelve el producto de los n primeros pares 
     *  (2 * 4 * 6 * 8 * ....)
     */
    public static long multiplicarPares(int n)
    {
        if (n==0)
            return 1;
        return 2 * n * multiplicarPares(n - 1);
    }

    /**
     *  muestra cada uno de los dígitos binarios de n 
     *  (Si n = 13 entonces 1101, si n = 9 entonces 101, ...)
     */
    public static void printEnBinario(int n)
    {
        if(n>0){
            printEnBinario(n/2);
            if(n%2!=0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }

    }

    /**
     *  muestra la secuencia 1,  2,    3,   4,   5
     */
    public static void secuencia01(int n)
    {
        if(n==1)
            System.out.print(n);
        if(n>1){
            secuencia01(n-1);
            System.out.print(", " + n);
        }
    }

    /**
     *  muestra la secuencia 5,  4,   3,   2,   1
     */
    public static void secuencia02(int n)
    {
        if(n==1)
            System.out.print(n);
        if(n>1){         
            System.out.print(n + ", ");
            secuencia02(n-1);
        }
    }

    /**
     *  genera un nº con tantas cifras como indique n, 
     *  su primera cifra será 1, la segunda 2, .... desde el 1. 
     *  Ej. si n = 5 entonces se genera 12345, si n = 8 el 12345678, ....
     */
    public static int generarNumero(int n)
    {
        if(n==1) 
            return n;
        return n + (10 * generarNumero(n-1));

    }

    /**
     *  calcula y devuelve un nº supuesto en base 10 a base 2 
     *  (Ej. 13 = 1101, 255 = 11111111, 17 = 10001)
     */
    public static int aBase2(int n)
    {
        if(n>0){
            if(n%2!=0){
                return 1 + (10 * aBase2(n/2)); 
            }else{
                return (10 * aBase2(n/2)); 
            }         
        }else{
            return 0;
        }

    }

    /**
     *  calcula y devuelve un nº supuesto en base 2 a base 10 
     */
    public static int aBase10(int n)
    {
        if(n==1)
            return 1;
        if(n%10==1)
            return 1 + 2 * aBase10(n/10);
        return 2 * aBase10(n/10);

    }

    /**
     *  escribe los  n primeros nºs  de forma que los impares se muestran antes 
     *  y en orden decreciente y los pares depués y en orden creciente. 
     *  Por ejemplo,  imparesPares(5)  daría como resultado  5  3  1  2  4  y 
     *  imparesPares(8)  daría  7  5  3  1  2  4  6  8
     */

    public static void imparesPares(int n){

        if(n<=0)
            System.out.print("");
        else{
            if(n%2!=0){
                System.out.print(" "+n);
                imparesPares(n-1);
            }
            if(n%2==0){
                imparesPares(n-1);
                System.out.print(" "+n);
            }
        }

    }

}

