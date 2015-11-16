import java.util.Random;
/**
 *    
 */
public class DemoBucles
{
    private static final char SUMATORIO = '\u2211';
    private static final char ASTERISCO = '*';
    private Random generador;

    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /*
    *   Descomponer numeros  
    */
    public String descomponerNumero(int numero){

        int i = 7;
        String cadena = String.format("%10d = %3c", numero, SUMATORIO);
        
        while (numero > 0){
            int potencia = (int) Math.pow(2,i);
            if(potencia <= numero){
                cadena += String.format("%4d", potencia);
                numero -= potencia;
            }
            i--;
        }

        return cadena;
    }

    /**
     *  Genera aleatorios (con la clase Random) ente 0 y 255 (inclusive)
     *  y escribe cada aleatorio como suma de potencias de 2.
     *  OJO! No hay que convertir previamente el nº a binario.
     *  
     *  Hay que parar el proceso al salir un 0 o después de haber generado 25 aleatorios
     *  Los resultados se muestran formateados como indica la figura (ver enunciado)
     *  
     *  Cada 4 números mostrados se hace una pausa y luego se borra la pantalla
     *  
     *  255 = 128 + 64 + 32 + 16 + 8 + 4 + 2 + 1
     *  34 = 32 + 2
     *  129 = 128 + 1
     *  
     *  Usa solo bucles while
     */
    public void numerosComoSumaPotenciasDe2()
    {
        Utilidades.borrarPantalla();

        int i = 1;
        int aleatorio = 1;

        while (i <= 25 && aleatorio != 0){
            
            //generamos el numero aleatorio y lo mostramos
            System.out.println(
                descomponerNumero(
                    generador.nextInt(256)
                )
            );
            
            //ciclos de 4
            if(i%4==0){
                Utilidades.hacerPausa();
                Utilidades.borrarPantalla();
            }
            
            //contador
            i++;

        }
        
        
    }

    /**
     *  Con bucles for
     *  
     *  alto, ancho, grosor asumimos positivos y correctos
     *  
     *      Altura de la letra L: 9
            *Anchura de la letra L: 5
            *Grosor de la letra L: 3
             * * *
             * * *
             * * *
             * * *
             * * *
             * * *
             * * * * *
             * * * * *
             * * * * *      
            *Altura de la letra L: 5
            *Anchura de la letra L: 3
            *Grosor de la letra L: 1
             * 
             * 
             * 
             * 
             * * * 
     *
     */
    public void escribirLetraL(int altura, int anchura, int grosor)
    {
       
        
        for(int i=1; i<=altura; i++){

            if(i<= anchura/2)
                escribirCaracter(ASTERISCO, grosor);
            else
                escribirCaracter(ASTERISCO, anchura);

        }
        
    }

    /**
     *  escribe n veces el caracter  indicado (en 2 posiciones)
     *  en la misma línea
     *  
     *  con bucles for 
     */
    private void escribirCaracter(char caracter, int n)
    {
        String cadena = "";
        for(int i=1; i<=n; i++){
            cadena += String.format("%2c", caracter);
        }

        System.out.println(cadena);
        
        
    }

}
