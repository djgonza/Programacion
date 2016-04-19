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
     * A�ade un animal solo si no est�
     *  Si el array est� completo lanzar la excepci�n RuntimeException
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
     *  devuepve true si est� el animal, false en otro caso
     *
     */
    public boolean estaAnimal(Animal a)
    {

    }

    /**
     * 
     * devuelve el animal de la posici�n i
     * Si i es incorrecto lanzar la excepci�n IllegalArgumentException
     */
    public Animal getAnimal(int i)
    {

    }

    /**
     * Contar cu�ntos perros hay en la granja
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
     * Cu�ntas vacas iguales a v hay en la granja
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
     *  Extraer los datos de una l�nea y crear el animal correspondiente
     *  Formato de la l�nea
     *          1,nombre,patas,nombredue�o,edaddue�o,lugar         para perro 
     *          2,nombre,patas,nombredue�o,edaddue�o,juguete       para gato 
     *          3,nombre,patas,nombredue�o,edaddue�o               para vaca  
     *          
     *  Asumimos todos los datos correctos
     */
    private Animal parsearLinea(String linea)
    {
        String[] datos = linea.split(",");
        String nombre = datos[1];
        int patas = Integer.parseInt(datos[2]);
        String due�o = datos[3];
        int  edad = Integer.parseInt(datos[4]);
        Persona p = new Persona(due�o, edad);

    }

    /**
     *  Guardar en un fichero los datos de los animales
     *  con PrintWriter / BufferedWriter / FileWriter
     *  
     *  Usa el m�todo guardarLinea()
     */
    public void salvarEnFicheroTexto(String nombre)
    {
        File f = new File(nombre);
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(f))); // abrir el fichero

        
    }

    /**
     *  Crear una l�nea los datos por cada animal separados por , y al 
     *  principio de la l�nea el caracter 1 (perro), 2 (gato), 3 (vaca)
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
