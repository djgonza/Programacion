
/**
 * 
 * 
 * @author  
 * @version  
 */
public class Inversion
{
    private double cantidadInicial;
    private double tipoInteres;
    /**
     *  
     */
    public Inversion(double cantidadInicial, double tipoInteres)
    {
        this.cantidadInicial = cantidadInicial;
        this.tipoInteres = tipoInteres;

    }

    /**
     *  Accesor cantidadInicial
     */
    public double getCantidadInicial()
    {
        return cantidadInicial;
    }

    /**
     *  Accesor cantidadInicial
     */
    public double getTipoInteres()
    {
        return tipoInteres;
    }

    /**
     *  Metodo que devuelve la cantidad total despues de varios años
     */
    public double despuesDe(int años)
    {
        double cantidad = this.cantidadInicial;
        for(int i=1; i<=años; i++)
        {
            cantidad *= ((this.tipoInteres/100) + 1);
        }
        return cantidad;
    }

    /**
     *  
     */
    public int añosHastaObjetivo(double importeObjetivo)
    {
        double importe = cantidadInicial;
        int i = 0;

        while(importe <= importeObjetivo) {
            importe *= ((this.tipoInteres/100) + 1);
            i++;
        }

        return i;
    }

    /**
     *  
     */
    public String tablaDespuesDe(int años)
    {
        String cadena = String.format("Cantidad inicial %.2f€\n"+
                "Interés anual %.2f%%\n"+
                "%-10s%-10s"
            ,cantidadInicial
            ,tipoInteres
            ,"Año"
            ,"Balance");

        int i = 1;
        for(int ano = años; ano > 0; ano--){
            {
                cadena += String.format("\n%-10d%-10.2f"
                ,i
                ,despuesDe(i));
                i++;
            }

        }
        
        System.out.print('\u000C');
        System.out.print(cadena);
        return cadena;

    }

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        new Inversion(3000, 5).tablaDespuesDe(5);
    }
}
