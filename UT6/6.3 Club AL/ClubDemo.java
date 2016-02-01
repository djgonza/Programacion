
/**
 * Demo de las clases Club y Miembro
 * Ejercicio 6.3 UT6
 * 
 * @author (Kölling y Barnes) 
 */
public class ClubDemo
{

    private Club club;

    /**
     * Constructor de la clase ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Añadir algunos miembros al club, y mostrar cuantos hay.
     * 
     */
    public void demo()
    {
        club.añadir(new Miembro("David", 2, 2004));
        club.añadir(new Miembro("Michael", 1, 2004));
        club.listarClub();
        System.out.println(club.incorporadoEnMes(1));
        //         System.out.println(club.borrar(2, 2004).toString());
        //         System.out.println("El club tiene " +
        //                            club.numeroMiembros() +
        //                            " miembros.");
        System.out.println(club.borrarConWhile(2, 2004).toString());
        System.out.println("El club tiene " +
            club.numeroMiembros() +
            " miembros.");
        
        club.listarClub();
    }
}
