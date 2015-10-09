
/**
 * Escriba la descripci�n de la clase FacturaLuz aqu�.
 * La clase guarada inforamci�n acerca del consumo de luz efectuado 
 * @author (su nombre) 
 * @version (n� versi�n o fecha)
 */
public class FacturaLuz
{
    // consumo en el inicio del per�odo a facturar
    private int lecturaAnterior;
    // consumo al final del per�odo a facturar
    private int lecturaActual;
    //constantes
    final double VALOR_KW = 8.6;
    final double IVA = 1.16;

    /**
     * Constructor de la clase FacturaLuz
     */
    public FacturaLuz(int lecturaAnterior, int lecturaActual)
    {
        this.lecturaActual = lecturaActual;
        this.lecturaAnterior = lecturaAnterior;
    }
  
    /**
     *  devuelve el consumo
     */
    public int obtenerConsumo()
    {
        return this.lecturaActual - this.lecturaAnterior;
    }

    /**
     *  devuelve la factura
     */
    public double obtenerImporteTotal()
    {
        return (this.lecturaActual - this.lecturaAnterior) * VALOR_KW * IVA;
    }

    
}
