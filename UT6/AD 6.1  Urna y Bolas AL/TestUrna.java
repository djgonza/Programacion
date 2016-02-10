 

/**
 * 
 */

 
public class TestUrna
{
        public static void main (String[] args)
        {
            Urna demo = new Urna();
            
            for(int i = 0; i < 6; i++){
            	demo.meterBola(new Bola());
            }

            demo.mostrarUrna();
            
            System.out.println("Blancas: " + demo.cuantasBlancas());
            System.out.println("Negras: " + demo.cuantasBlancas());
               
            demo.borrarBlancas();

            demo.mostrarUrna();
                
        }
        
        
        
}
