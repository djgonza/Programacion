
/**
 * La clase BaseDatos almacena objetos CD y Videos. 
 * Se puede imprimir una lista de CD y Videos.
 * Esta versión no guarda los datos en el disco y no proporciona
 * métodos de búsqueda.
 */
import java.util.ArrayList;


public class BaseDatos
{
    private ArrayList<Articulo> articulos;

    /**
     * Construir una base de datos vacía
     */
    public BaseDatos()
    {
        articulos = new ArrayList<Articulo>();
    }

    /**
     * Añadir un artículo a la base da datos
     */
    public void addArticulo(Articulo elArticulo)
    {
        articulos.add(elArticulo);
    }

    /**
     * Imprimir una lista de tods los articulos almacenados, CD y Videos
     */
    public void listar()
    {
        for(Articulo articulo: articulos)
        {
            articulo.print();
        }
    }
    
   
}
