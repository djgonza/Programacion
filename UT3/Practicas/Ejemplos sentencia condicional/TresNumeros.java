
/**
 *  class TresNumeros  
 * 
 * @author  
 * @version  
 */
public class TresNumeros
{
     
    private int n1;
    private int n2;
    private int n3;

    /**
     * Constructor de la clase TresNumeros
     */
    public TresNumeros(int n1, int n2, int n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    /**
     *  metodo que devuelve el valor maximo de los tres numeros
     */
    public int getMaximo()
    {
         int aux = 0;
         
         /*if(n1 >= n2 && n1 >= n3)
            aux = n1;
         if(n2 >= n1 && n2 >= n3)
            aux = n2;
         if(n3 >= n1 && n3 >= n2)
            aux = n3;*/
        
        aux = Math.max(n1, n2);
        aux = Math.max(aux, n3);
        
        //aux = Math.max(Math.max(n1,n2),n3);
        
        return aux;
    }
    
    /**
     *  metodo que devuelve el valor minimo de los tres numeros
     */
    public int getMinimo()
    {
         int aux = 0;
         
         /*if(n1 <= n2 && n1 <= n3)
            aux = n1;
         if(n2 <= n1 && n2 <= n3)
            aux = n2;
         if(n3 <= n1 && n3 <= n2)
            aux = n3;*/
        
        aux = Math.min(n1, n2);
        aux = Math.min(aux, n3);
        
        //Math.min(Math.min(n1,n2),n3);
        
        return aux;
    }
    
    /**
     *  metodo que devuelve true si todos los numeros son iguales
     */
    public boolean sonIguales()
    {
        return n1 == n2 && n1 == n3;
    }
    
    /**
     *  metodo que devuelve en numero de numeros pares que hay
     */
    public int sonPares()
    {
        int aux = 0;
        if (n1 % 2 == 0)
            aux++;
        if (n2 % 2 == 0)
            aux++;
        if (n3 % 2 == 0)
            aux++;
        return aux;
            
    }
    
    /**
     *  metodo que comprueba cuantos numeros terminan en 7
     */
    public int acabanEn7()
    {
        int aux = 0;
        if (n1 % 10 == 7)
            aux++;
        if (n2 % 10 == 7)
            aux++;
        if (n3 % 10 == 7)
            aux++;
        return aux;
    }
    
    /**
     *  metodo que ordena los numeros en orden ascendente
     */
    public void ordenar()
    {
        int n1 = this.n1; 
        int n2 = this.n2;
        int n3 = this.n3;
       
        this.n1 = getMinimo();
        this.n3 = getMaximo();
        
        if (getMinimo() == n1)
            this.n2 = Math.min(n2, n3);
        if (getMinimo() == n2)
            this.n2 = Math.min(n1, n3);
        if (getMinimo() == n3)
            this.n2 = Math.min(n1, n2);
       
     }




}
