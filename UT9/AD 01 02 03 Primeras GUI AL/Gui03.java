import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Gui03 extends JFrame
{
    private JLabel lblEtiqueta;
    private JButton btnIcono;

    /**
     * Constructor de la clase Gui03
     */
    public Gui03(String nombre)
    {
        crearGui(nombre);
        mostrarGui();
    }

    /**    
     */
    private void crearGui(String nombre)
    {
        setLayout(new GridLayout(2, 1));
        setTitle(nombre);
        
        
        lblEtiqueta = new JLabel("Etiqueta", JLabel.CENTER);
        btnIcono = new JButton("Botón");
        btnIcono.setHorizontalTextPosition(SwingConstants.LEFT);
        lblEtiqueta.setIcon(new ImageIcon("die2.png"));
        btnIcono.setIcon(new ImageIcon("bug.png"));

        this.add(lblEtiqueta);
        this.add(btnIcono);
    }

    /**
     * 
     */
    private void mostrarGui()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(300, 200);
        pack();
        setLocation(100, 100);
    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui03("Titulo ventana");
    }
}
