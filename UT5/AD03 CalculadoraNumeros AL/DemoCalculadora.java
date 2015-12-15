import java.util.Arrays;

/**
 * clase DemoCalculadora aquí.
 * 
 * @author 
 * @version 
 */
public class DemoCalculadora
{
    private Calculadora miCalculadora;
    private Calculadora tuCalculadora;

    /**
     * Constructor de la clase DemoCalculadora
     */
    public DemoCalculadora()
    {
        miCalculadora = new Calculadora();
        tuCalculadora = new Calculadora();
    }

    public void testUno()
    {
        int[] array_uno = {215,226,336,2248,1245,6543,87456,987};
        for(int i=0; i<array_uno.length; i++){
            miCalculadora.introducirNumero(array_uno[i]);
        }
        miCalculadora.escribirNumeros();
        System.out.println("Numeros Decrecientes:");
        System.out.println(Arrays.toString(miCalculadora.todoDigitosDecreciente()));
        System.out.println("Borrar ultimo");
        miCalculadora.borrarUltimoElemento();
        miCalculadora.escribirNumeros();
        System.out.println("Borrar los pares");
        miCalculadora.borrarPares();
        miCalculadora.escribirNumeros();
    }

    public void testDos()
    {
        for(int i=0; i<=8; i++){
            tuCalculadora.insertarEnPosicion(i*2, i);
        }
        tuCalculadora.escribirNumeros();
        System.out.println(tuCalculadora.getTotal());
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.escribirNumeros();
        tuCalculadora.vaciar();
        System.out.println(tuCalculadora.getTotal());
        tuCalculadora.escribirNumeros();
        
        tuCalculadora[i];
    }

    public void testTres()
    {
        miCalculadora.insertarEnPosicion(0, 0);
        miCalculadora.insertarEnPosicion(1, 1);
        miCalculadora.insertarEnPosicion(2, 2);
        miCalculadora.insertarEnPosicion(33, 33);
        miCalculadora.escribirNumeros();
        
    }
}





