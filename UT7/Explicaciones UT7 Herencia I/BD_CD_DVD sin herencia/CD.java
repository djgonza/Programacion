/**
 * La clase representa a un CD
 * 
 * @author Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */
public class CD
{
    private String titulo;
    private String artista;
    private int numeroPistas;
    private int duracion;
    private boolean loTengo;
    private String comentario;

    /**
     * Constructor del CD
     */
    public CD(String elTitulo, String telArtista, int pistas, int duracione)
    {
        titulo = elTitulo;
        artista = telArtista;
        numeroPistas = pistas;
        this.duracion = duracion;
        loTengo = false;
        comentario = "<sin comentario>";
    }

    /**
     * establecer comentario para el CD
     * @param comentario el comentario del CD
     */
    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    /**
     * @return el comentario
     */
    public String getComentario()
    {
        return comentario;
    }

    /**
     * Establecer el flag que indica si lo tengo o no
     * @param loTengo a true si lo poseo
     */
    public void setPropiedad(boolean loTengo)
    {
        this.loTengo = loTengo;
    }

    /**
     * @return true sil tengo el CD
     */
    public boolean getPropiedad()
    {
        return loTengo;
    }

    /**
     *  Escribir detalles del CD.
     */
    public void print()
    {
        System.out.print("CD: " + titulo + " (" + duracion + " mins)");
        if (loTengo)
            System.out.println("*");
        else 
            System.out.println();
        System.out.println("    " + artista);
        System.out.println("    tracks: " + numeroPistas);
        System.out.println("    " + comentario);
    }
}
