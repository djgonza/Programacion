
/**
 * Clase GuiFactorial con paneles
 * Eventos centralizados
 * 
 */

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GuiFactorialPaneles extends JFrame implements ActionListener
{

    private JTextField txtNumero;
    private JLabel lblResultado;
    private JButton btnFactorial;
    private JButton btnPrimo;
    private JButton btnClear;
    private JButton btnSalir;

    private Numero numero;

    /**
     * Constructor de la clase GuiFactorial
     */
    public GuiFactorialPaneles(Numero numero)
    {
        super("Factorial con paneles");
        crearGui();  
        mostrarGui();
        this.numero = numero;

    }

    /**
     *  
     */
    private void crearGui()
    {
        this.setLayout(new GridLayout(1,2));
        this.add(crearPanelCentral());
        this.add(crearPanelBotones());
        cogerFoco();
    }

    private JPanel crearPanelCentral()
    {
        JPanel temp = new JPanel();
        temp.setLayout(new BorderLayout());

        txtNumero = new JTextField("Introduzca Numero");
        txtNumero.addActionListener(this);
        
        
        
        lblResultado = new JLabel("Aqui va el resultado");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBackground(new Color(0, 255, 0));
        lblResultado.setOpaque(true);

        temp.add(txtNumero, BorderLayout.NORTH);
        temp.add(lblResultado, BorderLayout.CENTER);

        return temp;

    }

    private JPanel crearPanelBotones()
    {
        JPanel temp =  new JPanel();
        temp.setLayout(new GridLayout(4,1));

        btnFactorial = new JButton("Factorial");
        btnFactorial.addActionListener(this);
        btnPrimo = new JButton("Primo");
        btnPrimo.addActionListener(this);
        btnClear = new JButton("Limpiar");
        btnClear.addActionListener(this);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);

        temp.add(btnFactorial);
        temp.add(btnPrimo);
        temp.add(btnClear);
        temp.add(btnSalir);

        return temp;

    }

    private void mostrarGui()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocation(100, 100);
    }

    /**
     *  
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnClear){
            clear();
        }
        else if(e.getSource() == btnSalir){
            salir();
        }
        else{
            try {
                int n = Integer.valueOf(txtNumero.getText());
                numero.setNumero(n);
                if(e.getSource() == btnFactorial || e.getSource() == txtNumero){
                    factorial();
                }else if(e.getSource() == btnPrimo){
                    primo();
                }

            }catch (NumberFormatException f){
                lblResultado.setText("Numero Incorrecto");
            }
            cogerFoco();
        }

    }

    /**
     *  
     */
    private void factorial()
    {
        lblResultado.setText("El factorail de " + numero.getNumero() + "es: " + numero.factorial());
    }

    /**
     *  
     */
    private void primo()
    {
        lblResultado.setText("Primo ? " + numero.esPrimo());
    }

    /**
     *  lleva el foco a la caja de texto y 
     *  selecciona todo su contenido
     */
    private void cogerFoco()
    {
        txtNumero.requestFocus();
        txtNumero.selectAll();
    }

    /**
     *  
     */
    private void clear()
    {
        lblResultado.setText("");
        cogerFoco();
    }

    /**
     *  
     */
    private void salir()
    {
        System.exit(0);
    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        Numero numero = new Numero(0);        
        new GuiFactorialPaneles(numero);
    }
}
