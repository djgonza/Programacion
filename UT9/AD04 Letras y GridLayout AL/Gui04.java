import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.util.Scanner;

public class Gui04 extends JFrame
{

    /**
     * Constructor de la clase Gui04
     */
    public Gui04()
    {
        super("Ejemplo 4 Botones y GridLayout ");

        crearGui();
        mostrarGui();
    }

    /**  
     * 
     */
    private void crearGui()
    {
       this.setLayout(new GridLayout(5,6));
       String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       
       for (char c: abc.toCharArray())
       {
           this.add(new JButton("" + c));
       }
        
        

    }
    
    
    /**
     * 
     */
    private void mostrarGui()
    {
        centrarVentana();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
         
    }

    /**
     * 
     */
    private void centrarVentana()
    {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        int x = (ancho - this.getWidth()) / 3;
        int y = (alto - this.getHeight()) / 3;
        setLocation(x, y );
    }
    
         /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui04();
    }
}

