
/**
 *  Punto de entrada a la aplicaci�n 
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
