
/**
 *  Clase que inclute métodos para probar la
 *  sentencia iterativa while
 *   
 */

import java.util.Random;

public class DemoWhileUno
{

    private Moneda moneda;
    private Random aleatorio;
    /**
     * Constructor  
     */
    public DemoWhileUno()
    {
        moneda = new Moneda();
        aleatorio = new Random();
    }

    /**
     *  
     * Escribir un saludo 10 veces
     *  
     * 
     */
    public void ejemplo01()
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i + " - Hola");
            i++;
        }
       
    }

    /**
     *  
     * Tirar una moneda 10 veces
     * 
     */
    public void ejemplo02()
    {
        int i = 1;
        while(i <= 10)
        {
            moneda.tirar();
            if(moneda.esCara())
              System.out.println(i + " - Cara");  
            else
                System.out.println(i + " - Cruz"); 
            i++;
        }
    }

    /**
     *  
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     * Uso de contadores
     */
    public void ejemplo03()
    {
        int i = 1;
        int cara = 0;
        while(i <= 30)
        {
            moneda.tirar();
            if(moneda.esCara())
            cara++;  
            i++;
        }
        System.out.println("Cara: " + cara + "veces"); 
        System.out.println("Cruz: " + (i - 1 - cara) + "veces"); 
        
    }

    /**
     *  
     * Suma y producto de los números naturales desde el 20 hasta el 1
     * Uso de acumuladores
     */
    public void ejemplo04()
    {
        int i = 20;
        int suma = 0;
        long producto = 1;
        
        while(i >= 1)
        {
           suma += i;
           producto *= i;
           i--;
        }
        
        System.out.println("Suma: " + suma); 
        System.out.println("Producto: " + producto); 
    }
    
     /**
     *  Generar aleatorios entre 10 y 50 inclusive y escribirlos hasta
     *  que salga el 25 - en filas de 6 
     *  
     */
    public void ejemplo04_2( )
    {
        int aleatorio = 0;
        int fila = 1;
        while(aleatorio != 25){
            aleatorio = this.aleatorio.nextInt(41) + 10;
            if(fila < 6){
                System.out.print(" "+aleatorio+" ");
                fila++;
            }else{
                System.out.print("\n"+aleatorio+" ");
                fila = 0;
            }
        }
        
        
    }
    
    
     /**
     *  Generar aleatorios entre 0 y 50 inclusive y sumarlos.
     *  Parar cuando salga el 0. Escribir al final la suma
     *  
     */
    public void ejemplo04_3( )
    {
       
        int suma = 0;
        int aleatorio = (int) (Math.random() * 51);
        int total = 0;
        while ( aleatorio != 0 ){
            suma += aleatorio;
            System.out.print(aleatorio + "\t");
            total++;
            if(total % 6 == 0)
                System.out.print("\n");
            aleatorio = (int) (Math.random() * 51);
        }
        
    }

    /**
     *  
     * Tirar una moneda hasta que salga cara o se hayan hecho 30 tiradas
     * Usar una variable booleana como conmutador (o switch) para
     * salir del bucle
     */
    public void ejemplo05()
    {
        boolean cara = false;
        int tiradas = 0;
        while (!cara || tiradas <= 30) {
            
            if(aleatorio.nextInt(2) == 1){
                cara = true;
            }
            
            tiradas++;
            
        }
        
        

    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Sin usar switch o conmutadores
     */
    public  void ejemplo06V1()
    {
        int numero = 1;
        int sumaPar = 0;
        long productoImpar = 1;
        while(numero <= 100)
        {
            productoImpar *= numero;
            sumaPar += (numero + 1);
            numero += 2;
        }
        
        System.out.print("La suma total es: " + sumaPar);
        System.out.print("El producto total es: " + productoImpar);
    }
    
     /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Usando de switch o conmutadores
     */
    public  void ejemplo06V2()
    {
        boolean tocaImpar = true;
        int numero = 1;
        int sumaPar = 0;
        long productoImpar = 1;
        while(numero <= 100)
        {
            if(tocaImpar){
                 productoImpar *= numero;
            }else{
                sumaPar += (numero + 1);
            }
            
            numero++;
            tocaImpar = !tocaImpar;
                
        }
        
        System.out.print("La suma total es: " + sumaPar);
        System.out.print("El producto total es: " + productoImpar);
      
    }

    /**
     * Generar n aleatorios entre 5 y 15 inclusive y contar los pares, los que acaban en 2
     * y sumar los impares
     */
    public  void ejemploUno(int n)
    {
       

    }

 

    /**
     * Hacer una traza en papel  de este método y deducir qué salida produce
     * para las llamadas  misterio(1);       misterio(6);    
     *              misterio(19);  misterio(39);     misterio(74);
     */
    public   void misterio(int x)
    {
        int y = 1;
        int z = 0;
        while (2 * y <= x) 
        {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }
    
    
    /**
     * Generar 20 nºs aleatorios entre 5 y 10 incluidos
     * y para cada número calcular y escribir su sumatorio
     */
    public  void bucleAnidado01()
    {

      

    }
    
     /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     * 1111111111
     * 2222222222
     * 3333333333
     * 4444444444
     * 5555555555
     * 6666666666
     * 
     */
    public  void bucleAnidado02()
    {

       

    }
   
    
    /**
     * El programa hace una pausa de los milisegundos especificados
     */
     public void esperar(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)
        {
            // ignorar la excepción
        }
    }
    
    /**
     * Para hacer la traza en papel
     */
    public  int queHace01(int a, int b)
    {
        int p = 1;
        int contador = 1;
        while (contador <= b)
        {
            p = p * a;
            contador ++;
        }
        return p;
            
    }

    /**
     * Para hacer la traza
     */
    public  int queHace02(int a, int b)
    {
        int s = 0;
        int contador = 1;
        while (contador <= b)
        {
            s = s + a;
            contador ++;
        }
        return s;
            
    }


}
