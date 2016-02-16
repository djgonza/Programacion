import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
/**
 *  Clase de utilidades. Contiene solo métodos
 *  estáticos
 *  
 */

public class UtilsString
{
    /**
     *  Dada una cadena obtiene y devuelve su conjunto de caracteres
     *  Importa el orden en el conjunto
     *
     */
    public static TreeSet<Character> getConjuntoCaracteres(String cadena)
    {
        TreeSet<Character> nuevo = new TreeSet<Character>();
        for(int i = 0; i < cadena.length(); i++)
        {
            nuevo.add(cadena.charAt(i));
        }
        return nuevo;

    }

    /**
     *  Dada una cadena obtiene su conjunto de caracteres numéricos
     *  No importa el orden en el conjunto
     *  
     *  Usa algún método de la clase Character  para comprobar si un caracter es  
     *  numérico o no
     *
     */
    public static  HashSet<Character> getConjuntoDigitos(String cadena)
    {
        HashSet<Character> nuevo = new HashSet<Character>();
        for(int i = 0; i < cadena.length(); i++)
        {
            if(Character.isDigit(cadena.charAt(i)))
            nuevo.add(cadena.charAt(i));
        }
        return nuevo;


    }

    /**
     *  Dada una cadena obtiene su conjunto de letras mayúsculas
     *  en el orden en el que aparecen   en la cadena
     *   
     *
     */
    public static LinkedHashSet<Character> getConjuntoMayusculas(String cadena)
    {
        LinkedHashSet<Character> nuevo = new LinkedHashSet<Character>();
        for(int i = 0; i < cadena.length(); i++)
        {
            if(Character.isUpperCase(cadena.charAt(i)))
            {
                nuevo.add(cadena.charAt(i));
            }
            
        }
        return nuevo;

    }

}
