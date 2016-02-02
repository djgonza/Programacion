/**
 * La clase describe un fichero de un directorio
 * Todo fichero tiene un nombre y una extensión 
 * ("ejemplo.java"   "pruebas.txt"    "ejercicio.pdf")
 * (suponemos siempre correcto)
 *   
 */
public class Fichero 
{
    private String nombre;  //nombre que incluye la extensión
    private int size;  // tamaño en KBytes

    /**
     * Constructor 
     * @param nombre  el nombre del fichero
     * @param size  el tamaño del fichero
     */
    public Fichero(String nombre, int size)
    {
        this.nombre = nombre;
        this.size = size;

    }

    /**
     * 
     * @return devuelve el nombre completo del dichero con extensión
     */
    public String getNombre() 
    {    
        return nombre;
    }

    /**
     * 
     *  devuelve el nombre sin extensión
     *  Si el fichero se denomina "ejemplo.java" devuelve "ejemplo"
     *  
     *  No se puede utilizar split()
     */
    public String getNombreSinExtension() 
    { 
        return nombre.substring(0, nombre.indexOf("."));
    }

    /**
     * 
     * @return devuelve la extensión (sin incluir el punto)
     * 
     *  Si el fichero se denomina "ejemplo.java" devuelve "java"
     *  No se puede utilizar split()
     */
    public String getExtension()
    {
        return nombre.substring(nombre.indexOf(".") + 1);
         
    }

    /**
     * mutador para el nombre
     * se cambia el nombre completo
     * @param nombre el nombre nuevo
     */

    public void setNombre(String nombre) 
    {  
        this.nombre = nombre;
    }

    /**
     * accesor para el tamaño del fichero
     * @return el tamañoo del fichero
     */
    public int getSize() 
    {
        return size;
    }

    /**
     * mutador para el tamaño del fichero
     * @param size el tamaño del fichero
     */
    public void setSize(int size) 
    {
        this.size = size;
    }

    /**
     * representación textual del fichero
     */
    public String toString() 
    {
        return String.format("%15s", nombre) + "   " +
        String.format("%4d KB\n", size);
    }

    
}
