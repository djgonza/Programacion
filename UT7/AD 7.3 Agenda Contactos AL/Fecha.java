
/**
 * Modela una fecha
 *  
 */
public class Fecha  implements Comparable<Fecha>
{
    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor de objetos de la clase Fecha
     * @param fec la fecha en formato dd/mm/aaaa
     */
    public Fecha(String fec)
    {
        this.dia = Integer.parseInt(fec.substring(0, fec.indexOf("/")));
        this.mes = Integer.parseInt(fec.substring(fec.indexOf("/") + 1, fec.lastIndexOf("/")));
        this.año = Integer.parseInt(fec.substring(fec.lastIndexOf("/") + 1));


    }

    /**
     * Constructor de objetos de la clase Fecha
     * 
     * 
     */
    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /**
     * Accesor para el día 
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * Accesor para el mes 
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * Accesor para el año 
     */
    public int getAño()
    {
        return año;
    }

    /**
     *  
     */
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        if(this == obj)
            return true;

        Fecha otro = (Fecha) obj;
        return  otro.getAño()== this.getAño() && 
        otro.getMes() == this.getMes() && 
        otro.getDia() == this.getDia();

    }

    /**
     *  
     */
    public int compareTo(Fecha otro)
    {
        if(otro.getAño() > año)
            return -1;
        if(otro.getMes() > mes)
            return -1;
        if(otro.getDia() > dia)
            return -1;

        if(otro.getAño() == año && otro.getMes() == mes && otro.getDia() == dia)
            return 0;

        return 1;

    }

    /**
     * @override  
     */
    public String toString()
    {
        return dia + "/" + mes + "/" + año;
    }

    /**
     *  
     */
    public int hashCode()
    {
        return dia + mes + año;
    }


}
