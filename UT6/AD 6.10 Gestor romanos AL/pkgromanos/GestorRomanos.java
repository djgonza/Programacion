/**
 * La clase GestorArabigos genera una lista
 * de nºs arábigos con sus correspondientes
 * nºs romanos.
 * La lista está ordenada por nº arábigo
 * Para modelar la lista se utiliza un TreeMap
 */

package pkgromanos;
import javax.swing.JOptionPane;
import java.util.TreeMap;


public class GestorRomanos
{
    
    private  TreeMap<Integer, String> listaArabigos;
    private ConversorRomanos conversor;

    /**
     * Constructor 
     */
    public GestorRomanos(ConversorRomanos conversor)
    {
        listaArabigos = new TreeMap<>();
        this.conversor = new ConversorRomanos();      
    }

    /**
     * Añadir un romano. Se añade la clave que es 
     * su valor arábigo y el valor asociado que es
     * el nº romano
     * 
     * @param  romano el nº romano se añade como 
     *          valor asociado.
     * 
     */
    public void aniadirRomano(String romano)
    {
        int aux = conversor.convertir(romano);
        listaArabigos.put(aux, romano);
    }
    
    /**
     * Añadir varios romanos.  
     * 
     * @param  el array con los nºs romanos
     * 
     */
    public void aniadirRomanos(String[] romanos)
    {
        for(String romano : romanos){
            aniadirRomano(romano);
        }       
    }
    
    /**
     * representación  textual del map
     *
     */
    public String toString()
    {
       return listaArabigos.toString();
        
        
        
    }
    
    /**
     * Mostar la lista de arábigos   
     * Salida gráfica con JOptionPane
     */
    public void escribirListaArabigos()
    {
        JOptionPane.showMessageDialog(null, "Arábigos - Romanos \n " + toString(),
                "Nºs arábigos y sus romanos", JOptionPane.INFORMATION_MESSAGE);
                                
                            
        
    }
    
   
}
