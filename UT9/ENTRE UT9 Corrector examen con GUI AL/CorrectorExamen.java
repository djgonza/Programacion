import  java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *   Un objeto de esta clase guarda en un 
 *   array las respuestas correctas de un examen tipo test
 *   
 *   
 *   
 */
public class CorrectorExamen
{
    private static final String SOLUCION = "datos/solucion.TXT"; // el fichero que contiene la solución del test
    private static final char ESPACIO = ' ';
    private char[] solucion;  // todas las respuestas correctas del test
    private double valorCorrecta;    // valor de la correcta
    private double valorIncorrecta;  // cantidad a restar por incorrecta

    /**
     * Constructor de la clase CorrectorExamen
     * Todas las posibles excepciones se propagan
     */
    public CorrectorExamen() throws FileNotFoundException
    {
        leerSolucion(SOLUCION);

    }

    /**
     *  accesor para el peso de la respuesta correcta
     */
    public double getValorCorrecta()
    {
        return valorCorrecta;
    }

    /**
     *  accesor para el peso de la respuesta incorrecta
     */
    public double getValorIncorrecta()
    {
        return valorIncorrecta;
    }

    /**
     *  accesor para las respuestas del test
     */
    public char[] getSolucion()
    {
        return solucion;
    }

    /**
     *  Lee del fichero de texto cuyo nombre se pasa como parámetro dos
     *  líneas:
     *      - en la primera se indica el valor de  cada respuesta  correcta  
     *       y lo que se descontará por cada incorrecta 
     *      - en la segunda línea están las respuestas del examen 
     *      
     *   Ejemplo         1: -0.25          1ª línea con separador :
     *                   acbaaccbdd        2ª línea sin separador
     *                   
     *                   
     *   Asumimos la estructura del fichero sin errores
     *   
     *   Las respuestas leídas se guardan en el array respuestas
     *  
     *  Usa la clase Scanner para leer el fichero
     *  
     *  Todas las posibles excepciones se propagan
     */
    private void leerSolucion(String nombre) throws FileNotFoundException
    {
        Scanner entrada = new Scanner(new File(nombre));
       
        String[] datos = entrada.nextLine().split(":");  
        valorCorrecta = Double.parseDouble(datos[0].trim());
        valorIncorrecta = Double.parseDouble(datos[1].trim());

        String linea = entrada.nextLine();
        entrada.close();
        solucion = linea.toCharArray();

    }

    /**
     *  Dada un array con las respuestas que ha dado un alumno e
     *  al examen el método comprueba los aciertos y errores 
     *  y devuelve el valor obtenido en el test
     *  
     *  Las respuestas en blanco no contabilizan
     *  
     */
    public double evaluarTest(char[] test)
    {
        double nota = 0;
        for (int i = 0; i < test.length; i++)
        {
            char c = test[i];
            if (c != ESPACIO)
            {
                if (c == solucion[i])
                {
                    nota += valorCorrecta;
                }
                else
                {
                    nota += valorIncorrecta;
                }
            }
        }
        return nota;
    }

}
