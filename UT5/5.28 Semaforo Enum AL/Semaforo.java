
/**
 * Modela un sem�foro
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
     * accesor para el color del sem�foro
     */
    public  ColorSemaforo getEstado()
    {
        return estado;
    }

    /**
     * cambia el estado del sem�foro
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
     * Devuelve los colores del sem�foro
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
     * devuelve el color del sem�for0 en formato String  
     */
    public String toString()
    {
        return estado.toString();

         
    }
}
