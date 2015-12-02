import java.util.Random;
/**
 * 
 * 
 * @author  
 * @version  
 */
public class Histograma
{ 
    public final int MAX = 10;
    public final char ASTERISCO = '*';
    private int[] valores;
    public Random aleatorio;
    public int[] numeros;

    /**
     * Constructor de la clase prueba
     */
    public Histograma()
    {
        numeros = new int[MAX];
        aleatorio = new Random();
        inicializar();
    }

    private void inicializar () {
        for(int i=0; i<numeros.length; i++){
            numeros[i] = generarAleatorio();
        }
    }
    
    private int generarAleatorio () {
        return aleatorio.nextInt(45) + 5;
    }
    
    public void escribirHistograma() {
        for(int i=0; i<numeros.length; i++){
            for(int j=1; j<=numeros[i]; j++){
                System.out.print(ASTERISCO);
            }
            System.out.println();
        }
        
    }
    
    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
         Histograma demo = new Histograma();
         demo.escribirHistograma();
    }
}
