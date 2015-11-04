
/**
 *  class Fraccion  
 * 
 * @author  
 * @version  
 */
public class Fraccion
{

    private int numerador;
    private int denominador;

    /**
     * Constructor de la clase Fraccion
     */
    public Fraccion()
    {
        this.numerador = 0;
        this.denominador = 0;
    }

    /**
     * Constructor de la clase Fraccion
     */
    public Fraccion(int numerador, int denominador)
    {
        this.numerador = numerador;
        this.denominador = denominador;
        this.simplificar();
    }

    /**
     *  
     */
    public int getNumerador()
    {
        return this.numerador;
    }

    /**
     *  
     */
    public int getDenominador ()
    {
        return this.denominador;
    }

    /**
     *  
     */
    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    /**
     *  
     */
    public void setDenominador(int denominador)
    {
        this.denominador = denominador;
    }

    
    /**
     *  Suma dos Fracciones
     */
    public Fraccion sumar(Fraccion fraccion)
    {
        Fraccion c = new Fraccion();
        
        c.setNumerador((this.numerador * fraccion.getDenominador()) + (this.denominador * fraccion.getNumerador()));
        c.setDenominador(this.denominador * fraccion.getDenominador());
        
        return c;
    }

    /**
     *  
     */
    public Fraccion resta(Fraccion fraccion)
    {
        Fraccion c = new Fraccion();
        
        c.setNumerador((this.numerador * fraccion.getDenominador()) - (this.denominador * fraccion.getNumerador()));
        c.setDenominador(this.denominador * fraccion.getDenominador());
        
        return c;
    }

    /**
     *  
     */
    public Fraccion multiplicacion(Fraccion fraccion)
    {
        Fraccion c = new Fraccion();
        
        c.setNumerador(this.numerador * fraccion.getNumerador());
        c.setDenominador(this.denominador * fraccion.getDenominador());
        
        return c;
        
    }

    /**
     *  
     */
    public Fraccion division(Fraccion fraccion)
    {
        Fraccion c = new Fraccion();
        
        c.setNumerador(this.numerador * fraccion.getDenominador());
        c.setDenominador(this.denominador * fraccion.getNumerador());
        
        return c;
        
    }
    
    /**
     *  
     */
    public boolean igualQue(Fraccion fraccion) {
       
        double fraccionA = (double) fraccion.getNumerador() / fraccion.getDenominador();
        double fraccionB = (double) this.numerador / this.denominador;
        
        return fraccionA == fraccionB;
        
    }
    
    /**
     *  
     */
    public boolean menorQue(Fraccion fraccion) {
       
        double fraccionA = (double) fraccion.getNumerador() / fraccion.getDenominador();
        double fraccionB = (double) this.numerador / this.denominador;
        
        return fraccionA > fraccionB;
        
    }
    
    /**
     *  
     */
    public Fraccion clonar() {
       
        return new Fraccion(this.numerador, this.denominador);

    }
    
    /**
     *  
     */
    public String toString(){
        
        String devolver = String.format("%2d / %2d", this.numerador, this.denominador);
        return devolver;
    }
    
    /**
     *  
     */
    private void simplificar()
    {
        int div = mcd(this.numerador, this.denominador);
        this.numerador /= div; 
        this.denominador /= div;
                 
    }
    
    
    /**
     *  Metodo para conseguir el 
     */
    private int mcd(int num1, int num2)
    {
        int resto = num1 % num2;
        while(resto!= 0)
        {
            num1 = num2;
            num2 = resto;
            resto = num1 % num2;
       
        }
        return num2;
    }

    public static void main(String[] args)
    {
        System.out.println("\u000c");
        Fraccion demo = new Fraccion(32, 10);
        
        System.out.println(demo.toString());

    }
    
}
