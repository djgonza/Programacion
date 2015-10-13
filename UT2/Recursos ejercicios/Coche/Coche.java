/**
 * Una clase que representa autom�viles.
 * 
 */
public class Coche
{
    private String modelo; // Ford Focus, Citrone X-Sara, ...
    private String color;
    private int a�o, numPuertas;
    //private int numPuertas;
    /**
     * Constructor para los objetos de la clase Coche.
     * @param  queModelo el modelo del coche
     * @param  queColor el color del coche
     * @param  queA�o el a�o de fabricaci�n del coche
     * @param  cuantasPuertas cantidad de puertas del coche
     */
    public Coche(String queModelo, String queColor, int queA�o, int cuantasPuertas)
    {
        modelo = queModelo;
        color = queColor;
        a�o = queA�o;
        numPuertas = cuantasPuertas;
    }

    /**
     * cambiar el modelo del coche
     * @param  mod el coche modelo del coche
     */
     public void setModelor(String  mod)
    {
        modelo = mod;
    }   
 
    /**
     * cambiar el color del coche
     * @param  col el color del coche
     */
    public void setColor(String col)
    {
        color = col;
    }     
  
    /**
     * cambiar el a�o del coche
     * @param  an el a�o de fabricaci�n del coche
     */
    public void setA�o(int an) 
    {
        a�o = an;
    } 
    
    /**
     * visualizar la informaci�n del coche
     */
    public void print()
    {
        System.out.println("Modelo " + modelo + "\nA�o " + a�o + 
                           "\nColor " + color + ".");
    }    
   
    /**
     * devolver el modelo del coche
     * @return el modelo del coche
     */
    public String getModelo() 
    { 
        return modelo;
    }
  
    /**
     * devolver el color del coche
     * @return el color del coche
     */
    public String getColor()
    { 
        return color;
    }
    /**
     * devolver el numero de puertas del coche
     * @return el numero de puertas del coche
     */
    public int getPuertas() 
    { 
        return numPuertas;
    }
    /**
     * devolver el a�o del coche
     * @return el a�o del coche
     */
    public int getA�o() 
    { 
        return a�o;
    }
    
    /**
     * 
     *
     * @param  unCoche el coche a comparar con el actual
     * @return true si los coches que se comparan son iguales   
     */
    public boolean igualQue(Coche unCoche)
    {
        
        return (this.modelo.equals(unCoche.getModelo()) &&
               this.color.equals(unCoche.getColor()) &&
               this.a�o == unCoche.getA�o() &&
               this.numPuertas == unCoche.getPuertas());
    }
    
    

}
