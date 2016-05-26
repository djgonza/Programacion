
/**
 * La BD bdpersonas está ya creada e instalada en nuestro servidor MySQl 
 * El ejemplo muestra cómo efectuar una conexión a la BD, ejecutar consultas de actualización
 * y mostrar los resultados. Captura las posibles excepciones que se puedan dar.
 * 
 * Se utilizan sentencias Statement
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PruebaActualizacion
{

    /**
     *  
     */
    public static void main(String[] args)
    {
        final String BD = "bdpersonas";
        final String USUARIO = "root";
        final String PASSWORD = "root";
        Connection conexion  = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            // Cargar el driver de MySql
            Class.forName( "com.mysql.jdbc.Driver" ) ;

            conexion = DriverManager.getConnection( "jdbc:mysql://localhost/" + BD,  USUARIO, PASSWORD ) ;
            System.out.println("Conexión establecida con la BD " + BD);
            System.out.println();

            // preparar consulta de inserción SQL como String
           
            
            
            
            // Preparar una sentencia Statement  desde la conexión para enviar y ejecutar sentencias SQL
        
            
            
            
            // Ejecutar la consulta  
             

            // preparar consulta de modificación  SQL como String
            

            // preparar consulta de borrado  SQL como String
            

            // preparar consulta para contar el total de personas en la BD
            

           
            
        catch( SQLException e )
        {
            System.out.println( "SQL Excepción:" ) ;
            // Iterar a través de las excepciones SQL
            while( e != null )
            {
                System.out.println( "Estado  : " + e.getSQLState()  ) ;
                System.out.println( "Mensaje: " + e.getMessage()   ) ;
                System.out.println( "Error  : " + e.getErrorCode() ) ;
                e = e.getNextException() ;
            }
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

