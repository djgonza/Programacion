import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;

public class Gui01 extends JFrame  
{
    private JLabel lblSaludo;
    private JButton btnAceptar;
    private JButton btnSalir;
    private JTextField txtDato;
    private JTextArea areaTexto;

    /**
     * Constructor de la clase Gui01
     */
    public Gui01()
    {
        super("Ejercicio 1 de GUI en Java");
        crearGui();
        mostrarGui();

    }

    /**
     *    
     */
    private void crearGui()
    {
        this.setLayout(new BorderLayout(5, 5));
        setBackground(Color.RED);

      
    }

    /**
     * 
     */
    public  void mostrarGui()
    {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 100);
        this.pack();

    }
 

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui01();
    }

}
