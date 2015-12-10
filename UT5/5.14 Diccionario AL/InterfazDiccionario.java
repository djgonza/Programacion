
/**
 * clase InterfazDiccionario 
 *  
 */
import java.util.Scanner;
public class InterfazDiccionario
{
    private static final int AÑADIR = 1;
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
     * Incluye la lógica de la aplicación
     *  
     */
    public void iniciar()
    {
        borrarPantalla();
        int opcion = 0;
        
        do {
            opcion = menu();
            
            if(opcion == 1)
                añadirPalabra();
            if(opcion == 2)
                mostrarDiccionario();
            if(opcion == 3)
                traducirPalabra();
        } while (opcion !=4);
    }

    /**
     * Presenta el menú - pide una opción y la valida
     * 
     * @return  la opción seleccionada ya validada
     */
    private int menu()
    {
        System.out.println("********************************");
        System.out.println("Gestión de un diccionario\n");
        System.out.println("********************************");
        System.out.println("1. Añadir palabra");
        System.out.println("2. Mostrar diccionario");
        System.out.println("3. Traducir palabra");
        System.out.println("4. Salir");
        System.out.print("Teclea opción: ");
        int opcion = teclado.nextInt();
        // validar opción
        if(opcionValida (opcion))
            return opcion;
        else
            return 0;
    }

    /**
     *  Valida una opción recibida como parámetro
     *  Devuelve true si la opción es correcta, false en otro caso
     *   Sin if
     */
    private boolean opcionValida(int opcion)
    {
        return opcion >=1 && opcion <=4;
    }

    /**
     * Añade una nueva palabra al diccioanrio
     */
    private void añadirPalabra()
    {
        borrarPantalla();
        teclado.nextLine(); //limpiar el buffer

        System.out.println("Dame palabra en castellano");
        String castellano = teclado.nextLine();

        System.out.println("Dame palabra en inglés");
        String ingles = teclado.nextLine();

        diccionario.insertarPalabra(new Palabra(castellano, ingles));
        
        System.out.println("Palabra añadida");
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
        System.out.println("Dame posición de palabra");
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
