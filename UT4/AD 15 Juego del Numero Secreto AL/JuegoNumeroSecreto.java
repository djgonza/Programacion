import java.util.Random;
/**
 * La clase JuegoNumeroSecreto modela las reglas del
 * juego
 * 
 */

public class JuegoNumeroSecreto
{
    private final int MAX_INTENTOS = 5;
    private int numeroSecreto;
    private Contador intentos;
    private boolean terminado;   
    private String resultado; // aqu� se deja el mensaje "M�s alto", "M�s bajo", "Has adivinado el n�", ......
    private Random generador;

    /**
     * Constructor de la clase JuegoNumeroSecreto
     * crea el generador y el contador de intentos y prepara
     * el juego para empeazr a jugar (llama a resrJuego())
     */
    public JuegoNumeroSecreto()
    {
        generador = new Random();
        intentos = new Contador();
        resetJuego();

    }

    /**
     * Prepara todo para empezar a jugar,
     * genera un n� secreto, el contador de intentos se pone otra vez a 0
     * etc, .......
     *   
     */
    public void resetJuego()
    {
        numeroSecreto = generador.nextInt(99) + 1;
        intentos.reset();
        terminado = false;

    }

    /**
     * 
     * Accesor para el n� de intentos 
     */
    public int getIntentos()
    {
        return intentos.getContador();
    }

    /**
     * 
     * Devuelve el m�ximo n� de intentos permitidos
     */
    public int getMaximoIntentos()
    {
        return MAX_INTENTOS;
    }

    /**
     * Aumenta el n� de intentos por parte del usuario
     */

    public void incrementarIntentos()
    {
        intentos.incrementar();
    }

    /**
     * Simula una �nica jugada
     * 
     * Cada nueva jugada es un intento m�s. Habr� que comprobar si 
     * ha acertado o no y si ha consumido todos sus intentos actualizando el estado
     * del juego adecuadamente. El resultado "M�s alto", "M�s bajo", .... se deja
     * en resultado
     * 
     * @param intentado el n� intentado
     */
    public void realizarJugada(int intentado)
    {
        if(intentado == numeroSecreto){
            resultado = "Has acertado el numero secreto!";
            terminado = true;
        }else if(intentado > numeroSecreto){
            resultado = "Mas bajo";
        }else{
            resultado = "Mas alto";
        }
        
        intentos.incrementar();

        if(getIntentos() == getMaximoIntentos()){
            terminado = true;
            resultado = "Lo siento has agotado todos los intentos!";
        }
    }

    /**
     * 
     * Accesor que devuelve el valor del atributo terminado
     *  
     */
    public boolean haTerminado()
    {  
        return terminado;
    }

    /**
     * Accesor para el resultado obtenido
     */
    public String getResultado()
    {        
        return resultado;
    }

}
