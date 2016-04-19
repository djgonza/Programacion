
/**
 * Clase EjemploExcepciones 
 * 
*/
public class MasEjemplosFactorial
{
        
        private int a, b;
        private String cadena;

        /**
         * Constructor de la clase EjemploExcepciones
         */
        public MasEjemplosFactorial(int a, int b, String cadena)
        {
                this.a = a;
                this.b = b;
                this.cadena = cadena;
        }

        /**
         * Qué estamos haciendo aquí?
         * Tipo de excepción: 
         */
        public int factorial1()  throws FactorialNegativoExcepcion
        {
                if ( a < 0 )
                        throw new FactorialNegativoExcepcion(a);
                int f = 1;
                for (int i = 1; i < a; i++)
                        f *= i;
                return f;
        }
        
        /**
         * Qué estamos haciendo aquí?
         * Tipo de excepción:
         */
        public void escribirLongitudCadena1()
        {
                try
                {
                        System.out.println(cadena.length());
                }
                catch (NullPointerException e)
                {
                        System.out.println("Puntero nulo");
                        e.printStackTrace();
                }
        }
        
        /**
         * Qué estamos haciendo aquí?
         * Tipo de excepción:
         */
        public void escribirLongitudCadena2() throws NullPointerException
        {
               if (cadena == null)
                          throw new NullPointerException("Puntero nulo");
               System.out.println(cadena.length());        
        }
        
         /**
         * Qué estamos haciendo aquí?
         * Tipo de excepción:
         */
        public void escribirLongitudCadena3() //no se avisa, es posible porque no es verificada
        {
               if (cadena == null)
                          throw new NullPointerException("Puntero nulo");
               System.out.println(cadena.length());        
        }
        
        
}
