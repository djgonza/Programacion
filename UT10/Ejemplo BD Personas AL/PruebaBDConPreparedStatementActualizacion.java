/** 
 * La BD bdpersonas está ya creada e instalada en nuestro servidor MySQl 
 * El ejemplo muestra cómo efectuar una conexión a la BD, ejecutar una consulta de selección
 * y mostrar los resultados. Captura las posibles excepciones que se puedan dar.
 * 
 * Se utilizan sentencias PreparedStatement
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PruebaBDConPreparedStatementActualizacion
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
        PreparedStatement pst = null;
        
        try
        {
            // Cargar el dricer de MySql
            Class.forName( "com.mysql.jdbc.Driver" ) ;

            // Obtener conexión a la BD
            conexion = DriverManager.getConnection( "jdbc:mysql://localhost/" + BD,  USUARIO, PASSWORD ) ;
            System.out.println("Conexión establecida con la BD " + BD);
            System.out.println();

            // preparar consulta SQL como String
            String sql = "UPDATE personas SET eCivil = ? WHERE apellido = 'Redrado'"; // consulta con parámetros
            // Preparar una sentencia PreparedStatement  desde la conexión para enviar y ejecutar sentencias SQL
            pst = conexion.prepareStatement(sql) ;

            // Ejecutar la consulta y obtener el conjunto de resultados
            // antes de ejecutar la consulta establecemos los valores de los parámetros
            pst.setString(1, "c");

            pst.executeUpdate() ;
            System.out.println(pst.toString());

        }
        catch( SQLException e )
        {
            System.out.println( "SQL Excepción:" + e.getMessage() ) ;

        }
        catch( Exception e )
        {
            System.out.println( e ) ;
        }
        finally
        {
            // Cerarr resultado, sentencia y conexión

            try
            {
                 
                pst.close() ;
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

