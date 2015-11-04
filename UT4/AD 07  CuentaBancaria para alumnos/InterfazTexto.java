import java.util.Scanner;

/**
 *  class InterfazTexto  
 * 
 * @author  
 * @version  
 */
public class InterfazTexto
{
    private final int INGRESO = 1;
    private final int REINTEGRO = 2;
    private final int CONSULTA = 3;
    private final int IMPRIMIR = 4;
    private final int SALIR = 5;
    
    private Cuenta cuenta;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazTexto
     */
    public InterfazTexto()
    {
        this.teclado = new Scanner(System.in);
    }

    /**
     *  
     */
    public void iniciar(int cuenta, String nombre)
    {
         this.cuenta = new Cuenta(cuenta, nombre);
         int opcion = menu();
        while(opcion!= SALIR) {
            borrarPantalla();
            switch(opcion)
             {

                 case INGRESO: realizarIngreso();
                 break;
                 case REINTEGRO: realizarReintegro();
                 break;
                 case CONSULTA: consultarSaldo();
                 break;
                 case IMPRIMIR: imprimirDatosCuenta();
                 break;
             }
             
             opcion = menu();
        }
        
        System.out.println("Adios!!!!");
         
    }
 
    /**
     *  
     */
    public int menu()
    {
                 
         System.out.print("1.- Ingreso \n" +
                          "2.- Reintegro \n" +
                          "3.- Consulta \n" + 
                          "4.- Imprimir datos cuenta \n" +
                          "5.- Salir \n" +
                          "Elija opcion: ");
                          
         return teclado.nextInt();                 
    }
    
    /**
     *  
     */
    public void realizarIngreso()
    {
        System.out.print("Cantidad a ingresar en cuenta: ");
        this.cuenta.ingresar(teclado.nextDouble());
    }
    
    /**
     *  
     */
    public void realizarReintegro()
    {
        System.out.print("Cantidad a retirar de la cuenta: ");
        this.cuenta.reintegrar(teclado.nextDouble());
    }
    
    /**
     *  
     */
    public void consultarSaldo()
    {
        System.out.println("Saldo en la cuenta: " + this.cuenta.getSaldo());
    }
    
    /**
     *  
     */
    public void imprimirDatosCuenta()
    {
        System.out.println(this.cuenta.toString());
    }
    
    /**
     *  
     */
    public void borrarPantalla()
    {
        System.out.print("\u000c");
    }

}
