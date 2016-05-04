import java.io.IOException;
import javax.swing.JFileChooser; 
import java.io.File;
import pkgindice.io.CreadorIndice;
/**
 * Elige a trav�s de un cuadro de di�logo que lo abrir�s
 *  en el directorio activo un fichero de texto 
 * y crea para �l el �ndice del documento
 * 
 * (Elige al ejecutar la aplicaci�n el fichero "ejemplo.txt" )
 */


public class AppCreadorIndice
{
    public static void main (String[] args)
    {
        JFileChooser elector = new JFileChooser();
        elector.setCurrentDirectory(new File("."));     
        if (elector.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) 
            System.exit(0); 

        CreadorIndice demo = new CreadorIndice(elector.getSelectedFile());
        try{
            demo.guardarIndiceDocumento("indice.txt");
        }
        catch(IOException e)
        {
            System.out.println("Fichero no encontrado"); 
        }

        
            
            
            
    }

}
