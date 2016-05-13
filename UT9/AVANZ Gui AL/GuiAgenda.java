import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

/**
 *  Interfaz gráfico para la agenda
 */
public class GuiAgenda extends JFrame
{

    private JMenuItem itmBuscarPorNombre;
    private JMenuItem itmBuscar;
    private JMenuItem itmFelicitacion;
    private JMenuItem itmSalir;

    private JButton btnAdd;
    private JButton btnListar;
    private JButton btnClear;
    private JButton btnSalir;

    private JTextArea areaTexto;

    /**
     * Constructor de la clase GuiAgenda
     */
    public GuiAgenda()
    {

        crearGui();
        mostrarGui();
    }

    /**
     *  
     */
    private void crearGui()
    {
        JMenuBar barraMenu = crearMenu();
        this.setJMenuBar(barraMenu);
        this.add(crearPanelLetras(), BorderLayout.NORTH);
        this.add(crearPanelBotones(), BorderLayout.EAST);

    }

    /**
     *  
     */
    private JPanel crearPanelLetras()
    {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        JPanel letras = new JPanel();
        letras.setLayout(new GridLayout(2, 15));
        for(char c: abc.toCharArray())
        {
            JButton tmp = new JButton("" + c);
            letras.add(tmp);

        }

        return letras;
    }

    /**
     *  
     */
    private JMenuBar crearMenu()
    {
        JMenuBar barra = new JMenuBar();

        JMenu menuAccion = new JMenu("Operaciones");

        itmBuscarPorNombre = new JMenuItem("Buscar contacto por nombre");
        itmBuscar = new JMenuItem("Buscar contacto");
        itmFelicitacion = new JMenuItem("Felicitar");
        itmSalir = new JMenuItem("Salir");

        menuAccion.add(itmBuscarPorNombre);
        menuAccion.add(itmBuscar);
        menuAccion.add(itmFelicitacion);
        menuAccion.add(itmSalir);

        barra.add(menuAccion);

        return barra;
    }

    /**
     *  
     */
    private JPanel crearPanelBotones()
    {
        JPanel este = new JPanel();
        JPanel pnlFlow = new JPanel();
        este.setLayout(new FlowLayout());
        pnlFlow.setLayout(new GridLayout(4,1,5,5));

        btnAdd = new JButton("Add");
        btnListar = new JButton("Listar");
        btnClear = new JButton("Clear");
        btnSalir = new JButton("Salir");

        pnlFlow.add(btnAdd);
        pnlFlow.add(btnListar);
        pnlFlow.add(btnClear);
        pnlFlow.add(btnSalir);

        este.add(pnlFlow);

        return este;
    }

    /**
     *  
     */
    private void mostrarGui()
    {
        setTitle("Agenda de contactos");
        setVisible(true);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     *  
     */
    public static void main(String[] args)
    {

        GuiAgenda gui = new GuiAgenda( );
    }

}
