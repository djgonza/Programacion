import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.border.*;
import  java.io.FileNotFoundException;
import  java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 *  Interfaz gráfica para interactuar con el usurio
 *  
 */
public class GuiNumeroSecreto extends JFrame implements ActionListener
{

    private JTextField txtNumero;
    private JButton btnIntentar;
    private JButton btnSeguir;

    private JTextArea areaResultado;
    private JuegoNumeroSecreto juego; // el modelo

    /**
     * Constructor  
     */
    public GuiNumeroSecreto(JuegoNumeroSecreto juego)
    {
        this.juego = juego;

        crearGui();
        mostrarGui();
    }

    /**
     * 
     */
    private void crearGui()
    {

        JPanel pnlNorte = crearPanelNorte();
        this.add(pnlNorte, BorderLayout.NORTH);

        JPanel pnlCentro = crearPanelCentro();
        this.add(pnlCentro, BorderLayout.CENTER);

    }

    /**
     *  Crea y devuelve el panel que irá al norte
     *  
     */
    private JPanel crearPanelNorte()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Teclee un nº", JLabel.RIGHT));
        txtNumero = new JTextField(20);
        txtNumero.addActionListener(this);
        panel.add(txtNumero);
        btnIntentar = new JButton("Intentar");
        btnIntentar.addActionListener(this);
        panel.add(btnIntentar);
        btnSeguir = new JButton("Seguir");
        btnSeguir.addActionListener(this);
        btnSeguir.setEnabled(false);
        panel.add(btnSeguir);

        Border borde = BorderFactory.createMatteBorder( 1, 1, 1, 1, new Color(0, 0, 51) );
        panel.setBorder(new TitledBorder(borde, "Datos de entrada"));
        panel.setBackground(new Color(255, 255, 204));
        return panel;
    }

    /**
     *  Crea y devuelve el panel que irá al centro
     *  Este panel tiene un color de fondo amarillo e incluye  la etiqueta lblResultado
     *  
     */
    private JPanel crearPanelCentro()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); 
        areaResultado = new JTextArea(20, 30);
        JScrollPane scroll = new JScrollPane(areaResultado);
        panel.add(scroll);
        panel.setBorder(BorderFactory.createMatteBorder( 3, 3, 3, 3, new Color(0, 0, 51) ) );
        panel.setBackground(Color.pink);

        return panel;
    }

    /** 
     * 
     */
    public void mostrarGui()
    {
        this.setTitle("Juego del número secreto");
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
        // this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     *  Intenta una jugada. Muestra el resutlado de la jugada en el área de texto
     */
    private void intentarJugada()
    {

        String numero = txtNumero.getText();
        if (! numero.equals(""))
        {
            try
            {
                if (!juego.haTerminado())
                {
                    juego.realizarJugada(Integer.parseInt(numero));
                    areaResultado.append("Ha tecleado el nº " + numero + "\n");
                    areaResultado.append(juego.getResultado() + "\n");
                    if (juego.haTerminado())
                    {
                        btnIntentar.setEnabled(false);
                        btnSeguir.setEnabled(true);
                    }
                }

            }
            catch (NumberFormatException e)
            {
                areaResultado.append("Tecle valor numérico\n");
            }

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Teclee un nº");
        }
        cogerFoco();

    }

    /**
     * 
     */
    public void actionPerformed(ActionEvent ev)
    {
        if (ev.getSource() == btnIntentar || ev.getSource() == txtNumero)
        {
            intentarJugada();
        }
        else  if (ev.getSource() == btnSeguir)
        {
            continuarJugando();
        }

    }

    /**
     * Llevar el foco a la caja de texto
     */
    private void cogerFoco()
    {
        txtNumero.requestFocus();
        txtNumero.selectAll();
    }

    /**
     * Limpia el área de texto
     */
    private void limpiar()
    {
        areaResultado.setText("");
    }

    /**
     * continuar con el juego
     */
    private void continuarJugando()
    {
        limpiar();
        cogerFoco();
        juego.resetJuego();
        btnIntentar.setEnabled(true);
        btnSeguir.setEnabled(false);
        txtNumero.setText("");

    }

    /**
     *  Punto de entrada a la aplicación
     *  
     */
    public static void main(String[] args)
    {
        new GuiNumeroSecreto(new JuegoNumeroSecreto());
    }

}
