
/**
 *  class Linea  
 * 
 * @author  
 * @version  
 */
public class Linea
{
     
    private Punto punto1;
    private Punto punto2;
    
    /**
     * Constructor de la clase Linea
     */
    public Linea()
    {
        this.punto1 = new Punto(0,0);
        this.punto2 = new Punto(0,0);
    }

    /**
     * Constructor de la clase Linea
     */
    public Linea(Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    
    /**
     *  
     */
    public Punto getPunto1()
    {
        return this.punto1;
    }
    
    /**
     *  
     */
    public Punto getPunto2()
    {
        return this.punto2;
    }
    
    /**
     *  
     */
    public void setPunto1(Punto punto1)
    {
        this.punto1 = punto1;
    }
    
    /**
     *  
     */
    public void setPunto2(Punto punto2)
    {
        this.punto2 = punto2;
    }

    /**
     *  
     */
    public void printLinea()
    {
        System.out.printf("Punto1:\n%sPunto2:\n%s", this.punto1.toString(), this.punto2.toString());
    }

    
    /**
     *  
     */
    public void moverDerecha(int distancia)
    {
         this.punto1.desplazar(distancia, 0);
         this.punto2.desplazar(distancia, 0);
    }
    
    /**
     *  
     */
    public void moverIzquierda(int distancia)
    {
         this.punto1.desplazar(distancia * -1, 0);
         this.punto2.desplazar(distancia * -1, 0);
    }
    
    /**
     *  
     */
    public void moverArriba(int distancia)
    {
         this.punto1.desplazar(0, distancia);
         this.punto2.desplazar(0, distancia);
    }
    
    /**
     *  
     */
    public void moverAbajo(int distancia)
    {
         this.punto1.desplazar(0, -1 * distancia);
         this.punto2.desplazar(0, -1 * distancia);
    }
    
    /**
     *  
     */
    public void demo()
    {
        Punto punto1 = new Punto(5,7);
        Punto punto2 = new Punto(5,10);
        
        
    }

}
