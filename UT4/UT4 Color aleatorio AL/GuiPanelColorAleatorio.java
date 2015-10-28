
 
import javax.swing.JFrame;

/**
 * 
 */

/**
 * Interfaz gr�fico de la aplciaci�n.
 * A trav�s de un objeto de esta clase el usuario interact�a
 * con la aplicaci�n
 *
 */
public class GuiPanelColorAleatorio extends JFrame
{

	private PanelColor pnlColor;
	
	/**
	 *  
	 */
	public GuiPanelColorAleatorio(String titulo)  
	{
		super(titulo);
		pnlColor = new PanelColor();
		this.add(pnlColor);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null); //para centrar la ventana
        this.setVisible(true);
        this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		 
		
	}
	
}
