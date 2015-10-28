import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Random;

/**
 * Panel gráfico que contiene los componentes gráficos de la aplicación
 * Un objeto de esta clase escucha los eventos producidos y responde a ellos
 * 
 */
public class PanelColor extends JPanel  implements ActionListener
{
	
	private JPanel pnlNorte;
	private JButton btnColor;
	private Random aleatorio;

	/**
	 * Constructor
	 */
	public PanelColor()
	{
		super();
		this.setLayout(new BorderLayout());
		pnlNorte = new JPanel();
		
		Color bg = generarColor();
		pnlNorte.setBackground(bg);
		 
		this.add(pnlNorte, BorderLayout.CENTER);
		btnColor = new JButton("Cambiar color");
		btnColor.addActionListener(this);
		this.add(btnColor, BorderLayout.SOUTH);
		
		this.aleatorio = new Random();
		
	}

	/**
	 *   método que se ejecuta cuando se produce el click sobre el botón
	 *   Cambia el color de fondo del panel y le da un color aleatorio
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Color bg = generarColor();
		pnlNorte.setBackground(bg);
		
	}
	
	/**
	 * Método privado de ayuda
	 * Se hace una llamada interna a este método cuando se necesita generar un color de forma aleatoria
	 * Un color es un objeto de tipo Color que se construye con tres parámetros de tipo int,
	 * la cantidad  de rojo, verde y azul (un valor entre 0 y 255 inclusive)
	 */
	private Color generarColor()
	{
		int rojo = 0;
		int verde = 0;
		int azul = 0;
		
		rojo = aleatorio.nextInt(256);
		verde = aleatorio.nextInt(256);
		azul = aleatorio.nextInt(256);
	    
		Color aux = new Color(rojo, verde, azul, 0);
		
		return aux;
	    
	}
	
	
}
