import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.TitledBorder;
/**
 * Gui para la aplicación de sinónimos
 */
public class GuiSinonimos extends JFrame
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
        this.setJMenuBar(crearBarraMenu());

        this.add(crearPanelPalabra(), BorderLayout.NORTH);
        this.add(crearPanelSinonimos(), BorderLayout.CENTER);
        lblTotal = new JLabel("Número de sinónimos");
        lblTotal.setHorizontalAlignment(0);
        lblTotal.setBackground(Color.pink);
        lblTotal.setOpaque(true);
        this.add(lblTotal, BorderLayout.SOUTH);
    }

    /**
     *  Crear y devolver la barra de menú 
     */
    private JMenuBar crearBarraMenu()
    {
        JMenuBar barraMenu = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuColor = new JMenu("Color");
        JMenu menuFuente = new JMenu("Fuente");

        barraMenu.add(menuArchivo);
        barraMenu.add(menuColor);
        barraMenu.add(menuFuente);

        itemBuscar = new  JMenuItem("Buscar");
        itemSalvar = new  JMenuItem("Salvar");
        itemSalir = new JMenuItem("Salir");

        menuArchivo.add(itemBuscar);
        menuArchivo.add(itemSalvar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        itemColor = new JMenuItem("Elegir Color");
        menuColor.add(itemColor);

        return barraMenu;
    }

    /**
     *  crear el panel que va al norte 
     */
    private JPanel crearPanelPalabra()
    {
        JPanel pnlPalabra = new JPanel();
        pnlPalabra.setLayout(new FlowLayout());
        Border borde = new TitledBorder("Palabra");
        pnlPalabra.setBorder(borde);

        txtPalabra = new JTextField(20);
        btnBuscar = new JButton("Buscar");
        pnlPalabra.add(new JLabel("Palabra"));
        pnlPalabra.add(txtPalabra);
        pnlPalabra.add(btnBuscar);

        return pnlPalabra;
    }

    /**
     *   crear el panel que va al centro 
     */
    private JPanel crearPanelSinonimos()
    {
        JPanel pnlSinonimos = new JPanel();
        pnlSinonimos.setLayout(new BorderLayout());
        Border borde = new TitledBorder("Sinónimos");
        pnlSinonimos.setBorder(borde);

        btnAnterior = new JButton("<<");
        btnSiguiente = new JButton(">>");

        pnlSinonimos.add(btnAnterior, BorderLayout.WEST);
        pnlSinonimos.add(btnSiguiente, BorderLayout.EAST);

        return pnlSinonimos;

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
