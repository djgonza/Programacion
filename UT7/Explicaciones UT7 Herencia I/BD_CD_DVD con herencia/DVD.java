/**
 * La clase Video representa a un objeto Video. Se puede almacenar
 *  y recuperar la informaci�n sobre un v�deo.
 */
public class DVD extends Articulo 
{
    private String director;

    /**
     * Constructor de objetos de la clase Video
     */
    public DVD(String elTitulo, String elDirector, int duracion)
    {
        super(elTitulo, duracion);
        director = elDirector;
    }

    /**
     * Devolver el director del v�deo
     */
    public String getDirector()
    {
        return director;
    }
    
   
}
