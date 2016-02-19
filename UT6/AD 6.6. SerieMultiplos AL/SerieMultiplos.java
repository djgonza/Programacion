import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
/**
 * Multimap - Un objeto de esta clase guarda
 * en un map claves String que representan n�meros
 * y m�ltiplos asociados a esas claves
 * 
 * Ejer. AD07
 * 
 */

public class SerieMultiplos
{

    private  HashMap<String, ArrayList<Integer>> mapMultiplos;

    /**
     * Constructor de la clase SeriePotencias
     */
    public SerieMultiplos()
    {
        mapMultiplos = new HashMap<>();

    }

    /**
     * 
     * @param  num el n� que ser� la clave String
     *  
     */
    public void a�adirEntrada(int num) 
    {
        String clave = String.valueOf(num);
        mapMultiplos.put(clave,generarMultiplos(num));

    }

    /**
     * 
     * @param  num el n� del que se generear�n los m�ltiplos
     * @return una colecci�n ArrayLIst con los m�ltiplos generados
     */
    private ArrayList<Integer> generarMultiplos(int num)
    {
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        //         ArrayList<Integer> multiplos = ArrayList::new;  
        //         for(int i = num; i < 100; i++)
        //         {
        //             if(i%num == 0)
        //             {
        //                 multiplos.add(i);
        //             }
        // 
        //         }
        for(int i = 1; i < 20; i++){
            multiplos.add(i*num);
        } 

        return multiplos;

    }

    /**
     * 
     * @param  num el n� del que se obtendr�n los m�ltiplos
     * @return  la colecci�n asociada en el map   
     */
    public ArrayList<Integer> obtenerMultiplosDe(int num)
    {
        return mapMultiplos.get(String.valueOf(num));
    }

    /**
     * Visualiza el map (claves y valores asociados)
     *    
     */
    public void escribirMap()
    {
        //         Set<Map.Entry<String,ArrayList<Integer>>> mapa = mapMultiplos.entrySet();
        //         for(Map.Entry<String,ArrayList<Integer>> map : mapa)
        //         {
        //             System.out.println(map.getKey() + " - " + map.getValue());
        // 
        //         }

        Set<String> mapa = mapMultiplos.keySet();
        for(String map: mapa)
        {
            System.out.print(map + " - ");
            escribirValor(mapMultiplos.get(map));
            System.out.println();

        }

    }

    /**
     * M�todo privado de ayuda que visualiz aun ArrayList
     *    
     */
    public void escribirValor(ArrayList<Integer> lista)
    {
        for(int aux: lista) 
        {
            System.out.print(aux + "-");

        }
    }

    /**
     * borrar del map (de todas las entradas) el m�ltiplo indicado
     * y devuelve el total de m�ltiplos borrados
     * Con Map.Entry y un iterador
     */
    public  int borrarMultiplo(int multi)
    {
        int contador = 0;

        Set<Map.Entry<String,ArrayList<Integer>>> mapa = mapMultiplos.entrySet();
        Iterator<Map.Entry<String,ArrayList<Integer>>> it = mapa.iterator();
        while(it.hasNext())
        {
            Map.Entry<String,ArrayList<Integer>> entrada = it.next();
            ArrayList<Integer> aux = entrada.getValue();
            if(aux.contains(multi))
            {

                
                aux.remove(new Integer(multi));
                //mapMultiplos.get(entrada.getKey()).
                contador++;
                
            }
            
            /*if(it.getValue().remove(new Integer(multi)))
                cont++;*/
            
        }
        return contador;
    }
}
