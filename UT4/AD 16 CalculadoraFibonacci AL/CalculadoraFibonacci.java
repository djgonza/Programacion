
/**
 * clase CalculadoraFibonacci 
 *
 */
public class CalculadoraFibonacci
{

    /**
     * Constructor de la clase CalculadoraFibonacci
     */
    public CalculadoraFibonacci()
    {

    }

    /**
     * @param  cuantos  nº de términos de la serie 
     * de Fibonacci a generar 
     * @return   una representación textual de la serie generada  
     */
    public String generarFibonacci(int cuantos)
    {
        int i = 1;
        String devolver = "";
        while(cuantos >= 1){
            devolver += String.format("%-10d", generarTerminoFibonacci(i));
            i++;
            cuantos--;
        }

        return devolver;  
    }

    /**
     * @param  pos la posición del término a generar
     * @return  el término generado   
     */
    public int generarTerminoFibonacci(int pos)
    {
        if(pos == 1)
            return 0;
        int primerNumero = 0;
        int segundoNumero = 1;
        int devolverNumero = primerNumero + segundoNumero;
        int i = 2;
        while (i<pos){
            devolverNumero = (primerNumero)+(segundoNumero);
            primerNumero = segundoNumero;
            segundoNumero = devolverNumero;
            i++;
        }
        return devolverNumero;
    }

}
