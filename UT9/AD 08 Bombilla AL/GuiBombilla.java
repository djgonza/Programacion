
/**
 *   
 */


import javax.swing.JFrame;
 
public class GuiBombilla  extends JFrame
{

    private PanelBombilla pnlBombilla;
    /**
     * Constructor de la clase GuiBombilla
     */
    public GuiBombilla(Bombilla b)
    {

        pnlBombilla = new PanelBombilla(b);
        this.getContentPane().add(pnlBombilla);

        this.setTitle("Bombilla");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setVisible(true);
    }

    /**
     *
     * 
     */
    public static void main(String[] args)
    {
        GuiBombilla gui = new GuiBombilla(new Bombilla());

    }

}
