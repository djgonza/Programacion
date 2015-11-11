
/**
 *  clase DemoFibonacci 
 * 
 */
public class DemoFibonacci
{
    private CalculadoraFibonacci calculadora;
    
    /**
     * Constructor de la clase DemoFibonacci
     * Crea la calculadora 
     */
    public DemoFibonacci()
    {
         calculadora = new CalculadoraFibonacci();
    }

    /**
     *    
     */
    public void escribirSerieFibonacci(int terminos)
    {
        
        System.out.print('\u000C');
        System.out.print(calculadora.generarFibonacci(terminos));
        
    }
}
