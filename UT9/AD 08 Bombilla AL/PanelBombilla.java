
/**
 *  clase PanelBombilla  
 * 
 * 
 */
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class PanelBombilla extends JPanel 
{

    private JButton btnOn;
    private JButton btnOff;
    private JLabel lblImagen;

    private Bombilla bombilla;

    /**
     * Constructor de la clase PanelBombilla
     */
    public PanelBombilla(Bombilla b)
    {
        this.bombilla = b;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.black);
        crearPanelSur();
        crearPanelCentro();

        // crea aquí los componentes y sitúalos en el panel

    }

    /**
     *  
     */
    public void crearPanelSur()
    {
        btnOn = new JButton("Encender");
        btnOn.addActionListener(new SwitchBombilla());
        btnOff = new JButton("Apagar");
        btnOff.addActionListener(new SwitchBombilla());
        JPanel sur = new JPanel();
        sur.add(btnOn);
        sur.add(btnOff);
        this.add(sur, BorderLayout.SOUTH);

    }

    /**
     *  
     */
    public void crearPanelCentro()
    {
        lblImagen = new JLabel();
        lblImagen.setIcon(bombilla.getImagen());
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(lblImagen, BorderLayout.CENTER);

    }

    private class SwitchBombilla implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()== btnOn)
                bombilla.encender();

            else if(e.getSource() == btnOff)

                bombilla.apagar();
            actualizarPanel();
        }

    }

    /**
     * 
     * Actualizamos la vista para que registre el
     * cambio en el modelo , la bombilla
     *      
     */
    private void actualizarPanel()
    { 

        lblImagen.setIcon(bombilla.getImagen());
    }

}
