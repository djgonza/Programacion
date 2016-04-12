import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.net.URL;
 
/**
 *   Utilidades para cargar/salvar la agenda
 */
public class AgendaIO
{

    /**
     *  
     */
    public static void cargar(AgendaContactos agenda)
    {
        try
        {
            String fichero = "/agenda.txt";
            URL url = AgendaIO.class.getResource(fichero);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String linea = br.readLine();
            while (linea != null)
            {
                Contacto contacto = parsearLinea(linea);
                agenda.añadirContacto(contacto);
                linea = br.readLine();

            }
            br.close();
        }
        catch (IOException e)
        {

        }
    }

    /**
     *  
     */
    private static Contacto parsearLinea(String linea)
    {
        String[] datos = linea.split(":");
        String  nombre = datos[1];
        String  telefono = datos[2];
        if (datos[0].equals("1"))
            return new ContactoPersonal(nombre, telefono, new Fecha(Integer.parseInt(datos[3]),
                    Integer.parseInt(datos[4]), Integer.parseInt(datos[5])));
        return new ContactoProfesional(nombre, telefono, datos[3]);

    }

 
 

}
