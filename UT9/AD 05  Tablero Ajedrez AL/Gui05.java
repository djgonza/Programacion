import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Gui05 extends JFrame
{

    /**
     * Constructor de la clase Gui05
     */
    public Gui05()
    {
        super("Ejemplo 5 Botones y Tablero Ajedrez ");

        crearGui();
        mostrarGui();

    }

    /**
     *      
     */
    private void mostrarGui()
    {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        //pack();
        //setLocation(100, 100);
        setLocationRelativeTo(null); //centrar la pantalla
    }

    /**
     *      
     */
    private void crearGui()
    {
        setLayout(new GridLayout(8,8,1,1));

        boolean posicion = true;

        for(int i= 1; i<65; i++)
        {
            JButton btn =  new JButton();
            if(posicion)
            {
                btn.setBackground(Color.WHITE);
            }
            else
            {
                btn.setBackground(Color.BLACK);
            }
            this.add(btn);
            if(i%8 != 0){
                posicion = !posicion;
            }
        }

    }

    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        new Gui05();
    }
}
