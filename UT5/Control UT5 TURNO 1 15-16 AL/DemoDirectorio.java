import java.util.Arrays;

/**
 * Demo para las clases Directorio y Fichero
 */
public class DemoDirectorio
{
    private Directorio directorio;

    /**
     * Constructor  
     */
    public DemoDirectorio(String nombre, int n)
    {
        directorio = new Directorio(nombre, n);

    }

    /**
     *  
     */
    public void demoAddFichero( )
    {
        directorio.addFichero("ejer01.java", 6);
        directorio.addFichero("ejer03.java", 2);
        directorio.addFichero("ejer01.java", 6);       
        directorio.addFichero("texto01.txt", 50);
        directorio.addFichero("EJER01.java", 6);
        directorio.addFichero("prueba01.bat", 16);
        directorio.addFichero("PRUEBA01.bat", 16);
        directorio.addFichero("prueba02.bat", 19);
        directorio.addFichero("TEXTO01.txt", 50);
        directorio.addFichero("prueba01.bat", 16);
        directorio.addFichero("ejer04.java", 2);
        directorio.addFichero("ejer05.java", 2); 
        directorio.addFichero("EJER05.java", 2); 
        directorio.addFichero("EJER07.java", 6);
        directorio.addFichero("PRUeba01.bat", 56);
        directorio.addFichero("EJer01.java", 16);
        
        System.out.println("Añadidos ficheros al directorio " + 
                    directorio.getNombre() + " ......");
        System.out.println(directorio.toString() + "\n");
    }

    /**
     *  
     */
    public void demoSizeDirectorio( )
    {
        System.out.println("Tamaño total en Kbytes del directorio ....." + 
                    directorio.getSizeDirectorio() + " Kb\n");
    }

    
   /**
     *  
     *
     */
    public void demoBorrarDeExtension(String extension)
    {
        int borrados = directorio.borrarDeExtension(extension);
        System.out.println("\nDespués de borrar los de extensión '" + extension + "' .......");
        System.out.println(directorio.toString() + "\n");
    }

    /**
     *  Recibe dos argumentos desde línea de comandos, el nombre del directorio y su tamaño máximo
     *  Si hay algún error se muestra el mensaje correspondiente y se acaba la aplicación
     *  Si todo va bien  crea un objeto DemoDirectorio  e invoca a cada uno de los métodos de la clase 
     *  DemoDirectorio
     *  
     */
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Error en nº de argumentos, " +
                               "Sintaxis: java DemoDirectorio <nombre> <n>");
            return;
        }
        String nombre = args[0];
        int n = Integer.parseInt(args[1]);
        DemoDirectorio demo = new DemoDirectorio(nombre, n);
        demo.demoAddFichero();
        demo.demoSizeDirectorio();
        demo.demoBorrarDeExtension("java");
         
    }

}
