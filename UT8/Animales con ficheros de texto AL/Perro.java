
/**
 *  
 */
public class Perro extends Animal
{
    private String lugarFavorito;

    /**
     * Constructor  
     */
    public Perro(String nombre, int patas, Persona dueño, String lugar)
    {
        super(nombre, patas, dueño); //llamar al constructor de la superclase
        lugarFavorito = lugar;
    }

    /**
     * accesoir para el lugar    
     */
    public String getLugar()
    {
        return lugarFavorito;
    }

    /** 
     * @override     
     */
    public String emitirSonido()
    {
        return "Ladrar";
    }

    /** 
     * @override     
     */
    public String comer()
    {
        return "Huesos";
    }

    /**
     *   @override       
     */
    public String toString()
    {
        String s = super.toString();
        return s + "Lugar favorito: " + getLugar() + "\n";

    }

        
}
