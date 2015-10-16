
/**
 *  class CartaBaraja  
 * 
 * @author  
 * @version  
 */
public class CartaBaraja
{
    private final int OROS = 1;
    private final int COPAS = 2;
    private final int ESPADAS = 3;
    private final int BASTOS = 4;

    private int palo;
    private int valor;
    /**
     * Constructor de la clase CartaBaraja
     */
    public CartaBaraja(int palo, int valor)
    {
        this.palo = palo;
        this. valor = valor;
    }

    /**
     *  
     */
    public String getPalo()
    {   
        switch (this.palo){
            case 1: return "OROS";
            case 2: return "COPAS";
            case 3: return "ESPADAS";
            default: return "BASTOS";
        }
    }
    
    /**
     *  
     */
    public String getValor()
    {   
        switch (this.valor){
            case 1: return "UNO";
            case 2: return "DOS";
            case 3: return "TRES";
            case 4: return "CUATRO";
            case 5: return "CINCO";
            case 6: return "SEIS";
            case 7: return "SIETE";
            case 8: return "SOTA";
            case 9: return "CABALLO";
            default: return "REY";
        }
    }
    
    /**
     *  
     */
    public String toString()
    {
        return "'" + getValor() + " de " + getPalo();
    }

}
