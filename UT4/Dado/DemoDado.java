
/**
 * 
 * 
 * @author  
 * @version  
 */
public class DemoDado
{
    private final int TOTAL = 10;
    private Dado dado;

    /**
     *  
     */
    public DemoDado()
    {   
        dado = new Dado();
    }

    /**
     *  un método test1() que simule el lanzamiento de un dado 
     *  TOTAL veces (TOTAL es una constante)
     *  y cuente y visualice las apariciones del 1 y del 6 en esos lanzamientos
     */
    public void test1()
    {
        int uno = 0;
        int seis = 0;
        int i = 0;
        while(i <= TOTAL) {
            int valorTirada = dado.tirarDado();
            if(valorTirada == 1) {
                uno++;
            }else if (valorTirada == 6) {
                seis++;
            }
            i++;
        }

        System.out.print("Uno: "+uno+" || Seis: "+seis);
    }

    /**
     *  un método test2() que lance el dado hasta que salga 
     *  el 4 o el 5 contando las veces que se ha tirado
     *  el dado. Visualiza los resultados
     */
    public void test2()
    {
        int i = 0;
        int valorTirada = dado.tirarDado();
        while(valorTirada > 5 && valorTirada < 4) {
            valorTirada = dado.tirarDado();
            i++;
        }
        System.out.print("El dado se ha tirado: "+i+" veces.");

    }

    /**
     *  un método test3() que tire el dado mientras la suma de 
     *  las tiradas no supere el valor 42. Visualiza
     *  los resultados
     */
    public void test3()
    {
        int valor = 0;
        int i = 0;
        while (valor <= 42){
            valor += dado.tirarDado();
            i++;
        }
        System.out.print("El dado se ha tirado: "+i+" veces.");
    }

    /**
     *  
     *  
     */
    public static void main(String[] args)
    {
        System.out.println("\u000c");
        DemoDado demo = new DemoDado();
        demo.test1();
        System.out.println();
        demo.test2();
        System.out.println();
        demo.test3();
    }
}
