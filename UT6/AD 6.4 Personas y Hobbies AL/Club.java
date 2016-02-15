import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 */

public class Club
{

    private ArrayList<Persona> personas;

    /**
     * Constructor de la clase Club
     */
    public Club()
    {
        personas = new ArrayList<>();

    }

    /**
     * @param nombre el nombre de la persona que se añade
     * @param hob el conjunto de hobbies de la persona a añadir
     */
    public void addPersona(String nombre, HashSet<String> hob)
    {
        Persona nueva = new Persona(nombre);
        for(String h : hob)
        {

            
            nueva.addHobbie(h);
        }
        personas.add(nueva);

    }
    
    /**
     * 
     * @param  cual el hobbie a comprobar
     * @return  el nº de personas del club que tienen ese hobbie   
     */
    public int personasConHobbie(String cual)
    {
        int cont = 0;
        for(Persona p : personas){
            if(p.tieneHobbie(cual))
                cont ++;
        }
        return cont;
    }

    /**
     * visualiza la lista de personas
     */

    public void printClub()
    {
        for(Persona p : personas)
        {
            System.out.println(p.toString() + "\n");
        }

    }

    /**
     * Borra de la lista las persona con un determinado hobbie
     * y las añade en el conjunto a devolver
     * Usa un iterador
     * 
     * @param  cual el hobbie a comprobar
     * @return el conjunto de nombres de personas con ese hobbie
     */

    public HashSet<String> borrarPersonasConHobbie(String cual)
    {
        Iterator<Persona> it = personas.iterator();
        HashSet<String> aux = new HashSet<>();
        while(it.hasNext())
        {
            Persona p = it.next();
            if(p.tieneHobbie(cual))
            {
                aux.add(p.getNombre());
                it.remove();
            }
            
        }
        return aux;
    }
    
    public static void main(String[] args){
       Club demo = new Club();
       HashSet<String> hob = new HashSet<>();
       hob.add("comer");
       hob.add("programar");
       hob.add("ir al cine");
       hob.add("patinar");
       demo.addPersona("pepe",hob);
       
       hob.clear();
       hob.add("dormir");
       hob.add("programar");
       hob.add("cantar");
       hob.add("ir de compras");
       
       demo.addPersona("ana", hob);
       demo.printClub();
       System.out.println(demo.borrarPersonasConHobbie("cantar").toString());
       demo.printClub();
    }

}
