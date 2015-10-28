
 
import javax.swing.JFrame;

/**
 * 
 */

/**
 * Interfaz gráfico de la aplciación.
 * A través de un objeto de esta clase el usuario interactúa
 * con la aplicación
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
