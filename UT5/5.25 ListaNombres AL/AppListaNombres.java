
/**
 * 
 * Acepta como argumento del main el tama�o m�ximo de la lista
 * Si no se pasan argumentos se muestra un mensaje de error, se le informa al usuario
 * de la sintaxis a utilizar y se acaba el programa
 * 
 * En otro caso se crea la lista y:
 *  - se llama al m�todo cargarDeFichero() 
 *  - se muestra la lista
 *  - se muestra el nombre m�s largo
 *  - se borran los que empiezan por 'r'
 *  - se muestra la lista
 *  - se muestra cu�ntos empiezan por 'aL'
 *  - se muestran los nombres que empiezan por "a"
 */
public class AppListaNombres
{

    /**
     *  
     */
    public static void main(String[] args)
    {
        ListaNombres demo = new ListaNombres(15);
        demo.cargarDeFichero();
        System.out.println(demo.toString());
        System.out.println("*******************");
        System.out.println("Nombre mas largo");
        System.out.println(demo.nombreMasLargo());
        System.out.println("*******************");
        demo.borrarLetra('r');
        System.out.println("Lista despues de borrar la letra r");
        System.out.println(demo.toString());
        System.out.println("*******************");
        System.out.println("Lista nombres que empiezan por al");
        System.out.println(demo.empiezanPor("al"));
        System.out.println("*******************");
        System.out.println("Lista nombres que empiezan por a");
        String[] empiezanPor = demo.empiezanPorLetra('a');
        for(int i=0; i<empiezanPor.length; i++){
            System.out.println(empiezanPor[i]);
        }

    }
}
