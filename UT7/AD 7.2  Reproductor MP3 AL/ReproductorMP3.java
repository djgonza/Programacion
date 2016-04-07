
/**
 * Clase ReproductorMP3 
 *  
 */
 

public class ReproductorMP3
{

    private List<Fichero> ficheros;
    private int capacidad;  //en bytes
    private int tamActual;

    /**
     * Constructor de la clase ReproductorMP3
     */
    public ReproductorMP3(int bytes)
    {
        ficheros = new ArrayList<Fichero>();
        capacidad = bytes;

        //ficheros gratis
        ficheros.add(new FicheroMusica("Cancion 1", 3155, 166));
        ficheros.add(new FicheroMusica("Cancion 2", 2029, 187));
        tamActual = 3155 + 2029;
    }

    /**
     *  añade un fichero al MP3 actualizando el tamaño.
     *  Antes de añadirlo se comprueba si hay espacio en el MP3 y no hay un
     *  fichero igual.   
     */
    public void addFichero(Fichero f)
    {
        

    }

    /**
     *  accesor para la capacidad del MP3
     */
    public int getCapacidad()
    {
        return capacidad; 
    }
 

     /**
     *  borra todos los ficheros y pone el tamaño actual a 0
     */
    public void reset()
    {
         
    }

     /**
     *  muestra todos los datos de los ficheros de música
     *  que hay en el MP3. Al final se muestra el total de horas, minutos y
     *  segundos de música que hay
     */
    public void mostrarCanciones()
    {
        
    }

    /**
     *  dado un título, borra los ficheros de imagen
     *  con este título. 
     *  Devuelve true o false dependiendo de si se ha borrado alguno o no   
     */
    public boolean borrarFicheroImagen(String titulo)
    {
        

    }

    /**
     *  ordena aleatoriamente la lista de ficheros     
     */
    public void reordenar()
    {
        
    }

     /**
     *  ordena la lista de ficheros por tamaño
     */
    public void ordenarPorTamaño()
    {
         

    }

     /**
     *  ordena la lista de ficheros por título de fichero
     *  
     */
    public void ordenarPorTitulo()
    {
         

    }

    /**
     * Muestra todos los ficheros del MP3
     */
    public  void mostrarReproductor()
    {
        

    }
}
