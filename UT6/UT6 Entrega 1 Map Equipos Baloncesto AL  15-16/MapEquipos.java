
/**
 * Un objeto de esta clase mantiene una 
 * coleccion map de equipos de baloncesto.
 * Las claves son los nombres de los equipos (siempre en mayusculas). Para cada clave
 * se asocia la relacion (una coleccion ArrayList) de jugadores de ese equipo
 * 
 * Las claves se recuperaran en orden alfabetico
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapEquipos
{

    private TreeMap<String, ArrayList<Jugador>> mapEquipos;

    /**
     * Constructor de la clase MapEquipos
     */
    public MapEquipos()
    {
        mapEquipos = new TreeMap<>(); 
    }

    /**
     * anadir un  Jugador a la lista de Jugadores del equipo
     * @param equipo el equipo en que se anade el Jugador
     * @param j el Jugador a anadir
     *  
     * Si el equipo no existe se creara una nueva entrada asociando ese equipo 
     * junto con el jugado
     * Si  el equipo existe unicamente se anade un  Jugador mas que  juega en el
     * 
     * Los equipos siempre se anaden en mayusculas
     */
    public void addJugador(String equipo, Jugador j)
    {
        equipo = equipo.toUpperCase();

        //sacamos la lista de jugadores
        ArrayList<Jugador> listaJugadores = mapEquipos.get(equipo);
        //si no existe la entrada la creamos
        if(listaJugadores == null){
            listaJugadores = new ArrayList<>();
            mapEquipos.put(equipo, listaJugadores);
        }
        //anadimos el jugador
        listaJugadores.add(j);
        
    }

    /**
     *  Devuelve la cantidad de Jugadores del equipo indicado
     *  Si no existe lel equipo devuelve -1
     *
     */
    public int jugadoresEn(String equipo)
    {
        equipo = equipo.toUpperCase();

        ArrayList<Jugador> listaJugadores = mapEquipos.get(equipo);

        if(listaJugadores == null)
            return -1;

        return listaJugadores.size();
    }

    /**
     * 
     * @return una lista LinkedList de String con los
     * nombres de los jugadores que actuan como aleros en sus equipos
     * Cada vez que se anade a la lista se hace al principio
     * 
     * Usa el conjunto de entradas y un for mejorado
     */
    public LinkedList<String> obtenerAleros()
    {
        LinkedList<String> aleros = new LinkedList<>();
        Set<Map.Entry<String, ArrayList<Jugador>>> entradas = mapEquipos.entrySet();

        for(Map.Entry<String, ArrayList<Jugador>> entrada : entradas){
            for(Jugador jugador : entrada.getValue()){
                if(jugador.getPosicion() == Posicion.ALERO){
                    aleros.add(jugador.getNombre());
                }
            }
        }

        return aleros;
    }
    
     /**
     *  dado un equipo (asumimos que existe) obtener la altura
     *  media de sus jugadores
     *
     */
    public double alturaMedia(String equipo)
    {
        equipo = equipo.toUpperCase();

        double altura = 0;
        for(Jugador jugador : mapEquipos.get(equipo)){
            altura += jugador.getAltura();
        }
        return altura / mapEquipos.get(equipo).size();
        
    }


    /**
     * borra del map los jugadores con edad menor que la indicada
     * y devuelve un conjunto (sin importar el orden) con los 
     * nombres de los jugadores borrados
     * 
     * Usa para recorrer el map el conjunto de entradas y un iterador.
     */
    public HashSet<String> borrarMenoresDe(int edad)
    {
        HashSet<String> jugadores = new HashSet<String>();
        Set<Map.Entry<String, ArrayList<Jugador>>> entradas = mapEquipos.entrySet();
        Iterator<Map.Entry<String, ArrayList<Jugador>>> itMapa = entradas.iterator();

        while(itMapa.hasNext()){            
            
            Iterator<Jugador> itLista = itMapa.next().getValue().iterator();
            
            while(itLista.hasNext()){
                
                Jugador jugador = itLista.next();
                if(jugador.getEdad() < edad){
                    jugadores.add(jugador.getNombre());
                    itLista.remove();
                }

            }

        }

        return jugadores;
    }

      /**
     * Representacion textual del map, cada equipo junto con los jugadores
     *  
     * Con el conjunto de claves y for mejorado
     * De forma eficiente ya que habra muchas concatenaciones
     */

    public String  toString()
    {
       StringBuilder sb = new StringBuilder();
       Set<Map.Entry<String, ArrayList<Jugador>>> entradas = mapEquipos.entrySet();
       for(Map.Entry<String, ArrayList<Jugador>> entrada : entradas){
           sb.append("Nombre Equipo: ").append(entrada.getKey()).append('\n');
           for(Jugador jugador : entrada.getValue()){
               sb.append(jugador.toString()).append('\n');
           }
       }
       return sb.toString();
        
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
        return new Jugador(
            datosJugador[0],
            Integer.parseInt(datosJugador[1]),
            Integer.parseInt(datosJugador[2]),
            Integer.parseInt(datosJugador[3]),
            Double.parseDouble(datosJugador[4]),
            Posicion.valueOf(datosJugador[5])
        );
    }

    /**
     *  Lee de un fichero lineas de datos con la informacion de cada Jugador 
     *  Hace uso de los metodos parsearLinea() y addJugador()
     */
    public void leerDeFichero()
    {
         
            Scanner sc = new Scanner(this.getClass().getResourceAsStream("/equipos.txt"));
            while (sc.hasNext())  // mientras haya lineas en el fichero
            {
                String linea = sc.nextLine();
                String[] datos = linea.split(":");
                Jugador p = obtenerJugador(Arrays.copyOfRange(datos, 1, datos.length));
                addJugador(datos[0], p);
            }
        

    }

  
    /**
     * Muestra la lista
     */
    public void escribir()
    {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        MapEquipos demo = new MapEquipos();
        demo.addJugador("Prueba", new Jugador("MARC GASOL", 1, 1, 1991, 2.02, Posicion.ALERO));
        demo.addJugador("Prueba", new Jugador("MARC GASOL", 1, 1, 1991, 2.52, Posicion.ALERO));
        System.out.println(demo.jugadoresEn("Prueba"));
        System.out.println(demo.obtenerAleros().toString());
        System.out.println(demo.alturaMedia("Prueba"));
        demo.borrarMenoresDe(10);
    }

}
