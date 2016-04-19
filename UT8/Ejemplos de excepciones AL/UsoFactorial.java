
/**
 * Clase UsoEjemploExcepciones 
 * 
 * @author 
 * @version 
 */
public class UsoFactorial
{

    private MasEjemplosFactorial ej;

    /**
     * Constructor de la clase UsoEjemploExcepciones
     */
    public UsoFactorial()
    {
        ej = new MasEjemplosFactorial(-6, 9, null);
    }

    /**
     * Qué estamos haciendo aquí?
     * Tipo de excepción: 
     */
    public void demoFactorial()
    {
        try
        {
            ej.factorial1();
        }
        catch (FactorialNegativoExcepcion e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}