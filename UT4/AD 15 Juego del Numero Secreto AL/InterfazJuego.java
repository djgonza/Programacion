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
        teclado = new Scanner(System.in);
    }

    /**
     * 
     * Controla la lógica del juego, se le pregunta al usuario si desea jugar,
     * si es así se hace una presentación del juego y se prepara éste para empezar
     * a jugar. Se le solicitan diferentes números al usuario
     * hasta que lo adivina o se le agotan los 
     * intentos, es decir, hasta que acaba el juego
     * Cuando el juego termina se da la posibilidad de jugar de nuevo.
     * Así hasta que el usuario dice que no quiere continuar
     *     
     */
    public void jugar()
    {
        borrarPantalla();
        System.out.println("¿Deseas jugar? (s/n)");
        while(seguirJugando() == 's') {
            teclado.nextLine(); // ignorar salto
            juego.resetJuego();
            presentacionJuego();

            while(!juego.haTerminado()){

                System.out.println("Ingrese un numero:");
                juego.realizarJugada(leerNumero());
                System.out.println(juego.getResultado());

            }
            System.out.println("¿Deseas seguir jugando? (s/n)");
        }

        System.out.println("Hasta otra!");

    }

    /**
     * Solicitar al usuario un nº
     * @return el número tecleado
     */
    private int leerNumero()
    {
        return teclado.nextInt();
    }

    /**
     * Mensaje de bienvenida al juego
     */
    private void presentacionJuego()
    {
        borrarPantalla();
        System.out.println("*************************************************************");
        System.out.println("     Para jugar piensa un nº entre 1 y 100   ");
        System.out.println("     Has de adivinar un nº secreto en  " +  juego.getMaximoIntentos() + 
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
        return teclado.next().charAt(0);

    }
}
