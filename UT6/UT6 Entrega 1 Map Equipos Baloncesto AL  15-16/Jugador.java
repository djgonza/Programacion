
/**
 *  Representa a un jugador de un equipo de baloncesto
 *   
 */

public class Jugador
{

    private String nombre;     
    private LocalDate fechaNacimiento;
    private double altura;  // en metros
    private Posicion posicion; // posición que coupa en el equipo en el que juega

    /**
     * Constructor de la clase Jugador
     *  
     */
    public Jugador(String nombre,  int dia, int mes, int a, 
                    double altura, Posicion posicion)
    {
       
    }

    /**
     * Calcula y devuelve la fecha de nacimiento de un  Jugador
     * @param  dia, mes, a día mes y año de una fecha
     * @return un objeto LocalDate almacenando la fecha creada
     */
    private LocalDate asignarFecha(int dia, int mes, int a)
    {
            
    }

    /**
     *  devuelve el mes de nacimiento de un Jugador
     *
     */
    public int getMes()
    {
         
    }

    /**
     *  devuelve el año de nacimiento de un Jugador
     *
     */
    public int getAnio()
    {
        

    }

    /**
     * 
     * @return  devuelve el nombre en la forma Xxxxx, Xxxxx
     *          apellido, nombre
     *   La primera letra del apellido y del nombre en mayúsculas,
     *   el resto en minúsculas       
     *   Si el nombre del jugador es MARC GASOL  devuelve  "Gasol, Marc"
     *   
     *  Sin utilizar split()
     */
    public String getNombre()
    {   
      

    }
    /**
     *  accesor para la altura
     *
     */
    public double getAltura()
    {
        return altura;

    }

    /**
     * accesor para la posición que ocupa
     */

    public Posicion getPosicion()
    {
        return posicion;

    }

    /**
     *  Devuelve la edad del jugador
     */
    public int getEdad()
    {
        
    }

    /**
     * devuelve la fecha formateada como un string
     * en formato dd / nombre mes / aaaa
     */
    public String getFecha()
    {
        
         
    }

    /**
     * representación textual de un objeto Jugador
     * de la forma
                            Nombre: Kobe, Bryant              
                          Posición: ALERO                    
               Fecha de nacimiento: 23 / agosto / 1978 (edad 37 )
               
     */
    public String toString()
    {
        

    }

    /**
     *  
     */
    public static  void print()
    {
        Jugador j = new Jugador("Kobe Bryant", 23, 8, 1978, 1.98, Posicion.ALERO);
        System.out.println(j.toString());
    }

}
