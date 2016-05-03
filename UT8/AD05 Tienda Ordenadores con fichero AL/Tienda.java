import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *  
 */
public class Tienda
{
    private static final String NOMBRE = "tienda.txt";
    private String nombre; 
    private  List<Ordenador> ordenadores;

    /**
     * Constructor  
     */
    public Tienda(String nombre)
    {
        this.nombre = nombre;
        ordenadores = new ArrayList<Ordenador>();
    }

    /**
     *  
     */
    public void addOrdenador(Ordenador ord)
    {
        if (!ordenadores.contains(ord))
            ordenadores.add(ord);
    }

    /**
     * 
     */
    public  int cuantosPortatiles()
    {
        int cuantos = 0;
        for (Ordenador ord: ordenadores)
        {
            if (ord instanceof Portatil)
                cuantos++;
        }
        return cuantos;
    }

    /**
     * 
     */
    public  String masBarato()
    {
        String codMenorPrecio = null;
        double menorPrecio = Double.MAX_VALUE;
        Iterator<Ordenador> it = ordenadores.iterator();
        while (it.hasNext())
        {
            Ordenador ord = it.next();
            if (ord.getPrecio() < menorPrecio)
            {
                codMenorPrecio = ord.getCodigo();
                menorPrecio = ord.getPrecio();
            }
        }
        return codMenorPrecio;
    }

    /**
     * 
     */
    public  void borrarMasBarato()
    {
        String barato = masBarato();

        Iterator<Ordenador> it = ordenadores.iterator();
        while (it.hasNext())
        {
            Ordenador ord = it.next();
            if (ord.getCodigo().equalsIgnoreCase(barato))
            {
                it.remove();

            }
        }

    }

    /**
     * 
     */
    public  void ordenarPorPrecio()
    {
        Collections.sort(ordenadores);
    }

    /**
     * Con esta versión me evito crear la clase ComparadorCodigo
     */
    public  void ordenarPorCodigo()
    {
        Collections.sort(ordenadores,  new Comparator<Ordenador>()  
            {
                public int compare(Ordenador ord1, Ordenador ord2)
                {
                    return ord1.getCodigo().compareToIgnoreCase(ord2.getCodigo());
                }

            });
    }

    /**
     * 
     */
    public  List<Portatil> ordenarPorPrecioLosPortatiles()
    {
        List<Portatil> portatiles = new ArrayList<Portatil>();
        for (Ordenador ord: ordenadores)
        {
            if (ord instanceof Portatil)
                portatiles.add((Portatil) ord);
        }
        Collections.sort(portatiles);
        return portatiles;

    }

    /**
     * Aquí propagamos las excepciones
     */
    public  void salvarEnFichero() throws FileNotFoundException
    {
        File f = new File("nombre.txt");
        PrintWriter pw = new PrintWriter(f); 
        for(Ordenador ord: ordenadores)
        {
            guardarOrdenador(ord,pw);
        }
        pw.close();

    }

    /**
     * Escribe los datos de un objeto Ordenador en una línea de texto añadiendo una P
     * en la línea si portátil y una S si sobremesa. El separador de los campos
     * en la línea es el carácter :
     */
    private void guardarOrdenador(Ordenador ord, PrintWriter pw)
    {
        StringBuilder sb = new StringBuilder();

        sb.append(ord.getCodigo());
        sb.append(":");
        sb.append(ord.getPrecio());
        sb.append(":");

        if (ord instanceof Portatil){
            Portatil pt = (Portatil) ord;
            sb.append(pt.getPeso());
            sb.append(":");
            sb.append("P");
        }
        if (ord instanceof SobreMesa){
            SobreMesa sm = (SobreMesa) ord;
            sb.append(sm.getDescripcion());
            sb.append(":");
            sb.append("S");
        }

        //codigo:precio:peso:P si portátil y codigo:precio:descripción:S

        pw.println(sb.toString());

    }

    /**
     * Aquí capturamos las excepciones
     */
    public  void leerDeFichero()
    {
        File f = null;
        BufferedReader br = null;
        try{
            f = new File("nombre.txt");
            br = new BufferedReader(new FileReader(f));

            String linea= br.readLine();
            while(linea != null)
            {
                ordenadores.add(procesarLinea(linea));
                linea = br.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error al leer de fichero");

        }
        finally
        {
            if(br!=null){

                try{
                    br.close();
                }
                catch(IOException e)
                {
                    System.out.println("Error al leer de fichero");

                }
            }
        }

    }

    /**
     * Extrae de una línea de texto los datos de un ordenador
     * formato de la línea  codigo:precio:peso:P    si portátil
     *                      codigo:precio:descripción:S    si sobremesa
     */
    private Ordenador procesarLinea(String linea)
    {
        String[] aux = linea.split(":");
        if(aux[3].equalsIgnoreCase("P"))
        {
            return new Portatil(aux[0], Double.parseDouble(aux[1]),Double.parseDouble(aux[2]));
        }
        else
        {
            return new SobreMesa(aux[0], Double.parseDouble(aux[1]),aux[2]);
        }
    }

    /**
     * 
     */
    public  String toString()
    {
        StringBuilder sb = new StringBuilder("Tienda: " + nombre + "\n");
        for (Ordenador ord: ordenadores)
        {
            sb.append(ord.toString());
        }
        return sb.toString();
    }

}
