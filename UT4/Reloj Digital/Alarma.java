
/**
 *  class Alarma  
 * 
 * @author  
 * @version  
 */
public class Alarma
{
     
    private int horas;
    private int minutos;

    /**
     * Constructor de la clase Alarma
     */
    public Alarma()
    {
        this.horas = 7;
        this.minutos = 0;
    }

    /**
     *  
     */
    public void setHora(int horas, int minutos)
    {
         this.horas = horas;
         this.minutos = minutos;
    }
    
    /**
     *  
     */
    public String getHora()
    {
        String devolver = "";
        if (horas < 10)
          devolver += "0"+horas;
        else
          devolver += horas;
          
       devolver += ":";
          
        if (minutos < 10)
            devolver += "0"+minutos;
        else
            devolver += minutos;
       return devolver;
    }
}
