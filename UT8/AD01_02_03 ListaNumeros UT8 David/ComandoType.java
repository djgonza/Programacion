import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
/**
 *  class ComandoType  
 * 
 * @author  
 * @version  
 */
public class ComandoType
{
     
    private String fichero;

    /**
     * Constructor de la clase ComandoType
     */
    public ComandoType(String fichero)
    {
        this.fichero = fichero;
    }

    /**
     *  
     */
    public void mostrarFichero() throws IOException
    {
        File f = new File(this.fichero);
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        String linea = br.readLine();
        int cont = 0;
        
        while(linea != null){
            
            System.out.println(cont + " : " + linea);
            cont++;
            linea = br.readLine();
            
        }
         
    }
}
