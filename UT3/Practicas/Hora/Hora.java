
/**
 *  class Hora  
 * 
 * @author  
 * @version  
 */
public class Hora
{

    private int horas;
    private int minutos;
    private int segundos;

    /**
     * Constructor de la clase Hora
     */
    public Hora()
    {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    /**
     *  Metodo accesor Horas
     */
    public int getHoras()
    {
        return this.horas;
    }

    /**
     *  Metodo mutador Horas
     */
    public void setHoras(int horas)
    {
        this.horas = horas;
    }

    /**
     *  Metodo accesor Minutos
     */
    public int getMinutos()
    {
        return this.minutos;
    }

    /**
     *  Metodo mutador Minutos
     */
    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    /**
     *  Metodo accesor Segundos
     */
    public int getSegundos()
    {
        return this.segundos;
    }

    /**
     *  Metodo mutador Segundos
     */
    public void setSegundos(int segundos)
    {
        this.segundos = segundos;
    }

    /**
     *  Metodo a Segundos
     *  Devuelve la cantidad que almacena el atributo Horas en segundos
     */
    public int aSegundos()
    {
        return this.horas * 3600 + this.minutos * 60 + this.segundos;
    }

    /**
     *  Metodo para avanzar 1 segundo la Hora
     */
    public void avanzarSegundo()
    {
        this.segundos++;
        if (this.segundos == 60)
        {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60)
            {
                this.minutos = 0;    
                this.horas++;
                if (this.horas >= 24)
                {
                    this.horas = 0;    
                }
            }
        }
    }

    /**
     *  Metodo para atrasar 1 segundo la Hora
     */
    public void atrasarSegundo()
    {
        if (this.segundos == 0)
        {
            this.segundos = 59;          
            if (this.minutos == 0)
            {
                this.minutos = 59;
                if(this.horas == 0)
                    this.horas = 23;
                this.horas--;
            }
            this.minutos--;
        }
        this.segundos--;
    }

    /**
     *  
     */
    public String enFormatoAmPm()
    {
        if(this.horas >= 0 && this.horas <= 11)
            return  ""+this.horas+":"+this.minutos+":"+this.segundos+" AM";
        if(this.horas == 12)
            return  ""+this.horas+":"+this.minutos+":"+this.segundos+" PM";
        return ""+(this.horas - 12)+":"+this.minutos+":"+this.segundos+" PM";
    }

    /**
     *  Metodo toString para mostrar la Hora en formato hh:mm:ss
     */
    public String toString()
    {
        String resultado;
        if(this.horas <= 9)
            resultado = "0" + this.horas;
        else
            resultado = "" + this.horas;
        if(this.minutos <= 9)
            resultado += ":0" + this.minutos;
        else
            resultado += ":" + this.minutos;
        if(this.segundos <= 9)
            resultado += ":0" + this.segundos;
        else
            resultado += ":" + this.segundos;

        return resultado;
    }

}
