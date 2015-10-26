
/**
 * 
 * 
 * @author  
 * @version  
 */

import java.util.Scanner;

public class App
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {

        RelojAlarma reloj = new RelojAlarma(7,15);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame Hora: ");
        int hora = teclado.nextInt();
        System.out.print("Dame Minutos: ");
        int minutos = teclado.nextInt();
        
        reloj.ponerEnHora(hora, minutos);

        
        
        
        System.out.print("Hora reloj:\n "+ reloj.getHora());
        reloj.setAlarma(7, 18);
        reloj.emitirTic();
        reloj.emitirTic();
        reloj.emitirTic();
    }
}
