
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Representa una lista de números enteros
 *  
 */
public class Lista
{
    private  List<Integer> lista;

    /** 
     *  Constructor  
     */
    public Lista() throws  IOException
    {
        lista = new ArrayList<Integer>();
        addNumero(5);
        addNumero(2);
        addNumero(5);
        addNumero(7);
        addNumero(7);
        addNumero(5);
        addNumero(10);
        addNumero(15);
        addNumero(25);
        addNumero(15);

    }

    /**
     * Añadir un nº a la lista en la posición adecuada
     * Utiliza el método privado buscarPosicion()
     */

    public void addNumero(int n)
    {
        lista.add(buscarPosicion(n), n);

    }

    /**
     * Dado un nº devuelve la posición de la lista en
     * la que hay que insertarlo
     */
    private int buscarPosicion(int n)
    {
        for(int i = 0; i< lista.size(); i++ )
        {
            if(lista.get(i)>n)
            {
                return i;
            }
        }

        return lista.size();

    }

    /**
     * Borra de la lista todos los elementos repetidos
     *   
     */
    public void borrarRepetidos()
    {
        for(int i = lista.size()-1; i >=0; i--)
        {
            for(int j = lista.size()-1; j >=0; j--)
            {
                if(j != i && lista.get(j) == lista.get(i))
                {
                    lista.remove(j);
                }

            }

        }
    }

    /**
     * Borra un nº de la lista dada la posición
     */
    public void borrarDePosicion(int pos)
    {
        if(pos > 0 && pos <  lista.size()){
            lista.remove(pos - 1);
        }
    }

    /**
     * Detecta si está o no la lista vacía
     */
    public  boolean estaVacia()
    {
        return lista.isEmpty();  
    }

    /**
     * Cargar la lista desde un fichero numeros.txt.
     * Cada línea del fichero contiene un nº
     * Lee los nºs con Scanner. Propaga las posibles excepciones
     */
    public void cargarDeFichero( )  throws FileNotFoundException
    {
        File f = new File("numeros.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            int n = Integer.parseInt(sc.nextLine());
            lista.add(buscarPosicion(n), n);

        }
        sc.close();
    }

    /**
     * Salvar la lista en un fichero de texto resultado.txt
     * Cada nº en una línea
     * Propaga las posibles excepciones
     */
    public void salvarEnFichero( )  throws FileNotFoundException, IOException
    {
        File f = new File("resultado.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

        for(int salida: lista)
        {
            pw.println(salida);
        }
        pw.close();

    }

    /**
     * Devolver una copia de la lista
     */
    public  List<Integer> getModelo()
    {
        List<Integer> copia = new ArrayList<Integer>();
        copia.addAll(lista);
        return copia;

    }

    /**
     * Representación textual de la lista
     */
    public String toString()
    {
        StringBuilder sb =  new StringBuilder();
        for (Integer i: lista)
            sb.append(i + "\n");
        return sb.toString();
    }

    /**
     *  
     */
    public static void main(String[] param) throws IOException
    {
        Lista lst = new Lista();
        lst.addNumero(5);
        lst.addNumero(2);
        lst.addNumero(5);
        lst.addNumero(7);
        lst.addNumero(7);
        lst.addNumero(5);
        lst.addNumero(10);
        lst.addNumero(15);
        lst.addNumero(25);
        lst.addNumero(15);

    }
}
