package bases_de_datos;

import clases.estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class insertar_estudiante_base_datos {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    public boolean insertar(estudiante est) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet Estudiante = SentenciaSQL.executeQuery("SELECT * FROM estudiantes");

            Estudiante.moveToInsertRow();
            Estudiante.updateString("codigo_estudiante", est.getCodigo());
            Estudiante.updateString("nombre_estudiante", est.getNombre());
            Estudiante.updateString("telefono_estudiante", est.getTelefono());
          
            Estudiante.insertRow();
            // Personas.moveToCurrentRow();
            
            
            Estudiante = SentenciaSQL.executeQuery("SELECT * FROM usuarios");
            Estudiante.moveToInsertRow();
            Estudiante.updateString("usuario", est.getCodigo());
            Estudiante.updateString("pass", est.getCodigo());
            Estudiante.updateString("tipo", "estudiante");
          
            Estudiante.insertRow();
             
             
            Estudiante.close();
            Conexion.close();
            SentenciaSQL.close();
            System.out.println("Estudiante ingresado");
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
