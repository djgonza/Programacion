import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *  class JFile  
 * 
 * @author  
 * @version  
 */
public class JFile
{

    private int x;

    /**
     * Constructor de la clase JFile
     */
    public JFile()
    {

    }

    /**
     *  
     */
    public static void main(String[] args)
    {
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros java y de texto","java", "txt");
        fc.setFileFilter(filtro); 
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            ComandoType ct = new ComandoType(file.getName());
            try {
                ct.mostrarFichero();
            }catch (IOException e){
                System.out.println("Error al leer el fichero");
            }

        }
    }
}
