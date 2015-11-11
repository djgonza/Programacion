
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
     * @param  cuantos  n� de t�rminos de la serie 
     * de Fibonacci a generar 
     * @return   una representaci�n textual de la serie generada  
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
     * @param  pos la posici�n del t�rmino a generar
     * @return  el t�rmino generado   
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
