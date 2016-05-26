
/**
 * La BD bdpersonas está ya creada e instalada en nuestro servidor MySQl 
 * El ejemplo muestra cómo efectuar una conexión a la BD, ejecutar una consulta de selección
 * y mostrar los resultados. Captura las posibles excepciones que se puedan dar.
 * 
 * Realizaremos la consulta: Obtener nombre, apellido y edad de todas las personas
 * 
 * Se utilizan sentencias Statement
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import  java.sql.ResultSetMetaData;

public class PruebaSeleccion01
{

    /**
     *  
     */
    public static void main(String[] args) throws SQLException
    {
        final String BD = "bdpersonas";
        final String USUARIO = "root";
        final String PASSWORD = "alumno";
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;

        try
        {
            // Cargar el driver de MySql
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver cargado");
            // Obtener conexión a la BD           
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + BD, USUARIO, PASSWORD);
            System.out.println("Conexión establecida con la BD " + BD);
            System.out.println();

            // preparar consulta SQL como String
            String sql = "select nombre, apellido, edad from personas";

            // Preparar una sentencia Statement  desde la conexión para enviar y ejecutar sentencias SQL
            pst = conexion.prepareStatement(sql);

            // Ejecutar la consulta y obtener el conjunto de resultados
            rs = pst.executeQuery(sql);

            // Cabecera de la tabla
            rsmd = rs.getMetaData();

            for(int i = 1;  i <= rsmd.getColumnCount(); i++){
                System.out.print(String.format("%-10s", rsmd.getColumnName(i).toUpperCase()));
            }

            System.out.println();

            //System.out.println(String.format("%-10s %-10s %-10s", rsmd.getColumnName(1), rsmd.getColumnName(2), rsmd.getColumnName(3)));

            // Iterar sobre el conjunto de resultados
            while(rs.next()){
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");

                System.out.println(String.format("%-10s %-10s %-10d",  nombre, apellido, edad));
            }

            //seleccionar nombre, apellido de personas con genero y edad determinador
            sql = "select nombre, apellido from personas " +
            "where genero = ? and edad = ?";

            pst = conexion.prepareStatement(sql);
            pst.setString(1, "h");
            pst.setInt(2,33);

            rs = pst.executeQuery();

            rsmd = rs.getMetaData();

            for(int i = 1;  i <= rsmd.getColumnCount(); i++){
                System.out.print(String.format("%-10s", rsmd.getColumnName(i).toUpperCase()));
            }

            System.out.println();
            if(!rs.next()){
                System.out.println("No hay resultados que mostrar!!");
                
            }else{
                rs.previous();
                while(rs.next()){
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");

                    System.out.println(String.format("%-10s %-10s",  nombre, apellido));
                }
            }

        }     
        catch (SQLException exc)
        {
            System.out.println("Error estableciendo conexión JDBC: " + exc.toString());
        }
        catch (ClassNotFoundException exc)
        {
            System.out.println("Error cargando el driver: " + exc.toString());
        }
        finally
        {
            // Cerrar resultado, sentencia y conexión
            rs.close();
            pst.close();
            conexion.close();
        }

    }
}

