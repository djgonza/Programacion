
/**
 *  
 */
public class DemoMapPaises
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        MapPaises map = new MapPaises();
        map.addPais("Portugal", "Lisboa");
        map.addPais("Francia", "París");
        map.addPais("Irlanda", "Dublín");
        map.addPais("España", "Madrid");
        map.addPais("Italia", "Roma");
        map.addPais("Alemania", "Berlín");
        map.print();
        
        //map.mostrarPaisesV1();
        //map.mostrarPaisesV2();
        map.mostrarPaisesV3();
        map.mostrarPaisesV4();

        
        
        
        
        
    }
}
