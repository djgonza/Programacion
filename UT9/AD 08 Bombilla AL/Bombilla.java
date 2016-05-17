 
/** 
 * El modelo, representa a una bombilla
 */
import javax.swing.ImageIcon;

public class Bombilla
{
    
    private boolean encendida;

    /**
     * Constructor de la clase Bombilla
     */
    public Bombilla()
    {
         encendida = false;
    }

    /**
     *    
     */
    public void encender()
    {
         encendida = true;
    }
    
      /**
     *    
     */
    public void apagar()
    {
         encendida = false;
    }
    /**
     *  
     *       
     */
    public boolean estaEncendida()
    {
         return encendida;
    }
    
    /**
     * Obtener imagen de la bombilla
     */
   public ImageIcon getImagen()
    {
         if (estaEncendida())
              return new ImageIcon("images/encendida.gif");
          return new ImageIcon("images/apagada.gif");
    }
    
    
}
