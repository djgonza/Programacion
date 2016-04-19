import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase Granja 
 *  
 */
public class Granja
{

    private Animal[] animales;
    private int total;

    /**
     * Constructor de la clase Granja
     */
    public Granja(int cuantos)
    {
        animales = new Animal[cuantos];
        total = 0;
    }

    /**
     * Añade un animal solo si no está
     *  Si el array está completo lanzar la excepción RuntimeException
     */
    public void addAnimal(Animal a) throws RuntimeException
    {
        if (total == animales.length)
            throw new RuntimeException("Granja completa");
        if (!estaAnimal(a))
        {
            animales[total] = a;
            total++;
        }
    }

    /**
     *  devuepve true si está el animal, false en otro caso
     *
     */
    public boolean estaAnimal(Animal a)
    {

    }

    /**
     * 
     * devuelve el animal de la posición i
     * Si i es incorrecto lanzar la excepción IllegalArgumentException
     */
    public Animal getAnimal(int i)
    {

    }

    /**
     * Contar cuántos perros hay en la granja
     */
    public int cuantosPerros()
    {
        int perros = 0;
        for (int i = 0; i < total; i++)
            if (animales[i] instanceof Perro)
                perros++;
        return perros;
    }

    /**
     * Borrar los gatos de la granja
     */
    public  void borrarGatos()
    {
        int i = 0;
        while (i < total)
        {
            if (animales[i] instanceof Gato)
            {
                // borrar un gato
                for (int j = i + 1; j < total; j++)
                    animales[j - 1] = animales[j];
                total--;
            }
            else
                i++;
        }
    }

    /**
     * Cuántas vacas iguales a v hay en la granja
     */
    public  int vacasIgualesA(Vaca v)
    {
        int cuantas = 0;
        for (int i = 0; i < total; i++)
            if (animales[i].equals(v))
                cuantas++;
        return cuantas;
    }

    /**
     * 
     * mostar la granja
     */
    public void mostrarAnimales()
    {
        for (int i = 0; i < total; i++)
            System.out.println(animales[i].toString());
    }

    /**
     *  Leer desde un fichero los datos de los animales
     *  con BufferedReader
     */
    public void cargarDeFicheroTexto(String nombre)
    {
        File f = new File(nombre);
        entrada = new BufferedReader(new FileReader(f));

    }

    /**
     *  Extraer los datos de una línea y crear el animal correspondiente
     *  Formato de la línea
     *          1,nombre,patas,nombredueño,edaddueño,lugar         para perro 
     *          2,nombre,patas,nombredueño,edaddueño,juguete       para gato 
     *          3,nombre,patas,nombredueño,edaddueño               para vaca  
     *          
     *  Asumimos todos los datos correctos
     */
    private Animal parsearLinea(String linea)
    {
        String[] datos = linea.split(",");
        String nombre = datos[1];
        int patas = Integer.parseInt(datos[2]);
        String dueño = datos[3];
        int  edad = Integer.parseInt(datos[4]);
        Persona p = new Persona(dueño, edad);

    }

    /**
     *  Guardar en un fichero los datos de los animales
     *  con PrintWriter / BufferedWriter / FileWriter
     *  
     *  Usa el método guardarLinea()
     */
    public void salvarEnFicheroTexto(String nombre)
    {
        File f = new File(nombre);
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(f))); // abrir el fichero

        
    }

    /**
     *  Crear una línea los datos por cada animal separados por , y al 
     *  principio de la línea el caracter 1 (perro), 2 (gato), 3 (vaca)
     */
    private void guardarLinea(Animal a, PrintWriter salida)
    {

    }

    /**
     *  Guardar en un fichero el total de perros que hay en la granja
     *
     */
    public void salvarTotalPerros(String nombre)
    {

    }

    /**
     *  Leer desde un fichero los datos de los animales
     *  con Scanner
     */
    public void cargarDeFicheroTextoConScanner(String nombre)
    {
        File f = new File(nombre);
        Scanner entrada = new Scanner(f);

    }
}
