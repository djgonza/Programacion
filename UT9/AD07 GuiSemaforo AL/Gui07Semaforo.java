
/**
 * Ejercicio 7 - Clase Semáforo
 *  
 */
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui07Semaforo extends JFrame  implements ActionListener
{
    private JButton btnCambiar;
    private JPanel pnlSemaforo;
    private Semaforo semaforo;

    /**
     * Constructor for objects of class GuiSemaforo
     */
    public Gui07Semaforo(Semaforo semaforo)
    {
        this.semaforo = semaforo;
        construirGui();
        mostrarGui();

    }

    /**
     * 
     */
    private void construirGui()
    {
        btnCambiar = new JButton("Cambiar color semaforo");
        btnCambiar.addActionListener(this);
        pnlSemaforo = new JPanel();
        pnlSemaforo.setBackground(semaforo.getColor());
        add(btnCambiar, BorderLayout.SOUTH);
        add(pnlSemaforo, BorderLayout.CENTER);
    }

    /**
     * 
     */
    private void mostrarGui()
    {
        setTitle("Simulando un semáforo");
        setVisible(true);
        setSize(500, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     *  
     */
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("click en cambiar");
        cambiar();

    }
    
    /**
     *  
     */
    public void cambiar()
    {
        semaforo.avanzar();
        pnlSemaforo.setBackground(semaforo.getColor());
    }



    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        Semaforo semaforo = new Semaforo();
        Gui07Semaforo gui = new Gui07Semaforo(semaforo);
    }

}
