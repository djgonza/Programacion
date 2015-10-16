
/**
 *  class demoRelojDigital  
 * 
 * @author  
 * @version  
 */
public class demoRelojDigital
{
     
    private int x;

    /**
     * Constructor de la clase demoRelojDigital
     */
    public demoRelojDigital()
    {
        
    }

    /**
     *  
     */
    public void demo1()
    {
         VisorReloj reloj = new VisorReloj(10, 15, 0);
         reloj.emitirTic();
         reloj.emitirTic();
         reloj.emitirTic();
         System.out.println(reloj.getHora());
         
         for (int i=0; i<3; i++){
             reloj.emitirTic();
         }
         System.out.println(reloj.getHora());
         
         int i = 0;
         while (i<3) {
            reloj.emitirTic();
            i++;
            }
          System.out.println(reloj.getHora());
    }
}
