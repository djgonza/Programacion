import java.util.Scanner;

public class InterfazTexto
{
    private final int NUEVO_NUMERO = 1;
    private final int FACTORIAL = 2;
    private final int FIGURA = 3;
    private final int CONTAR_CIFRAS = 4;
    private final int ES_CAPICUA = 5;
    private final int A_BASE8 = 6;
    private final int CIFRAS_REPETIDAS = 7;
    private final int A_BASE2 = 8;
    private final int SALIR = 9;
    private Numero numero;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazUsuario
     */
    public InterfazTexto()
    {
        this.teclado = new Scanner(System.in);
        numero = null;

    }

    /**
     * Controla la lógica del objeto InterfazTexto
     * Se presenta un menú al usuario. Este selecciona una opción.
     * Para cada opción seleccionada hay un método privado que realiza la tarea que representa
     */
    public void iniciar()
    {
        borrarPantalla();
 
        int opcion = menu();
        while (opcion != SALIR)
        {
            switch (opcion)
            {       
                case NUEVO_NUMERO:
                int num = pedirNumero();
                if (numero == null)
                    numero = new Numero(num);
                else
                    numero.setNumero(num);
                break;
                case FACTORIAL:
                    this.factorial();
                break;
                case FIGURA:
                    this.escribirFigura();
                break;
                case CONTAR_CIFRAS:
                    this.contarCifras(numero.getNumero());
                break;
                case ES_CAPICUA:
                    this.esCapicua();              
                break;
                case  A_BASE8:
                     // a completar
                break; 
                case  CIFRAS_REPETIDAS:
                      // a completar
                break;
                case  A_BASE2:
                          // a completar
                break;
            }       

            opcion = menu();
        }
        System.out.println("¡¡¡¡ FIN de la aplicación !!!");

    }

    /**
     * pide un nº y lo devuelve
     */
    private int pedirNumero()
    {
        this.borrarPantalla();
        System.out.print("Introduce un numero: ");
        return teclado.nextInt();

    }


    /**
     * Presenta un menú en la pantalla
     * para que el usuario pueda elegir su opción
     * @return  devuelve la opción seleccionada
     */ 

    private int menu()
    {

        this.borrarPantalla();
        System.out.println(" ..........................................................");
        System.out.println(" Elige una opción ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Solicitar nuevo numero");
        System.out.println(" 2.- Factorial");
        System.out.println(" 3.- Escribir figura");
        System.out.println(" 4.- Contar cifras");
        System.out.println(" 5.- Comprobar capicúa");
        System.out.println(" 6.- A base 8");
        System.out.println(" 7.- Hay cifras repetidas");
        System.out.println(" 8.- A base 2");
        System.out.println(" 9.- Salir");

        int opcion = this.leerOpcion();
        while(!this.opcionValida(opcion))
        {
            System.out.println("Opcion erronea, selecciona otra: "); 
            opcion = this.leerOpcion();
        }
        
        return opcion;
        
    }

    /**
     *  lee una opción y la devuelve
     *
     *  
     */
    private int leerOpcion( )
    {
        return teclado.nextInt();
    }

    /**
     *  devuelve true si una opción es válida, false en otro caso
     *  
     */
    private boolean opcionValida(int opcion)
    {
         return ((opcion >= NUEVO_NUMERO && opcion <= SALIR));
         
    }

    /**
     * mostrar el factorial
     */
    private void factorial()
    { 
        borrarPantalla();
        numero.factorial();
        
        
    }

    /**
     * escribir figura
     */
    private void escribirFigura()
    { 
        borrarPantalla();
        numero.escribirFigura();
        
        
    }

    /**
     * mostrar la cantidad de cifras del número
     */
    private void contarCifras()
    { 
        borrarPantalla();
        numero.contarCifras(numero.getNumero());
        
        
    }

    /**
     * Mostrar si es o no capicía
     */
    private void esCapicua()
    { 
        borrarPantalla();
        numero.esCapicua();
        
        
    }

    /**
     * muestra el nº en base 8
     */
    private void aBase8()
    { 
         borrarPantalla();
         // a completar
         
         

    }

    /**
     * muestra el nº en base 2
     */
    private void aBase2()
    { 
        borrarPantalla();
         // a completar
        
        

    }

    /**
     *  Muestra si hay o no cifras repetidas en el número
     *  
     */
    public void hayCifrasRepetidas()
    {
         borrarPantalla();
          // a completar
         
    }

    /**
     * Borrar la pantalla  
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }

}

