/**
 * Demostraci�n de las clases GestorStock y Producto
 * 
 * Ejercicio 6.4 UT6
 * @author K�lling y Barnes
 * 
 * A completar
 */
public class StockDemo
{
    // El gestor de stock
    private GestorStock gestor;

    /**
     * Crea el gestor y a�ade algunos productos
     */
    public StockDemo()
    {
        gestor = new GestorStock();
        gestor.a�adirProducto(new Producto(132, "Clock Radio"));
        gestor.a�adirProducto(new Producto(37, "Mobile Phone"));
        gestor.a�adirProducto(new Producto(23, "Microwave Oven"));
    }
    
    /**
     * Demostraci�n de c�mo el gestor puede ser usado
     */
    public void demo()
    {
        // Muestra detalles de todos los productos
        
        
        // Llegada de 5 art�culos de un producto
       
        
    }
    
    /**
     * Mostrar detalles de un producto. 
     * @param id ISD del producto a buscar
     */
    public void mostrarDetalles(int id)
    {
        
            
    }
    
    /**
     * Vender un art�culo de un producto
     * Mostra el estado del producto antes y despu�s de la venta
     * @param id El id del producto vendido
     */
    public void venderProducto(int id)
    {
        
            
            
    }
    
    /**
     * Obtener el producto de id dado desde el gestor.
     *
     * @param id El ID del producto
     * @return El producto o null si no se encuentra
     */
    public Producto getProducto(int id)
    {
        
            
            
    }

    /**
     * @return El gestor de stock
     */
    public GestorStock getGestor()
    {
        return gestor;
    }
}
