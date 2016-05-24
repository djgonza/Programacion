
/**
 * 
 */
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel
{
    private GuiCalculadora gui;
    private JButton btnAceptar;
    private JButton btnClear;

    /**
     * Constructor 
     */
    public PanelBotones(GuiCalculadora g)
    {
        this.gui = g;
        setLayout(new GridLayout(1, 2, 2, 2));
        setBorder(new TitledBorder("Operaciones"));
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setMnemonic('a');

        btnAceptar.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e)
                {
                    g.actualizar();

                }
            });
        add(btnAceptar);

        btnClear = new JButton("Clear");
        add(btnClear);
        btnClear.setMnemonic('c');
           btnClear.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e)
                {
                    g.limpiar();
                }
            });
        add(btnClear);

    }

}
