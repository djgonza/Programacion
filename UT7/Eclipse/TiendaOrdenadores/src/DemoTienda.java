
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
         Portatil p1 = new Portatil("P1", 799, "Ideal para viajes", 1.5);
         Portatil p2 = new Portatil("P2", 599, "Ideal para viajes", 2);
         Portatil p3 = new Portatil("P3", 499, "Ideal para viajes", 2.200);
         SobreMesa s1 = new SobreMesa("s1", 799, "La mejor oferta", "Intel Core i5 2,5 GHz");
         SobreMesa s2 = new SobreMesa("s2", 1300, "Oferta semanal", "Intel Core i7 2600");
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
}