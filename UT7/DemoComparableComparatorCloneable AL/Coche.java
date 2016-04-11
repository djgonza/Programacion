import java.util.Set;
import java.util.HashSet;
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Coche implements Comparable<Coche>, Cloneable
{
    private int velocidad;
    private int consumo;

    /**
     * 
     */
    public  Coche(int velocidad, int consumo)
    {
        this.velocidad = velocidad;
        this.consumo = consumo;
    }

    /**
     * 
     */
    public  int getVelocidad()
    {
        return velocidad;
    }

    /**
     * 
     */
    public  void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;

    }
    
    public int compareTo(Coche obj){
        return 0;
    }

    /**
     * 
     */
    public  String toString()
    {
        return this.getClass() + "\nVelocidad: " + velocidad;
    }

    public int getConsumo (){
        return consumo;
    }

    /**
     * Redefinición de equals()
     */
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;      
        Coche c = (Coche) obj;
        if ( this.getClass() != c.getClass())
            return false;
        return this.velocidad == c.getVelocidad() && 
        this.consumo == c.getConsumo();
    }

    public int hashCode(){
        return velocidad + consumo * 31;
    }
    
    public Coche clone () throws CloneNotSupportedException {
        
        return (Coche) super.clone();
        
    }
    
    public static void main (String[] args){

        Set<Coche> coches = new HashSet<>();
        Coche c1 = new Coche(200, 70);
        Coche c2 = new Coche(200, 70);
        Coche c3 = new Coche(100, 50);

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        
        System.out.println(coches);

    }
}