/**
 * 
 *  
 */
public class AppDiccionario
{

    /**
     *   crea el diccionario
     *   crea e inicia el interfaz
     *  
     */
    public static void main(String[] args)
    {
          
        InterfazDiccionario demo = new InterfazDiccionario (new Diccionario (4));
        demo.iniciar();
        
    }
}
