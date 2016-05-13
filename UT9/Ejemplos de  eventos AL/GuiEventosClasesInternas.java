/**
 * Gestión de eevntos con clases internas
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GuiEventosClasesInternas extends JFrame 
{
    private JButton btnAceptar;
    private JButton btnSalir;
    private JButton btnEdad;

    /**
     * Constructor de la clase Gui03
     */
    public GuiEventosClasesInternas()
    {
        super("Ejemplo eventos con clases internas");

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
      
        
        this.getContentPane().add(btnAceptar);

        btnSalir = new JButton("Salir");
       
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
        // setSize(300, 200);
        this.pack();
        setLocation(200, 200);

    }
//     /**
//      * clase interna
//      */
//     private class OyenteAceptar implements ActionListener
//     {
//         
//         public void actionPerformed(ActionEvent e)
//         {
//             aceptar();
//         }
//         
//        
// 
//     }

//     /**
//      * clase interna
//      */
//     private class OyenteSalir implements ActionListener
//     {
//         public void actionPerformed(ActionEvent e)
//         {
//             salir();
//         }
//     }

//     private class OyenteEdad implements ActionListener
//     {
//         public void actionPerformed(ActionEvent e)
//         {
//             obtenerEdad();
//         }
//     }

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
        new GuiEventosClasesInternas();
    }

}

