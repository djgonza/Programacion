
import java.util.Random;

/**
 * 
 */
public class DemoFor
{
    private Moneda moneda;
    private Random aleatorio;

    /**
     * Constructor  
     */
    public DemoFor()
    {
        moneda = new Moneda();
        aleatorio = new Random();
    }

    /**
     * Saludar 10 veces con for
     */
    public  void ejemploFor01()
    {

    }
    
    
    /**
     * Tirar una moneda 10 veces con for
     */
    public  void ejemploFor02()
    {
        
    }

    /**
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     */
    public  void ejemploFor03()
    {
        
    }

    /**
     * Ejer 4.15 a) de la UT4
     * Escribe la siguiente figura 
     * Si n = 6 entonces
     * 1   1   1   1   1   1 
     * 2   2   2   2   2  2
     * 3   3   3   3   3  3
     * 4   4   4   4   4  4
     * 5   5   5   5   5   5 
     * 6   6   6   6   6  6 
     */
    public  void escribirFiguraA(int n)
    {
        
    }

    /**
     * Ejer 4.15 b) de la UT4
     * Escribe la siguiente figura 
     *  Si n = 6 entonces
     *  
     * 1   
     * 2   2   
     * 3   3   3   
     * 4   4   4   4   
     * 5   5   5   5   5   
     * 6   6   6   6   6  6 
     */
    public  void escribirFiguraB(int n)
    {
        
    }

    /**
     * Ejer 4.15 c) de la UT4
     * Escribe la siguiente figura
     *  Si n = 6 entonces
     *  
     * 1   
     * 1  2
     * 1  2   3
     * 1  2   3    4
     * 1  2    3    4   5 
     * 1  2   3   4   5   6 
     */
    public  void escribirFiguraC(int n)
    {
        
    }

    /**
     *  Ejer 4.15 d) de la UT4
     *   escribe la tabla de multiplicar del 1, del 2, 
     *   del 3, .... hasta la tabla de numero
     */
    public  void   escribirTablasMultiplicar(int  numero) 
    {
         
    }

    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)
        {
            // ignorar la excepción
        }
    }
    
    /**
     *  Generar 40 aleatorios entre -50 y 20 y calcular
     *  el numero de veces que aparece el maximo
     *  escribiremos el maximo y las veces que ha aparecido
     */
    public int maximo ()
    {
        int max = Integer.MIN_VALUE;
        int vecesMax = 0;
        for (int i=1; i<=40; i++){
            int numeroAleatorio = aleatorio.nextInt(70) - 50;
            if(numeroAleatorio > max) {
                max = numeroAleatorio;
                vecesMax = 1;
            }else if(numeroAleatorio == max){
                vecesMax++;
            }
        }
        
        System.out.print("Maximo: "+max+" : Veces Aparece: "+vecesMax);
        
        return 1;
    }
    
    /**
     *  
     */
    public void triangulo()
    {
        for(int i=1; i<=9; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.printf("%4d", (i*j));
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
    	System.out.print('\u000C');
    	DemoFor demo = new DemoFor();
    	demo.triangulo();

    }
    
    

}
