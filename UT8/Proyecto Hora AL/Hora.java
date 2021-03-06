
/**
 * Clase Hora cuyos objetos almacenan la hora
 * el formato hh, mm, ss
 * 
 *  
 */
public class Hora
{
    private int hora;
    private int minutos;
    private int segundos;

    /**
     * constructor parametrizado para los objetos de la clase Hora
     * Avisa de que en la creación se puede lanzar una excepción de tipo 
     * IllegalArgumentException
     * Si la hora es incorrecta se lanza la excepci´n
     * Idem para minutos y segundos
     */
    public Hora(int hora, int minutos, int segundos) throws HoraException
    {
        if(hora < 0 || hora > 23)
            throw new HoraException("Hora incorrecta");
        this.hora = hora;
        if(minutos < 0 || minutos  > 59)
            throw new HoraException("Minutos incorrectos"); 
        this.minutos = minutos; 
        if(segundos < 0 || segundos  > 23)
            throw new HoraException("Segundos incorrectos"); 
        this.segundos = segundos;

    }   

    /**
     * Obtener la hora
     */
    public int getHora()
    {
        return hora;
    }

    /**
     * Obtener los minutos 
     */
    public int getMinutos()
    {
        return minutos;
    }

    /**
     * Obtener lossegundos  
     */
    public int getSegundos()
    {
        return segundos;
    }

    /**
     * Establecer una nueva hora
     */
    public void setHora(int hora)
    {
        this.hora = hora;
    }

    /**
     * Establecer minutos
     */
    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    /**
     * Establecer segundos
     */
    public void setSegundos(int segundos)
    {
        this.segundos = segundos;
    }

    /*
     * Representaci�n textual de la hora hh:mm:ss
     */
    public String  toString()
    {
        String resul = "";

        if (hora < 10)
            resul = "0";
        resul +=  hora + ":";
        if (minutos < 10)
            resul += "0";
        resul += minutos + ":";
        if (segundos < 10)
            resul += "0";
        resul += segundos;
        return resul;
    }

    /*
     * Devolver n� de segundos transcurridos
     */
    public int aSegundos()
    {
        return hora * 3600 + minutos * 60 + segundos;
    }

    /*
     * Avanzar un segundo la hora
     */
    public void avanzarSegundo()
    {
        segundos++;
        if (segundos == 60)
        {
            segundos = 0;
            minutos++;
            if (minutos == 60)
            {
                minutos = 0;
                hora++;
                if (hora == 24)
                    hora = 0;
            }

        }
    }

    /*
     * Retrasar un segundo la hora
     */
    public void retrasarSegundo()
    {
        segundos--;
        if (segundos == -1)
        {
            segundos = 59;
            minutos--;
            if (minutos == -1)
            {
                minutos = 59;
                hora--;
                if (hora == -1)
                    hora = 23;
            }

        }
    }
}

