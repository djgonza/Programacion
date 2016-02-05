import java.util.ArrayList;
import java.util.Iterator;
/**
 * Gestiona el stock del negocio
 * El stock es descrito por 0 o mas productos
 * 
 *  Ejercicio 6.4 UT6
 *  
 *  @author Kölling y Barnes
 * A completar
 */
public class GestorStock
{
    // Lista de productos
    private ArrayList<Producto> listaProductos;

    /**
     * Inicializar el gestor de stock
     */
    public GestorStock()
    {
        listaProductos = new ArrayList<>();

    }

    /**
     *Añadir un producto a la lista
     * @param queProducto El producto a añadir
     */
    public void añadirProducto(Producto queProducto)
    {
        listaProductos.add(queProducto);

    }

    /**
     *  
     */
    public void añadirProductoV2(Producto queProducto)
    {
        for(Producto aux : listaProductos)
        {
            if(aux.getID() == queProducto.getID())
            {
                System.out.println("Ese id ya existe");
            }
            else
                listaProductos.add(queProducto);
        }


    }

    /**
     * Recibir una entrega de un producto particular
     * Incrementar la cantidad del producto en la cantidad indicada.
     * @param id El id del producto
     * @param cuanto La cantidad en que se incrementará el producto
     */
    public void recibir(int id, int cuanto)
    {
        listaProductos.get(id).incrementarCantidad(cuanto);
    }

    /**
     * Intenta encontrar el producto con el id dado
     * @param id  El identificador del producto a buscar
     * @return   El productos si se encuentra, o null 
     *          si no se encuentra
     */
    public Producto localizarProducto(int id)
    {
        if(id < 0 || id > listaProductos.size())
            return null;
        return listaProductos.get(id);

    }
    /**
     * Intenta encontrar el producto a partir de su nombre
     * @param nombre  El nombre del producto a buscar
     * @return   El producto si se encuentra, o null 
     *          si no se encuentra
     */
    public Producto localizarProducto(String nombre)
    {
        for(Producto aux : listaProductos)
        {
            if(aux.getNombre() == nombre)
            {
                return aux;
            }
        }
        return null;     

    }

    /**
     * Localiza un producto de id dado, y devuelve cuanto hay en stock. 
     * Si el id no existe devuelve 0
     * @param id El id del producto
     * @return La cantidad en stock del producto localizado
     */
    public int cantidadEnStock(int id)
    {
        if(localizarProducto(id) == null)
            return 0;
        return localizarProducto(id).getCantidad();

    }

    /**
     * Escribir detalles del producto
     */
    public void escribirDetallesProductos()
    {
        for(Producto aux : listaProductos)
        {
            System.out.println(aux.toString());
        }

    }

    /**
     * Escribir detalles del producto
     */
    public void escribirDetallesProductosV1()
    {
        Iterator<Producto> it = listaProductos.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }

    }

    /**
     * Escribir productos cuyo stock está
     * por debajo de un cierto nivel que se 
     * pasa como parámetro
     */
    public void escribirMenorQue(int valor)
    {
          Iterator<Producto> it = listaProductos.iterator();
        while(it.hasNext())
        {
            Producto aux = it.next();
            if(aux.getCantidad() < valor)
                System.out.println(aux.toString());
        }

    }
}
