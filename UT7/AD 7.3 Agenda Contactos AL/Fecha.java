
/**
 * Modela una fecha
 *  
 */
public class Fecha  implements Comparable<Fecha>
{
    private int dia;
    private int mes;
    private int a�o;

    /**
     * Constructor de objetos de la clase Fecha
     * @param fec la fecha en formato dd/mm/aaaa
     */
    public Fecha(String fec)
    {
        this.dia = Integer.parseInt(fec.substring(0, fec.indexOf("/")));
        this.mes = Integer.parseInt(fec.substring(fec.indexOf("/") + 1, fec.lastIndexOf("/")));
        this.a�o = Integer.parseInt(fec.substring(fec.lastIndexOf("/") + 1));


    }

    /**
     * Constructor de objetos de la clase Fecha
     * 
     * 
     */
    public Fecha(int dia, int mes, int a�o)
    {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

    /**
     * Accesor para el d�a 
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
     * Accesor para el a�o 
     */
    public int getA�o()
    {
        return a�o;
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
        return  otro.getA�o()== this.getA�o() && 
        otro.getMes() == this.getMes() && 
        otro.getDia() == this.getDia();

    }

    /**
     *  
     */
    public int compareTo(Fecha otro)
    {
        if(otro.getA�o() > a�o)
            return -1;
        if(otro.getMes() > mes)
            return -1;
        if(otro.getDia() > dia)
            return -1;

        if(otro.getA�o() == a�o && otro.getMes() == mes && otro.getDia() == dia)
            return 0;

        return 1;

    }

    /**
     * @override  
     */
    public String toString()
    {
        return dia + "/" + mes + "/" + a�o;
    }

    /**
     *  
     */
    public int hashCode()
    {
        return dia + mes + a�o;
    }


}
