/**
 * Ejemplo que muestra que se pueden generar varios tipos de excepciones en
 * un mismo método
 * Posibles excepciones no verificadas que se pueden generar
 * ArrayIndexOutOfBoundsException, NumberFormatException, ArithmeticException.
 * Aunque son no verificadas las vamos a tratar capturándolas
 */
public class Division
{
    public static void main(String[] args)
    {

         
            System.out.println("Antes de dividir ");
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(i / j); 
            System.out.println("Después de dividir ");
        
    }
}

