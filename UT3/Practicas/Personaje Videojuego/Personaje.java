
/**
 *  class Personaje  
 * 
 * @author  
 * @version  
 */
public class Personaje
{
    private final char NORTE = 'N';
    private final char SUR = 'S';
    private final char ESTE = 'E';
    private final char OESTE = 'O'; 
    private String nombre;
    private int x;
    private int y;
    private char o;

    /**
     * Constructor de la clase Personaje
     */
    public Personaje(String nombre)
    {
        this.nombre = nombre;
        this.x = 0;
        this.y = 0;
        this.o = NORTE;
    }
    


    /**
     *  metodo avanzar
     */
    public void avanzar(int distancia)
    {
         if (this.o == 'N' || this.o == 'S')
            this.x += distancia;
         else
            this.y += distancia;
    }
    
    /**
     *  metodo girar
     *  direccion de N a E
     */
    public void girar()
    {
        switch (this.o)
        {
            case 'N': this.o = 'E';
            break;
            case 'S': this.o = 'O';
            break;
            case 'E': this.o = 'S';
            break;
            case 'O': this.o = 'N';
            break;
            
        }   
    }
    
     /**
     *  metodo para visualizar los datos 
     */
    public String toString()
    {
        return "Personaje = " + this.nombre +
                "\n Orientacion = " + this.o +
                "\n Posicion = [" + this.x + "," + this.y + "]";
    }

}
