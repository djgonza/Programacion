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
        // crear el teclado
         // a completar
        
        numero = null;

    }

    /**
     * Controla la l�gica del objeto InterfazTexto
     * Se presenta un men� al usuario. Este selecciona una opci�n.
     * Para cada opci�n seleccionada hay un m�todo privado que realiza la tarea que representa
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
                         // a completar
                break;
                case FIGURA:
                        // a completar  
                break;
                case CONTAR_CIFRAS:
                         // a completar
                break;
                case ES_CAPICUA:
                           // a completar              
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
        System.out.println("���� FIN de la aplicaci�n !!!");

    }

    /**
     * pide un n� y lo devuelve
     */
    private int pedirNumero()
    {
         // a completar
        

    }


    /**
     * Presenta un men� en la pantalla
     * para que el usuario pueda elegir su opci�n
     * @return  devuelve la opci�n seleccionada
     */ 

    private int menu()
    {

        System.out.println(" ..........................................................");
        System.out.println(" Elige una opci�n ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Solicitar nuevo numero");
        System.out.println(" 2.- Factorial");
        System.out.println(" 3.- Escribir figura");
        System.out.println(" 4.- Contar cifras");
        System.out.println(" 5.- Comprobar capic�a");
        System.out.println(" 6.- A base 8");
        System.out.println(" 7.- Hay cifras repetidas");
        System.out.println(" 8.- A base 2");
        System.out.println(" 9.- Salir");
        // leer opci�n y validarla usando leerOpcion() y opcionValida()
        
        
        
        return opcion;
    }

    /**
     *  lee una opci�n y la devuelve
     *
     *  
     */
    private int leerOpcion( )
    {
        // a completar
        
        
    }

    /**
     *  devuelve true si una opci�n es v�lida, false en otro caso
     *  
     */
    private boolean opcionValida(int opcion)
    {
         // a completar
         
    }

    /**
     * mostrar el factorial
     */
    private void factorial()
    { 
        borrarPantalla();
        // a completar
        
        
    }

    /**
     * escribir figura
     */
    private void escribirFigura()
    { 
        borrarPantalla();
         // a completar
        
        
    }

    /**
     * mostrar la cantidad de cifras del n�mero
     */
    private void contarCifras()
    { 
        borrarPantalla();
        // a completar
        
        
    }

    /**
     * Mostrar si es o no capic�a
     */
    private void esCapicua()
    { 
        borrarPantalla();
          // a completar
        
        
    }

    /**
     * muestra el n� en base 8
     */
    private void aBase8()
    { 
         borrarPantalla();
         // a completar
         
         

    }

    /**
     * muestra el n� en base 2
     */
    private void aBase2()
    { 
        borrarPantalla();
         // a completar
        
        

    }

    /**
     *  Muestra si hay o no cifras repetidas en el n�mero
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

