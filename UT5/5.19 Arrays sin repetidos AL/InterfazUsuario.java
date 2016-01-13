
/**
 * Interfaz texto para interactuar con el usuario.
 * 
 * Un objeto de esta clase nos permitirá leer
 * valores para guardarlos en la clase
 * ArraySinRepetidos
 * 
 * @author  
 * @version  UT5 Ej.5.19
 */
import java.util.Scanner;
public class InterfazUsuario
{
    private ArraySinRepetidos unArray;
    private Scanner teclado;

    /**
     * Constructor  - crea e inicializa los atributos
     */
    public InterfazUsuario()
    {
        unArray = new ArraySinRepetidos();
        teclado = new Scanner(System.in);
    }

    /**
     * Permite pedir datos al usuario hasta introducir un 0
     * o hasta que el objeto unArray esté completo
     * Al final muestra el valor del array llamando al método printArray()
     */
    public void ejecutar()
    {
        unArray.clear();
        System.out.println("Introduce un numero (0 para salir!!)");
        int numeroTeclado = teclado.nextInt();
        while(!unArray.estaCompleto() && numeroTeclado != 0){
            unArray.insertarEnOrden(numeroTeclado);
            numeroTeclado = teclado.nextInt();
        } 
        printArray();
    }
    
    /**
     * Muestra el array
     *  
     */
    private void printArray()
    {
        System.out.println(unArray.toString());
    }
    
    
}
