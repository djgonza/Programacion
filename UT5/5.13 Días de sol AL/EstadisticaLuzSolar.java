
/**
 * Clase que cuenta las horas de sol en el año
 *
 */
public class EstadisticaLuzSolar
{
    // define una constante MESES que es un array con los nombres de los meses
    
    public static final String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    // define un array horas
    private int[] horas;
    
    /**
     * crea e inicializa el array horas
     */
    public EstadisticaLuzSolar()
    {
           horas = new int[]{100,90,120,150,210,250,300,310,280,230,160,120};

    }
    
    /**
     * Calcula la media de horas de sol
     *
     * @return la media de horas de sol
     */
    public double getMediaSol()
    {
        int suma =  0;
        for(int i = 0;i < horas.length; i++ )
         {
             suma += horas[i] ;
         }
        return (double)suma / horas.length;
    }
    
    /**
     * devuelve el nombre del mes con más horas de sol
     *
     * @return el nombre del mes
     */
    public String mesMasSoleado()
    {
        int mes = 0;
        int max = 0;
        for (int i = 0; i < horas.length; i++)
        {
            if (horas[i] > max)
            {
                mes = i;
                max = horas[i];
            }
            
        }
        return MESES[mes];
      
    }

    /**
     * mes con menos horas de sol
     *
     * @return el nombre del mes
     */
    public String mesMenosSoleado()
    {
        int mes = 0;
        int min = 0;
        for (int i = 0; i < horas.length; i++)
        {
            if (horas[i] < min)
            {
                mes = i;
                min = horas[i];
            }
            
        }
        return MESES[mes];
       
        
    }
}