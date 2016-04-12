import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
        if(!ficheros.contains(f) && (tamActual + f.getTamaño()) < capacidad)
        {
            ficheros.add(f);
        }
        else
            System.out.println("No se puede introducir");

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
        ficheros.clear();
        tamActual = 0;

    }

    /**
     *  muestra todos los datos de los ficheros de música
     *  que hay en el MP3. Al final se muestra el total de horas, minutos y
     *  segundos de música que hay
     */
    public void mostrarCanciones()
    {
        int tiempo = 0;

        for(Fichero fichero: ficheros)
        {
            if(fichero instanceof FicheroMusica )
            {
                fichero.display(); 
                tiempo += ((FicheroMusica) fichero).getDuracion();
            }
        }
        LocalTime tem = LocalTime.ofSecondOfDay(tiempo);
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(tem.format(formateador));
        //         System.out.println("Total duración " + tiempo / 3600+":"+(tiempo%3600)/60+":"+(tiempo%3600)%60);

    }

    /**
     *  dado un título, borra los ficheros de imagen
     *  con este título. 
     *  Devuelve true o false dependiendo de si se ha borrado alguno o no   
     */
    public boolean borrarFicheroImagen(String titulo)
    {
        Iterator<Fichero> it = ficheros.iterator();
        boolean borrado = false;
        while(it.hasNext())
        {
            Fichero aux = it.next();
            if(aux instanceof FicheroJPG)
            {
                if(aux.getTitulo().equalsIgnoreCase(titulo))
                {
                    it.remove();
                    borrado = true;
                }
            }

        }
        return borrado;
    }

    /**
     *  ordena aleatoriamente la lista de ficheros     
     */
    public void reordenar()
    {
        Collections.shuffle(ficheros);

    }

    /**
     *  ordena la lista de ficheros por tamaño
     */
    public void ordenarPorTamaño()
    {
        Collections.sort(ficheros);

    }

    /**
     *  ordena la lista de ficheros por título de fichero
     *  
     */
    public void ordenarPorTitulo()
    {

        Collections.sort(ficheros, new Comparator<Fichero>(){
                public int compare(Fichero fichero1, Fichero fichero2){
                    return fichero1.getTitulo().compareToIgnoreCase(fichero2.getTitulo());

                }

            });

    }

    /**
     * Muestra todos los ficheros del MP3
     */
    public  void mostrarReproductor()
    {
        for(Fichero fichero: ficheros)
        {
            if(fichero instanceof FicheroJPG )
            {
                fichero.display(); 

            }
        }
    }

    public void ordenarPorTituloDescendente() {
        ficheros.sort(Collections.reverseOrder());
    }

    public void ordenarPorTamañoDescendente(){
        Collections.sort(ficheros, new Comparator<Fichero>(){
                public int compare(Fichero fichero1, Fichero fichero2){
                    return (int) Math.signum(fichero1.getTamaño() - fichero2.getTamaño());

                }

            });
    }
}
