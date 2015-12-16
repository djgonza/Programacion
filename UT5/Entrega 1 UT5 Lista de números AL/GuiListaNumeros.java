
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class GuiListaNumeros extends JFrame  
{
    private static final int ANCHO = 600;
    private static final int ALTO = 400;

    private JButton btnAdd;

    private JButton btnSegundoMinimo;
    private JButton btnBorrarSegundosMinimos;
    private JButton btnOrdenar;
    private JButton btnDigitosMasGrandes;
    private JButton btnMostrarLista;
    private JButton btnVaciarLista;
    private JButton btnClear;
    private JTextField txtNumero;
    private JTextArea areaTexto;

    private ListaNumeros lista;

    public GuiListaNumeros(String titulo, ListaNumeros lista)
    {
        super(titulo);
        crearGui();
        mostrarGui();
        this.lista = lista;
        mostrarLista();
    }

    /**
     * crear los componenetes y añadirlos el contenedor del frame
     */
    private void crearGui()
    {

        JPanel pnlCentro = crearPanelCentral();
        this.add(pnlCentro, BorderLayout.CENTER);

        JPanel pnlEste = crearPanelDerecha();
        this.add(pnlEste, BorderLayout.EAST);

    }

    /**
     * crear el panel central que contiene dos paneles uno al norte (el que
     * tenÃ©is que crear) y otro al centro (el del Ã¡rea de texto)
     */
    private JPanel crearPanelCentral()
    {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(crearPanelEntradaDatos(), BorderLayout.NORTH);
        panel.add(crearPanelArea(), BorderLayout.CENTER);
        return panel;
    }

    /**
     * crear el panel de entrada de datos
     */
    private JPanel crearPanelEntradaDatos()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Tecle nº", JLabel.RIGHT));
        txtNumero = new JTextField(15);
        txtNumero.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    addNumero();

                }
            });
        panel.add(txtNumero);

        btnAdd = new JButton("Add número");
        btnAdd.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    addNumero();

                }
            });
        panel.add(btnAdd);

        return panel;
    }

    /**
     * panel que contiene el área de texto
     *  
     */
    private JPanel crearPanelArea()
    {
        JPanel panel = new JPanel(new BorderLayout());
        areaTexto = new JTextArea(30, 100);
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        panel.add(scroll, BorderLayout.CENTER);
        return panel;
    }

    /**
     * crear y devolver panel de botones
     */
    private JPanel crearPanelDerecha()
    {
        JPanel panel = new JPanel(new GridLayout(0, 1, 3, 3));

        btnSegundoMinimo = new JButton("Segundo mínimo");
        panel.add(btnSegundoMinimo);
        btnSegundoMinimo.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    segundoMinimo();

                }

            });

        btnBorrarSegundosMinimos = new JButton("Borrar segundos mínimos");
        panel.add(btnBorrarSegundosMinimos);
        btnBorrarSegundosMinimos.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    borrarSegundosMinimos();

                }

            });

        btnDigitosMasGrandes = new JButton("Dígitos más grandes");
        panel.add(btnDigitosMasGrandes);
        btnDigitosMasGrandes.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    digitosMasGrandes();

                }

            });

        btnOrdenar = new JButton("Ordenar lista");
        panel.add(btnOrdenar);
        btnOrdenar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    ordenar();

                }

            });

        btnClear = new JButton("Limpiar área texto");
        panel.add(btnClear);
        btnClear.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    clear();

                }

            });

        btnMostrarLista = new JButton("Mostrar Lista");
        panel.add(btnMostrarLista);
        btnMostrarLista.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    mostrarLista();

                }

            });

        btnVaciarLista = new JButton("Vaciar lista");
        panel.add(btnVaciarLista);
        btnVaciarLista.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    vaciarLista();

                }

            });

        return panel;
    }

    /**
     * ubicar y mostrar frame
     */
    private void mostrarGui()
    {
        this.setSize(ANCHO, ALTO);
        // this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    /**
     *  añade un nuevo número a la lista mostrando el estado actual de la lista
     *  en el área de texto
     *  
     */
    private void  addNumero()
    {
        clear();
        String strNumero = txtNumero.getText();
        if (strNumero.isEmpty())
        {
            areaTexto.append("Teclee nº");

        }
        else
        {
            try
            {
                boolean exito = lista.addElemento(Integer.parseInt(strNumero));
                if (!exito)
                {
                    areaTexto.append("\nLista completa, no se ha podido añadir");
                }
                mostrarLista();

            }
            catch (NumberFormatException e)
            {
                areaTexto.append("\nTeclee solo dígitos numéricos");
            }

        }
        cogerFoco();
    }

    /**
     *   Muestra en el área de texto el array con los dígitos
     *   más grandes de los elementos de lista
     *  
     */
    private void  digitosMasGrandes()
    {
        clear();  
        mostrarLista();
        areaTexto.append("\nEl nuevo objeto ListaNumeros contiene " +
            lista.digitosMasGrandes().toString());
        cogerFoco();
    }

    /**
     *   Muestra en el área de texto el valor que corresponde al segundo mínimo
     *  
     */
    private void  segundoMinimo()
    {
        clear();     
        if (lista.estaVacia())
        {
            areaTexto.append("Lista vacía");
        }
        else
        {
            mostrarLista();
            areaTexto.append("\n2º mínimo: " + lista.segundoMinimo() + "\n");
        }
        cogerFoco();
    }

    /**
     *  Borra los segundos mínimos y muestra en el área de texto la lista
     *  y la cantidad de segundos mínimos borrados
     */
    private void  borrarSegundosMinimos()
    {
        clear(); 
        mostrarLista();
        int borrados = lista.borrarSegundosMinimos();
        areaTexto.append("\nSe han borrado " + borrados + " elementos de la lista\n");
        mostrarLista();
        cogerFoco();
    }

    /**
     * ordena la lista y la muestra en el área de texto
     */
    private void ordenar()
    {
        clear();
        int[] ordenada = lista.ordenar();
        mostrarLista();        
        areaTexto.append("\nCopia ordenada de la lista " + Arrays.toString(ordenada) + "\n");

    }

    /**
     * mostrar la lista y su nº de elementos en el área de texto
     */
    private void mostrarLista()
    {
        clear();
        areaTexto.append("Lista: " + lista.toString());
        areaTexto.append("\nNº real elementos en lista " + lista.getTotalNumeros());
        cogerFoco();

    }

    /**
     * Vacía la lista
     */
    private void vaciarLista()
    {
        clear();
        lista.vaciarLista();         
        areaTexto.append("Borrados todos los valores de la lista");
        cogerFoco();

    }

    /**
     * finalizar aplicación
     */
    private void salir()
    {
        System.exit(0);

    }

    /**
     * llevar el foco al campo de texto y seleccionar todo
     */
    private void cogerFoco()
    {
        txtNumero.requestFocus();
        txtNumero.selectAll();

    }

    /**
     * limpiar área de texto
     */
    private void clear()
    {
        areaTexto.setText("");
        cogerFoco();
    }

    /**
     * Punto entrada de la aplicaicón
     */
    public static void main(String[] args)
    {
        int tam = (int) (Math.random() * 6) +  5;
        ListaNumeros lista = new ListaNumeros(tam);
        int[] lis = {12,  12,  12,  4,  4,  55, 789}; //{4, 4, 3, 3, 3, 7, 7, 8};
        for (int valor:lis)
            lista.addElemento(valor);
        new GuiListaNumeros("Lista de números", lista);

    }

}
