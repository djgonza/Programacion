
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
public class PruebaConPreparedStatement
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
        ResultSet rs = null;
        try
        {
            // Cargar el dricer de MySql
            Class.forName( "com.mysql.jdbc.Driver" ) ;

            // Obtener conexión a la BD
            conexion = DriverManager.getConnection( "jdbc:mysql://localhost/" + BD,  USUARIO, PASSWORD ) ;
            System.out.println("Conexión establecida con la BD " + BD);
            System.out.println();
            // preparar consulta SQL como String
            String sql = "SELECT nombre, apellido  FROM personas WHERE nombre LIKE 'E%' AND genero = 'm'"; // consulta sin parámetros 
            pst = conexion.prepareStatement(sql) ;
            rs = pst.executeQuery() ;
            System.out.println(sql);
            System.out.println(String.format("%-20s %-20s ", 
                    rs.getMetaData().getColumnName(1).toUpperCase() , rs.getMetaData().getColumnName(2).toUpperCase() ) );
            while( rs.next() )
            {

                String nombre = rs.getString(1); // aquí a partir del nº de columna
                String apellido = rs.getString("apellido"); 
                System.out.println(String.format("%-20s %-20s ", 
                        nombre, apellido) );
            }

            // preparar otra consulta SQL como String ahora con parámetros
            sql = "SELECT nombre, apellido FROM personas WHERE nombre LIKE ? AND genero = ?"; // consulta con parámetros
            // Preparar una sentencia PreparedStatement  desde la conexión para enviar y ejecutar sentencias SQL
            pst = conexion.prepareStatement(sql) ;
            // Ejecutar la consulta y obtener el conjunto de resultados
            // antes de ejecutar la consulta establecemos los valores de los parámetros
            pst.setString(1, "%a%");
            pst.setString(2, "m");
            rs = pst.executeQuery() ;
            System.out.println();
            System.out.println(pst.toString());
            // Utilizamos metadatos para mostrar los nombres de las columnas de la tabla y escribir la cabecera dewl listado
            System.out.println(String.format("%-20s %-20s",
                    rs.getMetaData().getColumnName(1).toUpperCase(), rs.getMetaData().getColumnName(2).toUpperCase() ));

            // Iterar sobre el conjunto de resultados
            while( rs.next() )
            {
                String nombre = rs.getString(1); // aquí a partir del nº de columna
                String apellido = rs.getString("apellido"); 
                System.out.println(String.format(" %-20s %-20s", 
                        nombre, apellido ) );
            }

           
        }
        catch( SQLException e )
        {
            System.out.println( "SQL Excepción:" ) ;

        }
        catch( ClassNotFoundException e )
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            // Cerarr resultado, sentencia y conexión

            try
            {
                rs.close() ;
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
