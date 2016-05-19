
/**
 * Primera interfaz gráfica GUI en Java
 *  
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.KeyStroke;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class GuiSaludo extends JFrame implements ActionListener
{
    // componentes que forman parte de la GUI
    private static final int ANCHO = 400;
    private static final int ALTO = 200;
    private static final int POS_X = 200;
    private static final int POS_Y = 200;
    private EventosRaton er = new EventosRaton();
    private JMenuItem itemSaludar;
    private JMenuItem itemLimpiar;
    private JMenuItem itemSalir; 
    private JMenuItem itemAbout;
    private JLabel lblSaludo;
    private JButton btnSaludo;
    private JRadioButton rbtAmarillo; 
    private JRadioButton rbtRojo;
    private Saludo saludo;
    private JCheckBox cbxCursiva; 
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnClear;
    private JButton btnSalir;
    private JComboBox<String> cmbColor;

    /**
     * Constructor de objetos de la clase GuiSaludo
     */
    public GuiSaludo(String titulo, Saludo s)
    {
        this.saludo = s;   
        crearGui();
        mostrarGui(titulo);

    }

    /**
     * crear los componentes y añadirlos 
     * al contentpane (panel de contenido) 
     */
    private void crearGui()
    {

        //this.setLayout(new FlowLayout());
        JMenuBar menu = crearBarraMenu();
        this.setJMenuBar(menu); 

        this.add(crearPanelNorte(), BorderLayout.NORTH);
        this.add(crearPanelCentral(), BorderLayout.CENTER);
        this.add(crearPanelSur(), BorderLayout.SOUTH);
        this.add(crearPanelEste(), BorderLayout.EAST);

    }

    /**
     *  
     *
     */
    private JMenuBar crearBarraMenu()
    {
        JMenuBar barra = new JMenuBar();

        JMenu menuAccion = new JMenu("Acción");
        itemSaludar = new JMenuItem("Saludar");
        itemSaludar.setMnemonic('S');
        itemSaludar.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        itemSaludar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    saludar();
                }
            }
        );
        menuAccion.add(itemSaludar);

        itemLimpiar = new JMenuItem("Limpiar");
        itemLimpiar.setMnemonic('L');
        itemLimpiar.setAccelerator(KeyStroke.getKeyStroke("ctrl L"));
        itemLimpiar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    limpiar();
                }
            }
        );
        menuAccion.add(itemLimpiar);

        menuAccion.add(new JSeparator());
        itemSalir = new JMenuItem("Salir");
        itemSalir.setMnemonic('r');
        itemSalir.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
        itemSalir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    salir();
                }
            }
        );
        menuAccion.add(itemSalir);

        JMenu menuAyuda = new JMenu("Ayuda");
        itemAbout = new JMenuItem("About");
        itemAbout.setMnemonic('b');
        itemAbout.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
        menuAyuda.add(itemAbout);

        barra.add(menuAccion);
        barra.add(menuAyuda);
        return barra;

    }

    public JPanel crearPanelNorte()
    {
        JPanel panel = new JPanel();

        panel.add(new JLabel("Nombre"));
        txtNombre = new JTextField(15);
        txtNombre.addActionListener(this);
        panel.add(txtNombre);

        panel.add(new JLabel("Edad"));
        txtEdad = new JTextField(5);
        txtEdad.addActionListener(this);
        panel.add(txtEdad);

        panel.add(new JLabel("Color"));

        String[] colores = {"azul", "verde", "rojo", "amarillo"};
        cmbColor = new JComboBox<>(colores);
        panel.add(cmbColor);

        //panel.add(new JButton("A"));
        //panel.add(new JButton("B"));
        panel.setPreferredSize(new Dimension(200, 50));
        return panel;
    }

    private class MouseListeners extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            btnSaludo.setBackground(new Color(0, 255, 0));
        }

        @Override
        public void mouseExited(MouseEvent e){
            btnSaludo.setBackground(new Color(255, 255, 0));
        }
    }

    public JPanel crearPanelSur()

    {
        btnSaludo = new JButton("Saludar");
        btnSaludo.setToolTipText("Pulsa el botón para saludar");
        btnSaludo.addActionListener(this);
        btnSaludo.addMouseListener(er);
        //btnSaludo.addMouseListener(new MouseListeners());

        btnSaludo.addMouseListener(new MouseAdapter() {            
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnSaludo.setBackground(new Color(255,0,125));
                }

                @Override
                public void mouseExited(MouseEvent e){
                    btnSaludo.setBackground(null);
                }
            });

        btnClear = new JButton("Limpiar");
        btnClear.addActionListener(this);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);

        JPanel pnlSur = new JPanel();
        pnlSur.add(btnSaludo);
        pnlSur.add(btnClear);
        pnlSur.add(btnSalir);

        Border borde = BorderFactory.createLineBorder(Color.blue, 3);
        pnlSur.setBorder(BorderFactory.createTitledBorder(borde, "Panel de botones"));
        return pnlSur;

    }

    private JPanel crearPanelCentral()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        lblSaludo = new JLabel();
        lblSaludo.setHorizontalAlignment(JLabel.CENTER); //el texto se mostrarácentrado
        lblSaludo.setFont(new Font("Georgia", Font.BOLD, 24));
        lblSaludo.setText("Aquí se mostrará el saludo");
        lblSaludo.setOpaque(true); //para luego establecer el color del fondo y
        // que se vea
        lblSaludo.setBackground(Color.yellow); //color de fondo de la etiqueta
        panel.add(lblSaludo);
        return panel;
    }

    private JPanel crearPanelEste()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        rbtAmarillo = new JRadioButton("Amarillo");
        rbtAmarillo.setSelected(true);
        rbtAmarillo.addActionListener(new OyenteAmarillo());

        rbtRojo = new JRadioButton("Rojo");
        rbtRojo.addActionListener(new OyenteRojo());

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(rbtAmarillo);
        grupoBotones.add(rbtRojo);
        panel.add(rbtAmarillo);
        panel.add(rbtRojo);
        cbxCursiva = new JCheckBox("Cursiva", false);
        cbxCursiva.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    ponerCursiva();
                }
            });
        panel.add(cbxCursiva);

        return panel;
    }

    private class OyenteAmarillo implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ponerColor(Color.YELLOW);
        }

    }

    private class OyenteRojo implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ponerColor(Color.RED);
        }

    }

    /**
     *  
     */
    public void ponerColor(Color c)
    {
        lblSaludo.setBackground(c);

    }

    /**
     *  
     */
    public void ponerCursiva()
    {
        Font actual = lblSaludo.getFont();
        Font nueva;
        if(cbxCursiva.isSelected())
        {
            nueva = new Font(actual.getFamily(), actual.getStyle() + Font.ITALIC, actual.getSize());

        }
        else
            nueva = new Font(actual.getFamily(), actual.getStyle() - Font.ITALIC, actual.getSize());
        lblSaludo.setFont(nueva);

    }

    /**
     * 
     */
    private void mostrarGui(String titulo)
    {

        setTitle(titulo);
        this.pack();
        //setSize(ANCHO, ALTO); //establecer las dimensiones (ancho - alto) de la ventana
        //setLocation(POS_X, POS_Y); //posición de esquina izquierda de la ventana
        setLocationRelativeTo(null); //para centrar la ventana
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnSaludo || e.getSource() == txtNombre || e.getSource() == txtEdad)
            saludar();
        else if(e.getSource() == btnClear)
        {
            limpiar();
        }
        else if(e.getSource() == btnSalir)
        {
            salir();
        }

    }

    private void saludar()
    {
        String nombre = txtNombre.getText();
        if(nombre.equals(""))
        {
            lblSaludo.setText("Teclea nombre");
            cogerFoco(txtNombre);
        }
        else
        {
            String strEdad = txtEdad.getText();
            if(strEdad.equals(""))
            {
                lblSaludo.setText("Teclea edad");
                cogerFoco(txtEdad);
            }
            else
            {

                try {
                    String color= (String)cmbColor.getSelectedItem();
                    Saludo saludo = new Saludo(nombre, color, Integer.parseInt(strEdad));
                    lblSaludo.setText(saludo.saludarPersonalizado());
                }catch (NumberFormatException e) {
                    lblSaludo.setText("Teclea edad correcta");
                    cogerFoco(txtEdad);
                }

            }
        }
    }

    private void limpiar()
    {
        lblSaludo.setText("");
        cogerFoco(txtNombre);
    }

    private void salir()
    {
        System.exit(0);
    }

    private void cogerFoco(JTextField txt)
    {
        txt.requestFocus();
        txt.selectAll();
    }

}

