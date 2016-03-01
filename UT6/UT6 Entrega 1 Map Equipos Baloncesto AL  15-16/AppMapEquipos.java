import pkgequipos.modelo.MapEquipos;
import pkgequipo.interfaz.IUConsola;
/**
 *  Punto de entrada a la aplicacion 
 *  
 *  java -jar equiposbaloncesto.jar
 */
public class AppMapEquipos
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        MapEquipos map = new MapEquipos();
        IUConsola interfaz = new IUConsola(map);
        interfaz.iniciar();
    }
}
