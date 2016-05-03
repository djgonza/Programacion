import java.util.List;
import java.io.IOException;

/**
 *  
 * 
 * @author  
 * @version  
 */
public class DemoTienda
{
     
    private Tienda tienda;

    /**
     * Constructor  
     */
    public DemoTienda()
    {
         tienda = new Tienda("PeCeOrdenador");
    }

    /**
     *  
     * 
     * @param   
     * 
     */
    public void addOrdenadores()
    {
         Portatil p1 = new Portatil("P1", 799, 1.5);
         Portatil p2 = new Portatil("P2", 599,   2);
         Portatil p3 = new Portatil("P3", 499,   2.200);
         SobreMesa s1 = new SobreMesa("s1", 799,   "Intel Core i5 2,5 GHz");
         SobreMesa s2 = new SobreMesa("s2", 1300,  "Intel Core i7 2600");
         tienda.addOrdenador(p1);
         tienda.addOrdenador(p2);
         tienda.addOrdenador(p3);
         tienda.addOrdenador(s1);
         tienda.addOrdenador(s2);
          
         
    }
    
    /**
     * 
     */
    public  void demoMasBarato()
    {
        System.out.println("El ordenador más barato es " + tienda.masBarato());
    }
    
     /**
     * 
     */
    public  void demoCuantosPortatiles()
    {
         System.out.println("Nº portátiles: " + tienda.cuantosPortatiles());  
    
    }
     /**
     * 
     */
    public  void demoEscribirTienda()
    {
        System.out.println(tienda.toString());
    }
  
    /**
     * 
     */
    public  void demoBorrarMasBarato()
    {
        tienda.borrarMasBarato();
         
    }
    
     /**
     * 
     */
    public  void demoOrdenarPorPrecio()
    {
        tienda.ordenarPorPrecio();
        demoEscribirTienda();
         
    }
    
     /**
     * 
     */
    public  void demoOrdenarPorCodigo()
    {
        tienda.ordenarPorCodigo();
        demoEscribirTienda();
         
    }
    
    /**
     * 
     */
    public  void demoListarPortatilesOrdenados()
    {
        List<Portatil> lista = tienda.ordenarPorPrecioLosPortatiles();
        for (Ordenador ord: lista)
            System.out.println(ord.toString());
    }
    
    /**
     * 
     */
    public  void demoSalvarFichero() throws IOException
    {
        this.addOrdenadores();
        tienda.salvarEnFichero();
    }

     /**
     * 
     */
    public  void demoLeerFichero()
    {
         
        tienda.leerDeFichero();
        this.demoEscribirTienda();
    }
}
