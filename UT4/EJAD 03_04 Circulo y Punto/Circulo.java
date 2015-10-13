
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

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo()
    {
       
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
    
 
    
}
