import java.util.Scanner;
/**
 * La clase principal que incluye el método main e 
 * inicia el proyecto
 * 
 */
public class AppSaludo
{
   
    /**
     * Punto de entrada a la aplicación
     */
    
    public static void main(String[] args)
    {
		Scanner teclado = new Scanner(System.in);
        GeneradorSaludos generador = new GeneradorSaludos();
		generador.emitirSaludo();
		System.out.println("Pulse <INTRO> para continuar .....");
		teclado.nextLine();
        generador.emitirSaludoConGui();
    }

   
}
