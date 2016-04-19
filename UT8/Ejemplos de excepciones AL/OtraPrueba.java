
/**
 *  Programa que muestra que no es necesario parar
 *  un programa siempre que se produca una excepción
 *  Leer una serie de nºs por teclado, tantos como el valor pasado
 *  como argumento del main
 *   
 *  Todas las excepciones van a ser no verificadas, las vamos a tratar capturándolas
 *  Capturaremos - errores en nº argumentos del main, conversión de formato del argumento del main,
 *  error de formato de cada nº leído (ignoraremos el nº y leeremos otro)
 */
import java.util.Scanner;

public   class OtraPrueba
{

    public static void main(String[] args)
    {

        try
        {
            int cantidad = Integer.parseInt(args[0]);
            Scanner teclado = new Scanner(System.in);
            int i = 1;
            while (i<= cantidad)
            {
                try{
                    System.out.println("Teclee número");
                    int n = Integer.parseInt(teclado.nextLine());
                    System.out.println("Leído en nº");
                    i++;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Error de conversión al leer número");
                }

            }
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error en nº de argumentos");
        }

        catch (NumberFormatException e)
        {
            System.out.println("Error de conversión");
        }

    }

}