import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * 
 */
public class AppPaises
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
         ArrayList<Pais> paises = new ArrayList<Pais>();
         paises.add(new Pais("Francia", 234, 37));
         paises.add(new Pais("Noruega", 198, 15));
         paises.add(new Pais("Suecia", 200, 21));
         paises.add(new Pais("Dinamarca", 100, 9));
         System.out.println("Ordenado  por superficie");
         
         
         
         for (Pais p: paises)
            System.out.println(p.toString() + "\n");
            
         System.out.println("Ordenado  por habitantes");
         
         
         
         
         for (Pais p: paises)
            System.out.println(p.toString() + "\n");
    }
}
