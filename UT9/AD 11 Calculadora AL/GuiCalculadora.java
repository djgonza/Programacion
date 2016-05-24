
/**
 * 
 */
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.io.IOException;
public class GuiCalculadora extends JFrame
{
    private JMenuBar barraMenu;
    private PanelNumero pnlNumero;
    private PanelBotones pnlBotones;
    private PanelResultado pnlResultado;

    private Calculadora calcModelo;

    /**
     * Constructor 
     */
    public GuiCalculadora(Calculadora c)
    {
        calcModelo = c;
        barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);
        JMenu menuNumero = new JMenu("Numero");
        barraMenu.add(menuNumero);

        JMenuItem itemAñadir = new JMenuItem("Añadir");
        itemAñadir.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e)
                {
                    actualizar();
                }
            });

        menuNumero.add(itemAñadir);
        menuNumero.addSeparator();

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e)
                {
                    System.exit(0);
                }
            });
        menuNumero.add(itemSalir);
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem salvar = new JMenuItem("Salvar");
        salvar.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e)
                {
                   salvar();
                }
            });
        menuArchivo.add(salvar);
        barraMenu.add(menuArchivo);
        this.setLayout(new BorderLayout());
        pnlNumero = new PanelNumero(this);
        pnlBotones = new PanelBotones(this);
        pnlResultado = new PanelResultado(this);

        this.getContentPane().add(pnlNumero, "North");
        this.getContentPane().add(pnlBotones, "Center");
        this.getContentPane().add(pnlResultado, "South");
        setTitle("Calculadora de números");
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * salva los resultados en el fichero
     * el modelo se encarga de la operación
     */
    public void salvar()
    {
        try{
            calcModelo.registrar(new File("resultados.txt"));
        }
        catch(IOException e)
        {
            System.out.println("Error al intentar escribir el fichero");
        }
    }

    /**
     * limpia los paneles de resultado, el del número y 
     * resetea la calculadora
     */
    public void limpiar()
    {
        pnlNumero.limpiar();
        pnlResultado.limpiar();

    }

    /**
     * Actualiza la calculadora y muestra los resultados en el panel de resultados
     */
    public void actualizar()
    {
        try{
            calcModelo.addNumero(pnlNumero.getNumero());
            pnlResultado.mostrar(calcModelo.getCantidad(),
                calcModelo.getMedia(),
                calcModelo.getMinimo(),
                calcModelo.getMaximo());

        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Introduzca valor correcto");

        }

        pnlNumero.cogerFoco();

    }

    /**
     *  
     */
    public static void main(String[] args) 
    {
        Calculadora calc = new Calculadora();
        GuiCalculadora demo = new GuiCalculadora(calc);

    }
}
