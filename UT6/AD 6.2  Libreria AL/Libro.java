import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Describe un libro de la biblioteca
 *
 */

public class Libro 
{
    private String titulo;
    private String autor;
    private int paginas;  
    private Estado estado;
    private String fechaPrestamo;

    /**
     * Constructor de la clase Libro
     * La fecha de prestamo inicialmente es vacía
     * y el estado del libro es no prestado
     * 
     */
    public Libro(String titulo, String autor, int paginas)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        estado = Estado.NOPRESTADO;
        fechaPrestamo = "";
    }

    /**
     * 
     * @return accesor para el titulo
     *       
     */
    public String getTitulo() 
    {       
        return titulo;
    }

    /**
     * 
     * @return devuelve el autor
     */
    public String getAutor() 
    {        
        return autor;
    }

    /**
     * 
     * @return devuelve el nº de páginas 
     */
    public int getPaginas() 
    {        
        return paginas;
    }

    /**
     * @return devuelve el estado del libro
     */
    public Estado getEstado() 
    {        
        return estado;
    }

    /**
     * Indica si está prestado
     */
    public boolean estaPrestado()
    {        
        return this.getEstado() == Estado.PRESTADO;
    }

    /**
     * Mutador para prestar el libro
     * Sólo se puede prestar un libro 
     * no prestado anteriormente. Utiliza el método privado
     * obtenerFechaPrestamo()n para obtener la fecha de hoy
     * 
     * Al prestar un libro cambia su estado
     * y la fecha en la que se prestó
     */
    public void prestar()
    {        
        if(!estaPrestado())
        {
            fechaPrestamo = obtenerFechaPrestamo();
            estado = Estado.PRESTADO;
        }
    }

    /**
     * Mutador para devolver un libro
     * Sólo se puede devolver un libro 
     * prestado anteriormente
     * Al prestar un libro cambia su estado
     * y la fecha en la que se prestó vuelve 
     * a ser ""
     */
    public void devolver()
    {        
        if(estaPrestado())
        {
            fechaPrestamo = "";
            estado = Estado.NOPRESTADO;
        }
    }

    /**
     * @return la fecha de préstamo que es la fecha actual
     *          en formato String
     */
    private String obtenerFechaPrestamo()
    {
        Calendar fecha = new GregorianCalendar();
        String fechaPrestado = fecha.get(Calendar.DAY_OF_MONTH) + "/" + 
                               fecha.get(Calendar.MONTH) + "/" + 
                               fecha.get(Calendar.YEAR);
        return fechaPrestado;
    }

    /**
     * 
     * @return representación textual del libro
     */
    public String toString()
    {
        String str = "";
        str = str + "Titulo: " + getTitulo() +
        "\nAutor: " + getAutor() +
        "\nNº pagina: " + getPaginas() + 
        "\nEstado " + estado.toString() + "\n";
        if (estaPrestado())
            str = str + fechaPrestamo;

        return str;
    }

    
}
