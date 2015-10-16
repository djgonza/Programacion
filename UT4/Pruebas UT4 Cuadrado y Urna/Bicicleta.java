
/**
 * Modela a una bicicleta
 */
public class Bicicleta
{
    private Rueda delantera;
    private Rueda trasera;

    /**
     *  el constructor crea las ruedas con una presión inicial de 0.0 
     */
    public Bicicleta()
    {
        this.delantera = new Rueda(0);
        this.trasera = new Rueda(0);
    }

    /**
     *   verifica cada una de las ruedas de la bici.
     *   Si están desinfladas las infla quedando las ruedas con una presión de 1.5.
     */
    public void verificar( )
    {
        if (this.delantera.estaDesinflada())
        {
            this.delantera.inflar();
            this.delantera.inflar();
            this.delantera.inflar();
        }
        
        if (this.trasera.estaDesinflada())
        {
            this.trasera.inflar();
            this.trasera.inflar();
            this.trasera.inflar();
        }
        
    }
}
