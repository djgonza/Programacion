
/**
 * La clase mantiene un map en el
 * que se registran las veces que 
 * aparece cada uno de los n�meros
 * de un fichero de texto
 * 
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrecuenciaNumeros
{
    private HashMap<String,Contador> frecuencia;
    /**
     * Constructor de la clase FrecuenciaNumeros
     */
    public FrecuenciaNumeros()
    {
        frecuencia = new HashMap<>();

    }

    /**
     * 
     *
     * @param  el n� a a�adir    
     */
    public void a�adirNumero(int numero)
    {
        String clave = String.valueOf(numero);
        if(!frecuencia.containsKey(clave))
        {
            frecuencia.put(clave, new Contador(1));
        }
        else
            frecuencia.get(clave).incrementar();

    }
    
    /**
     * lee los n�meros de un fichero de texto 
     * Este m�todo no hay que modificarlo
     *      
     */
    public void cargarDeFichero() 
    {
        try
        {
            Scanner sc = new Scanner(new File("numeros.txt"));
            while (sc.hasNext() )
            {
                a�adirNumero(sc.nextInt());
            }
            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 
     * Listar cada n�mero aparecido y su frecuencia
     * Se utiliza Map.Entry
     */
    public void listarFrecuencias()
    {
        Set<Map.Entry<String,Contador>> lista = frecuencia.entrySet();
        for(Map.Entry<String,Contador> aux : lista)
        {
            System.out.println(" El numero " + aux.getKey() + " ha salido " + aux.getValue());
        }


    }

    /**
     * 
     * Muestra cu�ntos n�meros diferentes han aparecido
     * y la relaci�n de todos ellos
     * 
     * Se utiliza la "vista" sobre las claves
     * y un for each
     */
    public void listarNumeros()
    {
        Set<String> lista = frecuencia.keySet();
        System.out.println(" Han salido " + frecuencia.size() + " n�meros diferentes ");
        for(String aux : lista)
        {
            
            System.out.println(aux);
        }
        
        
        
        
        
        
        
        
        

    }
}
