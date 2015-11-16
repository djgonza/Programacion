import java.util.Scanner;
/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{

    private static Scanner teclado = new Scanner(System.in);


    private static int validarNumero (int numero, int grosor, String mensaje) {

        //validamos el numero
        while(numero < grosor){
            System.out.println(mensaje);
            numero = teclado.nextInt(); 
        }

        

        return numero;
    } 

    /**
     *  Punto de entrada a la aplicación
     *  define y crea el teclado, 
     *  crea un objeto DemoBucles y:
     *  - ejecuta el método numerosComoSumaPotenciasDe2()
     *  - haz una pausa y borra la pantalla
     *  - pide al usuario un valor para el grosor de la H - Valida con un bucle while  que este
     *      valor es positivo
     *  - pide al usuario un valor para la anchura de la H. Valida con un bucle while 
     *      que este valor es positivo y superior al grosor
     *   - pide al usuario un valor para la altura de la H. Valida con un bucle while 
     *      que este valor es positivo y superior al grosor
     *   - muestra la letra H
     *  
     */
    public static void main(String[] args)
    {
        
        Utilidades.borrarPantalla();

        //creamos el objeto
        DemoBucles demo = new DemoBucles();

        //llamaos al primer metodo
        demo.numerosComoSumaPotenciasDe2();
        
        //limpiamos pantalla
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();

        //pedimos los numeros
        System.out.println("Dame un nº positivo para el grosor");
        int grosor = validarNumero (teclado.nextInt(), 0, "Grosor Incorrecto!!");

        System.out.println("Dame un nº positivo y mayor que el grosor para la anchura");
        int anchura = validarNumero (teclado.nextInt(), grosor, "Anchura Incorrecta!!");

        System.out.println("Dame un nº positivo y mayor que el grosor para la altura");
        int altura = validarNumero (teclado.nextInt(), grosor, "Altura Incorrecta");

        //mostramos la L
        demo.escribirLetraL(altura, anchura, grosor);
        
    }
}

