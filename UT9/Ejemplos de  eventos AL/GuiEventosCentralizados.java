/**
 * Gestión de eventos centralizada
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GuiEventosCentralizados extends JFrame implements ActionListener  // JFrame es el oyente de eventos
{
    private JButton btnAceptar;
    private JButton btnSalir;
    private JButton btnEdad;

    /**
     * Constructor 
     */
    public GuiEventosCentralizados()
    {
        super("Ejemplo eventos centralizados");                
        crearGui();
        mostrarGui();

    }

    /**
     *   
     */
    private void crearGui()
    {
        this.getContentPane().setLayout(new GridLayout(1, 3, 4, 4));

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        this.getContentPane().add(btnAceptar);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        this.getContentPane().add(btnSalir);

        btnEdad = new JButton("Edad");
        btnEdad.addActionListener(this);
        this.getContentPane().add(btnEdad);
    }

    /**
     *     
     */
    private void mostrarGui()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(500, 100);
        this.pack();
        setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnAceptar)
            aceptar ();
        if(e.getSource() == btnSalir)
            salir ();
        if(e.getSource() == btnEdad)
            obtenerEdad ();
    }

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
        try {
            int edad = Integer.valueOf(JOptionPane.showInputDialog(this, "Teclea Edad"));

            if(edad > 18)
                JOptionPane.showMessageDialog(this, "Eres mayor de edad");
            else
                JOptionPane.showMessageDialog(this, "Eres menor de edad");
        }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Edad Incorrecta");
        }
    }

    /**
     *  
     */
    public static void main(String[] args)
    {
        new GuiEventosCentralizados();
    }

}

