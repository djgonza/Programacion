import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**
 *  
 * Clase que incluye un map que asocia nombre de personas con el conjunto de sus colores favoritos
 * Ejemplo de uso de un multimap, un map en el que cada clave tiene
 * asociado una colección de valores
 */
 

public class MultiMapColores
{

    private HashMap<String, HashSet<String>> mapPersonas;

    /**
     * Constructor  
     */
    public MultiMapColores()
    {
        mapPersonas =   new HashMap<>();
    }

    /**
     *   Añade una nueva persona al map con su color favorito
     *   Si la persona (clave) no existe se crea una nueva entrada con
     *   un conjunto vacío y se añade el color al conjunto
     *   Si la personas (clave) existe se añade el color
     * 
     */
    public void addPersona(String nombre, String color)
    {
        if(!mapPersonas.containsKey(nombre))
        {
            HashSet<String> colores = new HashSet<>();
            colores.add(color);
            mapPersonas.put(nombre, colores);
        }
        else
        {
            mapPersonas.get(nombre).add(color);
        }
    }

    /**
     *   Añade una nueva persona al map con su color favorito
     *   Si la persona (clave) no exite se crea una nueva entrada con
     *   un conjunto vacío y se añade el color al conjunto
     *   Si la personas (clave) existe se añade el color
     * 
     */
    public void addPersonaV2(String nombre, String color)
    {
        

    }


    /**
     * Muestra el nombre de cada persona y sus colores favoritos
     * Con el conjunto de claves y un for mejorado
     */
    public  void escribirPersonasColores()
    {
         
        mapPersonas.forEach((k,v) -> System.out.println("Nombre: " + k + " Color: " + v ));
        mapPersonas.forEach((k,v) -> nombreMetodo(k,v));
        
        
        
        
        
        
        
        
    }

    /**
     * devuelve el nº de personas a las que les gusta el color pasado como parámetro
     * Con el conjunto de entradas y un iterador
     */
    public int personasLesGustaColor(String color)
    {
        //mapPersonas.forEach()
        int cont = 0;
        Set<Map.Entry<String, HashSet<String>>> entradas = mapPersonas.entrySet();
        for(Map.Entry<String, HashSet<String>> entrada : entradas)
        {
            if(entrada.getValue().contains(color))
            {
                cont++;
            }
        }
        return cont;

    }

    /**
     * devuelve un conjunto ordenado con los nombres de las personas a las que les gusta 
     * el color pasado como parámetro
     * Con el conjunto de claves y un for
     */
    public TreeSet<String> conjuntoPersonasLesGustaColor(String color)
    {
         

    }

    /**
     *  Borrar el color que le gusta a la persona indicada
     *
     */
    public void borrarColor(String persona, String color)
    {
      if(mapPersonas.containsKey(persona))
      {
          mapPersonas.get(persona).remove(color);
      }
    }

}

