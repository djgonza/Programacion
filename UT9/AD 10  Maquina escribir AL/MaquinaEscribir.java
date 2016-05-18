
/**
 * Modela una m�quina de escribir
 * 
 * 
 */
public class MaquinaEscribir
{
    private String texto;
    
    /**
     * Constructor  
     */
    public MaquinaEscribir()
    {
        texto = "";
    }

    /**
     * Accesor para el texto
     */
    public String getTexto()
    {
        return texto;
    }
    
     /**
     * Mutador para el texto
     */
    public void a�adirCaracter(char car)
    {
         texto += car;
    }
    
    /**
     * Limpia el texto escrito
     * 
     * 
     */
    public void clear()
    {
         texto = "";
    }
    
    /**
     * Borrar el �ltimo car�cter del texto
     * 
     * 
     */
    public void borrarUltimo()
    {
        if(!texto.isEmpty()) 
            texto = texto.substring(0, texto.length()-1);
    }
    
}
