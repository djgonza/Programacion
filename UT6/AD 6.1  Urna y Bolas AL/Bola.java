
/**
 * Representa a una bola
 * 
 */

public class Bola
{

    private Color color; // Color es un tipo enumerado

    /**
     * Constructor 
     */
    public Bola()
    {

        int aleatorio = (int) Math.floor(Math.random() * 2);
        
        if(aleatorio == 0)
            color = Color.BLANCO; 
        else
            color = Color.NEGRO;

        //aleatorio == 0 ? color = Color.BLANCO :  color= Color.NEGRO;

    }

    /**
     * Accesor para el color de la bola
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * 
     * @return  true si es blanca   
     */
    public boolean esBlanca()
    {
        return color == Color.BLANCO;     

    }

    /**
     * 
     * @return  true si es negra   
     */
    public boolean esNegra()
    {
        
        return color == Color.NEGRO;  

    }
    
    /**
     * return el color de la bola en formato String
     */
    public String getColorString()
    {
        if(esBlanca())
            return "Es blanca";
        return "Es negra";
    }

    /**
     * Representacion textual de una bola
     */
    public String toString()
    {
        return "Bola de color: " + getColorString();
    }

}
