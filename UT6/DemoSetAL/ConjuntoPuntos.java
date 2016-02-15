import java.util.HashSet;

/**
 * Representa un conjunto de puntos
 */
public class ConjuntoPuntos
{
    private HashSet<Punto> puntos;

    /**
     * Constructor  
     */
    public ConjuntoPuntos()
    {
         puntos = new HashSet<Punto>();
    }

    /**
     *  Añade un punto al conjunto
     */
    public boolean add(Punto p)
    {
         return puntos.add(p);
    }
    
  
}
