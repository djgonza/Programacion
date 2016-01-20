import java.util.Arrays;
/**
 * 
 * Clase de prueba del CD
 */
public class DemoCD
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        // aceptar argumentos a través del main
        if(args.length != 3){
            System.out.println("El numero de argumentos no es correcto!" + 
                               "Sintaxis: java DemoCD <n> <titulo>" +
                               "<artista>");
            return;
        }
        
        // crear el CD
        CD cd = new CD(Integer.parseInt(args[0]), args[1], args[2]);
        
        // añadir varias canciones al CD (al final del CD
        cd.addCancion("Ave María", 3.45);
        cd.addCancion("Lloraré tus penas", 2.34);
        cd.addCancion("Lucía", 4.55);
        cd.addCancion("Ella", 4.21);
        cd.addCancion("Esclavo de tus besos ", 4.23);
        cd.addCancion("Bulería Bulería ", 3.72);
        
        //  Mostar el CD
        System.out.println(cd.toString());
        System.out.println("---------------------------------------------");
        
        // Mostar la duración del CD
        System.out.println("Duración total. " + cd.duracionTotal() + "'");
        System.out.println("---------------------------------------------");
        
      
        System.out.println("Borrar Canciones que empizan por: L");
        cd.borrarCancionesQueEmpiezan("L");
        System.out.println(cd.toString());
        
        System.out.println("---------------------------------------------");
        System.out.println("Canciones ordenadas por titulo");
        System.out.println(Arrays.toString(cd.cancionesOrdenadasPorTitulo()));
        
        System.out.println("---------------------------------------------");
        System.out.println("Crea un nuevo cd ordenado");
        cd.crearNuevoCD();
        
        
        
    }
}
