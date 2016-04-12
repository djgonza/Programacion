
/**
 *  clase AgendaContactos 
 *  
 */
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class AgendaContactos  
{
    private Map<Character, List<Contacto>> agenda;

    /**
     * Constructor de objetos de la clase AgendaContactos
     * crea la agenda e inicializa el map
     */
    public AgendaContactos()
    {
        agenda = new TreeMap<>();
        inicializarMap();
    }

    /**
     * añade añade al map las entradas correspondientes a cada letra, 
     * letra (siempre en mayúsculas) y lista (inicialmente vacía) de contactos asociada
     * 
     */
    private void inicializarMap()
    {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for(int i  =0; i < alfabeto.length(); i++)
        {
            agenda.put(Character.toUpperCase(alfabeto.charAt(i)), new ArrayList<>());

        }

        
        
    }

  
    /**
     * Añadir un nuevo contacto solo si no está
     * @param  c el nuevo contacto a añadir
     *   
     */
    public void añadirContacto(Contacto c)
    {

    }

    /**
     *  Devuelve la lista de todos los contactos (personales o profesionales) con ese nombre
     * @param nombre el nombre del contacto a buscar
     * @return devuelve todos los contactos con ese nombre en un List
     *          
     *   
     */
    public List<Contacto> buscarContacto(String nombre)
    {

        return null;

    }

    /**
     * Buscar un  contacto y devuelve true si está, false en otro caso
     * usa indexOf()   de ArrayList
     * @param c el  contacto a buscar
     *  
     */
    public boolean buscarContacto(Contacto contacto)
    { 

        return true;
    }  

    /**
     * Obtener la lista de contactos personales a
     *  los que hay que felicitar - Hace uso de localizarCumpleaños()
     */

    public List<ContactoPersonal> felicitar()
    {

        return null;

    }

    /**
     * Método privado de ayuda que dada una lista de contactos de una letra
     * devuelve la lista de contactos personales que cumplen años hoy
     *
     * @param  contactosLetra lista de contactos que empiezan por una letra
     * @return  lista de contactos personales que cumplen hoy   
     */
    private  List<ContactoPersonal> localizarCumpleaños(List<Contacto> contactosLetra)
    {

        return null;
    }

    /**
     * Representación textual de la agenda
     * Con el conjunto de entradas y un iterador
     *
     * 
     */
    public String toString()
    {

        return "";
    }

    /**
     * Cuenta el total de contactos que hay en la agenda
     * Con el conjunto de claves
     * 
     * @return el nº total de contactos
     */
    public int totalContactos()
    {

        return 0;
    }
    /**
     * Cuenta el total de contactos personales que hay en la agenda
     * 
     * @return el nº total de contactos personales
     */
    public int totalContactosPersonales()
    {

        
        return 0;
    }

    /**
     * Devuelve una colección List con los contactos personales en una letra
     *   
     */
    public List<ContactoPersonal> personalesEnLetra(char letra)
    {

        
        return null;
    }

    /**
     * Cuenta los contactos personales en una colección List
     *   @return el nº total de contactos personales en la lista
     */
    public int totalPersonalesEnLetra(char letra)
    {

        return 0;
    }

    /**
     * Devuelve un array con los contactos profesionales de una letra
     * de la agenda ordenados alfabéticamente.  
     *  Hazlo obteniendo los contactos profesionales en una colección List, ordena
     *  esta colección, convierte la colección a un array y devuelve este array
     */
    public Contacto[] profesionalesOrdenadosPorNombre(char letra)
    {

        return null;
    }

    /**
     * Devuelve un array con los contactos personales de una letra
     * de la agenda ordenados por fecha de nacimiento
     *  
     *   
     *  Hazlo obteniendo los contactos personales en una colección List, ordena
     *  esta colección, convierte la colección a un array y devuelve este array
     */
    public Contacto[] personalesOrdenadosPorFecha(char letra)
    {

        
        return null;
    }

   
} 
