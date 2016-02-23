import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

/**
 * Un map que asocia nombres de paises con el conjunto de  idiomas que se hablan en ellos
 * Se quiere recuperar los nombres de los paises ordenados alfabéticamente
 * Se quiere recuperar los nombres de los idiomas ordenados alfabéticamente
 * 
 * Define el atributo mapPaises de forma adecuada
 */
public class MapPaises
{
    private TreeMap<String, TreeSet<String>> paises;

    /**
     * Constructor  
     */
    public MapPaises()
    {
        paises = new TreeMap<>();

    }

    /**
     *  añade un país (siempre en mayúsculas) y el idioma asociado
     *  Si la clave ya existe se añade el idioma al conjunto de idiomas del país
     *  Si la clave no existe se añade una nueva entrada con el pais y el conjunto
     *  formado por idioma
     */
    public void add(String pais, String idioma)
    {
        pais = pais.toUpperCase();
        idioma = idioma.toLowerCase();
        TreeSet<String> idiomas = paises.get(pais);
        //if(sinonimos.equals(null)){
        if(idiomas == null){
            idiomas = new TreeSet<>();
            idiomas.add(idioma);
        }else{
            idiomas.add(idioma);
        }

        paises.put(pais, idiomas);
    }

    /**
     *  Devuelve el conjunto de idiomas que hablan en el pais indicado
     *  
     *
     */
    public TreeSet<String> idiomasQueHablanEn(String pais)
    {
        return paises.get(pais);
    }

    /**
     *  Devuelve cuántos idiomas hablan en el pais indicado
     *  0 si el pais no existe 
     *
     */
    public int totalIdiomasQueHablanEn(String pais)
    {
        TreeSet<String> idiomas = paises.get(pais);
        if(idiomas == null)
            return 0;
        return idiomas.size();
        //return idiomas == null ? 0 : idiomas.size();
    }

    /**
     *  Representación textual del map de la forma
     *  Pais = {idioma1, idioma2, ....}
     *  Usa StringBuilder para las concatenaciones
     *  Para iterar sobre el map usa el conjunto de entradas y un for mejorado
     */
    public String  toString()
    {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String,TreeSet<String>>> paisesEntradas = paises.entrySet();
        for(Map.Entry<String,TreeSet<String>> entrada: paisesEntradas){
            sb.append(entrada.getKey()).append(" = ");
            for(String idioma: entrada.getValue()){
                sb.append(idioma).append(", ");
            }
        }
        System.out.println(paises.toString());
        return sb.toString();
    }

    /**
     *  Conjunto de paises en los que se habla el idioma indicado
     *  Importa el orden en el conjunto devuelto
     *  Usa el conjunto de claves y un iterador
     */
    public TreeSet<String> paisesQueHablanIdioma(String idioma)
    {

        Iterator<String> it = paises.keySet().iterator();
        TreeSet<String> paisesHablan = new TreeSet<>();
        while(it.hasNext()){
            String nombrePais = it.next();
            if(paises.get(nombrePais).contains(idioma.toLowerCase()))
                paisesHablan.add(nombrePais);
        }
        return paisesHablan;
    }

    /**
     *  Dados dos países devuelve el conjunto de idioma/s comunes que se hablan en ellos
     *  Si no hay devuelve el conjunto vacío. Si los países no existen también se devuelve 
     *  conjunto vacío
     *
     */
    public TreeSet<String>  idiomasComunes(String pais1, String pais2)
    {
        TreeSet<String> idiomasComunes = new TreeSet<>();
        
        pais1 = pais1.toUpperCase();
        pais2 = pais2.toUpperCase();
        
        if(paises.get(pais1) == null || paises.get(pais2) == null)
            return idiomasComunes;

        for(String idioma1: paises.get(pais1)){

            for(String idioma2: paises.get(pais2)){

                if(idioma1.equals(idioma2)){
                    idiomasComunes.add(idioma1); 
                }

            }

        }

        return idiomasComunes;
    }

    /**
     *  
     *
     */
    public void printPaises()
    {
        System.out.println(this.toString());
    }
}
