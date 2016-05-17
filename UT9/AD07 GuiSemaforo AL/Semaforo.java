import java.awt.Color;
/**
 * Modela un Semaforo  
 *  
 */
public class Semaforo
{

    private Color c;
    private int color;

    /**
     * Constructor de la clase Semaforo
     */
    public Semaforo()
    {
        c = Color.RED;
        color = 0;
    }

    /**
     *  
     * Obtener el color del semáforo
     */
    public Color getColor()
    {
        return c;
    }

    /**
     * 
     *  Actualizar color del semáforo
     */
    public void avanzar()
    {
        //         if(color == 0){
        //             c = Color.yellow;
        //             color = 1;
        //         }
        //          if(color == 1){
        //             c = Color.green;
        //             color = 2;
        //         }
        //          if(color == 2){
        //             c = Color.red;
        //             color = 0;
        //         }

        if(c.equals(Color.RED))
            c = Color.yellow;
       else  if(c == Color.yellow)
            c = Color.green;
        else if(c == Color.green)
            c = Color.red;

    }

    /**
     * 
     *  Cambiar el color   
     */
    public void setColor(Color c)
    {
        this.c = c;
    }

    /**
     *   
     */
    public String toString()
    {
        return c.toString();
    }

}
