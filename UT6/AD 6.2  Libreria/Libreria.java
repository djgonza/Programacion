
/**
 * Modela una clase Libreria 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Libreria
{

    private String nombre;
    private ArrayList<Libro> libros;

    /**
     * Constructor de la clase Libreria
     */
    public Libreria(String nombre)
    {
        libros = new ArrayList<>();
        this.nombre = nombre;

    }
    
    /**
     * Accesor para el nombre
     * 
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return la cantidad de libros en la librer�a
     * 
     */
    public int  numeroLibros()
    {
        return libros.size();

    }

    /**
     * A�ade un nuevo libro
     * @param l el libro a a�adir
     */
    public void addLibro(Libro l)
    {
        libros.add(l);

    }

    /**
     * Localizar un libro dado su t�tulo
     * @return el libro buscado o null si no
     * se encuentra
     */
    public Libro localizarLibro(String titulo)
    {
        for(Libro aux: libros)
        {
            if(aux.getTitulo().equalsIgnoreCase(titulo))
            {
                return aux;
            }
        }
        return null;

    }

    /**
     * @param autor el autor a buscar
     * @return true si hay en la librer�a libros
     * del autor dado
     */    
    public boolean hayLibrosDe(String autor)
    {
        for(Libro aux: libros)
        {
            if(aux.getAutor().equalsIgnoreCase(autor))
            {
                return true;
            }
        }
        return false;

    }
    
    /**
     * Borrar los libros de un determinado autor
     * @param autor el autor cuyos libros se borrar�n
     */
    public void borrarLibrosDe(String autor)
    {
        Iterator<Libro> it = libros.iterator();

        while(it.hasNext())
        {
            if(it.next().getAutor().equalsIgnoreCase(autor))
                it.remove();
        }

    }
    /**
     * Mostar libros prestados
     *   
     */
    public void listarPrestados()
    {
        StringBuilder sb = new StringBuilder();
        for(Libro aux: libros)
        {
            if(aux.estaPrestado())
            {
                sb.append(aux.toString());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

    }
    
    /**
     * Prestar un libro de un determinado t�tulo
     */
    public void prestarTitulo(String titulo)
    {
        
        for(Libro aux: libros)
        {
            if(aux.getTitulo().compareToIgnoreCase(titulo) < 0)
                System.out.println("Este libro no existe ");   
            else if(aux.estaPrestado())
                System.out.println("Este libro est� prestado");
            else
                aux.prestar();
        }
    }

}
