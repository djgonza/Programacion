
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
    public FicheroMusica(String titulo, int tama�o, int duracion )
    {
        super(titulo, tama�o);
        this.duracion = duracion;

    }

    /**
     *  devuelve la duraci�n en segundos  
     */
    public int getDuracion()
    {

        return duracion;
    }

    /**
     * Muestra los datos del fichero de m�sica
     * La duraci�n se muestra en formato  XX:XX  (minutos, segundos)
     */
    public void display()
    {

    }
}
