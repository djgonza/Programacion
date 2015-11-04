
import java.util.Scanner;
import java.util.Random;
/**
 * 
 * 
 * @author  
 * @version  
 */
public class AppExponencial
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        int base = 0;
        int exponente = 0;
        Random aleatorio = new Random();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame base para el primer número exponencial: ");
        base = teclado.nextInt();
        System.out.println("Dame exponente para el primer número exponencial: ");
        exponente = teclado.nextInt();
        Exponencial expo1 = new Exponencial(base, exponente);

        System.out.println("Dame base para el segundo número exponencial: ");
        base = teclado.nextInt();
        System.out.println("Dame exponente para el segundo número exponencial: ");
        exponente = teclado.nextInt();
        Exponencial expo2 = new Exponencial(base, exponente);

        System.out.println("Pulse intro para mostrar resultados");
        teclado.nextLine();
        System.out.print('\u000C');

        
        Exponencial producto = expo1.multiplicar(expo2);
        Exponencial cociente = expo1.dividir(expo2);
        Exponencial elevar = expo1.elevar(aleatorio.nextInt(7)+2);
        
        
        String mostrar = String.format("Exponencial 1\n%s\nExponencial 2\n%s\nProducto\n%s\nCociente\n%s\nPotencia\n%s",
                      expo1.toString(),
                      expo2.toString(),
                      producto.toString(),
                      cociente.toString(),
                      elevar.toString());
        
         System.out.print(mostrar);             

    }
}
