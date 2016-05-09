/**
 *   
 * 
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

public class EjemploBoxLayout extends JFrame
{
    private static final int ANCHO = 500;
    private static final int ALTO = 200;

    /**
     * Constructor de la clase BorderLayout
     */
    public EjemploBoxLayout()
    {   
        crearGui(); 
        mostrarGui();        
    }

    /**
     * 
     *  Aquí creo los componentes que añadiré a la GUI
     *       
     */
    private void crearGui()
    {
        JPanel pnlCentral = crearPanelCentral();
        this.add(pnlCentral, BorderLayout.CENTER);

        JPanel pnlSur = crearPanelSur();
        this.add(pnlSur, BorderLayout.SOUTH);

    }

    /**
     * El  panel central tiene un FlowLayout
     * que incluye dos paneles BoxLayout alineados en vertical
     *   
     *       
     */
    private JPanel crearPanelCentral()
    {
        JPanel pnlCentral = new JPanel();

        JPanel pnlCelsius = new JPanel();
        pnlCelsius.setLayout(new BoxLayout(pnlCelsius, BoxLayout.Y_AXIS));
        pnlCelsius.add(new JLabel("Celsius"));
        pnlCelsius.add(new JTextField(15));

        JPanel pnlFarenheit = new JPanel();
        pnlFarenheit.setLayout(new BoxLayout(pnlFarenheit, BoxLayout.Y_AXIS));
        pnlFarenheit.add(new JLabel("Farenheit"));
        pnlFarenheit.add(new JTextField(15));

        pnlCentral.add(pnlCelsius);
        pnlCentral.add(pnlFarenheit);

        return pnlCentral;
    }

    /**
     * El  panel sur tiene un BoxLayout alineado horizontalmente
     *  
     *   
     *       
     */
    private JPanel crearPanelSur()
    {
        JPanel pnlSur = new JPanel();         
        pnlSur.setLayout(new BoxLayout(pnlSur, BoxLayout.X_AXIS));
        pnlSur.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        pnlSur.add(Box.createHorizontalGlue());      
        pnlSur.add(new JButton("Reset"));
        pnlSur.add(Box.createRigidArea(new Dimension(10, 00)));
        pnlSur.add(new JButton("Salir"));

        return pnlSur;
    }

    /**
     * 
     *  Aquí establezco título, tamaño
     *  posición y muestro la GUI
     *       
     */
    private void mostrarGui()
    {
        this.setTitle("Ejemplo BorderLayout"); // establecer título de la aplicación

        this.setSize(ANCHO, ALTO); // ancho y alto de la ventana
        //this.setLocation(100, 100); // posición x,y en la pantalla de la ventana
        this.setLocationRelativeTo(null); //centrar la ventana
        // this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //al cerrar la ventana acabar la aplicación
        this.setVisible(true); //hacer visible la ventana
    }

}
