
/**
 * Representa a un cuadrado con un centro y un lado
 */
public class Cuadrado
{
     private Punto centro;
     private double lado;

    /**
     * Constructor  
     */
    public Cuadrado()
    {
         this.centro = new Punto();
         this.lado = 0;
    }
    
    /**
     * Constructor  
     */
    public Cuadrado(int x, int y, double lado)
    {
        this.centro = new Punto(x, y);
        this.lado = lado;     
    }
    
    /**
     * Constructor  
     */
    public Cuadrado(Punto punto, double lado)
    {
        this.centro = punto;
        this.lado = lado;
    }

    
}
