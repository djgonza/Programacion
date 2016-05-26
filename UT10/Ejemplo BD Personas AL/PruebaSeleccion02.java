
/**
 * La BD bdpersonas está ya creada e instalada en nuestro servidor MySQl 
 * El ejemplo muestra cómo efectuar una conexión a la BD, ejecutar una consulta de selección
 * y mostrar los resultados. Captura las posibles excepciones que se puedan dar.
 * 
 * Realizaremos las consultas: 
 * a) Obtener nombre, apellido, edad y estado civil de todos los
 * hombres   por orden ascendente de apellido 
 * b) Obtener nombre y apellido de las mujeres que tienen una edad determinada 
 * c) Contar el total de hombres
 * 
 * Se utilizan sentencias Statement
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import  java.sql.ResultSetMetaData;
public class PruebaSeleccion02
{

    /**
     *  
     */
    public static void main(String[] args)
    {
        final String BD = "bdpersonas";
        final String USUARIO = "root";
        final String PASSWORD = "root";
        Connection conexion = null;    
        Statement st = null;
        ResultSet rs = null;
        try
        {
            // Cargar el driver de MySql
            // Class.forName( "com.mysql.jdbc.Driver" ) ;
            System.out.println("Driver cargado");
            // Obtener conexión a la BD           
            conexion = DriverManager.getConnection( "jdbc:mysql://localhost/" + BD,  USUARIO, PASSWORD ) ;
            System.out.println("Conexión establecida con la BD " + BD);
            System.out.println();

            // preparar consulta SQL como String
            
            
            // Preparar una sentencia Statement  desde la conexión para enviar y ejecutar sentencias SQL
            
            
            // Ejecutar la consulta y obtener el conjunto de resultados
          
            // Utilizamos metadatos para mostrar los nombres de las columnas de la tabla y escribir la cabecera del listado            

          

            // Iterar sobre el conjunto de resultados
            
            
            
            

            
            
            
        }       
        catch (SQLException exc)
        {
            System.out.println("Error estableciendo conexión JDBC: " + exc.toString());
        }
        finally
        {
            // Cerarr resultado, sentencia y conexión

            try
            {
                rs.close() ;
                st.close() ;
                conexion.close() ;
            }
            catch (SQLException e) 
            {
                System.err.println("Error al cerrar la conexión: "+
                    e.getMessage());
            }
            catch (NullPointerException e) 
            {
                System.err.println("Error null ");
            }

        }

    }
}