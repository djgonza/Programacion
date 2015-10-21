
/**
 *  class RelojAlarma  
 * 
 * @author  
 * @version  
 */
public class RelojAlarma
{
     
    private VisorReloj reloj;
    private Alarma alarma;

    /**
     * Constructor de la clase RelojAlarma
     */
    public RelojAlarma(int horas, int minutos)
    {
        this.reloj = new VisorReloj(horas, minutos);
        this.alarma = new Alarma();
    }
    
    /**
     * Constructor de la clase RelojAlarma
     */
    public RelojAlarma()
    {
        this.reloj = new VisorReloj();
        this.alarma = new Alarma();
    }

    /**
     *  
     */
    public void emitirTic()
    {
        this.reloj.emitirTic();
        if(this.esHoraAlarma())
             System.out.println("RRRRIIIIINNNNNGGGGG");
    }
    
    /**
     *  
     */
    private boolean esHoraAlarma()
    {
        if(this.reloj.getHora().equals(this.alarma.getHora()))
            return true;
        return false;
    }
    /**
     *  
     */
    public void setAlarma(int horas, int minutos)
    {
        this.alarma.setHora(horas, minutos);
    }
    
    /**
     *  
     */
    public String getHora()
    {
        return this.reloj.getHora();
    }
    /**
     *  
     */
    public String getAlarma()
    {
        return this.alarma.getHora();
    }
    
    /**
     *  
     */
    public void ponerEnHora(int hora, int minutos)
    {
        this.reloj.ponerEnHora(hora, minutos);
    }

}
