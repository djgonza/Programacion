
/**
 *  
 */
public class Gato extends Animal
{
    private String juguete;

    /**
     * Constructor  
     */
    public Gato(String nombre, int patas, Persona dueño, String juguete)
    {
        super(nombre, patas, dueño); //llamar al constructor de la superclase
        this.juguete = juguete;
    }

    /**
     * @accesor para el juguete  
     */
    public String getJuguete()
    {
        return juguete;
    }

    /**
     *  m  
     * @override     
     */
    public String emitirSonido()
    {
        return "Maullar";
    }

    /**
     *  
     * @override     
     */
    public String comer()
    {
        return "Raspas";
    }

    /**
     *  @override  
     */
    public String toString()
    {
        String s = super.toString();
        return s + "Juguete favorito: " + getJuguete() + "\n";

    }

        
}

