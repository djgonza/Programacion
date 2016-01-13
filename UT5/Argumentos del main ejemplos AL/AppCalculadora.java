
/**
 * 
 */
public class AppCalculadora
{

    /**
     *  
    /**
     *  si no se pasan argumentos al main mostrar error,
     *  sino aceptar los argumentos, crear un array de enteros con ellos
     *  crear la calculadora a partir de los valores de ese array y mostrar la calculadora
     *  
     */
    public static void main(String[] args)
    {
         if(args.length == 0){
            System.out.println("Error en numero de argumentos\n"+
            "Sintaxis: java AppCalculadora [numeros]");
            return;
            //System.exit(0);
        }
        Calculadora app = new Calculadora();
        
        for(int i=0; i<args.length; i++){
            app.introducirNumero(Integer.parseInt(args[i]));
        }
        
        app.escribirNumeros();
    }
}
