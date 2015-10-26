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

    }
    
    /**
     *  
     */
    public void realizarReintegro()
    {

    }
    
    /**
     *  
     */
    public void consultarSaldo()
    {

    }
    
    /**
     *  
     */
    public void imprimirDatosCuenta()
    {

    }
    
    /**
     *  
     */
    public void borrarPantalla()
    {
        System.out.print("\u000c");
    }

}
