
/**
 * 
 */
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel
{
    private GuiCalculadora gui;
    private JTextField txtNumeros;
    private JTextField txtMedia;
    private JTextField txtMinimo;
    private JTextField txtMaximo;

    /**
     * Constructor 
     */
    public PanelResultado(GuiCalculadora gui)
    {
        this.gui = gui;
        setLayout(new GridLayout(4, 2, 2, 2));

        txtNumeros = new JTextField();
        txtNumeros.setEditable(false);

        txtMedia = new JTextField();
        txtMedia.setEditable(false);

        txtMinimo = new JTextField();
        txtMinimo.setEditable(false);

        txtMaximo = new JTextField();
        txtMaximo.setEditable(false);

        this.add(new JLabel("Total números", JLabel.RIGHT));
        this.add(txtNumeros);
        
        this.add(new JLabel("Media", JLabel.RIGHT));
        this.add(txtMedia);

        this.add(new JLabel("Minimo", JLabel.RIGHT));
        this.add(txtMinimo);

        this.add(new JLabel("Máximo", JLabel.RIGHT));
        this.add(txtMaximo);

    }

    /**
     * limpia las cajas de texto donde se han mostrado los resultados
     */
    public void limpiar()
    {
        txtNumeros.setText("");
        txtMedia.setText("");
        txtMinimo.setText("");
        txtMaximo.setText("");

    }

    /**
     * muestra en las cajas de texto  los resultados
     */
    public void mostrar(int cant, double med, int min, int max)
    {
        txtNumeros.setText(String.valueOf(cant));
        txtMedia.setText(String.valueOf(med));
        txtMinimo.setText(String.valueOf(min));
        txtMaximo.setText(String.valueOf(max));
    }
}
