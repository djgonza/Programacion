
/**
 * clase InterfazDiccionario 
 *  
 */
import java.util.Scanner;
public class InterfazDiccionario
{
    private static final int A�ADIR = 1;
    private static final int MOSTRAR = 2;
    private static final int TRADUCIR = 3;
    private static final int SALIR = 4;

    private Scanner teclado;
    private Diccionario diccionario;

    /**
     * Constructor de objetos de la clase InterfazDiccionario
     * Crea e inicializa adecuadamente los atributos
     */
    public InterfazDiccionario(Diccionario diccionario)
    {
        this.diccionario = diccionario;
        teclado = new Scanner(System.in);

    }

    /**
     * Incluye la l�gica de la aplicaci�n
     *  
     */
    public void iniciar()
    {
        borrarPantalla();
        int opcion = 0;
        
        do {
            opcion = menu();
            
            if(opcion == 1)
                a�adirPalabra();
            if(opcion == 2)
                mostrarDiccionario();
            if(opcion == 3)
                traducirPalabra();
        } while (opcion !=4);
    }

    /**
     * Presenta el men� - pide una opci�n y la valida
     * 
     * @return  la opci�n seleccionada ya validada
     */
    private int menu()
    {
        System.out.println("********************************");
        System.out.println("Gesti�n de un diccionario\n");
        System.out.println("********************************");
        System.out.println("1. A�adir palabra");
        System.out.println("2. Mostrar diccionario");
        System.out.println("3. Traducir palabra");
        System.out.println("4. Salir");
        System.out.print("Teclea opci�n: ");
        int opcion = teclado.nextInt();
        // validar opci�n
        if(opcionValida (opcion))
            return opcion;
        else
            return 0;
    }

    /**
     *  Valida una opci�n recibida como par�metro
     *  Devuelve true si la opci�n es correcta, false en otro caso
     *   Sin if
     */
    private boolean opcionValida(int opcion)
    {
        return opcion >=1 && opcion <=4;
    }

    /**
     * A�ade una nueva palabra al diccioanrio
     */
    private void a�adirPalabra()
    {
        borrarPantalla();
        teclado.nextLine(); //limpiar el buffer

        System.out.println("Dame palabra en castellano");
        String castellano = teclado.nextLine();

        System.out.println("Dame palabra en ingl�s");
        String ingles = teclado.nextLine();

        diccionario.insertarPalabra(new Palabra(castellano, ingles));
        
        System.out.println("Palabra a�adida");
    }

    /**
     * Mostrar el diccioanrio
     */
    private void mostrarDiccionario()
    {
        borrarPantalla();
        System.out.println(diccionario.toString());
    }

    /**
     * Traducir una  palabra al diccionario
     */
    private void traducirPalabra()
    {
        borrarPantalla();
        teclado.nextLine(); //limpiar el buffer
        System.out.println("Dame posici�n de palabra");
        System.out.println(diccionario.traducirPalabra(teclado.nextInt()));
    }

    /**
     * Borrar la pantalla
     */
    private void borrarPantalla()
    {
        System.out.println("\u000C");
    }

        
    
}
