
/**
 *  Punto de entrada a la aplicación 
 *  
 *  
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
