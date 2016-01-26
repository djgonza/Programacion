import java.util.Arrays;
/**
 * Representa a una palabra
 * 
 */
public class Palabra
{
    private static final char ASTERISCO = '*';
    private String palabra;

    /**
     * Constructor de la clase Palabra
     */
    public Palabra(String palabra)
    {
        this.palabra = palabra;
    }

    /**
     *  
     */
    public String invertir()
    {
        //         StringBuilder sb = new StringBuilder();
        //         
        //         sb.append(this.palabra).reverse();
        //         return sb.toString();

        return new StringBuilder().append(this.palabra).reverse().toString();

    }

    /**
     * Devuelve una palabra con guiones insertados
     * @return  la palabra con guiones 
     */
    public String guionizar()
    { 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < palabra.length(); i++)
        {
            sb.append(palabra.charAt(i));
            if(i != palabra.length() - 1)
                sb.append('-');
        }
        return sb.toString();

    }

    /**
     * 
     * @return   el nº de vocales de la palabra  
     */
    public int contarVocales()
    {
        int vocal = 0;
        for(int i = 0; i < palabra.length(); i++)
        {
            if (esVocal(palabra.charAt(i)))
                vocal++;
        }
        return vocal;

    }
    /**
     *  
     */
    private boolean esVocal(char car)
    {
        return car == 'a' || car == 'A' || car == 'e' || car == 'E' || car == 'i' || car == 'I' || car == 'o' || car == 'O' || car == 'u' || car == 'U';

    }

    /**
     * Compara la palabra actual con la recibida como parámtero
     *
     * @param  la palabra con la que comparar
     * @return  true si son mayor, false en otro caso 
     */
    public boolean mayorQue(String palabra)
    {
        return this.palabra.compareTo(palabra) > 0;

    }

    /**
     *  
     */
    public boolean esPalindromo()
    {
        return this.palabra.equalsIgnoreCase(invertir());

    }

    /**
     * Borrar las apariciones de str en palabra
     *  
     *  Usar indexOf() y substring()
     */
    public String borrarOcurrenciasDe(String str)
    {
        String aux = palabra;

        while(aux.indexOf(str) >= 0 )
        {
            aux = aux.substring(0, aux.indexOf(str)) + aux.substring(aux.indexOf(str) + str.length());
        }

        return aux;

    }

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        Palabra aux = new Palabra("DAVID"); 
        System.out.println(aux.borrarOcurrenciasDe("V"));
        //         System.out.println(aux.toArray());
        char[][] aux2 = aux.toArray2D();
        for(int i = 0; i < aux2.length; i++)
        {
            for(int j = 0; j < aux2[i].length; j++)
            {
                System.out.print(aux2[i][j]);
            }
            System.out.println();
        }
        
        
        
    }

    /**
     *  
     */
    public char[][] toArray2D()   
    {
        char[][] aux = new char[palabra.length()][palabra.length()];
        for (int i = 0; i < aux.length; i++)
        {
            for(int j = 0; j < i ; j++)
            {
                aux[i][j] = '*';
            }
            for(int p = i; p < aux.length; p++)
            {
                aux[i][p] = palabra.charAt(p);
            }
        }

        
        return aux;
    }

    /**
     *  
     */
    public char[] toArray()   
    {
        char[] aux = new char[palabra.length()];
        for (int i = 0; i < aux.length; i++)
        {
            aux[i] = palabra.charAt(i);
        }
        return aux;

    }

    /**
     * 
     *  
     */
    public void print()
    {
        for (char[] fila: toArray2D())
        {
            System.out.println(Arrays.toString(fila));
        }

    }

}
