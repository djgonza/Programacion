import java.util.HashSet;
/**
 * La clase mantiene informaci�n sobre un estudiante
 * 
 */

public class Persona 
{
    private String nombre;
    private HashSet<String> hobbies;

    /**
     * constructor para los objetos de la clase Persona
     */
    public Persona(String nombre)
    {
        this.nombre = nombre;
        hobbies = new HashSet<>();

        
    }

    /**
     * Accesor para el nombre   
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param h a�ade el nuevo hobbie
     * en min�sculas
     */
    public void addHobbie(String h)
    {
        hobbies.add(h.toLowerCase());

    }

    /**
     * @param h el nombre del hobbie a comprobar
     * @return true si tiene ese hobbie
     */
    public boolean tieneHobbie(String h)
    {
        return hobbies.contains(h);
    }

    /** 
     * Devuelve el conjunto de hobbies como un String
     */
    public String hobbiesToString()
    {
        StringBuilder sb = new StringBuilder();
        for(String h : hobbies)
        {
            sb.append("\t");
            sb.append(h);
            sb.append("\n");
        }
        return sb.toString();   
    }

    /** 
     * Devuelve una representaci�n de la persona
     * Su nombre y su conjunto de hobbies como un String
     */
    public String toString()
    {
        return nombre + "\n" + hobbiesToString();

    }

}
