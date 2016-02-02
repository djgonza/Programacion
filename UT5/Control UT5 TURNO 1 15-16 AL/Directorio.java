import java.util.Arrays;

/**
 * La clase describe un directorio que contiene ficheros
 * Los ficheros del directorio pueden tener cualquier extensión
 * 
 * Sobre el directorio se pueden añadir ficheros,  renombrar, ...
 *
 */
public class Directorio 
{
    private String nombre; // el nombre del directorio
    private Fichero[] ficheros;
    private int pos;  // nº real de ficheros en el directorio

    /**
     * Constructor de un directorio
     * @param nombre el nombre del directorio     
     * @param n el tamaño máximo del directorio (nº máximo de ficheros que va a contener)
     */
    public Directorio(String nombre, int n) 
    {
        this.nombre = nombre;
        this.ficheros = new Fichero[n];
        this.pos = 0;
    }

    /**
     *  Accesor para el nombre del directorio     
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * añade un nuevo fichero al directorio     
     * 
     * Si ya hay otro fichero con el mismo nombre se sobreescribe
     * con el nuevo fichero
     * 
     * Solo puede añadirse si hay sitio en el directorio
     * 
     * El fichero se añade siempre al final       
     * 
     * @param nombre el nombre del fichero a añadir
     * @param size el tamaño del fichero a añadir
     */
    public void  addFichero(String nombre, int size)
    {
        Fichero aux = new Fichero(nombre, size);
        int existe = existeFichero(nombre);
        if(existe != -1){
            ficheros[existe] = aux;
        }else if(!estaLleno()){
            ficheros[pos] = aux;
            pos++;
        }
    }

    /**
     * @return devuelve true si directorio lleno
     * 
     */
    public boolean estaLleno()
    {
        return pos >= ficheros.length;
    }

    /**
     * detecta a partir un nombre si un fichero está o no en un directorio
     * Indiferente mayúsculas / minúsculas
     * 
     * @param el nombre completo del fichero a buscar
     * @return devuelve -1 si no está o la posición 
     *     en la que se encuentra
     */

    public int existeFichero(String nombre)
    {
        nombre = nombre.toUpperCase();
        for(int i = 0; i < pos; i++){
            if(ficheros[i].getNombre().toUpperCase().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

    /**
     * @return devuelve el tamaño total en Kbytes ocupados por los
     * ficheros del directorio
     * 
     */
    public int getSizeDirectorio()
    {
        int suma = 0;
        for(int i = 0; i < pos; i++){
            suma += ficheros[i].getSize();
        }
        return suma;
    }

    /**
     * Borra del directorio todos los ficheros con la extensión 
     * indicada en el parámetro. Se devuelve el nº de ficheros borrados
     */
    public int borrarDeExtension(String extension) 
    {
        int i = 0;
        int cont = 0;
        while(i < pos){
            if(ficheros[i].getExtension().equals(extension)){
                int j = i;
                while(j < pos - 1){
                    ficheros[j] = ficheros[j + 1];
                    j++;
                }
                pos--;
                cont++;
            }else{
                i++;
            }
        }
        return cont;
    }

    /**
     *  Repesentación textual del directorio
     *  Se hará de la forma más eficiente teniendo en cuenta
     *  que habrá múltiples concatenaciones
     */

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < pos; i++){
            sb.append(ficheros[i].toString());
        }
        return sb.toString();
    }

}
