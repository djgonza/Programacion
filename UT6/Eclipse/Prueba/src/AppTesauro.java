


/**
 * Clase AppTesauro -  incluye el m�todo main()
 * Arranca la aplicaci�n
 */
public   class AppTesauro
{
     
    /**
     * 
     */
    public static void main(String[] args)
    {
         Tesauro tesauro = new Tesauro();
         tesauro.a�adirSinonimo("obeso gordo");
         tesauro.a�adirSinonimo("delgado enjuto fino flaco");
         tesauro.a�adirSinonimo("delegar encargar encomendar facultar");
         tesauro.escribirTesauro();
    }
}
