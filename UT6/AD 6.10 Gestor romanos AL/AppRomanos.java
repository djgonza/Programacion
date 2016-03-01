import pkgromanos.GestorRomanos;
import pkgromanos.ConversorRomanos;
/**
 * La clase que inicia el gestor de romanos
 * 
 * 
 * Para ejecutar desde linea de comandos java -jar RutaFichero.jar {parametros}
 * 
 * para ejecutar sin el jar tecleamos java ruta/AppRomanos {parametros}
 * 
 * para crear el jar jar -cfve (nombre a dar).jar (ruta del main) {ruta archivos a añadir}
 * 
 * 
 * 
 */
public class AppRomanos
{
        public static void main (String[] args)
        {
            GestorRomanos demo = new GestorRomanos(new ConversorRomanos());
            demo.aniadirRomanos(args);
            System.out.println(demo.toString());
                
        }
        
        
        
}
