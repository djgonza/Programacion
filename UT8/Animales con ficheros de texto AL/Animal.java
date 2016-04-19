
/**
 * Clase Animal 
 *  
 */

public abstract class Animal
{

    private String nombre;
    private int patas;
    private Persona due�o;

    /**
     * Constructor de la clase Figura
     */
    public Animal(String nombre, int patas, Persona due�o)
    {
        this.nombre = nombre;
        this.patas = patas;
        this.due�o = due�o;

    }

    /**
     * Accesor para el nombre
     */
    public  String getNombre()
    {
        return nombre;
    }

    /**
     *  Accesor para el n� de patas
     */
    public  int getNumeroPatas()
    {
        return patas;
    }

    /**
     *  Accesor para el due�o
     */
    public  Persona getDue�o()
    {
        return due�o;
    }

    /**
     *  todo animal emite un sonido
     */
    public abstract String emitirSonido();

    /**
     *  todo animal es capaz de comer
     */
    public abstract String comer();

    /**
     * @override
     */
    public  boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;

        if (this.getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return this.nombre.equalsIgnoreCase(animal.getNombre()) &&
        this.due�o.equals(animal.getDue�o());
    }

    /**
     * @override
     */
    public  int hashCode()
    {
        return nombre.hashCode() * 11 + patas + due�o.hashCode();
    }

    /**
     *   @override   
     */
    public String toString()
    {
        return "Tipo animal: " + this.getClass().getName() + "\n" +
            "Nombre animal: " +  nombre + "\n" +
            "Patas: " + patas + "\n" +
            "Datos del due�o\n" + 
            due�o.toString() + "\n";

    }
 

}
