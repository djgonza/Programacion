
/**
 * 
 */
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNumero extends JPanel
{
    private GuiCalculadora gui;
    private JLabel lblNumero;
    private JTextField txtNumero;

    /**
     * Constructor 
     */
    public PanelNumero(GuiCalculadora g)
    {
        this.gui = g;
        setLayout(new FlowLayout());
        setBorder(new TitledBorder("Introduzca números"));
        txtNumero = new  JTextField (50);
        txtNumero.addActionListener(new ActionListener (){
                public void actionPerformed (ActionEvent e)
                {
                    g.actualizar();
                }
            });

        this.add(txtNumero);

    }

    /**
     * limpia la cahja de texto y coge el foco
     */
    public void limpiar()
    {
        txtNumero.setText("");
        cogerFoco();
    }

    /**
     * el foco va a la caja de texto
     */
    public void cogerFoco()
    {
        txtNumero.requestFocus();
        txtNumero.selectAll();
    }

    /**
     * devuelve el valor tecleado en la caja de texto 
     * propaga la excepción que se puede producir
     */
    public int getNumero() throws NumberFormatException
    {
        return Integer.valueOf(txtNumero.getText());

    }
}
