import java.util.Arrays;
/**
 *  Guarda las notas de estudiantes en una serie de asignaturas
 *  
 */
public class Curso
{
    private static final int MAX_ESTUDIANTES = 10;
    private static final int MAX_ASIGNATURAS =  6;
    private     int[][]        notas;

    /**
     * Constructor  
     */
    public Curso()
    {
        notas = new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
        inicializar(notas);
    }

    /**
     *  Inicializa el array con notas aleatorias entre 1 y 10 inclusive
     */
    private void inicializar(int[][] notas)
    {
        for(int al = 0; al < notas.length; al++)
        {
            for(int asig = 0; asig < notas[al].length; asig++ )
            {
                notas[al][asig]= (int)(Math.random()* 10 + 1);
            }
        }

    }

    /**
     *  Muestra en pantalla  el array 2D
     * 
     */
    public void escribir( )
    {
        for(int al = 0; al < notas.length; al++)
        {
            for(int asig = 0; asig < notas[al].length; asig++ )
            {
                System.out.print(notas[al][asig] + "\t");
            }
            System.out.println();
        }
    }

    /**
     *  Muestra en pantalla  el array 2D
     * 
     */
    public void escribirv2()
    {
        for(int al = 0; al < notas.length; al++)
        {
            System.out.println(Arrays.toString(notas[al]));
        }
    }

    /**
     *  
     *  Calcular la media por asignatura
     *  Recorrido por columnas
     * 
     */
    public double[] calcularMedias( )
    {
        double[] result = new double[notas[0].length];
        
        for(int asig = 0; asig < notas[0].length; asig++)
        {
            for(int al = 0; al < notas.length; al++ )
            {
                result[asig] += (double) notas[al][asig]; 
            }
            result[asig] /= notas.length;
        }
       
        return result;

    }

    /**
     *  
     *  Calcular la media por alumno
     *  Recorrido por filas
     * 
     */
    public double[] calcularMediaPorAlumno( )
    {
        double[] result = new double[notas.length];
        
        for(int al = 0; al < notas.length; al++)
        {
            for(int asig = 0; asig < notas[al].length; asig++ )
            {
                result[al] += notas[al][asig];
            }
            result[al] /= notas[al].length;
        }
        
        return result;

    }
    
    /**
     *  
     */
    public static void main(String[] args)
    {
        Curso curso = new Curso();
        curso.escribirv2();
        System.out.println(Arrays.toString(curso.calcularMedias()));
        System.out.println(Arrays.toString(curso.calcularMediaPorAlumno()));
        
    }

}
