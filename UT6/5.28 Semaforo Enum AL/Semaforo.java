
/**
 * Modela un semáforo
 */
public class Semaforo
{
     
    private ColorSemaforo estado;

    /**
     * Constructor de la clase Semaforo
     * Inicialmente en verde
     */
    public Semaforo()
    {
        estado = ColorSemaforo.VERDE;
         
    }

    /**
     * accesor para el color del semáforo
     */
    public  ColorSemaforo getEstado()
    {
        return estado;
    }

    /**
     * cambia el estado del semáforo
     */
    public  void  cambiarEstado() 
    {
        switch (estado)
        {
            case VERDE: estado = ColorSemaforo.AMARILLO;
            break;
            case ROJO: estado = ColorSemaforo.VERDE;
            break;
            case AMARILLO: estado = ColorSemaforo.ROJO;
            break;
            
        }
    }

    /**
     * Devuelve los colores del semáforo
     * 
     */
    public String getColoresSemaforo() 
    {
         ColorSemaforo[] colores = ColorSemaforo.values();
         String resul = "";
         for(int i = 0; i < colores.length; i++)
         {
             resul += colores[i].toString() + " - " + 
             colores[i].getSegundos() + " ";
         }
         return  resul;
    }

    /**
     * devuelve el color del semáfor0 en formato String  
     */
    public String toString()
    {
        return estado.toString();

         
    }
}
