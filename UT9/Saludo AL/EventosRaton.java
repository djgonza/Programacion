import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
/**
 *  class EventosRaton  
 * 
 * @author  
 * @version  
 */
public class EventosRaton implements MouseListener
{
    /**
     * Constructor de la clase EventosRaton
     */
    public EventosRaton()
    {

    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Press");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Relased");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }
}
