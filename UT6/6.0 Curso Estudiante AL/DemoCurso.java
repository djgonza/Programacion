
/**
 * Clase para probar las otras dos
 */
public class DemoCurso
{

    /**
     *   
     */
    public static void main(String[] args)
    {
        Curso daw = new Curso();
        daw.añadirEstudiante("Luisa", 9);
        daw.añadirEstudiante("Manolete", 10);
        daw.añadirEstudiante("Angel", 1);
        daw.añadirEstudiante("Ana", 3);
        daw.añadirEstudiante("Alberto", 2);
        System.out.println("Hay " + daw.cuantosAlumnos() +
            " alumnos");
        System.out.println(daw.toString());                      
        System.out.printf("La media es %4.2f" , daw.getMedia());

        //         System.out.println("\nAlumno con nota máxima " +
        //             daw.alumnoNotaMaxima());
        //                 daw.borrarPrimero();
        //                 System.out.println(daw.toString()); 
        //                 daw.borrarSuspensos();
        //                 System.out.println(daw.toString()); 
        int suspensoMasAlto = daw.suspensoMasAlto();
        if (suspensoMasAlto == 0)
            System.out.println("No hay suspensos");
        else
            System.out.println("Suspenso más alto " + suspensoMasAlto); 
        System.out.println("Total alumnos suspendidos " + daw.totalSuspensosIterador()); 
        System.out.println("Dos notas más altas " + daw.dosNotasMasAltas());
    }

}
