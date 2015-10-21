
/**
 *  class TestPunto  
 * 
 * @author  
 * @version  
 */
public class TestPunto
{

    /**
     * Constructor de la clase TestPunto
     */
    public TestPunto()
    {
     
    }

    /**
     *  
     */
    public void test()
    {
        Punto punto1 = new Punto(3,8); 
        Punto punto2 = new Punto(12,9);
        
        System.out.printf("Coordenadas de el punto 1:\n%10s", punto1.toString());
        System.out.printf("Coordenadas de el punto 2:\n%10s", punto2.toString());
        
        System.out.printf("Distancia desde el origen al punto 1: %8.5f\n", punto1.getDistanciaDesdeOrigen());
        
        System.out.printf("Distancia entre los dos puntos: %6.2f", punto1.getDistanciaDesde(punto2));
    }
}
