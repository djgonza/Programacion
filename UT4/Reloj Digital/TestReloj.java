
/**
 *  class TestReloj  
 * 
 * @author  
 * @version  
 */
public class TestReloj
{
     
    private RelojAlarma miReloj;
    private RelojAlarma tuReloj;

    /**
     * Constructor de la clase TestReloj
     */
    public TestReloj()
    {
        this.miReloj = new RelojAlarma(18, 32);
        this.tuReloj = new RelojAlarma(23, 58);
    }

    /**
     *  
     */
    public String test1()
    {
        String devolver = "";
        this.miReloj.setAlarma(18, 35);       
        this.miReloj.emitirTic();
        devolver += "Hora reloj" +
                    "\n "+ this.miReloj.getHora() +
                    "Hora Alarma" +
                    "\n" + this.miReloj.getAlarma();
        
        return devolver;
        
    }
}
