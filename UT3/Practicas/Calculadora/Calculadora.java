
/**
 *  class Calculadora  
 * 
 * @author  
 * @version  
 */
public class Calculadora
{
     
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    /**
     * Constructor de la clase Calculadora
     * Inicializamos todos los atributos a 0
     */
    public Calculadora()
    {
        this.cantidad = 0;
        this.suma = 0;
        this.maximo = 0;
        this.minimo = 0;
    }

    /**
     *  Accesor de Cantidad
     */
    public int getCantidad()
    {
        return this.cantidad;
    }
    
    /**
     *  Accesor de Maximo
     */
    public int getMaximo()
    {
        return this.maximo;
    }
    
    /**
     *  Accesor de Minimo
     */
    public int getMinimo()
    {
        return this.minimo;
    }
    
    /**
     *  Metodo Introducir numero
     *  Cambiara el estado de la calculadora
     */
    public void introducirNumero(int numero)
    {
        this.cantidad++;
        this.suma += numero;
        if (cantidad == 1)
        {
            this.maximo = numero;
            this.minimo = numero;
        }
        if (numero > this.maximo) 
        {
            this.maximo = numero;
        }
        if (numero < this.minimo) 
        {
            this.minimo = numero;
        }
    }
    
    /**
     *  Metodo que calcula la media de todos los numeros introducidos
     */
    public double getMedia()
    {
        return (double) this.suma / this.cantidad;
    }

}
