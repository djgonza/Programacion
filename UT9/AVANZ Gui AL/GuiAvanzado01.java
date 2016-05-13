import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
public class GuiAvanzado01 extends JFrame  
{
    private JMenuItem menuNuevo;
    private JMenuItem menuAbrir;
    private JMenuItem menuSalir;
    private JTextArea areaTextoIzda;
    private JTextArea areaTextoDcha;
    private JButton btnNueva;
    private JButton btnFlechaPunteada;
    private JButton btnCompilar;
    private JTextArea areaUno;
    private JTextArea areaDos;

    /**
     * Constructor de la clase Gui01
     */
    public GuiAvanzado01()
    {
        super("Ejercicio Avanzado 1 de GUI en Java");
        crearGui();
        mostrarGui();

    }

    /**
     *  crear la barra de menú y los componentes y situarlos en el contenedor
     *  del frame
     */
    private void crearGui()
    {
        this.setJMenuBar(crearMenuBarra());

        this.add(crearPanelSur(), BorderLayout.SOUTH);
        this.add(crearPanelOeste(), BorderLayout.WEST);
        this.add(crearPanelCentro(), BorderLayout.CENTER);

    }
    /**
     *  
     *  
     */
    private JMenuBar crearMenuBarra()
    {
        JMenuBar barra = new JMenuBar();

        JMenu menuAccion = new JMenu("Proyecto");

        menuNuevo = new JMenuItem("Nuevo");
        menuAbrir = new JMenuItem("Abrir");
        menuSalir = new JMenuItem("Salir");
        menuAccion.add(menuNuevo);
        menuAccion.add(menuAbrir);
        menuAccion.add(menuSalir);

        barra.add(menuAccion);

        return barra;
    }

    /**
     *  
     *  
     */
    private JPanel crearPanelSur()
    {
        JPanel sur = new JPanel();
        sur.setLayout(new BorderLayout());
        areaTextoIzda = new JTextArea(6,40);
        areaTextoDcha = new JTextArea(6,20);
        Border borde = BorderFactory.createLineBorder(Color.black, 1);
        areaTextoIzda.setBorder(borde);
        areaTextoDcha.setBorder(borde);

      
        sur.add(areaTextoIzda, BorderLayout.CENTER);
        sur.add(areaTextoDcha, BorderLayout.EAST);

        return sur;
    }
    
    
    /**
     *  
     *  
     */
    private JPanel crearPanelCentro()
    {
        JPanel centro = new JPanel();
        Border borde = BorderFactory.createLineBorder(Color.black, 1);
        centro.setBorder(borde);
      

        return centro;
    }


    /**
     *  
     *  
     */
    private JPanel crearPanelOeste()
    {
        JPanel oeste = new JPanel();
        JPanel pnlFlow = new JPanel();
        oeste.setLayout(new FlowLayout());
        pnlFlow.setLayout(new GridLayout(3,1,5,5));

        btnNueva = new JButton("Nueva");
        btnFlechaPunteada = new JButton("--->");
        btnCompilar = new JButton("Compilar");

        pnlFlow.add(btnNueva);
        pnlFlow.add(btnFlechaPunteada);
        pnlFlow.add(btnCompilar);
        oeste.add(pnlFlow);

        return oeste;

    }

    /**
     * 
     */
    public  void mostrarGui()
    {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 100);
        setSize(700, 500);
        //this.pack();

    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new GuiAvanzado01();
    }

}
