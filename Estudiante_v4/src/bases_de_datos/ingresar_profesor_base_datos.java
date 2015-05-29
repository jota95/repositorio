package bases_de_datos;



import clases.profesor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ingresar_profesor_base_datos {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    public boolean ingresar(profesor prof) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet profesor = SentenciaSQL.executeQuery("SELECT * FROM profesores");

            profesor.moveToInsertRow();
            profesor.updateString("cedula_profesor", prof.getCedula());
            profesor.updateString("nombre_profesor", prof.getNombre());
            profesor.updateString("telefono_profesor", prof.getTelefono());
            profesor.insertRow();
            // Personas.moveToCurrentRow();
            
            profesor = SentenciaSQL.executeQuery("SELECT * FROM usuarios");
            profesor.moveToInsertRow();
            profesor.updateString("usuario", prof.getCedula());
            profesor.updateString("pass", prof.getCedula());
            profesor.updateString("tipo", "profesor");
            profesor.insertRow();

            profesor.close();
            Conexion.close();
            SentenciaSQL.close();
            System.out.println("profesor ingresado");
            return true;

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            return false;

        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }

    }

   

}
