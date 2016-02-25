
/**
 * Un objeto de esta clase mantiene una 
 * colección map de equipos de baloncesto.
 * Las claves son los nombres de los equipos (siempre en mayúsculas). Para cada clave
 * se asocia la relación (una colección ArrayList) de jugadores de ese equipo
 * 
 * Las claves se recuperarán en orden alfabético
 */

import java.util.Scanner;
import java.util.Arrays;

public class MapEquipos
{

    private        mapEquipos;

    /**
     * Constructor de la clase MapEquipos
     */
    public MapEquipos()
    {
        mapEquipos =  
    }

    /**
     * añadir un  Jugador a la lista de Jugadores del equipo
     * @param equipo el equipo en que se añade el Jugador
     * @param j el Jugador a añadir
     *  
     * Si el equipo no existe se creará una nueva entrada asociando ese equipo junto con el jugado
     * Si  el equipo existe únicamente se añade un  Jugador más que  juega en él
     * 
     * Los equipos siempre se añaden en mayúsculas
     */
    public void addJugador(String equipo, Jugador j)
    {
       
    }

    /**
     *  Devuelve la cantidad de Jugadores del equipo indicado
     *  Si no existe lel equipo devuelve -1
     *
     */
    public int jugadoresEn(String equipo)
    {
        
    }

    /**
     * 
     * @return una lista LinkedList de String con los
     * nombres de los jugadores que actúan como aleros en sus equipos
     * Cada vez que se añade a la lista se hace al principio
     * 
     * Usa el conjunto de entradas y un for mejorado
     */
    public LinkedList<String> obtenerAleros()
    {
        
    }
    
     /**
     *  dado un equipo (asumimos que existe) obtener la altura
     *  media de sus jugadores
     *
     */
    public double alturaMedia(String equipo)
    {
       
        
    }


    /**
     * borra del map los jugadores con edad menor que la indicada
     * y devuelve un conjunto (sin importar el orden) con los 
     * nombres de los jugadores borrados
     * 
     * Usa para recorrer el map el conjunto de entradas y un iterador.
     */
    public .................. borrarMenoresDe(int edad)
    {
        
        
        
    }

      /**
     * Representación textual del map, cada equipo junto con los jugadores
     *  
     * Con el conjunto de claves y for mejorado
     * De forma eficiente ya que habrá muchas concatenaciones
     */

    public String  toString()
    {
       
        
        
    }
    
    
    
    /**
     *  Dado un array de String con los datos de un  Jugador 
     *  obtiene y devuelve un objeto Jugador 
     *
     *  Ej. a partir del array {"kobe bryant",  "23", "9", "1978", "1.98", "ALERO"} 
     *  obtiene el objeto Jugador correspondiente
     *  
     *  Asumimos todos los valores correctos
     */
    private Jugador obtenerJugador(String[] datosJugador)
    {
        
        
    }

    /**
     *  Lee de un fichero líneas de datos con la información de cada Jugador 
     *  Hace uso de los métodos parsearLinea() y addJugador()
     */
    public void leerDeFichero()
    {
         
            Scanner sc = new Scanner(this.getClass().getResourceAsStream("/equipos.txt"));
            while (sc.hasNext())  // mientras haya líneas en el fichero
            {
                String linea = sc.nextLine();
                String[] datos = linea.split(":");
                Jugador p = obtenerJugador(Arrays.copyOfRange(datos, 1, datos.length));
                addJugador(datos[0], p);
            }
        

    }

  
    /**
     * Mostra la lista
     */
    public  void escribir()
    {
        System.out.println(this.toString());
    }
}
