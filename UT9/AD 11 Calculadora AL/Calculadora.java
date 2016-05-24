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
    private int cantidad; // cantidad de n�s introducidos
    private double suma; // suma de todos los n�s
    private int maximo; // el valor m�ximo de los n�s introducidos
    private int minimo;  // el valor m�nimo de los n�s introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     */
    public Calculadora()
    {
        cantidad = 0;
        suma = 0;
    }

    /**
     * a�ade un n� a la calculadora
     * 
     * @param  el n� a a�adir   
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
     * accesor para la cantidad de n�meros
     */
    public int getCantidad()
    {
        return cantidad;
    }

     /**
     * accesor para el m�ximo
     */
    public int getMaximo()
    {
        return maximo;
    }

     /**
     * accesor para el m�nimo
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
     * guarda en el fichero indicado los resultados, la cantidad de n�meros,
     * la suma de todos ellos, el m�ximo y el m�nimo
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
     * Escribir las estad�sticas en pantalla
     * 
     */
    public void printEstadisticas()
    {
        System.out.println("Estad�stica final ");
        System.out.println("N� total del n�s introducidos: " + cantidad);
        System.out.println("Suma total de los  n�s introducidos: " + suma);
        System.out.println("Valor m�ximo: " + maximo);
        System.out.println("Valor m�nimo: " + minimo);
        // System.out.println("Media de todos los n�s: " + getMedia());   
        System.out.printf("Media de todos los n�s: %f ", getMedia()); 
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
