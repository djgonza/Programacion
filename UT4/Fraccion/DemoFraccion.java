
/**
 *  class DemoFraccion  
 * 
 * @author  
 * @version  
 */
public class DemoFraccion
{
     
    private Fraccion fraccion1;
    private Fraccion fraccion2;

    /**
     * Constructor de la clase DemoFraccion
     */
    public DemoFraccion()
    {
        this.fraccion1 = null;
        this.fraccion2 = null;
    }

    /**
     *  
     */
    public void demo1()
    {
        this.fraccion1 = new Fraccion();
        this.fraccion1.setNumerador(-4);
        this.fraccion1.setDenominador(7);
        
        this.fraccion2 = new Fraccion(13,2);
        
        Fraccion suma = this.fraccion1.sumar(this.fraccion2);
        Fraccion resta = this.fraccion1.resta(this.fraccion2);
        Fraccion multiplicacion = this.fraccion1.multiplicacion(this.fraccion2);
        Fraccion division = this.fraccion1.division(this.fraccion2);
        
        this.escribirFraccion("Suma: %s", suma);
        this.escribirFraccion("Resta: %s", resta);
        this.escribirFraccion("Multiplicacion: %s", multiplicacion);
        this.escribirFraccion("Division: %s", division);
        
    }
    
    /**
     *  
     */
    private void escribirFraccion(String mensaje, Fraccion fraccion)
    {
        System.out.printf(mensaje, fraccion.toString());
    }

}
