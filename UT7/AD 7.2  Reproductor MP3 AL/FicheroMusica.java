
/**
 *   clase FicheroMusica  
 *  
 */
public class FicheroMusica  extends Fichero
{

    private int duracion;
    /**
     * Constructor de la clase FicheroMusica
     */
    public FicheroMusica(String titulo, int tamaño, int duracion )
    {
        super(titulo, tamaño);
        this.duracion = duracion;

    }

    /**
     *  devuelve la duración en segundos  
     */
    public int getDuracion()
    {

        return duracion;
    }

    /**
     * Muestra los datos del fichero de música
     * La duración se muestra en formato  XX:XX  (minutos, segundos)
     */
    public void display()
    {

    }
}
