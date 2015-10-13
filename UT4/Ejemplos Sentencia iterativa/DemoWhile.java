
/**
 *  Clase que inclute métodos para probar la
 *  sentencia iterativa while
 *   
 */
public class DemoWhile
{

    private Moneda moneda;
    /**
     * Constructor  
     */
    public DemoWhile()
    {
        moneda = new Moneda();
    }

    /**
     *  
     * Emitir un saludo 10 veces
     *  
     * 
     */
    public void ejemplo01()
    {
        int veces = 1;
        while (veces <= 10)
        {
            System.out.println("Saludo: " + veces);
            veces++;
        }
    }

    /**
     *  
     * Tirar una moneda 10 veces
     * 
     */
    public void ejemplo02()
    {
        int tiradas = 1;
        while (tiradas <= 10)
        {
            moneda.tirar();
            tiradas++;
        }
    }

    /**
     *  
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     */
    public void ejemplo03()
    {
        int caras = 0;  // es una variable contador
        int cruz = 0;  // es una variable contador
        int tiradas = 1;  // es una variable contador
        while (tiradas <= 30)
        {
            moneda.tirar();
            if (moneda.esCara())
                caras++;
            else
                cruz++;
            tiradas++;
        }
        System.out.println("Ha salido cara " + caras + " veces");
        System.out.println("Ha salido cruz " + cruz + " veces");
    }

    /**
     *  
     * Suma y producto de los números naturales de 1 a 20
     * Uso de acumuladores
     */
    public void ejemplo04()
    {
        int suma = 0; // variable acumulador
        long producto = 1;  // variable acumulador
        int contador = 20;  // variable contador de control del bucle
        while (contador >= 1)
        {
            suma = suma + contador;
            producto = producto * contador;
            contador--;
        }
        System.out.println("La suma vale " + suma);
        System.out.println("El producto vale " + producto);
    }

    /**
     *  
     * Tirar una moneda hasta que salga cara o se hayan hecho 30 tiradas
     * Uso de switch o conmutadores
     */
    public void ejemplo05()
    {
        boolean salioCara = false; // variable que actúa como conmutador
        int tiradas = 1;
        while (tiradas <= 30 && !salioCara)
        {
            moneda.tirar();
            if (moneda.esCara())
                salioCara = true;
            else
                tiradas++;
        }
        System.out.println("Salió cara en la tirada " + tiradas);

    }

    /**
     * Saludar 10 veces
     */
    public  void ejemploFor01()
    {
        for (int veces = 1; veces <= 10; veces++)
        {
            System.out.println("Saludo " + veces);
        }

    }

    /**
     * 
     */
    public  void ejemploFor02()
    {
        for (int tiradas = 1; tiradas <= 30; tiradas++)
        {
            moneda.tirar();
        }
    }

    /**
     * 
     */
    public  void ejemploFor03()
    {
        int ncaras = 0;
        int ncruz = 0;
        for (int tiradas = 1; tiradas <= 30; tiradas++)
        {
            moneda.tirar();
            if  (moneda.esCara())
                ncaras++;
            else
                ncruz++;
        }
    }

}
