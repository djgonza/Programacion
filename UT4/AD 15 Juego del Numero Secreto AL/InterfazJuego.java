import java.util.Scanner;
/**
 * Modela la interfaz con el usuario
 *
 */
 
public class InterfazJuego
{
    private Scanner teclado;
    private JuegoNumeroSecreto juego;

    /**
     * Constructor de la clase InterfazJuego
     */
    public InterfazJuego()
    {
        juego = new JuegoNumeroSecreto();
        teclado = new Scanner(System.In);
    }

    
    /**
     * 
     * Controla la l�gica del juego, se le pregunta al usuario si desea jugar,
     * si es as� se hace una presentaci�n del juego y se prepara �ste para empezar
     * a jugar. Se le solicitan diferentes n�meros al usuario
     * hasta que lo adivina o se le agotan los 
     * intentos, es decir, hasta que acaba el juego
     * Cuando el juego termina se da la posibilidad de jugar de nuevo.
     * As� hasta que el usuario dice que no quiere continuar
     *     
     */
    public void jugar()
    {
        String cadena = String.format("%20%-5s%-5s%20",
                                      ,"\nPara jugar piensa un n� entre 1 y 100"
                                      ,"\nHas de adivinar un n� secreto en 5 intentos");
        System.out.print(cadena);
        
        

    }

    /**
     * Solicitar al usuario un n�
     * @return el n�mero tecleado
     */
    private int leerNumero()
    {
        
        
        
    }

    /**
     * Mensaje de bienvenida al juego
     */
    private void presentacionJuego()
    {
        borrarPantalla();
        System.out.println("*************************************************************");
        System.out.println("     Para jugar piensa un n� entre 1 y 100   ");
        System.out.println("     Has de adivinar un n� secreto en  " +  juego.getMaximoIntentos() + 
            " intentos          ");
        System.out.println("*************************************************************");
    }

    /**
     * Borrar la pantalla  
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }

    /**
     * Indicar al usuario si desea jugar otra vez
     * Devuelve la respuesta del usuario
     * @return un caracter solicitado al usuario
     */
    private char seguirJugando()
    {
       
        
        
    }
}
