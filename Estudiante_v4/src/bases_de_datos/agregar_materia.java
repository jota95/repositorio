package bases_de_datos;

import clases.estudiante;
import clases.materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class agregar_materia {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    public boolean insertar(materia mat) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet materia = SentenciaSQL.executeQuery("SELECT * FROM materia");

            materia.moveToInsertRow();
            materia.updateString("codigo_materia", mat.getCodigo());
            materia.updateString("nombre_materia", mat.getNombre());
           

            materia.insertRow();
            // Personas.moveToCurrentRow();

            ;

            materia.close();
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
