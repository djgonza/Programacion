
/**
 *  
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GuiPanelesContenedores extends JFrame
{
    

    /**
     * Constructor  
     */
    public GuiPanelesContenedores()
    {
         crearGui();
         mostrarGui();
        
    }

    /**
     * 
     * @param   
     */
    public void crearGui()
    {
        JPanel pnlNorte = crearPanelNorte();
        this.getContentPane().add(pnlNorte, BorderLayout.NORTH);
        
        JPanel pnlCentro = crearPanelCentro();
        this.getContentPane().add(pnlCentro, BorderLayout.CENTER);
         
        JPanel pnlSur = crearPanelSur();
        this.getContentPane().add(pnlSur, BorderLayout.SOUTH);
    }
    
    /**
     * Descripci�n del m�todo
     * @param  
     * @return   
     */
    public JPanel crearPanelNorte()
    {
        JPanel panel = new JPanel();
        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        return panel;
    }
    
    public JPanel crearPanelSur()
    {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        for (int c = (int)'F'; c <= (int)'K'; c++)
            panel.add(new JButton((char)c + ""));

        return panel;
    }
    
      public JPanel crearPanelCentro()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JPanel pnlCentro = new JPanel(new GridLayout(1, 3));
        pnlCentro.add(new JButton("B"));
        pnlCentro.add(new JButton("C"));
        pnlCentro.add(new JButton("D"));
        panel.add(pnlCentro, BorderLayout.CENTER);
        
        JPanel pnlEste = new JPanel(new GridLayout(3, 1));
        pnlEste.add(new JButton("M"));
        pnlEste.add(new JButton("N"));
        pnlEste.add(new JButton("O"));
        panel.add(pnlEste, BorderLayout.EAST);
         
        panel.add(pnlCentro, BorderLayout.CENTER);
        panel.add(pnlEste, BorderLayout.EAST);
 

        return panel;
    }
    
    /**
     * 
     */
    public  void mostrarGui()
    {
         setTitle("Paneles como contenedores"); //establecer las dimensiones (ancho - alto) de la ventana
         setLocation(200, 200); //posición de esquina izquierda de la ventana
         setVisible(true);
         
       //
       //setSize(200, 300);
        pack();
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
