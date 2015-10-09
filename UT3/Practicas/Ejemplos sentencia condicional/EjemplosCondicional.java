
/**
 *  Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 *  
 */
public class EjemplosCondicional
{
    // no incluimos atributos, es solo una clase de demostración

    /**
     * Constructor  
     */
    public EjemplosCondicional()
    {

    }

    /**
     *  
     * if con else completo (if anidado)
     *  
     * 
     */
    public void printDescripcion(int edad, String nombre)
    {

        if   (edad  <  13)
        {
            System.out.println(nombre  +  " es un niño");   
        }
        else
        {
            if  (edad  <  18)
            {
                System.out.println(nombre  + " es un adolescente ");  
            }
            else
            {
                System.out.println(nombre  +  "es un adulto");
            } 
        }

    }

    /**
     * if anidado, if ... else if
     */
    public void printDescripcionOtraVersion(int edad, String nombre)
    {

        if   (edad  <  13)
            System.out.println(nombre  +  " es un niño");   
        else  if  (edad  <  18)
            System.out.println(nombre  + " es un adolescente "); 
        else
            System.out.println(nombre  +  " es un adulto");
    }

    /**
     * 
     */
    public boolean  esPositivoPar(int numero)
    {    
        if   ( (numero  > 0)  && (numero % 2 ==  0))
            return true;
        return false;   
    }

    /**
     * 
     */
    public boolean  metodoMisterioV1(int valor)
    {        
        if   (valor  >= 0)  
            return true;
        return false;   
    }

    /**
     * Uso de una variable local para devolver el valor después con return
     */
    public boolean  metodoMisterioV2(int valor)
    {
        boolean resul = false;
        if   (valor  >= 0)  
            resul = true;
        return resul;   
    }

    /**
     * El método anterior con expresión booleana
     */
    public boolean  metodoMisterioV3(int valor)
    {

        return (valor >= 0);
    }

    /**
     * Demo de la sentencia switch
     */
    public  String demoSwitch(int dia)
    {
        String nombreDia;
        switch    (dia)
        {
            case 1:    nombreDia = "Lunes";
            break;
            case 2:    nombreDia = "Martes";
            break;
            case 3:    nombreDia = "Miércoles";
            break;
            case 4:    nombreDia = "Jueves";
            break;
            case 5:    nombreDia = "Viernes";
            break;
            case 6:    nombreDia = "Sábado";
            break;
            case 7:    nombreDia = "Domingo";
            break;
            default:  nombreDia = "Incorrecto";
            break;
        }
        return nombreDia;
    }

    /**
     * Demo de la sentencia switch
     */
    public void opcionMenu(char opcion)
    {
        switch    (opcion)
        {
            case 1:    System.out.println("Seleccionar cliente.");
            break;
            case 2:    System.out.println("Insertar cliente.");
            break;
            case 3:    System.out.println("Borrar cliente");
            break;
            case 4:    System.out.println("Editar cliente.");
            break;
            case 5:    System.out.println("Salir.");
            break;
            default:  System.out.println("Opción incorrecta.");
            break;
        }
    }

    /**
     *  
     */
    public void cuestion13()
    {
        double descuento;
        char codigo = 'B';
        switch (codigo)
        {
            case 'A': descuento = 0.0;
            case 'B': descuento = 0.1;
            case 'C': descuento = 0.2;
            default:
            descuento = 0.3;
        }
        System.out.println(descuento);
    }

    
    /**
     *  calcular dias mes
     *  parametros int numeroMes
     *  año bisiesto multiplo de 4
     *  si mes es erroneo mes -1
     */
    public int calcularDiasMes(int mes, int anio)
    {
        int dias = -1;
        if(mes > 12 || mes < 1){
            return dias;
        }else{
            
            switch (mes) 
            {
                case 2: 
                     if (anio % 4 == 0)
                        dias = 29;
                    else
                        dias = 28;
                break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: 
                    dias = 31;
               break;
               default: 
                    dias = 30;
               break;
            }
            
            return dias;
        }
    }

    /**
     *  
     */
    public int generarNumeroAleatorio(int menor, int mayor)
    {
       return (int)(
            Math.random() * (mayor - menor + 1) + menor
      );
       
    }

}
