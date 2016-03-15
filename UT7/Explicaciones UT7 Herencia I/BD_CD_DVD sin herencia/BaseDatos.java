import java.util.ArrayList;

/**
 * La clase BaseDatos mantiene una catálogo
 * de CDs y Videos.
 * 
 * @author Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */
public class BaseDatos
{
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    /**
     * Constructor, crea una base de datos
     * vacía
     */
    public BaseDatos()
    {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    /**
     * Añadir un CD
     * @param elCD el CD a añadir
     */
    public void addCD(CD elCD)
    {
        cds.add(elCD);
    }

    /**
     * Añade un DVD
     * @param elDVD el DVD a añadir
     */
    public void addDVD(DVD elDVD)
    {
        dvds.add(elDVD);
    }

    /**
     * Lista todos los CD y DVD
     * 
     */
    public void listar()
    {
        
        for(CD cd : cds)
        {
            cd.print();
            System.out.println();   
        }
        
        for(DVD dvd : dvds)
        {
            dvd.print();
            System.out.println();  
        }
    }
}
