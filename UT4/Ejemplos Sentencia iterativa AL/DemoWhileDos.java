import java.text.DecimalFormat;

/**
 * 
 */
public class DemoWhileDos
{

    /**
     * Constructor  
     */
    public DemoWhileDos()
    {

    }

    /**
     * Ejer 4.14 a)
     *  escribe los números que están comprendidos 
     *  entre el parámetro desde y el parámetro hasta. Si desde = 10 y hasta =30, escribe 10, 11, 12, 
     *  ….. ,30  
     *  Se escriben 5 números en cada línea
     */
    public void escribirNumeros(int desde, int hasta)
    {

    }
    /**
     * Ejer 4.14 b)
     * 
     * Mostrar números pares entre 2 y 50  
     */
    public void mostrarPares()
    { 
    	int i = 2;
    	System.out.print(i);
    	i+=2;
    	while (i <= 50){
    		System.out.print(","+i);
    		i += 2;
    	}
    }

    /**
     * Ejer 4.14 c)
     *  genera y escribe  os   aleatorios entre 1 y 100 parando  el 
     *  proceso cuando se generan 30 o bien cuando salga un 99. El método cuenta también las 
     *  veces que sale el 12 y devuelve este valor.
     *  En cada línea se escriben 8 números
     */
    //     public int generarAleatorios()
    //     {
    //        
    // 
    //     }


    /**
     * Ejer 4.14 d)
     *
     *  Calcula   y   devuelve   la   suma   de   la   serie 1/1 + 1/2 + 1/3 + 1/4 + ... 1/n
     */
    public double sumarSerie(int n)
    {
        double numerador = 1;
        int contador = 1;
        double resultado = 0;
        while (contador <= n){

            resultado += numerador / contador;
            contador++;
        }

        return resultado;
    }

    /**
     * Ejer 4.14 d) Idem pero formateado como String a 2 decimales
     */
//     public String sumarSerieV2(int n)
//     {
//         
//     }


    /**
     * Ejer 4.14 e)
     *    Calcula   y   devuelve   la   suma   de   la   serie 1/1 - 1/2 + 1/3 - 1/4 + 1/5 - .....
     *     
     */
    public double sumarSerieConSigno(int n)
    {
        int signo = 1;
        int contador = 1;
        double resultado = 0;
        while (contador <= n){

            resultado += (1.0 / contador) * signo;
            signo = -signo;
            contador++;
        }

        return resultado;
    }

    /**
     * Ejer 4.14 f)
     *  Calcula y devuelve la suma de los divisores de 
     *  numero
     */
    public int sumarDivisores(int numero)
    {
        int contador = 2;
        int suma = 1;
        while (contador <= numero / 2) {
            
            if(numero % contador == 0)
                suma += contador;
            contador++;
            
        }
        
        suma += numero;
        if(numero == 1)
            return 1;
        return suma;
        
    }

    /**
     * Ejer 4.14 g)
     *  Calcula y devuelve la suma de los dígitos de numero
     */
    public int sumarDigitos(int numero)
    {
         int suma = 0;
         while(numero != 0)
         {
             suma += (numero % 10);
             numero = (numero / 10);
         }
         
         return suma;

    }


    /**
     * Ejer 4.14 h)
     *  devuelve true si numero es primo, false en otro caso, Un 
     *  nº es primo si únicamente tiene como divisores él mismo y la unidad
     *  El 1 no se considera primo
     *  
     * Contamos los divisores de numero con el método 
     * contarDividores() que dado un nº devuelve el total de divisores que tiene
     */
//     public  boolean esPrimoV1(int numero)
//     {
//         if(this.contarDivisores(numero) == 2)
//             return true;
//     }

    /**
     * Cuenta la cantidad de divisores del parámetro recibido
     */
//     public int contarDivisores(int numero)
//     {
//          
// 
//     }

    /**
     * Ejer 4.14 h)
     * Sin método adicional de ayuda
     * Buscamos divisores desde el 2 hasta la mitad del número
     * Si se encuentra alguno sabremos que no es primo, en caso contrario lo será
     * 
     */
    public  boolean esPrimoV2(int numero)
    {
         int i = 2;
         while (i <= numero / 2){
             if (numero % i == 0)
                return false;
             i++;
         }
         return true;
         
    }
    
    /**
     *  Dado un numero, devolver el inverso
     */

    public int inverso(int numero)
    {
         int resto = 0;
         int inverso = 0;
         while(numero != 0)
         {
            int cifra = numero % 10;
            inverso *= 10;
            inverso += cifra;
            numero /= 10;
         }
         
         return inverso;
    }


    /**
     * Devuelve la tabla de multiplicar del parámetro (hasta el 10)
     */
    //     public String tablaMultiplicarV2(int numero)
    //     {
    //           
    //     }

    /**
     * Borrar la pantalla  
     */
    //     public void borrarPantalla()
    //     {
    //         System.out.print('\u000C');
    //     }

    /**
     * Generar aletorios entre 0 y 100 incluidos. Parar el proceso cuando salga el 0
     * Hay que calcular y mostrar en pantalla la suma de los impares, el producto de los pares, 
     * cuántos son múltiplos de 6 y múltiplos de 3 y cuántos acaban en 7
     */
    public  void ejemplo01()
    {

    }

    /**
     * pausa 
     */
    public void esperar(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)
        {
            // ignorar la excepción
        }
    }

    public static void main(String[] args) {
    	DemoWhileDos demo = new DemoWhileDos();	
    	demo.mostrarPares();
    }

}
