
/**
 *  class DemoUrna  
 * 
 * @author  
 * @version  
 */
public class DemoUrna
{
     
    private int x;

    /**
     * Constructor de la clase DemoUrna
     */
    public DemoUrna()
    {
     
    }

    /**
     *  Probar el primer constructor de Urna y mostrar la urna
     */
    public void demo1()
    {
        Urna urna = new Urna();
        System.out.println(urna.toString());
    }
    
    
    /**
     *  Probar el primer constructor de Urna y mostrar la urna
     */
    public void demo2()
    {
        Urna urna = new Urna(2);
        System.out.println(urna.toString());
    }
    
    /**
     *  Probar el primer constructor de Urna y mostrar la urna
     */
    public void demo3()
    {
        Bola bola1 = new Bola(2);
        Bola bola2 = new Bola(1);
        
        Urna urna = new Urna(bola1, bola2);
        System.out.println(urna.toString());
    }
}
