package pkgagenda.interfaz;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.List;
import pkgagenda.modelo.AgendaContactos;
import pkgagenda.io.AgendaIO;
import pkgagenda.modelo.AgendaContactos;
import pkgagenda.modelo.Contacto;
import pkgagenda.modelo.ContactoPersonal;
import pkgagenda.modelo.ContactoProfesional;
import pkgagenda.modelo.Fecha; 

/**
 *  Interfaz gráfico para la agenda
 */
public class GuiAgenda extends JFrame
{

    private AgendaContactos agenda;
    private JMenuItem buscarPorNombre;
    private JMenuItem buscar;
    private JMenuItem felicitacion;
    private JMenuItem salir;

    private JButton btnListar;
    private JButton btnClear;
    private JButton btnTotal;
    private JButton btnTotalPersonales;
    private JButton btnProfesionalesPorNombre;
    private JButton btnPersonalesPorFecha;
    private JButton btnSalir;

    private JTextArea areaTexto;

    /**
     * Constructor de la clase GuiAgenda
     */
    public GuiAgenda(AgendaContactos agenda)
    {
        this.agenda = agenda;
        crearGui();
        mostrarGui();
        cargarAgenda();
        listarAgenda();
    }

    /**
     *  
     */
    private void crearGui()
    {
        JMenuBar barraMenu = crearMenu();
        this.setJMenuBar(barraMenu);

        JPanel pnlLetras = crearPanelLetras();
        this.add(pnlLetras, BorderLayout.NORTH);

        JPanel pnlArea = new JPanel(new BorderLayout());
        pnlArea.setBorder(new TitledBorder(new LineBorder(Color.blue)));

        areaTexto = new JTextArea(20, 50);

        JScrollPane scroll = new JScrollPane(areaTexto);         
        pnlArea.add(scroll);
        this.add(pnlArea, BorderLayout.CENTER);

        JPanel pnlBotones = crearPanelBotones();
        this.add(pnlBotones, BorderLayout.EAST);

    }

    /**
     *  
     */
    private JPanel crearPanelLetras()
    {
        JPanel panel = new JPanel(new GridLayout(2, 10, 2, 2));
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < letras.length(); i++)
        {
            JButton btnLetra = new JButton(letras.charAt(i) + "");
            btnLetra.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ev)
                    {
                        personalesEnLetra(ev.getActionCommand().charAt(0));
                    }
                });
            panel.add(btnLetra);
        }

        return panel;
    }

    /**
     *  
     */
    private JMenuBar crearMenu()
    {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Operaciones");

        buscarPorNombre = new JMenuItem("Buscar contacto por nombre");
        buscarPorNombre.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    buscarPorNombre();
                }
            });
        menu.add(buscarPorNombre);

        buscar = new JMenuItem("Buscar contacto  ");
        buscar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    buscar();
                }
            });
        menu.add(buscar);
        felicitacion = new JMenuItem("Felicitar  ");
        felicitacion.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    felicitar();
                }
            });
        menu.add(felicitacion);
        menu.add( new JSeparator());
        salir = new JMenuItem("Salir ");
        salir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    salir();
                }
            });
        menu.add(salir);

        barraMenu.add(menu);
        return barraMenu;
    }

    /**
     *  
     */
    private JPanel crearPanelBotones()
    {
        JPanel panelFinal = new JPanel(); 
        JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));

        btnListar= new JButton("Listar");
        btnListar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    listarAgenda();
                }
            });
        panel.add(btnListar);
        btnTotal = new JButton("Total contactos");
        btnTotal.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    totalContactos();
                }
            });
        panel.add(btnTotal);

        btnTotalPersonales = new JButton("Total contactos personales");
        btnTotalPersonales.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    totalContactosPersonales();
                }
            });
        panel.add(btnTotalPersonales);

        btnProfesionalesPorNombre = new JButton("<html>Contactos profesionales<br/> ordenados por nombre</html>");
        btnProfesionalesPorNombre.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    profesionalesOrdenadosPorNombre();
                }
            });
        panel.add(btnProfesionalesPorNombre);

        btnPersonalesPorFecha = new JButton("<html>Contactos personales<br/> ordenados por fecha</html>");
        btnPersonalesPorFecha.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    personalesOrdenadosPorFecha();
                }
            });
        panel.add(btnPersonalesPorFecha);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    clear();
                }
            });
        panel.add(btnClear);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    salir();
                }
            });
        panel.add(btnSalir);

        panelFinal.add(panel);
        return panelFinal;
    }

    /**
     *  
     */
    private void mostrarGui()
    {
        setTitle("Agenda de contactos");
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     *  
     */
    private void cargarAgenda()
    {
        AgendaIO.cargar(agenda);

    }

    /**
     *  
     */
    private void listarAgenda()
    {
        areaTexto.append(agenda.toString());

    }

    /**
     *  
     */
    private void totalContactos()
    {
        clear();
        areaTexto.append("Total contactos en la agenda:   " + agenda.totalContactos());

    }

    /**
     *  
     */
    private void totalContactosPersonales()
    {
        clear();
        areaTexto.append("Total contactos personales en la agenda:   " + agenda.totalContactosPersonales() + "");

    }

    /**
     *  
     */
    private void personalesEnLetra(char letra)
    {
        clear();
        areaTexto.append("Total contactos personales en la letra " +  letra + ":   " + agenda.totalPersonalesEnLetra(letra));
        List<ContactoPersonal> contactos = agenda.personalesEnLetra(letra);
        for (ContactoPersonal cp: contactos)
        {
            areaTexto.append(cp.toString());
        }
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
     */
    private void clear()
    {
        areaTexto.setText("");

    }

    /**
     *  
     */
    private char pedirLetra()
    {
        return Character.toUpperCase(JOptionPane.showInputDialog("Introduzca letra").charAt(0));

    }

    /**
     *  
     */
    private String pedirNombre()
    {
        return JOptionPane.showInputDialog("Introduzca nombre del contacto a buscar");

    }

    /**
     *  
     */
    private void  profesionalesOrdenadosPorNombre()
    {
        clear();
        try
        {
            Contacto[] profesionales = agenda.profesionalesOrdenadosPorNombre(pedirLetra());
            for (Contacto c: profesionales)
            {
                areaTexto.append(c.toString());
            }
        }
        catch (Exception e)
        {
            areaTexto.append("Teclee una letra en el cuadro de diálogo ...");
        }
    }

    /**
     *  
     */
    private void  personalesOrdenadosPorFecha()
    {
        clear();
        try
        {
            Contacto[] personales = agenda.personalesOrdenadosPorFecha(pedirLetra());
            for (Contacto c: personales)
            {
                areaTexto.append(c.toString());
            }
        }
        catch (Exception e)
        {
            areaTexto.append("Teclee una letra en el cuadro de diálogo ...");
        }

    }

    /**
     *  
     */
    private void  buscarPorNombre()
    {
        clear();
        String nombre = pedirNombre();
        List<Contacto> contactos = agenda.buscarContacto(nombre);
        if (contactos.isEmpty())
            areaTexto.append("No hay contactos en la agenda con el nombre " + nombre);
        else
        {
            for (Contacto c: contactos)
            {
                areaTexto.append(c.toString());
            }
        }
    }

    /**
     *  
     */
    private void  felicitar()
    {
        clear();
        areaTexto.append("Hay que felicitar a \n");
        List<ContactoPersonal> contactos = agenda.felicitar();
        for (ContactoPersonal c: contactos)
        {
            areaTexto.append(c.toString());
        }
    }

    /**
     *  
     */
    private void  buscar()
    {
        clear();
        areaTexto.append("Se han buscado los siguientes contactos \n");
        Contacto c = new ContactoPersonal("Marisa Esteban","689123456",new Fecha(5, 11, 1981));
        areaTexto.append("\nEl contacto " + c.toString() + " está en la agenda " + Boolean.toString(agenda.buscarContacto(c)).toUpperCase());
        c = new ContactoProfesional("Beltrán Iriarte","948456677","Empresa 01 D.A.");
        areaTexto.append("\nEl contacto " + c.toString() + " está en la agenda " + Boolean.toString(agenda.buscarContacto(c)).toUpperCase());
        c = new ContactoPersonal("Julio Bueno","689123456",new Fecha(5, 11, 1981));
        areaTexto.append("\nEl contacto " + c.toString() + " está en la agenda " + Boolean.toString(agenda.buscarContacto(c)).toUpperCase());
    }

    /**
     *  
     */
    public static void main(String[] args)
    {
        AgendaContactos agenda = new AgendaContactos();
        GuiAgenda gui = new GuiAgenda(agenda);
    }

}
