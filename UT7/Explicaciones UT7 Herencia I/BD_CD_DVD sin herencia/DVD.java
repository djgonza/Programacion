/**
 * La clase representa a un objeto DVD
 * 
 * @author Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */
public class DVD 
{
    private String titulo;
    private String director;
    private int duracion; 
    private boolean loTengo;
    private String comentario;

    /**
     * Constructor 
     */
    public DVD(String elTitulo, String elDirector, int duracion)
    {
        titulo = elTitulo;
        director = elDirector;
        this.duracion = duracion;
        loTengo = false;
        comentario = "<sin comentario>";
    }

    /**
     * Introducir un comentario para el DVD
     * @param comentario 
     */
    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    /**
     * @return el comentario del DVD
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
     * @return true si lo tengo
     */
    public boolean getPropiedad()
    {
        return loTengo;
    }

    /**
     * Escribir detalles del DVD.
     */
    public void print()
    {
        System.out.print("DVD: " + titulo + " (" + duracion + " mins)");
        if (loTengo) 
            System.out.println("*");
        else 
            System.out.println();
        System.out.println("    " + director);
        System.out.println("    " + comentario);
    }
}
