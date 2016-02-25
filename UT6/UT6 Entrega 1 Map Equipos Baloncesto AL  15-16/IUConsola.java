
/**
 * Interfaz de texto
 *  
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class IUConsola
{
    private static final int MOSTRAR = 1;
    private static final int JUGADORES_EN_EQUIPO = 2;
    private static final int ALEROS = 3;
    private static final int ALTURA_MEDIA = 4;
    private static final int BORRAR = 5;
    private static final int SALIR = 6;

    private Scanner teclado;
    private  MapEquipos map;

    /**
     * Constructor de la clase IUConsola
     */
    public IUConsola(MapEquipos map)
    {
        teclado = new Scanner(System.in);
        this.map = map;
        map.leerDeFichero();

    }

    /**
     *  Incluye la lógica de la aplicación
     *  
     */
    public void iniciar()
    {

        int opcion = menu();
        while (opcion != SALIR)
        {
            switch (opcion)
            {
                case MOSTRAR: mostrarEquipos();
                break;
                case JUGADORES_EN_EQUIPO : jugadoresEnEquipo();
                break;
                case ALEROS: aleros();
                break;
                case ALTURA_MEDIA: alturaMedia();
                break;
                case BORRAR: borrar();
                break;

            }
            pausa();
            opcion = menu(); 
        }

    }

    /**
     * Presenta el menú 
     * @return  la opción seleccionada
     */
    private int menu()
    {
        borrarPantalla();
        System.out.println("*******************************************");
        System.out.println("*** Equipos de baloncesto y jugadores  ****");
        System.out.println("******************************************");
        System.out.println("1. Mostrar equipos");
        System.out.println("2. Jugadores en equipo");
        System.out.println("3. Relación de aleros");
        System.out.println("4. Altura media jugadores de un equipo");
        System.out.println("5. Borrar jugadores de edad menor");
        System.out.println("6. Salir");

        System.out.print("Teclea opción: ");
        int opcion = teclado.nextInt();
        while (!opcionValida(opcion))
        {
            System.out.print("Opción incorrecta, Teclea opción: ");
            opcion = teclado.nextInt();
        }
        teclado.nextLine();
        return opcion;
    }

    /**
     *  Devuelve true si la opción es correcta, false en otro caso
     *
     */
    private boolean opcionValida(int opcion)
    {
        return opcion >= MOSTRAR && opcion <= SALIR;
    }

    /**
     * Muestra los equipos y sus jugadores en el map
     */
    private void mostrarEquipos()
    {
        borrarPantalla();
        map.escribir();
    }

    /**
     * Muestra cuántos jugadores hay en un equipo
     */
    private void jugadoresEnEquipo()
    {
        System.out.print("Introduce equipo: ");
        String equipo = teclado.nextLine();
        int total = map.jugadoresEn(equipo);
        if (total != -1)
        {
            System.out.println("\nEn " + equipo.toUpperCase() + " hay " + total + " jugador/es");
        }
        else
        {
            System.out.println("\nEl equipo " + equipo.toUpperCase() + " no existe");
        }

    }

    /**
     * Muestra los aleros
     */
    private void aleros()
    {

        System.out.println("\nRelación de aleros: ");
        for (String jugador: map.obtenerAleros())
        {
            System.out.println(jugador);
        }
    }

    /**
     * Muestra la altura media de los jugadores de un equipo
     */
    private void alturaMedia()
    {
        System.out.print("Introduce equipo: ");
        String equipo = teclado.nextLine();
        double altura = map.alturaMedia(equipo);
        if (altura == -1)
        {
            System.out.println("\nEl equipo no existe");
        }
        else
        {
            System.out.println("\nAltura media de los jugadores de " + equipo.toUpperCase() 
                + "  " + altura + " mtos.");
        }

    }

    /**
     * borra los jugadores de edad menor que la indicada
     */

    private void borrar()
    {
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt();
        HashSet<String> borrados = map.borrarMenoresDe(edad);
        System.out.println("\nBorrados los jugadores de edad menor a " + edad);
        System.out.println(borrados.toString());
        teclado.nextLine();

    }

    /**
     * Borrar la pantalla
     */
    private void borrarPantalla()
    {
        System.out.println("\u000C");
    }

    /**
     * Hacer una pausa
     */
    private void pausa()
    {
        System.out.println("Pulse <Intro> para continuar");
        teclado.nextLine();
    }
}
