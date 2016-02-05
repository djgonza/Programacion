
/**
 * Un objeto de esta clase modela una urna 
 * que guarda una serie de bolas blancs y/o negras
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Urna
{

    private  ArrayList<Bola>urna;

    /**
     * Constructor 
     */
    public Urna()
    {
        urna = new ArrayList<Bola>();

    }

    /**
     * Añade una nueva bola a la urna
     * @param b la bola a añadir
     */
    public void meterBola(Bola b)
    {
        urna.add(b);

    }

    /**
     * Saca una bola de la urna
     * @return la bola sacada
     * @throws RuntimeException si la urna está vacía
     */
    public Bola sacarBola()
    {
        
        if(urna.size() == 0){
            throw new RuntimeException("Urna Vacia");
        }
           return urna.remove(obtenerPosicionAleatoria(urna.size()));

            
    }

    /**
     * @return un valor que representa una posición
     *          en la urna
     * @param hasta el límite hasta el que generar valores
     *              aleatorios
     */
    private int obtenerPosicionAleatoria(int hasta)
    {
        return (int) Math.random() * (hasta + 1);
        

    }

    /**
     *  
     * @return   cantidad de bolas blancas en la urna  
     */
    public int cuantasBlancas()
    {

    }
    /**
     *  
     * @return   cantidad de bolas negras en la urna  
     */
    public int cuantasNegras()
    {

    }
    /**
     * Muestra la urna
     *    
     */
    public void mostrarUrna()
    { 

    }

    /**
     * Borra las bolas de color blanco
     *      
     */
    public void borrarBlancas()
    { 

    }

        
        
        
        
}
