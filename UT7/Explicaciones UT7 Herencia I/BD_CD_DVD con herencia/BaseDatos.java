
/**
 * La clase BaseDatos almacena objetos CD y Videos. 
 * Se puede imprimir una lista de CD y Videos.
 * Esta versi�n no guarda los datos en el disco y no proporciona
 * m�todos de b�squeda.
 */
import java.util.ArrayList;


public class BaseDatos
{
    private ArrayList<Articulo> articulos;

    /**
     * Construir una base de datos vac�a
     */
    public BaseDatos()
    {
        articulos = new ArrayList<Articulo>();
    }

    /**
     * A�adir un art�culo a la base da datos
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
