
/**
 * Representa a una urna que contiene dos bolas
 */
public class Urna
{
     private Bola bola1;
     private Bola bola2;

    /**
     * Constructor  
     */
    public Urna()
    {
        this.bola1 = new Bola();
        this.bola2 = new Bola();
    }
    
    /**
     * Constructor  
     */
    public Urna(int queColor)
    {
        this.bola1 = new Bola(queColor);
        this.bola2 = new Bola(queColor);
    }
    
    /**
     * Constructor  
     */
    public Urna(Bola bola1, Bola bola2)
    {
        this.bola1 = bola1;
        this.bola2 = bola2;
    }
    
    /**
     *  
     */
    public String toString()
    {
        return bola1.toString() + "\n" +
               bola2.toString();
    }


     
}
