
/**
 *  
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
public class Gui06GrupoPaneles extends JFrame
{
    private JRadioButton rbtUno;
    private JRadioButton rbtDos;
    private JRadioButton rbtTres;
    private JCheckBox cbxUno;
    private JCheckBox cbxDos;
    private JPanel pnlUno;
    private JPanel pnlDos;
    private JPanel pnlTres;

    /**
     * Constructor de la clase PanelDibujo
     */
    public Gui06GrupoPaneles()
    {
        super("GUI con Paneles ");
        crearGui();
        mostrarGui();

    }

    /**
     *    
     */
    private void crearGui()
    {
        setLayout(new GridLayout(3,1));
        Border borde = BorderFactory.createLineBorder(Color.white, 3);
        pnlUno = new JPanel();
        pnlUno.setBorder(BorderFactory.createTitledBorder(borde, "Panel verde"));
        pnlUno.setBackground(Color.GREEN);
        rbtUno = new JRadioButton();
        rbtDos = new JRadioButton();
        rbtTres = new JRadioButton();
        
        pnlUno.add(rbtUno);
        pnlUno.add(new JLabel("uno"));
        pnlUno.add(rbtDos);
        pnlUno.add(new JLabel("dos"));
        pnlUno.add(rbtTres);
        pnlUno.add(new JLabel("tres"));
        this.add(pnlUno);

        pnlDos = new JPanel();
        pnlDos.setBorder(BorderFactory.createTitledBorder(borde, "Panel rojo"));
        pnlDos.setBackground(Color.RED);
        cbxUno = new JCheckBox();
        cbxDos = new JCheckBox();
        pnlDos.add(cbxUno);
        pnlDos.add(new JLabel("Casilla Uno"));
        pnlDos.add(cbxDos);
        pnlDos.add(new JLabel("Casilla Dos"));
        this.add(pnlDos);
        
        pnlTres = new JPanel();
        pnlTres.setBorder(BorderFactory.createTitledBorder(borde, "Panel azul"));
        pnlTres.setBackground(Color.BLUE);
        this.add(pnlTres);

    }

    /**
     * 
     */
    private void mostrarGui()
    {
        setLocation(150, 150);
        this.pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui06GrupoPaneles();
    }
}
