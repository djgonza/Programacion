/**
 * La clase Video representa a un objeto Video. Se puede almacenar
 *  y recuperar la informaci�n sobre un v�deo.
 */
public class Video extends Articulo 
{
    private String formato;

    /**
     * Constructor de objetos de la clase Video
     */
    public Video(String elTitulo, String elFormato, int duracion)
    {
        super(elTitulo, duracion);
        formato = elFormato;
    }

    /**
     * Devolver el formato del v�deo
     */
    public String getFormato()
    {
        return formato;
    }
    
    /**
     * Escribir detalles sobre el CD
     * Redefinir print()
     */
    public String toString()
    {
        return super.toString() + 
        "Formato   " + formato;
    }
}
