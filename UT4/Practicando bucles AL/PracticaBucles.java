import java.util.Random;
/**
 *   
 */
public class PracticaBucles
{
    private final char ASTERISCO = '*';
    private final char CRUZ = 'X';
    private final char ALMOHADILLA = '#';
    private final char GUION = '-';
    private Random aleatorio;

    /**
     * 
     */
    public PracticaBucles()
    {
        aleatorio = new Random();
    }

    /**
     *  Escribe los impares entre 1 y 100 (con un for)
     *  (con for) - escribe en cada línea 8 números
     * 
     */
    public void metodo01()
    {
        int j=0;
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                j++;
            }    
            if(j==8){
                System.out.println("-");
                j=0;
            }
        }

    }

    /**
     *  Escribe los 10 primeros múltiplos de n
     *  (con for) -  
     * 
     */
    public void metodo02(int n)
    {
        for(int i=1; i<=10; i++){
            System.out.println((n*i));
        }
    }

    /**
     *  Detecta si n es un nº primo
     *  Hazlo con un for. En cuanto detectes que el nº no es primo sal del bucle con un return
     *  El 1 no es un nº primo
     */
    public boolean esPrimo(int n)
    {
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    /**
     *  Calcula y devuelve el primo más cercano a n
     *  Si n = 12 el primo más cercano es 11
     *  S n = 15 el primo más cercano es 13
     *  Utiliza el método anterior para detectar si un nº es primo o no
     *  Con while
     */
    public int metodo03(int n)
    {
        while(n>0){
            if(esPrimo(n))
                return n;
            n--;
        }
        return 0;
    }

    /**
     * Escribe los n primeros números primos
     * Si n = 7 entonces  2   3   5   7   11   13   17
     * 
     *  Con while
     */
    public void metodo04(int n)
    { 
        int i = 0;
        while(i<=n){
            if(esPrimo(i))
                System.out.print(" "+i);
            i++;
        }
    }

    /**
     *  Genera aleatorios entre 0 y 50 y por cada aleatorio escribe tantas X
     *  como indique el nº .  El final del proceso termina con el 0
     *  
     *  Hay que hacer un bucle anidado (un while y dentro un for)
     * 
     *   Posible resultado
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXX
     *   
     */
    public void metodo05()
    {
        int numeroAl = aleatorio.nextInt(51);
        while(numeroAl!=0){

            for(int i=numeroAl; i>0; i--){
                System.out.print(CRUZ);
            }
            System.out.println();
            numeroAl = aleatorio.nextInt(51);

        }
    }

    /**
     *  Escribe los números entre ALTO y BAJO que
     *  son múltiplos de 4 pero no de 5 (con for)
     * 
     */
    public void metodo06()
    {
        final int ALTO = 40;
        final int BAJO = 2;

        for(int i=BAJO; i<=ALTO; i++){
            if(i%4==0&&i%5!=0)
                System.out.print(" "+i);
        }
    }

    /**
     *  Escribe la siguiente figura para 10 filas y 8 columnas (con for)
     * 
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########

     */
    public void metodo07()
    { 
        for(int fila=1; fila<=10; fila++)
        {
            for(int columna=1; columna<=8; columna++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Cuenta y devuelve las apariciones de cifra en numero
     * (con while)
     */
    public int metodo08(int numero, int cifra)
    { 

        return 0;
    }

    /**
     * Escribe la siguiente figura
     * (con for) - utiliza el método escribirGuiones()
     * usa las constantes adecuadas
     * 
     *    *
     *    -*
     *    --*
     *    ---*
     *    ----*
     *    -----*

     */
    public void metodo09(int filas)
    { 
        System.out.println(ASTERISCO);
        for(int i=1; i<filas; i++)
        {
            escribirGuiones(i);
            System.out.println(ASTERISCO);
        }
    }

    /**
     * escribe n guiones en la misma línea
     * (con for) - Usa la constante adecuada
     */
    public void escribirGuiones(int n)
    { 
        for(int i=1; i<=n; i++)
        {
            System.out.print(GUION);
        }
    }

    /**
     * Calcula y escribe las 10 primeras potencias de 2 (con for)
     * Utiliza Math.pow() - Con for
     * 
     * 2 elevado a 0 es 1
     * 2 elevado a 1 es 2
     * 2 elevado a 2 es 4
     * 2 elevado a 3 es 8
     * 2 elevado a 4 es 16
     * 2 elevado a 5 es 32
     * 2 elevado a 6 es 64
     * 2 elevado a 7 es 128
     * 2 elevado a 8 es 256
     * 2 elevado a 9 es 512
     * 2 elevado a 10 es 1024

     */
    public void metodo10()
    { 
        for(int i=0; i<=10; i++)
        {
            System.out.printf("2 elevado a %-2d es %-4d \n", i, (int)Math.pow(2,i));
        }
    }

    /**
     *  Escribe la siguiente figura donde inicio marca el primer valor
     *  en la primera fila del cuadrado y fin el primer valor en la última fila del cuadrado
     *  Con for
     *  
     *  El ejemplo es para la llamada  printCuadrado(3, 8);
     *  
     *   3   4   5   6   7   8   
     *   4   5   6   7   8   3   
     *   5   6   7   8   3   4   
     *   6   7   8   3   4   5   
     *   7   8   3   4   5   6   
     *   8   3   4   5   6   7   
     *  
     */
    public void metodo11(int inicio, int fin)
    {

        for(int i=inicio; i<=fin; i++){
            int j=i;
            for(int k=(fin-inicio); k>=0; k--){
                if(j>fin)
                    j=inicio;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }

    /**
     *  Genera aleatorios entre 0 y 100 
     *  Calcula y escribe la longitud de la secuencia más larga de números iguales seguidos
     *  El final del proceso termina con el 0
     *  
     *  Ej.  Para la secuencia  2  2  2  4  4  7  6  6  6  1  1  9  9  9  2  2  2  2  2  2  5  0 
     *  
     *  el valor a mostrar sería "La longitud de la secuencia más larga de números seguidos es 6 y
     *  corresponde al valor 2"
     *
    Otras posibles ejecuciones:

    10   10  20  27  
    La longitud secuencia más larga de números seguidos es 2 
    y  corresponde al valor 10

    41  7   7   13  20  20  19  28  
    30  4   2   11  1   15  13  3   
    17  30  19  30  29  8   17  29  
    18  2   27  2   19  18  26  20  
    15  12  14  28  12  29  1   1   
    2   2   22  17  5   22  19  10  
    4   15  4   22  26              
    La longitud secuencia más larga de números seguidos es 2 
    y  corresponde al valor 7

    12  5   26  15  30  21  16  9           
    La longitud secuencia más larga de números seguidos es 1 
    y  corresponde al valor 12

    13  24  11  18  11  25  22  29  
    16  2   8   28  16  25  28  24  
    7   7   7   7   5   11  2   12  
    24  15  14  24  6   22  1   24  
    29  27  25  14  
    La longitud secuencia más larga de números seguidos es 4 
    y  corresponde al valor 7

     *  Con bucles while
     */
    public void metodo12()
    {
        int numero = aleatorio.nextInt(3) + 1;
        int anterior = numero;
        int longitud = 0;
        int longMaxima = 1;
        int valorMaximo = numero;
        int i = 0;
        while(numero != 0){

            System.out.print (" "+numero);

            if(numero == anterior){
                longitud++;
            }else{
                if(longitud > longMaxima){
                    longMaxima = longitud;
                    valorMaximo = anterior;
                }
                anterior=numero;
                longitud=1;
            }

            numero = aleatorio.nextInt(3) + 1;
            //numero = aleatorio.nextInt(100);

            if(i%10==0){
                System.out.println();
            }
            if(i==30){
                numero = 0;
            }
            i++;
        }

        System.out.println();
        System.out.println("El numero "+valorMaximo+" se repite "+longMaxima+" veces.");
    }

    /**
     *  
     */
    public void metodo121()
    {
        int numero = aleatorio.nextInt(3) + 1;
        int anterior = 0;
        int longitud = 0;
        int valor = 0;
        int longMaxima = 1;
        int valorMaximo = numero;
        int i = 0;
        while(numero != 0){

            numero = aleatorio.nextInt(3) + 1;
            if(i%10==0){
                System.out.println();
            }
            if(i==30){
                numero = 0;
            }
            i++;
            System.out.print (" "+numero);

            while(numero == anterior){
                longitud++;
                numero = aleatorio.nextInt(100); 
            }
            if(longitud > longMaxima)
                longMaxima = longitud;
            valorMaximo = numero;
            longitud = 0;
            numero = aleatorio.nextInt(100);

        }

        System.out.println();
        System.out.println("El numero "+valorMaximo+" se repite "+longMaxima+" veces.");
    }

    /**
     *  Calcula y devuelve formateado a 2 decimales el valor de la serie
     *  para el valor de n proporcionado como parámetro (primero calcúlalo
     *  como double y luego lo devuelves con String.format()
     *  
     *  Hazlo con bucles for  
     *  
     *  1 / 1  + 1 / 2! + 1 / 3! + 1 / 4! + ..........  + 1 / n
     *
     *
     *  Para n = 3 se devuelve el valor 1.6667
     *  Para n = 5 se devuelve el valor 1.7167
     *  Para n = 6 se devuelve el valor 1.7181
     */
    public String metodo13(int n)
    {
        int i = 1;
        String devolver = String.format("Para n = %d se devuelve el valor ", n);
        double valor = 0; 
        while(i<=n){
            valor += (double) 1/i;
            i++;
        }
        devolver+=String.format(" %1.4f", valor);
        return devolver; 
    }

    /**
     *  Escribe los factores primos del nº n - Con while
     *  
     *  Si n = 9 entonces    3   3
     *  Si n = 18 entonces    2  3   3
     *  Si n =  24    entonces 2   2  2  3
     *
     */
    public void metodo14(int n)
    {
        String cadena = String.format("Si n = %d entonces", n);
        int divisor = 2;
        while(n>1){

            if(n%divisor!=0){
                divisor++;
            }

            cadena+=String.format(" %d ", divisor);
            n/=divisor;
        }
        System.out.println(cadena);
    }

    /**
     *  Escribe la siguiente figura
     *  
     *  00  
     *  10  11  
     *  20  21  22  
     *  30  31  32  33  
     *  40  41  42  43  44  
     *  50  51  52  53  54  55  
     *  60  61  62  63  64  65  66  
     *  70  71  72  73  74  75  76  77  
     *  80  81  82  83  84  85  86  87  88  
     *  90  91  92  93  94  95  96  97  98  99  
     *
     */
    public void metodo15()
    {

    }

    public static void main(String[] args)
    {
        PracticaBucles demo = new PracticaBucles();
        System.out.print('\u000C');
        demo.metodo01();
        demo.metodo02(5);
        System.out.print(demo.esPrimo(5)+" "+demo.esPrimo(6));
        System.out.print(demo.metodo03(12));
        demo.metodo04(7);
        demo.metodo05();
        demo.metodo06();
        demo.metodo07();
        demo.metodo09(6);
        demo.metodo10();
        demo.metodo11(3,8);
        demo.metodo12();
        System.out.println(demo.metodo13(3));
        System.out.println(demo.metodo13(5));
        System.out.println(demo.metodo13(6));
        demo.metodo14(9);
        demo.metodo14(18);
        demo.metodo14(24);
    }

}
