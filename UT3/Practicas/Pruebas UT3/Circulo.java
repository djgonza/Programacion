
/**
 * Modela circulos de un determinado radio  
 */
public class Circulo
{
    private final double PI = 3.1416;
    private double radio;

    /**
     * Constructor de la clase Circulo
     */
    public Circulo(double queRadio)
    {
        radio = queRadio;
    }

    /**
     *  
     */
    public double calcArea()
    {
        double area = PI * radio * radio;  
        return area;
    }

    /**
     *  
     */
    public double calcPerimetro(double pi)
    {
        double perimetro = 2 * PI * radio;
        return perimetro;
    }

    /**
     *  
     */
    public double areaCuadrado()
    {
        return PI * radio * radio;
    }

}
