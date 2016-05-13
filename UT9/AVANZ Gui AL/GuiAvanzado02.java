import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox; 
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.KeyStroke;

public class GuiAvanzado02 extends JFrame  
{
    private JTextField txtPrinter;
    private JTextField txtConsole;
    private JCheckBox cbxToFile;
    private JCheckBox cbxSide;
    private JRadioButton rbtSeleccion;
    private JRadioButton rbtAll;
    private JButton btnOk;
    private JButton btnCancel;
    private JButton btnSetup; 
    private JButton btnHelp;
    private JComboBox cmbCalidad;

    /**
     * Constructor de la clase Gui01
     */
    public GuiAvanzado02()
    {
        super("Ejercicio Avanzado 2 de GUI - Panel de control de impresión");
        crearGui();
        mostrarGui();

    }

    /**
     *   
     */
    private void crearGui()
    {
         

    }

   

    /**
     * 
     */
    public  void mostrarGui()
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 100);
        setSize(500, 250);
        //this.pack();
        
        setVisible(true);

    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new GuiAvanzado02();
    }

}
