
/**
 *  class Calentador  
 * 
 * @author  
 * @version  
 */
public class Calentador
{

    private int temperatura;
    private int minimo;
    private int maximo;  
    private int incremento;

    /**
     * Constructor de la clase Calentador
     */
    public Calentador(int minimo, int maximo)
    {
        this.temperatura = 15;
        this.minimo = minimo;
        this.maximo = maximo;
        this.incremento = 5;
    }

    /**
     *  accesor temperatura
     */
    public int getTemperatura()
    {
        return this.temperatura;
    }
    
    /**
     *  metodo set incremento
     */
    public void setIncremento(int incremento)
    {
        if (incremento > 0)
            this.incremento = incremento;
    }

    /**
     *  metodo para calentar 5º
     */
    public void calentar()
    {
        if ((getTemperatura() + this.incremento) < this.maximo) 
            this.temperatura += this.incremento;
    }

    /**
     *  metodo para enfriar 5º
     */
    public void enfriar()
    {
        if ((getTemperatura() - this.incremento) > this.minimo)  
            this.temperatura -= this.incremento;
    }
}
