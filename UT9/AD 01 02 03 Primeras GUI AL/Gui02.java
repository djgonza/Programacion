import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;


public class Gui02 extends JFrame
{
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblNota;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtNota;

    /**
     * Constructor de la clase Gui02
     */
    public Gui02(String titulo)
    {
        super(titulo);

        crearGui();
        mostrarGui();

    }

    /**
     *     
     */
    private void crearGui()
    {
        this.setLayout(new GridLayout(3, 3, 5, 5));
        setBackground(Color.WHITE);

        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblNota = new JLabel("Nota");

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtNota = new JTextField();

        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNota.setHorizontalAlignment(SwingConstants.RIGHT);

        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblApellido);
        this.add(txtApellido);
        this.add(lblNota);
        this.add(txtNota);



    }

    /**
     * 
     */
    private void mostrarGui()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(300, 200);
        this.pack();
        setLocation(100, 100);
    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui02("Gui ejercicio 2");
    }
}
