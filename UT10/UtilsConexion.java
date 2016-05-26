import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *  
 * Clase de utilidades
 * La modelamos como una clase con métodos estáticos
 * 
 */
public class UtilsConexion
{

    private static final String BD = "bdalumnos";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";
   
 
    /**
     * 
     */
    public  static Connection getConexion()
    {
         Connection conexion = null;
        
            try
            {
                // Cargar el driver de MySql
                Class.forName( "com.mysql.jdbc.Driver" ) ; // podemos omitir esta línea

                // Obtener conexión a la BD                
                conexion = DriverManager.getConnection( "jdbc:mysql://localhost/" + BD,  USUARIO, PASSWORD ) ;
                System.out.println("Conexión establecida con la Base de datos " + BD);
            }
            catch (SQLException exc)
            {
                System.out.println("Error estableciendo conexión JDBC: " + exc.toString());
            }
            catch (ClassNotFoundException exc)
            {
                System.out.println("Error cargando el driver: " + exc.toString());
            }
        
        return conexion;

    }

    /**
     * 
     */
    public  static void closeConexion( Connection conexion )
    {
    	 try
         {
             if (!conexion.isClosed())
             {
                 conexion.close();
                 
             }
         }
         catch (SQLException exc) 
         {
             System.out.println("Error cerrando conexión  JDBC  : " +  exc.toString());
         }
    }
    
     /**
     * 
     */
    public  static void closeStatement(Statement statement)
    {
        try
        {
            if (statement != null)
            {
                statement.close();
                
            }
        }
        catch (SQLException exc) 
        {
            System.out.println("Error cerrando statement  : " +  exc.toString());
        }
       
    }
    
    
     /**
     * 
     */
    public  static void closeResultSet(ResultSet resultSet)
    {
       
        try
        {
            if (resultSet != null)
            {
                resultSet.close();
                
            }
        }
        catch (SQLException exc) 
        {
            System.out.println("Error cerrando resultSet  : " +  exc.toString());
        }
    }

}