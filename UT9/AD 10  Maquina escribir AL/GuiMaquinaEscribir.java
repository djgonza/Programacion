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
        JPanel pnlTexto = new JPanel();
        pnlTexto.setBorder(new TitledBorder("Texto"));
        
        txtLetras = new JTextField(25);
        txtLetras.setEditable(false);
        pnlTexto.add(txtLetras);
        
        this.add(pnlTexto, BorderLayout.SOUTH);
    }


    private void crearPanelLetras()
    {
        pnlTeclado = new JPanel();
        pnlTeclado.setLayout(new GridLayout(4,7));
        pnlTeclado.setBorder(new TitledBorder("Teclado"));
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(Character c : abc.toCharArray())
        {
            JButton jb = new JButton("" + c);
            jb.addActionListener(new  ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        
                        mostrarLetra(((JButton) e.getSource()).getText());
                    }
                });
            pnlTeclado.add(jb);
        }

        JButton jbEspacio = new JButton("Espacio");
        jbEspacio.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    espaciar();
                }
            });
        pnlTeclado.add(jbEspacio);

        JButton jbSpr = new JButton("Suprimir");
        jbSpr.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    borrarUltimo();
                }
            });
        pnlTeclado.add(jbSpr);
        
        this.add(pnlTeclado, BorderLayout.CENTER);

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
      maquina.añadirCaracter(letra.charAt(0));
      txtLetras.setText(maquina.getTexto());
    }
    
      /**
     *  Boton espacio
     *
     * 
     */
    private void espaciar()
    {
        maquina.añadirCaracter(' ');
    }

    /**
     *  Borra la última letra tecleada
     *
     * 
     */
    private void borrarUltimo()
    {
        maquina.borrarUltimo();
        txtLetras.setText(maquina.getTexto());
    }
}
