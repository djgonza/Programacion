
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
            break;
            case 2: return "COPAS";
            break;
            case 3: return "ESPADAS";
            break;
            default: return "BASTOS";
            break;
        }
    }
    
    /**
     *  
     */
    public String getValor()
    {   
        switch (this.valor){
            case 1: return "UNO";
            break;
            case 2: return "DOS";
            break;
            case 3: return "TRES";
            break;
            case 4: return "CUATRO";
            break;
            case 5: return "CINCO";
            break;
            case 6: return "SEIS";
            break;
            case 7: return "SIETE";
            break;
            case 8: return "SOTA";
            break;
            case 9: return "CABALLO";
            break;
            default: return "REY";
            break;
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
