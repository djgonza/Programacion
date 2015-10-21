
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
        devolver += "Hora reloj" +
                    "\n "+ this.miReloj.getHora() +
                    "Hora Alarma" +
                    "\n" + this.miReloj.getAlarma();
        
        System.out.print(devolver);
                    
        this.miReloj.emitirTic();
        this.miReloj.emitirTic();
        this.miReloj.emitirTic();
                    
        return devolver;
        
    }
    
    /**
     *  
     */
    public String test2()
    {
        String devolver = "";
        this.tuReloj.setAlarma(7, 00);       
        devolver += "Hora reloj" +
                    "\n "+ this.tuReloj.getHora() +
                    "Hora Alarma" +
                    "\n" + this.tuReloj.getAlarma();
        
        System.out.print(devolver);
                    
        this.tuReloj.emitirTic();
        this.tuReloj.emitirTic();
        this.tuReloj.emitirTic();
        this.tuReloj.emitirTic();
        this.tuReloj.emitirTic();
                    
        return devolver;
        
    }
    
    /**
     *  
     */
    public void test3(int hora, int minutos)
    {
        miReloj.ponerEnHora(hora, minutos);
    }

}
