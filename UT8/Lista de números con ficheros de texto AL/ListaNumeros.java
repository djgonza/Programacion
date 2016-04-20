import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileNotFoundException;
/**
 *  La clase guarda en una colección ArrayList una
 *  lista de números enteros
 *  
 */
public class ListaNumeros
{
    // define la colección
    private List<Integer> lista;

    /**
     * Constructor  - instancia la colección
     */
    public ListaNumeros()
    {
        lista = new ArrayList<Integer>();
    }

    /**
     *  añade un número a la colección
     */
    public void add(int numero)
    {
        lista.add(numero);
    }

    /**
     *  detectar si la lista está vacía
     */
    public boolean estaVacia()
    {
        return lista.size() == 0;
    }

    /**
     * borrar todos los elementos de la lista, dejadla vacía
     */
    public void borrarLista()
    {
        lista.clear();
    }

    /**
     *  Crea un fichero de texto  cuyo nombre se
     *  pasa como argumento
     *  Para crear el fichero recorreremos la colección y
     *  guardaremos cada nº de la lista en el fichero, un nº por línea
     *  
     *  Capturamos las excepciones que se puedan producir
     */
    public void salvarEnFicheroDeTexto(String nombre) 
    {
        File f = null;
        PrintWriter pw = null;

        try {
            f = new File(nombre);
            pw = new PrintWriter(f);
            for(Integer numero: lista)
            {
                pw.println(numero);
            }

        }
        catch(FileNotFoundException e )
        {
            System.out.println("Fichero no encontrado");
        }
        finally
        {
            if(pw != null)
                pw.close();
        }

    }

    /**
     *  lee de un fichero de texto cuyo nombre se pasa
     *  como argumento una serie de nºs enteros y cada nº lo guarda en la lista
     *  Al acabar se cierra el fichero
     *  
     *   Usando BufferedReader
     *  
     *  Capturaremos las excepciones que se puedan producir 
     *  incluidas las de conversión de formato. Las líneas con errores se ignoran
     *  continuando la ejecución del programa
     */
    public void leerFicheroDeTexto(String nombre)  
    {
        File f = null;
        BufferedReader br = null;
        try{
            f = new File (nombre);
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();
            while(linea != null)
            {
                lista.add(Integer.parseInt(linea));

                linea = br.readLine();
            }
        }
        catch(FileNotFoundException e )
        {
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e )
        {
            System.out.println("Fichero no encontrado");
        }
        finally

        {
            try{
                if(br !=null)
                    br.close();
            }
            catch(IOException e)
            {
               System.out.println("Error"); 
            }

        }

    }

    /**
     *  lee de un fichero de texto que elegiremos desde una ventana JFileChooser
     *  una serie de nºs enteros y cada nº lo guarda en la lista
     *  Al acabar se cierra el fichero
     *  
     *   Usando BufferedReader
     *  
     * Capturaremos las excepciones que se puedan producir 
     *  incluidas las de conversión de formato. Las líneas con errores se ignoran
     *  continuando la ejecución del programa
     */
    public void leerFicheroDeTextoFileChooser()  
    {

    }

    /**
     *  Devuelve un objeto File obtenido a partir de una ventana
     *  de diálogo JFileChooser
     */
    public File obtenerFichero()
    {
        JFileChooser elector = new JFileChooser();
        // abrimos la ventana de diálogo en el directorio actual
        // elector.setCurrentDirectory(new File(System.getProperty("user.dir")));
        elector.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros java y de texto","java", "txt");
        elector.setFileFilter(filtro); 
        if (elector.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) 
        {
            System.out.println("Se ha pulsado Cancelar al abrir");
            return null;
        }

        File f = elector.getSelectedFile();
        return f;
    }

    /**
     *  lee de un fichero de texto cuyo nombre se pasa
     *  como argumento una serie de nºs enteros y cada nº lo guarda en la lista
     *  Al acabar se cierra el fichero
     *  
     *   Usando Scanner
     *  
     *  
     *  Capturaremos las excepciones que se puedan producir 
     *  incluidas las de conversión de formato. Las líneas con errores se ignoran
     *  continuando la ejecución del programa
     */
    public void leerFicheroDeTextoConScanner(String nombre)  
    {

    }

    /**
     * Representación textual de la colección
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder("Lista de números\n");
        for (Integer n : lista)
        {
            sb.append(n + " ");
        }
        return sb.toString();
    }

    /**
     * Muestra la lista en pantalla
     */
    public void mostrarLista()
    {
        System.out.println(this.toString());
    }

    public static void main(String args[])
    {
        ListaNumeros lista = new ListaNumeros();
        List<Integer> datos = Arrays.asList(4, 6, 7, 8, 3, 2, 1, 9, 80);
        for (int i: datos)
        {
            lista.add(i);
        }
        lista.salvarEnFicheroDeTexto("numeros.txt");

        lista.borrarLista();
        lista.leerFicheroDeTexto("numeros.txt");
        if (!lista.estaVacia())
        {
            System.out.println("Después de leerFicheroDeTexto() con BufferedReader");
            System.out.println(lista.toString() + "\n");
        }
        lista.borrarLista();

        lista.leerFicheroDeTextoConScanner("numeros.txt");
        if (!lista.estaVacia())
        {
            System.out.println("Después de leerFicheroDeTextoConScanner()");
            System.out.println(lista.toString() + "\n");
        }
        lista.borrarLista();

        lista.leerFicheroDeTextoFileChooser();
        if (!lista.estaVacia())
        {
            System.out.println("Después de leerFicheroDeTextoFileChooser()");
            System.out.println(lista.toString() + "\n");
        }
    }

}
