import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Describe un libro de la biblioteca
 *
 */

public class Libro 
{
    private String titulo;
    private String autor;
    private int paginas;  
    private Estado  estado;
    private String fechaPrestamo;

    /**
     * Constructor de la clase Libro
     * La fecha de prestamo inicialmente es vac�a
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
     * @return devuelve el n� de p�ginas 
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
     * Indica si est� prestado
     */
    public boolean  estaPrestado()
    {        
        return estado == Estado.PRESTADO;
    }

    /**
     * Mutador para prestar el libro
     * S�lo se puede prestar un libro 
     * no prestado anteriormente. Utiliza el m�todo privado
     * obtenerFechaPrestamo()n para obtener la fecha de hory
     * 
     * Al prestar un libro cambia su estado
     * y la fecha en la que se prest�
     */
    public void prestar()
    {        
        if(!estaPrestado())
        {
            estado = Estado.PRESTADO; 
            fechaPrestamo = obtenerFechaPrestamo();

        }
    }

    /**
     * Mutador para devolver un libro
     * S�lo se puede devolver un libro 
     * prestado anteriormente
     * Al prestar un libro cambia su estado
     * y la fecha en la que se prest� vuelve 
     * a ser ""
     */
    public void devolver()
    {        
        if(estaPrestado())
        {
            estado = Estado.NOPRESTADO;  
            fechaPrestamo = ""; 
        }

    }
    
    /**
     * @return la fecha de pr�stamo que es la fecha actual
     *          en formato String
     */
    private String obtenerFechaPrestamo()
    {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd:MMM:yyyy");
        String fechaPrestamo = hoy.format(formateador);
        return fechaPrestamo;
    }

    /**
     * 
     * @return representaci�n textual del libro
     */
    public String toString()
    {
        String str = "";
        str = str + "Titulo: " + getTitulo() +
        "\nAutor: " + getAutor() +
        "\nN� pagina: " + getPaginas() + 
        "\nEstado " + estado.toString() + "\n";
        if (estaPrestado())
            str = str + fechaPrestamo;

        return str;
    }

    
}
