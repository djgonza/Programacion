
/**
 *  
 */
public class DemoAlumno
{

    /**
     *  
     *  Aceptar como argumentos del main el nombre y la nota de un alumno
     *  crear un objeto Alumno y mostrar su representación
     */
    public static void main(String[] args)
    {
        if(args.length != 2){
            System.out.println("Error en numero de argumentos\n"+
            "Sintaxis: java DemoAlumno nombreAlumno nota");
            return;
            //System.exit(0);
        }
        Alumno demo = new Alumno(args[0], Integer.parseInt(args[1]));
        System.out.println(demo.toString());

    }
}
