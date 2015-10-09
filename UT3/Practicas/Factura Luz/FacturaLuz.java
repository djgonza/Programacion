
/**
 * Escriba la descripción de la clase FacturaLuz aquí.
 * La clase guarada inforamción acerca del consumo de luz efectuado 
 * @author (su nombre) 
 * @version (nº versión o fecha)
 */
public class FacturaLuz
{
    // consumo en el inicio del período a facturar
    private int lecturaAnterior;
    // consumo al final del período a facturar
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
