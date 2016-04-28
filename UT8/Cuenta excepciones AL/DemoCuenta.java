
/**
 *  La clase acepta a través de argumentos del main
 *  el importe de la cuenta. Si el valor del importe es correcto se crea 
 *  la cuenta
 *  A continuación de pide (con Scanner) al usuario la cantidad a ingresar
 *  y se añade y después la cantidad a sacar y se reintegra.
 *  
 *  Hay que capturar todas las posibles excepciones que se puedan dar
 *  Se indicarán mensajes de error adecuados en cada caso
 *  Incluye un bloque finally en el que se muestre el estado de la cuenta (toString() de Cuenta)
 *  Puede que tengas que tratar otra excepción dentro de finally
 */
import java.util.Scanner;
public class DemoCuenta
{

    /**
     *  
     * 
     */
    public static void main(String[] args)
    {
        if(args.length <= 0){
            System.out.println("Argumentos no validos");
        }else{
            Scanner sc = new Scanner(System.in);
            Cuenta demo = null;
            try {
                double importe = Double.parseDouble(args[0]);
                demo = new Cuenta(importe);

                try{    
                    System.out.println("Cantidad a ingresar:");
                    demo.ingresar(Double.parseDouble(sc.nextLine()));
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());

                }

                try {
                    System.out.println("Cantidad a retirar:");
                    demo.sacar(Double.parseDouble(sc.nextLine()));
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }catch (SaldoInsuficienteException e) {
                    System.out.println(e.toString());
                }

            }catch (NumberFormatException e) {
                System.out.println("Error en el parametro");
            }finally {
                if(demo != null)
                    System.out.println(demo);
            }

        }

    }
}
