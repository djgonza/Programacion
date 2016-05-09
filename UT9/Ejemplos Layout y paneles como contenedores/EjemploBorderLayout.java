/**
 *   
 * 
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class EjemploBorderLayout extends JFrame
{
     private static final int ANCHO = 300;
     private static final int ALTO = 200;
      
     
    /**
     * Constructor  
     */
    public EjemploBorderLayout()
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
       // no hace falta que lo establezca
      
       JButton btn1 = new JButton("Botón 1");
       this.add(btn1, BorderLayout.NORTH);
       
//        btn1.setPreferredSize(new Dimension(200, 100));
//        this.add(btn1, BorderLayout.NORTH);  
       
       this.add(new JButton("Botón 2"), BorderLayout.WEST);
       this.add(new JButton("Botón 3"), BorderLayout.EAST);
       this.add(new JButton("Botón 4"), BorderLayout.SOUTH);
       this.add(new JTextArea(), BorderLayout.CENTER);
    }
    
   
    
    
      /**
     * 
     *  Aquí establezco título, tamaño
     *  posición y muestro la GUI
     *       
     */
    private void mostrarGui()
    {
         this.setTitle("Ejemplo BorderLayout"); // establecer título de la aplicación
                  
         this.setSize(ANCHO, ALTO); // ancho y alto de la ventana
         //this.setLocation(100, 100); // posición x,y en la pantalla de la ventana
         this.setLocationRelativeTo(null); //centrar la ventana
        // this.pack();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //al cerrar la ventana acabar la aplicación
         this.setVisible(true); //hacer visible la ventana
    }
   
    
}
