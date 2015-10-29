
/**
 *  Clase para probar las clases Curso y Alumno
 */
public class DemoCurso
{

    /**
     * Constructor de la clase DemoCurso
     */
    public DemoCurso(String nombre)
    {

    }

    /**
     *  Curso sin alumnos
     */
    public static void demo1()
    {
        Curso daw = new Curso("DAW 1º");
        daw.printCurso();
    }

    /**
     *  Curso con un alumno
     */
    public static void demo2()
    {
        Curso daw = new Curso("DAW 1º");
        daw.addAlumno(new Alumno("Ana", 8));
        daw.printCurso();
    }

    /**
     *  Curso con dos alumno
     */
    public static void demo3()
    {
        Curso daw = new Curso("DAW 1º");
        daw.addAlumno(new Alumno("Luis", 6));
        daw.addAlumno(new Alumno("Ana", 8));
        daw.addAlumno(new Alumno("Isabel", 4));
        daw.printCurso();
    }

    /**
     *  demo para probar el método clonar() de Curso
     */
    public static void demo4()
    {
        Curso daw = new Curso("DAW 1º");
        daw.addAlumno(new Alumno("Luis", 6));

        daw.clonar().printCurso();

    }


    public static void main(String[] args) {
        demo1();
        System.out.println("");
        demo2();
        System.out.println("");
        demo3();
        System.out.println("");
        demo4();
        
    }
}
