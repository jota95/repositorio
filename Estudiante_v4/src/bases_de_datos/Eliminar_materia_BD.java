package bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Eliminar_materia_BD {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    String resultado;

    public String getResultado() {
        return resultado;
    }

    public void eliminar(String codigo_materia) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();

            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet materia = SentenciaSQL.executeQuery("select * from est_mat where codigo_materia='" + codigo_materia + "'"); 
            
            while (materia.next()) {
                materia.deleteRow();
                resultado = "eliminado";
            }
            
            materia = SentenciaSQL.executeQuery("select * from prof_mat  where codigo_materia='" + codigo_materia + "'");
            
            while (materia.next()) {
                materia.deleteRow();
                resultado = "eliminado";
            }
           
            
             materia = SentenciaSQL.executeQuery("select * from materia where codigo_materia='" + codigo_materia + "'");

            if (materia.next()) {
                materia.deleteRow();
                resultado = "eliminado";

            } else {
                resultado = "no eliminado";
            }

            materia.close();
            Conexion.close();
            SentenciaSQL.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");

        } catch (SQLException e) {
            System.out.println(e);

        }
    }

}
