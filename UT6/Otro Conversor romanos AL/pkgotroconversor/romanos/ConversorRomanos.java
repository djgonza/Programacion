/**
 * Clase ConversorRomanos representa a un
 * objeto que puede convertir u nº romano
 * a u nº arábigo y viceversa
 * 
 * jar -cvf [nombreArchivo.jar] [nombreDelPaquete]
 */
package  pkgotroconversor.romanos;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConversorRomanos
{
    public  LinkedHashMap<Character, Integer> map; 

    /**
     * Constructor 
     */
    public ConversorRomanos()
    {
        map = new LinkedHashMap<Character, Integer>();
        inicializar();
    }

    /**
     * Da valores iniciales al map
     */
    private void inicializar()
    {
        String letras = "MDCLXVI";
        int[] numeros = {1000, 500, 100, 50, 10, 5, 1};

        for (int i = 0; i < letras.length(); i++)
            map.put(letras.charAt(i), numeros[i]);
    }

    /**
     * convierte el nº romano a arábigo
     * @param el nº romano a convertir
     * @return el nº arábigo
     */
    public int aArabigo(String romano)
    {   
        romano = romano.toUpperCase();
        int arabigo = 0;
        for (int i = 0; i < romano.length(); i++)
            arabigo += map.get(romano.charAt(i));
        return arabigo;
    }

    /**
     * convierte el nº  arábigo (menor o igual a 4000, asumimos esto) a romano en notación antigua
     * @param el nº arábigo  a convertir
     * @return el nº romano
     * 
     * 
     */
    public String aRomano(int arabigo)
    {   
        //         String romano = "";
        //         while(arabigo > 0)
        //         {
        //             Set<Map.Entry<Character,Integer>> entradas = map.entrySet();
        //             for(Map.Entry<Character,Integer> entrada: entradas)
        //             {
        //                 if(arabigo >= entrada.getValue())
        //                 {
        //                     romano += entrada.getKey();               
        //                     arabigo -= entrada.getValue();
        //                     break;
        //                 }
        //             }
        //         }
        // 
        //         return romano;

        String romano = "";

        Set<Map.Entry<Character,Integer>> entradas = map.entrySet();
        for(Map.Entry<Character,Integer> entrada: entradas)
        {
            while(arabigo >= entrada.getValue())
            {
                romano += entrada.getKey();               
                arabigo -= entrada.getValue();
            }
        }
        return romano;
    }

    /**
     *  
     */
    public static void main(String[] args)
    {
        ConversorRomanos demo = new ConversorRomanos();
        System.out.println(demo.map.toString());
        System.out.println(demo.aRomano(1573));
        System.out.println(demo.aArabigo(demo.aRomano(1573)));
        System.out.println(demo.aRomano(345));
        System.out.println(demo.aArabigo(demo.aRomano(345)));
        System.out.println(demo.aRomano(23));
        System.out.println(demo.aArabigo(demo.aRomano(23)));
        System.out.println(demo.aRomano(1));
        System.out.println(demo.aArabigo(demo.aRomano(1)));

    }

}
