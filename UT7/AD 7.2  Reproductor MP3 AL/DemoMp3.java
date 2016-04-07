
/**
 *    
 */
public class DemoMp3
{

    private ReproductorMP3 mp3;

    /**
     * Constructor  
     */
    public DemoMp3()
    {
        mp3 = new ReproductorMP3(1048576);
    }

    /**
     *  
     * 
     */
    public void demoAdd()
    {
        mp3.addFichero(new FicheroMusica("T�tulo 01", 4096, 468));
        mp3.addFichero(new FicheroMusica("T�tulo 02", 5120, 378));
        mp3.addFichero(new FicheroMusica("T�tulo 03", 4096, 336));
        mp3.addFichero(new FicheroMusica("T�tulo 04", 5120, 510));
        mp3.addFichero(new FicheroJPG("imagen 01", 5120, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen", 6000, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen 02", 5100, Compresion.MEDIA));
        mp3.addFichero(new FicheroJPG("imagen 02", 5100, Compresion.MEDIA));
        mp3.addFichero(new FicheroJPG("imagen 03", 4000, Compresion.BAJA));
        mp3.addFichero(new FicheroJPG("imagen 03", 5120, Compresion.ALTA));
        mp3.addFichero(new FicheroJPG("imagen", 2000, Compresion.MEDIA));

    }

    /**
     * 
     */
    public  void demoCapacidad()
    {
        System.out.println("Capacidad del MP3: " + mp3.getCapacidad() + " bytes");
    }

    /**
     * 
     */
    public  void demoMostrarCanciones()
    {
        System.out.println("Canciones en el MP3 ");
        mp3.mostrarCanciones();
    }

    /**
     * 
     */
    public  void demoMostrarReproductor()
    {
        System.out.println("Situaci�n inicial del Reproductor MP3 ");
        mp3.mostrarReproductor();
    }

    /**
     * 
     */
    public  void demoReset()
    {
        mp3.reset();
    }

    /**
     * 
     */
    public  void demoOrdenarPorTitulo()
    {
        System.out.println("Despu�s de ordenar por t�tulo ");
        mp3.ordenarPorTitulo();

    }

    /**
     * 
     */
    public  void demoOrdenarPorTama�o()
    {
        System.out.println("Despu�s de ordenar por tama�o ");
        mp3.ordenarPorTama�o();

    }

    /**
     * 
     */
    public  void demoReordenar()
    {
        System.out.println("Despu�s de reordenar aleatoriamente ");
        mp3.reordenar();
    }
    
    /**
     * 
     */
    public  void demoBorrarFicheroImagen()
    {
        String titulo = "imagen";
        System.out.println("Despu�s de borrar el fichero de imagen con el t�tulo " + titulo);
        mp3.borrarFicheroImagen(titulo);

    }

}
