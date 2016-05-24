import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 * Calculadora
 */
public class Calculadora
{
    private int cantidad; // cantidad de nºs introducidos
    private double suma; // suma de todos los nºs
    private int maximo; // el valor máximo de los nºs introducidos
    private int minimo;  // el valor mínimo de los nºs introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     */
    public Calculadora()
    {
        cantidad = 0;
        suma = 0;
    }

    /**
     * añade un nº a la calculadora
     * 
     * @param  el nº a añadir   
     */
    public void addNumero(int numero)
    {
        this.suma += numero;
        cantidad++;
        if (cantidad == 1)
        {
            maximo = numero;
            minimo = numero;
        }
        else
        {
            if (numero > maximo)
                maximo = numero;
            if (numero < minimo)
                minimo = numero;
        }
    }

    /**
     * accesor para la media
     */
    public double getMedia()
    {
        return ( suma / cantidad );
    }

     /**
     * accesor para la cantidad de números
     */
    public int getCantidad()
    {
        return cantidad;
    }

     /**
     * accesor para el máximo
     */
    public int getMaximo()
    {
        return maximo;
    }

     /**
     * accesor para el mínimo
     */
    public int getMinimo()
    {
        return minimo;
    }

    /**
     * resetear la calculadora poniendo todo a 0
     */
    public void reset()
    {
        cantidad = 0;
        suma = 0;
        maximo = 0; 
        minimo = 0; 
        
    }

    /**
     * guarda en el fichero indicado los resultados, la cantidad de números,
     * la suma de todos ellos, el máximo y el mínimo
     * 
     */
    public void registrar(File f) throws IOException
    {
       PrintWriter pw = new PrintWriter(new FileWriter(f)); 
       pw.println("Total numeros: " + cantidad);
       pw.println("Media: " + (suma/cantidad));
       pw.println("Minimo: " + minimo);
       pw.println("Maximo: " + maximo);
       pw.close();

    }

    /**
     * Escribir las estadísticas en pantalla
     * 
     */
    public void printEstadisticas()
    {
        System.out.println("Estadística final ");
        System.out.println("Nº total del nºs introducidos: " + cantidad);
        System.out.println("Suma total de los  nºs introducidos: " + suma);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        // System.out.println("Media de todos los nºs: " + getMedia());   
        System.out.printf("Media de todos los nºs: %f ", getMedia()); 
    }
    
    /**
     *  
     */
    public static void main(String[] args) throws IOException
    {
        Calculadora demo = new Calculadora();
        demo.addNumero(3);
        demo.addNumero(5);
        demo.registrar(new File("prueba.txt"));

    }

}
