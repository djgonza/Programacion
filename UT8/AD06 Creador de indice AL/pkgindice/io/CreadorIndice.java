package pkgindice.io;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import pkgindice.modelo.IndiceDocumento;
/**
 * Clase CreadorIndice 
 * Crea el índice de un doumento que está en un fichero de texto
 *  
 */

public class CreadorIndice
{
    private IndiceDocumento indice;

    /**
     * Constructor de la clase CreadorIndice
     * Instancia indice 
     */
    public CreadorIndice(File f)
    {
        indice = new IndiceDocumento();
        leerFichero(f);

    }

    /**
     *  lee del fichero de texto una a una las líneas 
     *  y va creando el índice del documento
     *  
     *  Se capturan las excepciones
     *  @param f el fichero del que se va a leer
     */
    public void  leerFichero(File f)  
    {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();
            int cont = 1;
            while(linea != null)
            {
                indice.addTodasPalabras(linea, cont);
                linea = br.readLine();
                cont++;

            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e)
        {
            System.out.println("Error al leer del fichero");
        }
        finally{
            if(br != null)
                try{
                    br.close();
                }
                catch(IOException e)
                {
                    System.out.println("Error al leer del fichero");
                }
        }

    }

    /**
     *  Guarda en un fichero   el índice del documento
     *  Propaga las excepciones
     */
    public void guardarIndiceDocumento(String nombre)throws FileNotFoundException, IOException  
    {
        File f = null;
        PrintWriter pw = null;

        f = new File(nombre);
        pw = new PrintWriter(f);
        pw.println(indice.toString());
        pw.close();

    }

    /**
     * Muestra en pantalla el índice
     */
    public void listarIndice()
    {
        indice.listarIndiceDocumento();
    }
}
