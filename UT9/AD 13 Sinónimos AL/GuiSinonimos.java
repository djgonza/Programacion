import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;

/**
 * Gui para la aplicación de sinónimos
 */
public class GuiSinonimos 
{
    private JTextField txtPalabra;
    private JButton btnBuscar;
    private JLabel lblTotal;
    private JTextField txtSinonimo;
    private JButton btnAnterior;
    private JButton btnSiguiente;

    private JMenuItem itemBuscar;
    private JMenuItem itemSalvar;
    private JMenuItem itemSalir;

    private JMenuItem itemColor;

    private Diccionario diccionario; //el modelo

    /**
     * Constructor de la clase Gui04
     */
    public GuiSinonimos(Diccionario d)
    {

        super("Diccionario de sinónimos ");

        diccionario = d;                
        crearGui();
        mostrarGui();

    }

    /**
     *   crear los componentes
     *   del interfaz
     *   Usa los métodos privados que se te proporcionan
     */
    private void crearGui()
    {

    }
    /**
     *  Crear y devolver la barra de menú 
     */
    private JMenuBar crearBarraMenu()
    {

        return null;
    }

    /**
     *  crear el panel que va al norte 
     */
    private JPanel crearPanelPalabra()
    {

    }

    
    /**
     *   crear el panel que va al centro 
     */
    private JPanel crearPanelSinonimos()
    {

    }
    /**
     * Busca la palabra tecleada en el diccionario
     * y muestra el total de sinónimos que tiene 
     */
    private void buscarPalabra()
    {

    }

    /**
     * Muestra el primer sinónimo
     */
    private void mostrarSinonimos(String[] sinonimos)
    {

    }

    /**
     * muestra el sinónimo anterior
     */
    private void anterior()
    {

    }

    /**
     * muestra el sinónimo siguiente
     */
    private void siguiente()
    {

    }

    /**
     * llevar el foco a la caja de texto
     */
    private void cogerFoco()
    {
        txtPalabra.selectAll();
        txtPalabra.requestFocus();

    }

    /**
     * Guardar en el fichero cuyo nombre se solicita al usuario
     * cada palabra del diccionario y el total de sinónimos que tiene
     */
    private void salvarEnArchivo()
    {

    }
    /**
     * terminar la aplicación
     */
    private void salir()
    {
        System.exit(0);

    }

    /**
     * elegir color de fondo y modificarlo para la etiqueta que mustra cada sinónimo
     */
    private void elegirColor()
    {

    }

    /**
     * elegir tamaño fuente y modificarlo para la etiqueta que muestra cada sinónimo
     */
    private void elegirFuente(String tam)
    {

    }

    /**
     * Mostrar la ventana
     */
    public void mostrarGui()
    {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Clase AppSinonimos  que incluye el método main
     * para iniciar la aplicación
     * 
     * Crea el diccionario y la interfaz gráfica
     */
    public static void main(String[] args)
    {
        try
        {
            Diccionario diccionario = new Diccionario();
            GuiSinonimos gui = new GuiSinonimos(diccionario);
        }
        catch (IOException e)
        {
            System.out.println("Error al abrir el fichero con los datos del diccionario");
        }

    }

}
