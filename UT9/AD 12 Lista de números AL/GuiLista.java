
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 * 
 */
public class GuiLista extends  JFrame
{

    private  JTextArea areaTexto;
    private  JButton btnAdd;
    private  JButton btnBorrarDePosicion;
    private  JButton btnBorrarRepetidos;
    private  JButton btnSalvar;
    private  JScrollPane scroll;
    private  JLabel lblNumero;
    private  JPanel pnlBotones;
    private  JPanel pnlEntrada;
    private  JTextField txtNumero;

    private Lista lista;  // el modelo

    /**  
     * 
     */
    public GuiLista()
    {
        crearGui();
        mostrarGui();
        txtNumero.requestFocus();
        try
        {
            lista = new Lista();
            lista.cargarDeFichero();
            actualizarAreaTexto();

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * actualiza el área de texto mostrando la lista de números
     */
    private void actualizarAreaTexto()
    {
        areaTexto.setText(lista.toString());
    }

    /** 
     * 
     */

    private void crearGui()
    {

        this.add(panelNorte(), BorderLayout.NORTH);
        this.add(panelCentro(), BorderLayout.CENTER);
        this.add(panelSur(), BorderLayout.SOUTH);

        crearOyentes();

    } 

    /**
     *  
     */
    public void crearOyentes()
    {
        btnAdd.addActionListener(new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    addNumero();
                    actualizarAreaTexto();
                    cogerFoco();
                }
            });
        btnBorrarDePosicion.addActionListener(new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    borrarDePosicion();
                    actualizarAreaTexto();
                    cogerFoco();
                }
            });
        btnBorrarRepetidos.addActionListener(new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    borrarRepetidos();
                    actualizarAreaTexto();
                    cogerFoco();
                }
            });
        btnSalvar.addActionListener(new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    salvar();
                    actualizarAreaTexto();
                    cogerFoco();
                }
            });

        txtNumero.addActionListener(new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    addNumero();
                    actualizarAreaTexto();
                    cogerFoco();
                }
            });
    }

    /**
     *  
     */
    private JPanel panelSur()
    {
        JPanel pnlBotones = new JPanel(new FlowLayout());
        btnAdd = new JButton("Añadir");
        btnBorrarDePosicion = new JButton("Borrar de Posicion");
        btnBorrarRepetidos = new JButton("Borrar Repetidos");
        btnSalvar = new JButton("Guardar");

        pnlBotones.add(btnAdd);
        pnlBotones.add(btnBorrarDePosicion);
        pnlBotones.add(btnBorrarRepetidos);
        pnlBotones.add(btnSalvar);

        return pnlBotones;
    }

    /**
     *  
     */
    private JTextArea panelCentro()
    {

        areaTexto = new JTextArea(25,20);
        areaTexto.setBackground(new Color(0,225,0));
        areaTexto.setEditable(false);

        return areaTexto;
    }

    /**
     *  
     */
    private JPanel panelNorte()
    {
        JPanel pnlNumero = new JPanel(new FlowLayout());
        lblNumero = new JLabel("Numero");
        txtNumero = new JTextField(10);

        pnlNumero.add(lblNumero);
        pnlNumero.add(txtNumero);

        return pnlNumero;
    }

    /** 
     * 
     */

    private void mostrarGui()
    {
        this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Se pide una posición al usuario con JOptionPane.showInputDialog() y se borra el nº 
     * que hay en esa posición de la lista
     * Habrá que actualizar el área de texto
     */
    private void borrarDePosicion() 
    { 
        String valor = JOptionPane.showInputDialog(this, "Dame una posición");
        if(valor != null){
            try {
                lista.borrarDePosicion(Integer.valueOf(valor));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Numero Incorrecto");
            }
        }
    } 

    /**
     * Guarda la lista en un fichero
     */
    private void salvar() 
    { 
        try {
            lista.salvarEnFichero();
        }catch (IOException e) {

        } 
    }

    /**
     * borrar los valores repetidos de la lista
     */
    private void borrarRepetidos() 
    {  
        lista.borrarRepetidos();
    } 

    /**
     * añadir un nuevo nº a la lista. Hay que añadirlo al modelo y actualizar el
     * área de texto
     */
    private void addNumero() 
    { 
        try {
            lista.addNumero(Integer.valueOf(txtNumero.getText()));
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Numero Incorrecto");
        }
    } 

    /**
     * llevar el foco a la caja de texto y seleccionar el texto
     */
    private void cogerFoco()
    {

    }
}
