
/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 * 
 * @autor 
 * @version 
 */
public class Circulo
{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo(double radio, Punto centro)
    {
       this.radio = radio;
       this.centro = centro;
    }
    
    /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo(double radio)
    {
       this.radio = radio;
       this.centro = new Punto(0,0);
    }
   
    /**
     * 
     * @return devuelve el radio del círculo    
     */
    public double getRadio()
    {
        return radio;
    }
    
    /**
     * Devulve el objeto centro 
     */
    public Punto getCentro()
    {
        return this.centro;
    }

        
      /**
     * 
     * @param   El nuevo valor del radio
     */
    public void setRadio(int nuevoRadio)
    {
        radio = nuevoRadio;
    }
    
    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()
    {
        return 2 * PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerímetro()
    {
        return 2 * PI * radio;
    }
    
    /**
     *  Actualiza el centro x
     */
    public void setCentroX (int x)
    {
        this.centro.setX(x);
    }

    /**
     *  Actualiza el centro y
     */
    public void setCentroY (int y)
    {
        this.centro.setY(y);
    }

    /**
     *  To String
    */
    public String toString()
    {
        return centro.toString();
    }
    
    /**
     *  Muestra el circulo en pantalla
     */
    public void printCirculo()
    {
        System.out.print(this.toString());
    }

    
}
