package pkgagenda.modelo;
/**
 *  clase AgendaContactos 
 *  
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class AgendaContactos  implements Visualizable
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
        Character clave = c.getPrimeraLetra();
        if(!agenda.get(clave).contains(c)){
            List<Contacto> tmp = agenda.get(clave);
            tmp.add(c);
        }

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
        Character clave = nombre.charAt(0);
        List<Contacto> tmp = agenda.get(clave);
        List<Contacto> aDevolver = new ArrayList<Contacto>();
        for(Contacto c: tmp)
        {
            if(c.getNombre().equalsIgnoreCase(nombre))
                aDevolver.add(c);

        }
        return aDevolver;

    }

    /**
     * Buscar un  contacto y devuelve true si está, false en otro caso
     * usa indexOf()   de ArrayList
     * @param c el  contacto a buscar
     *  
     */
    public boolean buscarContacto(Contacto contacto)
    { 
        Character clave = contacto.getPrimeraLetra();
        if(agenda.get(clave).indexOf(contacto) >= 0)

            return true;
        return false;
    }  

    /**
     * Obtener la lista de contactos personales a
     *  los que hay que felicitar - Hace uso de localizarCumpleaños()
     */

    public List<ContactoPersonal> felicitar()
    {
        Set<Map.Entry<Character,List<Contacto>>> tmp = agenda.entrySet();
        List<ContactoPersonal> aDevolver = new ArrayList<ContactoPersonal>();
        for(Map.Entry<Character,List<Contacto>> entrada: tmp)
        {

            //aDevolver.addAll(localizarCumpleaños(entrada.getValue()));
            for(ContactoPersonal cp : localizarCumpleaños(entrada.getValue())){
                System.out.println("ContactoPersonal");
            }

        }
        //System.out.println(aDevolver.size() + "Sizeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        return aDevolver;

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
        List<ContactoPersonal> aDevolver = new ArrayList<>();
        for(Contacto c : contactosLetra){
            if(c instanceof ContactoPersonal){
                ContactoPersonal cp = (ContactoPersonal) c;
                if(cp.esCumpleaños()){
                    aDevolver.add(cp);
                    //System.out.println("Es compleaños");
                }
            }

        }
        //System.out.println(aDevolver.size() + "Akiiiiiiiiiii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return aDevolver;
    }

    /**
     * Representación textual de la agenda
     * Con el conjunto de entradas y un iterador
     *
     * 
     */
    public String toString()
    {
        Set<Map.Entry<Character,List<Contacto>>> entradas = agenda.entrySet();
        Iterator<Map.Entry<Character,List<Contacto>>> it = entradas.iterator();
        StringBuilder st = new StringBuilder();
        while(it.hasNext())
        {
            Map.Entry<Character,List<Contacto>> temp = it.next();
            st.append(String.format("\n%20c", temp.getKey()));
            for(Contacto cont : temp.getValue()){
                st.append(String.format("\n%-20s", cont.toString()));
            }
        }
        
        return st.toString();
    }

    /**
     * Cuenta el total de contactos que hay en la agenda
     * Con el conjunto de claves
     * 
     * @return el nº total de contactos
     */
    public int totalContactos()
    {
        Set<Character> claves = agenda.keySet();
        int contador = 0;
        for(Character c : claves)
        {
            contador += agenda.get(c).size();

        }
        return contador;
    }

    /**
     * Cuenta el total de contactos personales que hay en la agenda
     * 
     * @return el nº total de contactos personales
     */
    public int totalContactosPersonales()
    {
        Set<Character> claves = agenda.keySet();
        int contador = 0;
        for(Character c : claves)
        {
            contador += totalPersonalesEnLetra(c);
        }
        return contador;
    }

    /**
     * Devuelve una colección List con los contactos personales en una letra
     *   
     */
    public List<ContactoPersonal> personalesEnLetra(char letra)
    {
        List<ContactoPersonal> aDevolver = new ArrayList<ContactoPersonal>();
        for(Contacto cp : agenda.get(letra)){
            if(cp instanceof ContactoPersonal)
                aDevolver.add((ContactoPersonal) cp);
        }
        return aDevolver;
    }

    /**
     * Cuenta los contactos personales en una colección List
     *   @return el nº total de contactos personales en la lista
     */
    public int totalPersonalesEnLetra(char letra)
    {
        int contador = 0;
        for(Contacto cp : agenda.get(letra)){
            if(cp instanceof ContactoPersonal)
                contador++;
        }
        return contador;
    }

    /**
     * Devuelve un array con los contactos profesionales de una letra
     * de la agenda ordenados alfabéticamente.  
     *  Hazlo obteniendo los contactos profesionales en una colección List, ordena
     *  esta colección, convierte la colección a un array y devuelve este array
     */
    public Contacto[] profesionalesOrdenadosPorNombre(char letra)
    {
        List<Contacto> aDevolver = new ArrayList<Contacto>();
        for(Contacto cp : agenda.get(Character.toUpperCase(letra))){
            if(cp instanceof ContactoProfesional)
                aDevolver.add(cp);
        }
        Collections.sort(aDevolver);
        Contacto[] tmp = new Contacto[aDevolver.size()];
        return aDevolver.toArray(tmp);
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

        List<ContactoPersonal> aDevolver = new ArrayList<ContactoPersonal>();
        for(Contacto cp : agenda.get(Character.toUpperCase(letra))){
            if(cp instanceof ContactoPersonal)
                aDevolver.add((ContactoPersonal) cp);
        }
        aDevolver.sort(new Comparator<ContactoPersonal>(){
                public int compare (ContactoPersonal uno, ContactoPersonal dos){

                    return uno.getFechaNacimiento().compareTo(dos.getFechaNacimiento());

                }
            });        
        
        Contacto[] tmp = new Contacto[aDevolver.size()];
        return aDevolver.toArray(tmp);
    }
    
    public void mostrar(){
        System.out.println(agenda.toString());
    }
} 
