import java.util.Arrays;
/**
 *  
 */
public class AppUT5EjerArrays
{

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        //Creamos un objeto de la clase
        UT5EjerArrays demo = new UT5EjerArrays();
        //definimos un array para los ejemplos
        int[] Enteros = {1,2,3,4,5,6};
        
        //metodo
            int max = demo.maximo(Enteros);
            //System.out.print(max);
        
        //metodo  
            //asigamos el resultado del metodo a una variable
            int[] result = demo.paresV1(Enteros);
            //si intentamos mostrar el array directamente salen cosas raras
                //System.out.println(Arrays.toString(result));
            //recorremos el array resultante
            for(int i=0; i < result.length; i++)
            {
                //mostramos los valores
                //System.out.println(result[i]);
            }
        
        //metodo    
            System.out.println(Arrays.toString(demo.rotarDerechaV1(Enteros)));
            
        //metodo
            System.out.println(Arrays.toString(demo.calcularFrecuencias()));

    }
}
