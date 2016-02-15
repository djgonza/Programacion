
/**
 *  La clase representa a un conjunto de nombres
 *  
 */
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class ConjuntoNombres
{

    private LinkedHashSet<String> nombres;

    /**
     * Constructor  
     */
    public ConjuntoNombres()
    {
        nombres = new LinkedHashSet<>();

    }

    /**
     * Añade un nombre al conjunto
     */
    public  void addNombre(String nombre)
    {
        nombres.add(nombre);

    }

    /**
     * Borrar un nombre al conjunto
     */
    public  void borrarNombre(String nombre)
    {
        nombres.remove(nombre);

    }

    /**
     *  Devuelve true si el conjunto contiene a nombre
     *
     */
    public boolean estaNombre(String nombre)
    {

        return nombres.contains(nombre);

    }

    /**
     *  
     * Nº de nombres (elementos del conjunto)
     */
    public int totalNombres()
    {
        return nombres.size();
    }

    /**
     *  Obtiene un nuevo conjunto de nombres, la unión
     *  del atributo nombres y del parámetro otro
     *  (el conjunto original nombres no se modifica)
     *
     */
    public LinkedHashSet<String> union(LinkedHashSet<String> otro)
    {
        LinkedHashSet<String> nuevo = new LinkedHashSet<String>();
        nuevo.addAll(otro);
        return otro;
    }

    /**
     *  Obtiene un nuevo conjunto de nombres, la intersección (los nombres comunes)
     *  del atributo nombres y del parámetro otro
     *  (el conjunto original nombres no se modifica)
     *
     */
    public LinkedHashSet<String> interseccion(LinkedHashSet<String> otro)
    {
        LinkedHashSet<String> nuevo = new LinkedHashSet<String>();
        nuevo.retainAll(otro);
        return otro;
    }

    /**
     *  Obtiene un nuevo conjunto de nombres, la diferencia  
     *  del conjunto nombres y del conjunto  otro 
     *  (el conjunto original nombres no se modifica)
     *
     */
    public LinkedHashSet<String> diferencia(LinkedHashSet<String> otro)
    {
        LinkedHashSet<String> nuevo = new LinkedHashSet<String>();
        nuevo.removeAll(otro);
        return otro;
    }

    /**
     * Mostrar todos los nombres con iterador
     */
    public  void escribirConjunto()
    {
       

    }

    /**
     * Mostrar todos los nombres con for mejorado
     */
    public  void escribirConjuntoConFor()
    {
         for(String nombre: nombres)
        {
            System.out.println(nombre);
        }

    }

}
