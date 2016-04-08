
/**
 * clase FicheroJPG  
 *  
 */
public class FicheroJPG  extends FicheroImagen
{

    private Compresion compresion;

    /**
     * Constructor de la clase FicheroJPG
     */
    public FicheroJPG(String titulo, int tama�o, Compresion compresion)
    {
        super(titulo, tama�o);
        this.compresion = compresion;
       
    }

    /**
     *  
     */
    public  Compresion getCompresion()
    {
        return compresion;
    }

    /**
     *     
     */
    public void display()
    {
        super.display();
        System.out.println("Compresion " + compresion.name());
        
    }
}
