
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
        this.numerador = 0;
        this.denominador = 0;
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
        double fraccionB = (double)this.numerador / this.denominador;
        
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
       
        Fraccion devolver = new Fraccion(this.numerador, this.denominador);
        
        return devolver;
        
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
    public void simplificar()
    {
    	int div = 0;
    	//comprobamos si la fraccion es entera
    	if(this.numerador % this.denominador == 0)
    		div = this.numerador / this.denominador;
    	if(this.denominador % this.numerador == 0)
    		div = this.denominador / this.numerador;
    	if(div != 0){
    		this.numerador = (this.numerador / div);
    		this.denominador = (this.denominador / div);
    	}
    		
    		
    }
    
}
