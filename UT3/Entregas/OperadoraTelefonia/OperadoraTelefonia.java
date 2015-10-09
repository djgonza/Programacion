
/**
 * ENTREGA UT3
 * @author - David Jimenez Gonzalez
 * 
 * 
 * 
 * Una operadora de telefonía ofrece tres tipos de tarifas a sus clientes
 * para uso de voz y datos (todos los precios indicados no incluyen IVA): 
 *   - tarifa mini - 5.60€/mes
 *                  Incluye 100 Mb de navegación
 *                  No incluye llamadas que se facturarán a 0,01 céntimos / minuto
 *                  No incluye SMS
 *   - tarifa smart - 16€/mes 
 *                  Incluye 1GB de navegación
 *                  Incluye 200 minutos de llamadas. Cada minuto adicional a 0.20 céntimos
 *                  no incluye SMS      
 *   - tarifa red - 39€/mes 
 *                  Incluye 5GB de navegación
 *                  Llamadas ilimitadas
 *                  SMS ilimitados
 *  
 *  Cada minuto adicional de consumo de llamadas no incluido en la  tarifa contratada se factura a 0.20 céntimos
 *  Cada bloque de 200 Mb adicionales de consumo de datos no incluido en la  tarifa contratada se factura a 2€
 *  (no se consideran bloques de menor tamaño, si se han consumido 150 Mb adicionales se factura como un bloque de 200Mb)
 *  
 *  Los clientes nuevos tendrán un descuento del 20% en su factura final
 *  
 *  La operadora  registra también el importe total acumulado entre todas las facturas de todos los clientes
 *  así como el nº de clientes en cada tipo de tarifa
 */
public class OperadoraTelefonia
{
   
    private final char TARIFA_MINI = 'M';
    private final char TARIFA_SMART = 'S';
    private final char TARIFA_RED = 'R';
    private final double PRECIO_TARIFA_MINI = 5.60;
    private final double PRECIO_TARIFA_SMART = 16.00;
    private final double PRECIO_TARIFA_RED = 39.00;
    private final int TOPE_MEGAS_MINI = 100;
    private final int TOPE_MEGAS_SMART = 1024;
    private final int TOPE_MEGAS_RED = 5120;
    private final double BLOQUE_MEGAS = 200;
    private final double PRECIO_SMS = 0.5; 
    private final double PRECIO_MINUTO = 0.01; 
    private final double PRECIO_MINUTO_ADICIONAL = 0.20;
    private final double PRECIO_BLOQUE_200MB = 2.00;
    private final double IVA = 0.21;
    private final double DESCUENTO = 0.20;

    private String nombre;
    private int mini;
    private int smart;
    private int red;
    private double totalFacturas;
    private int totalFacturasNuevas;
    private int totalFacturasExpendidas;

    /**
     * Constructor  - 
     * Recibe un parámetro, el nombre de la operadora, e inicializa el resto de atributos adecuadamente
     */
    public OperadoraTelefonia(String nombre)
    {
        this.nombre = nombre;
        this.mini = 0;
        this.smart = 0;
        this.red = 0;
        this.totalFacturas = 0;

    }

    /**
     *  Accesor para el nombre de la operadora
     *
     */
    public String getNombre()
    {
         return this.nombre;
    }

    /**
     *  Mutador para el nombre de la operadora
     *
     */
    public void setNombre(String nombre)
    {
         this.nombre = nombre;
    }

    /**
     *  accesor para el importe total acumulado entre todas las facturas emitidas
     *
     */
    public double getTotalFacturas()
    {
         return this.totalFacturas;
    }


    /**
     *  Calcula y muestra en pantalla el importe de la factura emitida a un cliente
     *  
     *  El método recibe cinco parámetros:
     *      - tipoTarifa - 'M' mini   'S' smart 'R' red  
     *      - minutos - minutos totales consumidos por el cliente
     *      - megas - megas totales consumidos por el cliente
     *      - sms - nº sms enviados por el cliente
     *      - esNuevoCliente - indica si se trata o no de un cliente nuevo
     *      
     *  Suponemos todos los parámetros correctos.
     *   
     *  Ej: Una posible llamada al método sería:      emitirFacturaCliente('M', 80, 850, 3, false)
     *                                                emitirFacturaCliente('R', 400, 5000, 23, true)
     *                                                emitirFacturaCliente('S', 215, 3500, 3, false)
     *  
     *   A partir de estos parámetros se calculará el importe total de la factura (incluido el IVA)
     *   que se emitirá al cliente.
     *   
     *   Hay que incrementar también la cantidad de tarifas de cada tipo. 
     *   
     *   Una vez calculado el importe de la factura si se trata de un nuevo cliente se le hará un descuento del 20%.
     *   
     *   La operadora acumulará tambien este importe en el atributo  adecuado  para sus estadísticas 
     *   
     *   Utilizar  una sentencia switch  para analizar el tipo de tarifa
     */
    public void emitirFacturaCliente(char tipoTarifa, int minutos, int megas, int sms, boolean esNuevoCliente)
    {
       
        double importe = 0;
        double importeIVA = 0;
        double importeFacturar = 0;
        double bloquesMegas = 0;
        String nombreTipoTarifa;
        int megasDeMas = 0;
        double importeFacturarDescuento = 0;

        switch (tipoTarifa){
            case TARIFA_MINI:
                {
                    //tipo tarifa
                    nombreTipoTarifa = "MINI";
                    //precio base
                    importe += PRECIO_TARIFA_MINI;
                    //minutos
                    importe += minutos * PRECIO_MINUTO;
                    //megas
                    megasDeMas = megas - TOPE_MEGAS_MINI;
                    bloquesMegas = Math.ceil(megasDeMas / BLOQUE_MEGAS);
                    if(bloquesMegas > 0)
                        importe += bloquesMegas * PRECIO_BLOQUE_200MB;
                    //sms
                    importe += sms * PRECIO_SMS;
                    //IVA
                    importeIVA = importe * IVA;
                    //numero total de tarifas
                    this.mini++;
                }
            break;
            case TARIFA_SMART:
                {
                    //tipo tarifa
                    nombreTipoTarifa = "SMART";
                    //precio base
                    importe += PRECIO_TARIFA_SMART;
                    //minutos
                        //cobra apartir de 200 minutos
                    if(minutos > 200)
                        importe += (minutos - 200) * PRECIO_MINUTO_ADICIONAL;
                    //megas
                    megasDeMas = megas - TOPE_MEGAS_SMART;
                    bloquesMegas = Math.ceil(megasDeMas / BLOQUE_MEGAS);
                    if(bloquesMegas > 0)
                        importe += bloquesMegas * PRECIO_BLOQUE_200MB;
                    //sms
                    importe += sms * PRECIO_SMS;
                    //IVA
                    importeIVA = importe * IVA;
                    //numero total de tarifas
                    this.smart++;
                }
            break;
            default: TARIFA_RED:
                {
                    //tipo tarifa
                    nombreTipoTarifa = "RED";
                    //precio base
                    importe += PRECIO_TARIFA_RED;
                    //minutos
                        //gratuitos
                    //megas
                    megasDeMas = megas - TOPE_MEGAS_RED;
                    bloquesMegas = Math.ceil(megasDeMas / BLOQUE_MEGAS);
                    if(bloquesMegas > 0)
                        importe += bloquesMegas * PRECIO_BLOQUE_200MB;
                    //sms
                    //importe += sms * PRECIO_SMS;
                    //IVA
                    importeIVA += importe * IVA;
                    //numero total de tarifas
                    this.red++;
                }
            break;
        }

        //importe a facturar
        importeFacturar = importeIVA + importe;

        //nuevo cliente
        if(esNuevoCliente)
            importeFacturarDescuento = importeFacturar - (importeFacturar * DESCUENTO);

        //registramos la factura
        this.totalFacturas += importeFacturar;
        this.totalFacturasExpendidas++;

        //formateamos los datos
        if(megasDeMas < 0)
            megasDeMas = 0;
        //mostramos en pantalla
        System.out.println(
            "******** Operador: "+this.nombre+" ********"+
            "\n "+
            "\n Factura del Cliente: "+this.totalFacturasExpendidas+
            "\n Tipo de Tarifa: Tarifa "+nombreTipoTarifa+
            "\n Consumo Voz: "+minutos+" Minutos"+
            "\n Consumo Datos: "+megas+ " Megas"+
            "\n Megas adicionales consumidos no incluidos en la tarifa: "+megasDeMas+" Megas"+
            "\n SMS: "+sms+
            "\n "
        );
        //descuentos
        if(esNuevoCliente){

            //con descuento
            System.out.println(
                "\n Importe a pagar sin IVA: "+importe+"€"+
                "\n IVA: "+importeIVA+"€"+
                "\n Importe total a pagar: "+importeFacturar+"€"+
                "\n Descuento por nuevo cliente: "+(importeFacturar * DESCUENTO)+"€"+
                "\n Importe total a pagar con descuento: "+importeFacturarDescuento+"€"
            );

        }else{

            //sin descuento
            System.out.println(
                "\n Importe a pagar sin IVA: "+importe+"€"+
                "\n IVA: "+importeIVA+"€"+
                "\n Importe total a pagar: "+importeFacturar+"€"
            );
        }
    }

    //inicializador
    public static void main(String[] args)
    {
        //inicializamos la clase
        OperadoraTelefonia factura = new OperadoraTelefonia("Yoigo");
        //creamos las facturas
        factura.emitirFacturaCliente('M', 80, 850, 3, false);
        factura.emitirFacturaCliente('R', 400, 5000, 23, true);
        factura.emitirFacturaCliente('S', 215, 3500, 3, false);
    }

}
