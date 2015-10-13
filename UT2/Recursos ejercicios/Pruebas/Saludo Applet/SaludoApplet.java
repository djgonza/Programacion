
import java.awt.*;
import javax.swing.*;

/**
 * Class SaludoApplet 
 * 
 * @author 
 * @version 
 */
public class SaludoApplet extends JApplet
{
    
     /**
     * 
     * init() es llamado por el navegador o appletviewer para informar 
     * de que el applet ha sido cargado. Se ejecuta antes que el m�todo start()
     */
    public void init()
    {  
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    }

    /**
     * 
     *  start() es llamado por el navegador o appletviewer para informar 
     * de que el applet ha comenzado su ejecuci�n. Se ejecuta despu�s
     * del m�todo init() y cada vez que el applet se vuelve a visitar
     * en una p�gina web
     */
    public void start()
    {
       

    }

    /** 
     *  stop() es llamado por el navegador o appletviewer para informar 
     * de que el applet debe parar su ejecuci�n. Se ejecuta despu�s
     * de que la p�gina web que contiene el applet haya sido reemplazada por 
     * otra y justo antes de que el applet sea destruido
     */
    public void stop()
    {
    
    }

    /**
     * 
     *  destroy() es llamado por el navegador o appletviewer para informar 
     * de que el applet debe liberar los recursos que ha utilizado y ser destruido
     */
    public void destroy()
    {
        
    
    }

    
    /**
     * m�todo paint() para el applet
     * 
     * @param  g   el objeto Graphics
     */
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.setFont(new Font("Georgia", Font.BOLD, 24));
        g.drawString("Bienvenido a la POO en Java ", 20, 20); 
        g.drawString("usando BlueJ", 20, 50);
    }


    
}



