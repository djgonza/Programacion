
/**
 * Clase Animal 
 *  
 */

public abstract class Animal
{

    private String nombre;
    private int patas;
    private Persona dueño;

    /**
     * Constructor de la clase Figura
     */
    public Animal(String nombre, int patas, Persona dueño)
    {
        this.nombre = nombre;
        this.patas = patas;
        this.dueño = dueño;

    }

    /**
     * Accesor para el nombre
     */
    public  String getNombre()
    {
        return nombre;
    }

    /**
     *  Accesor para el nº de patas
     */
    public  int getNumeroPatas()
    {
        return patas;
    }

    /**
     *  Accesor para el dueño
     */
    public  Persona getDueño()
    {
        return dueño;
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
        this.dueño.equals(animal.getDueño());
    }

    /**
     * @override
     */
    public  int hashCode()
    {
        return nombre.hashCode() * 11 + patas + dueño.hashCode();
    }

    /**
     *   @override   
     */
    public String toString()
    {
        return "Tipo animal: " + this.getClass().getName() + "\n" +
            "Nombre animal: " +  nombre + "\n" +
            "Patas: " + patas + "\n" +
            "Datos del dueño\n" + 
            dueño.toString() + "\n";

    }
 

}
