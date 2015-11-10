
/**
 * Representa a un nº entero
 * 
 *  
 */
public class Numero
{
    private int numero;

    /**
     * constructor para los objetos de la clase Numero
     */
    public Numero()
    {
        this.numero = 0;
    }

    /**
     * constructor para los objetos de la clase Numero
     */
    public Numero(int numero)
    {
        this.numero = numero;
    }

    /**
     * constructor para los objetos de la clase Numero
     */
    public Numero(Numero numero)
    {
        this.numero = numero.getNumero();

    }

    /**
     * @return  el número que almacena la clase   
     */
    public int getNumero()
    {
        return numero;
    }

    /**
     * @param establece un nuevo numero
     */
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    /**
     * calcula el factorial de numero con for
     */
    public int factorial()
    {
        int resultado = 1;
        for(int i=1; i<=this.numero; i++)
        {
            resultado *= i;
        }
        return resultado;

    }

    /**
     * Dibuja un rectángulo en la pantalla
     * con for
     */
    public void escribirFigura()
    {        
        for(int i=1; i<=10; i++)
        {
            System.out.println("********************");
        }   

    }

    /**
     *  
     * @return true si el número que guarda el objeto actual es primo
     * 
     */
    public boolean esPrimo()
    {
        for(int i=2; i<=(this.numero/2); i++)   
        {
            if(this.numero % i == 0)
                return false;
        }
        return true;

    }

    /**
     * @return la cantidad de cifras del nº
     */
    public int contarCifras(int numero)
    {
        int i = 0;
        for(i=0; (numero != 0); i++)
        {
            numero /= 10;
        }
        return i;

    }

    /**
     * @param numero el nº del que se extraerá 
     * la última cifra
     * @return la última cifra 
     */

    private static int ultimaCifra(int numero)
    {
        return (numero % 10);  
    }

    /**
     * Calcula el inverso
     * Hay que hacer uso del método privado ultimaCifra()
     * 
     * @param numero el nº del que se calculará el inverso 
     * @return el inverso
     */
    private int inverso(int numero)
    {
        int nuevoNumero = 0;
        int cifras = this.contarCifras(numero);
        for(int i=1; i<=cifras; i++){
            nuevoNumero *= 10;
            nuevoNumero += this.ultimaCifra(numero);
            numero /= 10;
        }
        return nuevoNumero;

    }

    /**
     * @return true si numero es capicúa
     * Hay que usar inverso()
     */
    public boolean esCapicua()
    {
        return this.numero == this.inverso(this.numero);

    }

    /**
     * Convertir a base 8 
     * @return   el nº convertido
     */
    public int aBase8()
    {
        int numero = this.numero;
        int numeroBase = 0;
        
        int i = 0;
        while(numero > 0)
        {
            numeroBase += (numero % 8) * Math.pow(10, i);
            numero /= 8;
            i++;
        }

        return numeroBase;

    }

    /**
     * Detecta si está o no una cifra en el nº
     * @param  cifra la cifra a localizar
     * @return   true si está la cifra
     */
    private static boolean estaCifra(int numero, int cifra)
    {
        while (numero > 0){
            if(ultimaCifra(numero) == cifra)
                return true;
            numero /= 10;
        }
        return false;

    }

    /**
     * Detecta si el nº tiene cifras repetidas
     * @return   true si las hay
     */
    public boolean hayCifrasRepetidas()
    {
        int numero = this.numero;
        int ultimaCifra = 0;
        while(numero > 0) {
            ultimaCifra = ultimaCifra(numero);
            numero /= 10;
            if(estaCifra(numero, ultimaCifra))
                return true;
        }
        
        return false;

    }

    /**
     * Convertir a base 2 
     * @return   el nº convertido
     */
    public long aBase2()
    {
        int numero = this.numero;
        long numeroBase = 0;
        
        int i = 0;
        while(numero > 0)
        {
            numeroBase += (numero % 2) * Math.pow(10, i);
            numero /= 2;
            i++;
        }

        return numeroBase;  

    }

//     /**
//      * Convertir a base 2 
//      * @return   la cadena que representa el nº convertido
//      */
//     public String aBase2V2()
//     {
//         //return (String) aBase2();    
// 
//     }

    public static void main (String args[])
    {
        System.out.print('\u000C');
        int numero = 123456;
        Numero demo = new Numero(numero);
//         System.out.println(demo.factorial());
//         demo.escribirFigura();
//         System.out.println(demo.esPrimo());
//         System.out.println(demo.inverso(numero));
//         System.out.println(demo.contarCifras(numero));
//         System.out.println(demo.ultimaCifra(numero));

        System.out.println(demo.aBase8());
        System.out.println(estaCifra(156, 2));
        System.out.println(demo.hayCifrasRepetidas());
        System.out.println(demo.aBase2());

    }
}
