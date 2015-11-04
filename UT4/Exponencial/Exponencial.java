
/**
 * 
 * 
 * @author  
 * @version  
 */
public class Exponencial
{
    private int base;
    private int exponente;

    /**
     *  Constructor con base y exponente
     */
    public Exponencial(int base, int exponente)
    {
        this.base = base;
        this.exponente = exponente;
    }

    /**
     *  Constructor
     */
    public Exponencial(Exponencial exponencial)
    {
        this.base = exponencial.getBase();
        this.exponente = exponencial.getExponente();
    }

    /**
     *  Mutador base
     */
    public void setBase(int base)
    {
        this.base = base;
    }

    /**
     *  Mutador exponente
     */
    public void setExponente(int exponente)
    {
        this.exponente = exponente;
    }

    /**
     *  Accesor base
     */
    public int getBase()
    {
        return this.base;
    }

    /**
     *  Accesor exponente
     */
    public int getExponente()
    {
        return this.exponente;
    }

    /**
     *  calcula el valor de un nº exponencial. Para ello este
     *  método se ayuda del método privado, potencia
     */
    public double valorExponencial()
    {
        if(this.exponente < 0)
        {
            return (double)(1.0 / this.potencia(this.base, -1 * this.exponente));
        }
        else if(this.exponente == 0)
        {
            return 1;
        }
        else
        {
            return (double)this.potencia(this.base, this.exponente);
        }

    }

    /**
     *   multiplica dos numeros exponenciales
     */
    public Exponencial multiplicar(Exponencial otro)
    {
        Exponencial devolver = new Exponencial(this.base, this.exponente + otro.getExponente());
        return devolver;
    }

    /**
     *   divide dos numeros exponenciales
     */
    public Exponencial dividir(Exponencial otro)
    {
        Exponencial devolver = new Exponencial(this.base, this.exponente - otro.getExponente());
        return devolver;
    }

    /**
     *   calcula la potencia de un nº exponencial
     */
    public Exponencial elevar(int n)
    {
        Exponencial devolver = new Exponencial(this.base, (this.exponente * n));
        return devolver;
    }

    /**
     *  calcula 'a' elevado a 'b' (el parámetro 'b' recibido por este
     *  método siempre es un valor >= 0)
     */
    private int potencia(int a , int b) 
    {
        int i = 1;
        int resultado = 1;
        while(i <= b){
            resultado *= a;
            i++;
        }
        return resultado;

    }

    /**
     *  to string
     */
    public String toString()
    {
        return String.format("\tBase: %d | Exponente: %d\n\tValor: %.1f", 
                   this.base, this.exponente, this.valorExponencial());
    }

    
    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        Exponencial demo = new Exponencial(2, 3);
        System.out.println(demo.toString());
        Exponencial demo1 = new Exponencial(2, 5);
        System.out.println(demo.dividir(demo).toString());
        
    }
}
