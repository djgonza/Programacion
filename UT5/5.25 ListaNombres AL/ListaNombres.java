
/**
 * La clase mantiene una lista de nombres
 * en orden léxicográfico  
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class ListaNombres
{
    private String[]  lista;
    private int pos;

    /**
     * Constructor de la clase ListaNombres
     */
    public ListaNombres(int n) 
    {              
        pos = 0;
        lista = new String[n];
    }

    /**
     * @return  true si la lista está vacía   
     */
    public boolean  listaVacia()
    {
        return pos == 0;      

    }

    /**
     * 
     * @return  true si la lista está llena   
     */
    public boolean  listaLlena()
    {
        return pos == lista.length;     

    }

    /**
     * Inserta un nombre en la lista únicamente
     * si no está y la lista no está llena. La inserción se hace de tal
     * manera que el nombre queda colocado en el 
     * lugar que le corresponde manteniendo el orden 
     * de la lista (no se utiliza ningún algoritmo de ordenación)
     * Importan mayúsculas y minúsculas
     * 
     * @param nombre el nombre a insertar
     * @return  true si la inserción se hace con éxito   
     *
     */
    public boolean insertarNombre(String nombre)
    {
        if(listaLlena() || estaNombre(nombre))  
            return false;

        // buscar hueco mientras se desplaza
        int j = pos - 1;
        while (j >= 0 && lista[j].compareTo(nombre) > 0)
        {
            lista[j + 1] = lista[j];
            j --;
        }
        lista[j + 1] = nombre;  // insertar el valor
        pos++;  // incrementamos el nº de elementos en la lista
        return true;

        //         for(int i = 0; i < pos; i++)
        //         {
        //             if(nombre.compareTo(lista[i]) < 0 && nombre.compareTo(lista[i+1]) > 0){
        //                 for(int j = pos; j > i ; j--)
        //                 {
        //                     lista[j] = lista[j - 1];  
        //                 }
        // 
        //                 lista[i] = nombre;
        //                 pos++;
        //                 return true;
        // 
        //             }
        //         }
        //         return false;
    }

    /**
     *  Busca un nombre en la lista
     *  Puesto que la lista está en todo momento ordenada
     *  se hace una búsqueda binaria
     *  @param  nombre el nombre a buscar
     *  @return   true si ya existe el nombre en la lista  
     *   
     */
    private boolean estaNombre(String nombre)
    {

        return Arrays.binarySearch(lista, 0, pos,nombre) >= 0;

    }

    /**
     *  Busca y devuelve el nombre de mayor longitud
     *  en la lista. Si hay varios devuelve el
     *  primero encontrado
     *  Si la lista está vacía devuelve null
     *  
     *  @return   el nombre más largo  
     *  
     */
    public String nombreMasLargo()
    {
        if(listaVacia())
            return null;
        String aux = lista[0];
        for(int i = 1; i < pos; i++)
        {
            if (lista[i].length() > aux.length())
                aux = lista[i];

        }
        return aux;

    }

    /**
     * Borra de la lista los nombres que empiezan por 
     * una letra determinada (sí importan mayúsculas y minúsculas)
     * No es lo mismo borrarLetra('A') que borrarLetra('a')
     *
     * @param letra la letra por la que han de empezar los nombres 
     *    
     */
    public void borrarLetra(char letra)
    {
        //String str = String.valueOf(letra);
        for(int i = pos - 1; i >= 0 ; i--){
            if(lista[i].charAt(0) == letra)
            {
                borrarDePosicion(i);
                
            }

        }

    }

    /**
     * Borra un nombre de la posición indicada
     * 
     *
     * @param  p posición del nombre a borrar
     *  
     */
    public void borrarDePosicion(int p)
    {
        if (p >= 0 && p < pos)  // posición correcta
        {   
            // desplazar a la izquierda
            for (int i = p + 1; i < pos; i++)
                lista[i - 1] = lista[i];
            pos--;
        }
    }

        
    /**
     * Cuenta cuántos nombres empiezan por una determinada 
     * cadena sin importar si es mayúscula o minúscula
     *
     * @param  la cadena de comienzo
     * @return  la cantidad de nombres calculados   
     */
    public int empiezanPor(String inicio)
    {
        String[] aux = Arrays.copyOf(lista,pos);
        int cont = 0;
        for(int i = 0; i < aux.length; i++)
        {
            if(aux[i].toLowerCase().startsWith(inicio.toLowerCase()))
            {
                cont++;
            }
            
        }
        return cont;

    }
    
    /** 
     * 
     * Devuelve un array con los  nombres que empiezan por una determinada 
     * letra sin importar si es mayúscula o minúscula
     * 
     * @param  la letra de comienzo
     * @return  la cantidad de nombres encontrados
     *          con esa letra   
     */ 
    public String[] empiezanPorLetra(char letra)
    {
        int cont = 0;
        String[] aux = new String[pos];
        for(int i = 0; i < pos; i++)
        {
            if(lista[i].charAt(0) == letra)
            {
                aux[cont] = lista[i];
                cont++;
            }
            
        }
         
        return Arrays.copyOf(aux, cont);

    }
    
    /**
     * Representación textual de la cadena
     * 
     * @return la cadena resultante    
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos; i++)
        {
            sb.append(lista[i]).append('\n');
        }
        return sb.toString();

    }

    /**
     * Lee de un fichero de texto una serie 
     * de nombres con ayuda de un objeto de la 
     * clase Scanner y los almacena en la lista
     */
    public void cargarDeFichero() 
    {
        try
        {
            Scanner sc = new Scanner(new File("nombres.txt"));
            while (sc.hasNextLine() && !listaLlena())
                insertarNombre(sc.nextLine());
            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
