
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

    }

    /** 
     * 
     */

    private void crearGui()
    {
        
        this.add(panelNorte(), BorderLayout.NORTH);
        this.add(panelCentro(), BorderLayout.CENTER);
        //         JFrame (BorderLayout )
        //         ? JPanel (pnlNumero - FlowLayout – al norte)
        //         ? JLabel (lbNumero )
        //         ? JTextField (txtNumero )
        //         ?JTextArea ( areaTexto – al centro) – 25 filas y 20 columnas, no editable
        //         ?- JPanel (pnlBotones - FlowLayout – al sur)
        //         ?- JButton (btnAñadir, btnBorrarRepetidos, btnBorrarDePosicion, btnSalvar )

    } 
    
      /**
     *  
     */
    private JPanel panelSur()
    {
        JPanel pnlBotones = new JPanel(new FlowLayout());
        return null;
    }
    
    /**
     *  
     */
    private JPanel panelCentro()
    {
        JPanel pnlAreaTexto = new JPanel();
        areaTexto = new JTextArea(25,20);
        areaTexto.setEditable(false);
        
        pnlAreaTexto.add(areaTexto);
        
        return pnlAreaTexto;
    }

    /**
     *  
     */
    private JPanel panelNorte()
    {
        JPanel pnlNumero = new JPanel(new FlowLayout());
        lblNumero = new JLabel("Numero");
        txtNumero = new JTextField(50);
        
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
     * Se pide una posición al usuario con JOptionPane.showInputDialog() y se borra el nº que hay en esa posición de la lista
     * Habrá que actualizar el área de texto
     */
    private void borrarDePosicion() 
    { 

    } 

    /**
     * Guarda la lista en un fichero
     */
    private void salvar() 
    { 

    } 

    /**
     * borrar los valores repetidos de la lista
     */
    private void borrarRepetidos() 
    {  
    } 

    /**
     * añadir un nuevo nº a la lista. Hay que añadirlo al modelo y actualizar el
     * área de texto
     */
    private void addNumero() 
    { 

    } 

    /**
     * llevar el foco a la caja de texto y seleccionar el texto
     */
    private void cogerFoco()
    {

    }
}
