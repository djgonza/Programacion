import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
/**
 *    Guarda en una lista una serie de nºs enteros
 */
public class ListaNumeros
{

    private List<Integer> lista;

    /**
     * Constructor de la clase ListaNumeros
     */
    public ListaNumeros()
    {
        lista = new ArrayList<>();
    }

    /**
     *  
     */
    public void add(int numero)
    {
        lista.add(numero);
    }

    /**
     *  Vacia la lista de números
     */
    public void vaciarLista()
    {
        lista.clear();
    }

    /**
     *  lee del fichero de texto especificado como parámetro
     *  una serie de números y los añade a la lista en memoria
     *  El fichero de texto contiene una serie de líneas con formato
     *  n1:n2:n3:.... , es decir, en cada línea hay una serie de números separados por
     *  el caracter :
     *  
     *  El fichero se lee línea a línea (con BufferedReader) y con ayuda del
     *  método parserLinea() se extrae cada nº y se añade a la lista. 
     *  Se capturarán aquí todas las posibles excepciones
     *  
     *  
     *  El método devuelve la cantidad total de valores erróneos leídos
     */
    public int leerDeFicheroV1(String nombre)
    {
        File f = null;
        BufferedReader br = null;
        int cont = 0;
        try{
            f = new File(nombre);
            br = new BufferedReader(new FileReader(f));
            String linea = br.readLine();
            while(linea != null)

            {
                cont += parsearLinea(linea);
                linea = br.readLine();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e){
            System.out.println("Error al leer el fichero");
        }
        finally{

            if(br != null)
            {
                try{
                    br.close(); 
                }
                catch (IOException e){
                    System.out.println("Error al leer el fichero");
                }
            }
        }
        return cont;

    }

    /**
     *  A partir de una línea de texto extrae los números y los añade a la lista
     *  Las excepciones de formato se capturarán contabilizando los nºs erróneos
     *  que se detectan. El programa no para cuando encuentra un error
     */
    private int parsearLinea(String linea)  
    {
        int cont = 0;
        String[] numeros = linea.split(":");
        for(String numero: numeros)
        {

            try{
                int tmp = Integer.parseInt(numero);
                add(tmp);
            }
            catch (NumberFormatException e){
                cont++;

            }
        }
        return cont;
    }

    /**
     *   Haz lo mismo que en leerDeFicheroV1() pero ahora usando la clase Scanner
     *  
     *  El fichero se lee línea a línea (con Scanner) y con ayuda del
     *  método parserLinea() se extrae cada nº y se añade a la lista. 
     *  Se capturarán aquí todas las posibles excepciones
     *  
     *  
     *  El método devuelve la cantidad total de valores erróneos leídos
     */
    public int leerDeFicheroV2(String nombre)
    {
        File f = null;
        Scanner sc = null;
        int cont = 0;
        try {
            f = new File(nombre);
            sc = new Scanner(new FileReader(f));

            while (sc.hasNext()){

                cont += parsearLinea(sc.nextLine());

            }

        }catch(IOException e){
            System.out.println("Error al leer el fichero");
        }finally{
            if(sc != null){
                sc.close();
            }
        }

        return cont;
    }

    /**
     *  Calcula y devuelve el valor máximo de la colleción (usa la clase Collections)
     */
    public int maximo()
    {
        return Collections.max(lista);
    }

    /**
     *  Devuelve una colección ordenada de mayor a menor
     *  Sin modificar la coleción original
     */
    public List<Integer> ordenarDescendente()
    {
        List<Integer> retornar = new ArrayList<Integer>(lista);
        Collections.sort(retornar, Collections.reverseOrder());
        return retornar;
    }

    /**
     *  Guarda en el fichero cuyo nombre indica el parámetro
     *  el valor máximo de la colección en una línea y 
     *  la colección ordenada descendentemente en otra línea
     *  
     *  Se propagarán todas las posibles excepciones
     */
    public void salvarEnFichero(String nombre) throws IOException
    {
        File f = new File(nombre);
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(f))); // abrir el fichero

        StringBuilder sb = new StringBuilder();
        for(int numero : lista){
            sb.append(numero + ":");
        }

        salida.println(maximo());

        salida.println(sb.toString());
        salida.close();
    }

    /**
     *  - crea un objeto ListaNumeros
     *  - lee del fichero "numeros.txt" los nºs y guárdalos en la lista (usa leerDeFicheroV1())
     *  - muestra la cantidad de valores erróneos leídos
     *  - guarda en el fichero "resultado1.txt" el máximo y la lista en orden descendente
     *  - vacia la lista
     *  - lee del fichero "numeros.txt" los nºs y guárdalos en la lista (usa leerDeFicheroV2())
     *  - guarda en el fichero "resultado2.txt" el máximo y la lista en orden descendente
     *  
     *   Propaga todas las posibles excepciones
     */
    public static void main(String[] args)  
    {

        ListaNumeros demo = new ListaNumeros();

        System.out.println("Errores: " + demo.leerDeFicheroV1("numeros.txt"));
        try{
            demo.salvarEnFichero("resultado1.txt");
        }catch (IOException e){
            System.out.println("Error al scribir en el fichero");
        }
        demo.vaciarLista();
        demo.leerDeFicheroV2("numeros.txt");
        try{
            demo.salvarEnFichero("resultado2.txt");
        }catch (IOException e){
            System.out.println("Error al scribir en el fichero");
        }

    }
}
