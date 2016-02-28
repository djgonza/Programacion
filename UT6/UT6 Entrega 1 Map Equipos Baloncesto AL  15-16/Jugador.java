import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *  Representa a un jugador de un equipo de baloncesto
 *   
 */

public class Jugador
{

    private String nombre;     
    private LocalDate fechaNacimiento;
    private double altura;  // en metros
    private Posicion posicion; // posicion que coupa en el equipo en el que juega

    /**
     * Constructor de la clase Jugador
     *  
     */
    public Jugador(String nombre,  int dia, int mes, int a, 
                    double altura, Posicion posicion)
    {
       this.nombre = nombre;
       this.fechaNacimiento = asignarFecha(dia, mes, a);
       this.altura = altura;
       this.posicion = posicion;
    }

    /**
     * Calcula y devuelve la fecha de nacimiento de un  Jugador
     * @param  dia, mes, a dia mes y ano de una fecha
     * @return un objeto LocalDate almacenando la fecha creada
     */
    private LocalDate asignarFecha(int dia, int mes, int a)
    {   
          return LocalDate.of(a, mes, dia);
    }

    /**
     *  devuelve el mes de nacimiento de un Jugador
     *
     */
    public int getMes()
    {
        return fechaNacimiento.getMonthValue();
    }

    /**
     *  devuelve el ano de nacimiento de un Jugador
     *
     */
    public int getAnio()
    {
        return fechaNacimiento.getYear();
    }

    /**
     * 
     * @return  devuelve el nombre en la forma Xxxxx, Xxxxx
     *          apellido, nombre
     *   La primera letra del apellido y del nombre en mayusculas,
     *   el resto en minusculas       
     *   Si el nombre del jugador es MARC GASOL  devuelve  "Gasol, Marc"
     *   
     *  Sin utilizar split()
     */
    public String getNombre()
    {   
        String nombreFormat = 
            nombre.substring(0,1) + 
            nombre.substring(1, nombre.indexOf(" ")).toLowerCase();
        String apellidoFormat = 
            nombre.substring(nombre.indexOf(" ") + 1, nombre.indexOf(" ") + 2) + 
            nombre.substring(nombre.indexOf(" ") + 2, nombre.length()).toLowerCase();

        return apellidoFormat + ", " + nombreFormat;
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
     * accesor para la posicion que ocupa
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
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    /**
     * devuelve la fecha formateada como un string
     * en formato dd / nombre mes / aaaa
     */
    public String getFecha()
    {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        return fechaNacimiento.format(formateador);
         
    }

    /**
     * representacion textual de un objeto Jugador
     * de la forma
     *                       Nombre: Kobe, Bryant              
     *                    Posicion: ALERO                    
     *          Fecha de nacimiento: 23 / agosto / 1978 (edad 37 )
     *          
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%30s%-20s", "Nombre: ", getNombre()));
        sb.append('\n');
        sb.append(String.format("%30s%-20s", "Posicion: ", getPosicion()));
        sb.append('\n');
        sb.append(String.format("%30s%-1s", "Fecha deNacimiento: ", getFecha()));
        sb.append(" (").append("Edad ").append(getEdad()).append(")");
        return sb.toString();
    }

    /**
     *  
     */
    public static void print()
    {
        Jugador j = new Jugador("Kobe Bryant", 23, 8, 1978, 1.98, Posicion.ALERO);
        System.out.println(j.toString());
    }

    public static void main(String[] args) {
        Jugador demo = new Jugador("MARC GASOL", 1, 1, 1991, 2.02, Posicion.ALERO);
        System.out.println(demo.toString());
    }

}
