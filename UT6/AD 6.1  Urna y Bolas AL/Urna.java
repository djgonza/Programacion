
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
     * Anade una nueva bola a la urna
     * @param b la bola a anadir
     */
    public void meterBola(Bola b)
    {
        urna.add(b);
    }

    /**
     * Saca una bola de la urna
     * @return la bola sacada
     * @throws RuntimeException si la urna esta vacia
     */
    public Bola sacarBola()
    {
        
        if(urna.size() == 0){
            throw new RuntimeException("Urna Vacia");
        }
           return urna.remove(obtenerPosicionAleatoria(urna.size()));

            
    }

    /**
     * @return un valor que representa una posicion
     *          en la urna
     * @param hasta el limite hasta el que generar valores
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
        int cont = 0;
        for(Bola bola : urna){
            if(bola.esBlanca())
                cont++;
        }
        return cont;
    }
    /**
     *  
     * @return   cantidad de bolas negras en la urna  
     */
    public int cuantasNegras()
    {
        int cont = 0;
        for(int i = 0; i < urna.size(); i++){
            if(urna.get(i).esNegra())
                cont++;
        }
        return cont;
    }
    /**
     * Muestra la urna
     *    
     */
    public void mostrarUrna()
    { 
        Iterator<Bola> it = urna.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        } 
    }

    /**
     * Borra las bolas de color blanco
     *      
     */
    public void borrarBlancas()
    { 
        Iterator<Bola> it = urna.iterator();
        while(it.hasNext())
        {
            if(it.next().esBlanca())
                it.remove();
        }
    }    
}
