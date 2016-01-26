
/**
 * Enumeration class ColorSemaforo - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ColorSemaforo
{
    ROJO (90), VERDE(50), AMARILLO(10);
    
    private int segundos;
    private ColorSemaforo(int segundos)
    {
        this.segundos = segundos;
    }
    
    /**
     *  
     */
    public int getSegundos()
    {
        return segundos;
    }

}
