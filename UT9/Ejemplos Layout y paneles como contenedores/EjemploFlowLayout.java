/**  
 * 
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;


public class EjemploFlowLayout extends JFrame
{
     private static final int ANCHO = 300;
     private static final int ALTO = 200;
      
     
    /**
     * Constructor  
     */
    public EjemploFlowLayout()
    {   
         crearGui(); 
         mostrarGui();        
    }

    /**
     * 
     *  Aquí creo los componentes que añadiré a la GUI
     *       
     */
    private void crearGui()
    {
       // por defecto JFrame tiene asociado el gestor de disposición BorderLayout
       // lo cambiamos a FlowLayout
       this.setLayout(new FlowLayout(FlowLayout.LEFT));
       this.add(new JButton("Botón 1 mas largo que otro"));
       this.add(new JButton("Botón 2"));
       this.add(new JButton("Botón 3") );
       this.add(new JButton("Botón 4") );
       
    }
    
   
    
    
      /**
     * 
     *  Aquí establezco título, tamaño
     *  posición y muestro la GUI
     *       
     */
    private void mostrarGui()
    {
         this.setTitle("Ejemplo FlowLayout"); // establecer título de la aplicación
                  
         this.setSize(ANCHO, ALTO); // ancho y alto de la ventana
         //this.setLocation(100, 100); // posición x,y en la pantalla de la ventana
         this.setLocationRelativeTo(null); //centrar la ventana
        // this.pack();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //al cerrar la ventana acabar la aplicación
         this.setVisible(true); //hacer visible la ventana
    }
   
    
}