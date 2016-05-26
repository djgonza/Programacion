
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *  
 */
public class GuiExamen extends JFrame implements ActionListener {

    private static final int ANCHO = 700;
    private static final int ALTO = 500;

    private JMenuItem itmLeer;
    private JMenuItem itmGuardar;
    private JMenuItem itmSalir;

    private JButton btnVerNota;
    private JButton btnListar;
    private JButton btnClear;
    private JButton btnSalir;

    private JTextArea areaTexto;

    private JTextField txtAlumno;

    private JRadioButton rbtAprobados;
    private JRadioButton rbtListadoNotas;

    private Examen examen;

    public GuiExamen(String titulo, Examen examen) {
        super(titulo);
        crearGui();
        mostrarGui();
        this.examen = examen;

    }

    /**
     * crear los componentes y añadirlos el contenedor del frame
     */
    private void crearGui() {
        JMenuBar barraMenu = crearBarraMenu();
        this.setJMenuBar(barraMenu);

        JPanel pnlNorte = crearPanelNorte();
        this.add(pnlNorte, BorderLayout.NORTH);

        JPanel pnlCentro = crearPanelCentral();
        this.add(pnlCentro, BorderLayout.CENTER);

        JPanel pnlEste = crearPanelEste();
        this.add(pnlEste, BorderLayout.EAST);

    }

    /**
     * crear el panel norte
     * 
     * 
     */
    private JPanel crearPanelNorte() {

        JPanel panel = new JPanel(new GridLayout(2, 1));

        JPanel panelUno = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panelDos = new JPanel();

        // panel Uno
        txtAlumno = new JTextField(20);
        btnVerNota = new JButton("Ver Nota");
        btnVerNota.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                verNota();
            }

        });

        panelUno.setBorder(new TitledBorder("Panel entrada de datos"));
        panelUno.add(new JLabel("Alumno"));
        panelUno.add(txtAlumno);
        panelUno.add(btnVerNota);

        // panel dos
        ButtonGroup grupoBotones = new ButtonGroup();
        rbtAprobados = new JRadioButton("Mostrar nº aprobados");
        rbtAprobados.setSelected(true);
        rbtListadoNotas = new JRadioButton("Listar Notas");
        grupoBotones.add(rbtAprobados);
        grupoBotones.add(rbtListadoNotas);
        btnListar = new JButton("Listar");
        btnListar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                listar();

            }

        });

        panelDos.setBorder(new TitledBorder("Panel de opciones"));

        panelDos.add(rbtAprobados);
        panelDos.add(rbtListadoNotas);
        panelDos.add(btnListar);

        panel.add(panelUno);
        panel.add(panelDos);

        return panel;

    }

    /**
     * crear el panel central que contiene el área de texto)
     */
    private JPanel crearPanelCentral() {

        JPanel panel = new JPanel(new BorderLayout());
        areaTexto = new JTextArea(30, 100);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);
        areaTexto.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(areaTexto);
        panel.add(scroll, BorderLayout.CENTER);
        return panel;

    }

    /**
     * crear panel de botones
     */
    private JPanel crearPanelEste() {

        /*
         * JPanel panelContenedor = new JPanel(); JPanel panel = new JPanel(new
         * GridLayout(2, 1));
         * 
         * btnClear = new JButton("Clear"); btnSalir = new JButton("Salir");
         * 
         * panel.add(btnClear); panel.add(btnSalir);
         * 
         * panelContenedor.add(panel);
         * 
         * return panelContenedor;
         */

        JPanel panel = new JPanel(new GridLayout(6, 1, 0, 5));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);

        panel.add(btnClear);
        panel.add(btnSalir);
        return panel;

    }

    /**
     * crear barra de menú
     * 
     */
    private JMenuBar crearBarraMenu() {

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Archivo");

        itmLeer = new JMenuItem("Leer", KeyEvent.VK_L);
        itmLeer.setAccelerator(KeyStroke.getKeyStroke("ctrl L"));
        itmLeer.addActionListener(this);
        itmGuardar = new JMenuItem("Guardar En fichero", KeyEvent.VK_G);
        itmGuardar.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
        itmGuardar.setEnabled(false);
        itmGuardar.addActionListener(this);
        itmSalir = new JMenuItem("Salir", KeyEvent.VK_S);
        itmSalir.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        itmSalir.addActionListener(this);

        menu.add(itmLeer);
        menu.add(itmGuardar);
        menu.addSeparator();
        menu.add(itmSalir);

        barraMenu.add(menu);
        return barraMenu;

    }

    /**
     * ubicar y mostrar frame
     */
    private void mostrarGui() {
        this.setSize(ANCHO, ALTO);
        // this.pack();     
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Leer el fichero con las respuestas de los alumnos y muestra en el área de
     * texto el mensaje adecuado (ver ejecución)
     */
    private void leer() {
        examen.leerDeFichero();
        areaTexto.setText(
                "Leído el fichero con las respuestas de los alumnos al control tipo test \nGuardado en memoria los resultados del exámen");
        llevarFoco();
        itmGuardar.setEnabled(true);
        itmLeer.setEnabled(false);
    }

    /**
     * Guarda en un fichero de texto el nombre de cada alumno y su nota en orden
     * decreciente de nota
     */
    private void guardar() {
        try {
            examen.guardarOrdenadosPorNota();
            areaTexto.setText("Datos guardados");
        } catch (IOException e) {
            areaTexto.setText("Error al guardar en fichero");
        }
    }

    /**
     * Mostrar la nota del alumno tecleado en la caja de texto Si no se teclea
     * nada se muestra un mnesaje y el foco va a la caja de texto Si ocurre un
     * error porque el alumno no existe se muestra un mensaje y el foco va a la
     * caja de texto
     */
    private void verNota() {
        try {
            areaTexto.setText("La nota de " + txtAlumno.getText() + " es " + examen.notaDe(txtAlumno.getText().toUpperCase()));
        } catch (AlumnoNoExistenteException e) {
            llevarFoco();
            areaTexto.setText("No se han leído todavía los datos del fichero \n Vaya a la opción leer del menú");
        }
    }

    /**
     * Muestra en el área de texto el nº de aprobados o la relación de alumnos y
     * sus notas dependiendo del botón seleccionado
     */
    private void listar() {

        if (rbtAprobados.isSelected()) {
            areaTexto.setText("El numero de aprobados es " + examen.aprobados());
        } else {
            areaTexto.setText(examen.toString());
        }

    }

    /**
     * Finalizar la aplicación
     */
    private void salir() {
        System.exit(0);
    }

    /**
     * Limpiar área de texto
     */
    private void clear() {
        areaTexto.setText("");

    }

    /**
     * llevar el foco a la caja de texto y selecciona todo el texto incluido en
     * ella
     */
    private void llevarFoco() {
        txtAlumno.requestFocus();
        txtAlumno.selectAll();
    }

    /**
     * Punto entrada de la aplicación
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Examen examen = new Examen(new CorrectorExamen());
        new GuiExamen("Interface gráfica - Corrector de exámen tipo test", examen);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == itmLeer) {
            leer();
        } else if (e.getSource() == itmGuardar) {
            guardar();
        } else if (e.getSource() == itmSalir || e.getSource() == btnSalir) {
            salir();
        } else if (e.getSource() == btnClear) {
            clear();
        }

    }

}
