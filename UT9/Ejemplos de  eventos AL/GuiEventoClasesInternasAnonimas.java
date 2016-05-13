/**
 * Clases internas anónimas como oyentes
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GuiEventoClasesInternasAnonimas extends JFrame 
{
    private JButton btnAceptar;
    private JButton btnSalir;
     private JButton btnEdad;

    /**
     * Constructor de la clase Gui03
     */
    public GuiEventoClasesInternasAnonimas()
    {
        super("Ejemplo eventos con clases internas anónimas");

        crearGui();
        mostrarGui();

               
    }

    /**
     *       
     */
    private void crearGui()
    {
        this.getContentPane().setLayout(new FlowLayout());

        btnAceptar = new JButton("Aceptar");
        //registrar oyente
       

        this.getContentPane().add(btnAceptar);

        btnSalir = new JButton("Salir");
        //registrar oyente
         

        this.getContentPane().add(btnSalir);
        
        btnEdad = new JButton("Edad");
        
        
        
        
        this.getContentPane().add(btnEdad);
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
        //setLocationRelativeTo(null);

        //centrar la ventana
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        int x = (ancho - this.getWidth()) / 2;
        int y = (alto - this.getHeight()) / 2;
        setLocation(x, y );

    }


    /**
     * Aceptar
     *
     * 
     */
    private void aceptar()
    {
        JOptionPane.showMessageDialog(this, "Pulsado botón Aceptar");
    }

    /**
     * Salir
     *
     * 
     */
    private void salir()
    {
        System.exit(0);
    }

    /**
     * Obtener edad
     *
     * 
     */
    private void obtenerEdad()
    {
        try
        {
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu edad", 
                        "Cuadro de diálogo petición edad", JOptionPane.INFORMATION_MESSAGE));
            String tmp = ",  eres";                                                          
            if (edad >= 18)
            {
                tmp += " mayor de edad";
            }
            else
            {
                tmp += " menor de edad";
            }

            JOptionPane.showMessageDialog(this, "Tienes " + edad + " años" + tmp);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Introduce una edad correcta");
        }

    }

    /**
     *  
     */
    public static void main(String[] args)
    {
        new GuiEventoClasesInternasAnonimas();
    }
}


