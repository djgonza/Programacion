import java.util.Scanner;
import pkgotroconversor.romanos.ConversorRomanos;
/**
 * 
 * 
 * @author  
 * @version  
 */
public class AppOtroConversor
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ConversorRomanos cr = new ConversorRomanos();
        System.out.println("Dame un numero arábigo, cero para parar ");
        int entero = sc.nextInt();
        while(entero != 0)
        {

            
            System.out.println(cr.aRomano(entero));
            sc.nextLine();
            System.out.println("Dame un numero arábigo, cero para parar ");
            entero = sc.nextInt();

            
        }

    }
}
