
/**
 * La clase modela un contador de d�as transcurridos 
 * hasta una fecha determinada
 * Ejer 5.12
 */
public class ContadorDias
{
    private int[] diasMes;

    /**
     * 
     */
    public ContadorDias()
    {
        diasMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    }

    /**
     * Cuenta el n� de d�as desde el inicio de a�o
     *
     * @param  mes mes actual entre 1 y 12
     * @param  dia actual  entre 1 y 31
     * @param  a�o actual
     * @return la cantidad de d�as desde el comienzo de a�o
     */

    public int contarDias(int dia, int mes, int ano)
    {
        int dias = 0;
        for(int i = 0; i < mes - 1; i++)
        {
            if(i==1 && esBisiesto(ano))
                dias += diasMes[i] + 1;
            else
                dias += diasMes[i];
        }

        return dias += dia;

    }

    /**
     * return true si a�o es bisiesto
     * Un a�o es bisiesto si es m�ltiplo de 4 pero no de 100 o s� de 400
     * Hazlo sin if
     */
    private boolean esBisiesto(int ano)
    {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

}
