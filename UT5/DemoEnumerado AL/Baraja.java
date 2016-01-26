import java.util.Arrays;

/**
 * 
 */
public class Baraja
{
    public static final int MAX_CARTAS = 40;
    private CartaBaraja[] baraja;

    /**
     * Constructor  
     */
    public Baraja()
    {
        baraja = new CartaBaraja[MAX_CARTAS];
        inicializar();
    }

    /**
     *  Inicializar la baraja con AS de OROS, DOS de OROS, ....,SOTA de OROS,
     *  
     */
    private void inicializar( )
    {
        Palo[] palos = Palo.values();
        Valor[] valores = Valor.values();
        for (int i=0; i<palos.length; i++) {
            for(int j=0; j<valores.length; j++) {
                baraja[10*i+j] = new CartaBaraja(valores[j], palos[i]);
            }
        }
        
    }

    /**
     *  Representación textual de la baraja
     *  De forma eficiente
     *
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baraja.length; i++)
        {
           sb.append(baraja[i].toString()).append("\n");
        }
        return sb.toString();
    }
    
    /**
     *  
     *
     */
    public void printBaraja()
    {
        System.out.println(this.toString());
    }

    /**
     *  Simular que se barajan las cartas
     *  Haremos:
     *      - repetir 20 veces generar dos posiciones aleatorias distinatas pos1 y pos2
     *      - intercambiar las cartas de esas posiciones
     *
     */
    public void barajar()
    {
        for(int i=0; i<20; i++){
            intercambiar(posicionAleatoria(), posicionAleatoria());
        }
    }


    /**
     *  Devuelve una posición aleatoria entre 0 y 40 exclusive
     *
     */
    private int posicionAleatoria()
    {
        return (int) (Math.random() * MAX_CARTAS);
    }
    
      /**
     *  
     * Intercambia las cartas de las posiciones pos1 y pos2
     */
    private void intercambiar(int pos1, int pos2)
    {
        CartaBaraja aux = baraja[pos2];
        baraja[pos2] = baraja[pos1];
        baraja[pos1] = aux;
    }

}
