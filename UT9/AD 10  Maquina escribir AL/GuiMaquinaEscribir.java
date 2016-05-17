import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
/**
 *  
 */
public class GuiMaquinaEscribir extends JFrame 
{
    private JPanel pnlTeclado;
    private JPanel pnlTexto;
    private JTextField txtLetras;

    private MaquinaEscribir maquina; //el modelo

    /**
     * Constructor de la clase Gui04
     */
    public GuiMaquinaEscribir(MaquinaEscribir m)
    {
        super("Máquina de escribir ");

        maquina = m;

        crearGui();
        mostrarGui();

    }

    /** 
     * 
     */
    private void crearGui()
    {
        crearPanelLetras();
        crearCajaTexto();
    }
    
    /**
     *  
     */
    public void crearCajaTexto()
    {
        JPanel tmp = new JPanel();
        tmp.setBorder(new TitledBorder("Texto"));
        
    }


    private void crearPanelLetras()
    {
        JPanel tmp = new JPanel();
        tmp.setLayout(new GridLayout(4,7));
        tmp.setBorder(new TitledBorder("Teclado"));
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(Character c : abc.toCharArray())
        {
            JButton jb = new JButton("" + c);
            jb.addActionListener(new  ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        ((JButton) e.getSource()).getText();
                    }
                });
            tmp.add(jb);
        }

        JButton jbEspacio = new JButton("Espacio");
        jbEspacio.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent e)
                {

                }
            });
        tmp.add(jbEspacio);

        JButton jbSpr = new JButton("Suprimir");
        jbSpr.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent e)
                {

                }
            });
        tmp.add(jbSpr);
        
        this.add(tmp);

    }

    /**
     * Mostrar la ventanas
     *
     * 
     */
    public void mostrarGui()
    {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
    }

    /**
     *  Mostrar letra en la caja de texto
     *
     * 
     */
    private void mostrarLetra(String letra)
    {

    }

    /**
     *  Borra la última letra tecleada
     *
     * 
     */
    private void borrarUltimo()
    {

    }
}
