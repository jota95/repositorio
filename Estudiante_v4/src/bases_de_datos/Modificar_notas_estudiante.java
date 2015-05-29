package bases_de_datos;

import clases.materia;
import java.sql.*;
import java.util.ArrayList;

public class Modificar_notas_estudiante {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    public void Modificar(String est[][]) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            for (int i = 0; i < est.length; i++) {
                ResultSet estudiante = SentenciaSQL.executeQuery("select * from est_mat where codigo_estudiante='" + est[i][1] + "'and codigo_materia='" + est[i][0] + "' order by codigo_materia ASC");
                if (estudiante.next()) {// busqueda del documento si exite lo modifica con los nuevos datos
                    
                    
                    estudiante.updateDouble(3, Double.parseDouble(est[i][3]));
                    estudiante.updateDouble(4, Double.parseDouble(est[i][4]));
                    estudiante.updateDouble(5, Double.parseDouble(est[i][5]));
                    estudiante.updateDouble(6, Double.parseDouble(est[i][6]));

                    estudiante.updateRow();

                //estudiante.close();
                    //Conexion.close();
                    //SentenciaSQL.close();
                } else {
                    

                }
                estudiante.close();
            }
            
                    Conexion.close();
                    SentenciaSQL.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");

        } catch (SQLException e) {
            System.out.println(e);

        }
    }

    public boolean modificar_estudiante(String codigo_estudiante, String nombre, String telefono) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet estudiante = SentenciaSQL.executeQuery("select * from estudiantes where codigo_estudiante='" + codigo_estudiante + "'");
            if (estudiante.next()) {// busqueda del documento si exite lo modifica con los nuevos datos
                estudiante.updateString(2, nombre);
                estudiante.updateString(3, telefono);

                estudiante.updateRow();

                estudiante.close();
                Conexion.close();
                SentenciaSQL.close();
                return true;
            } else {
                estudiante.close();
                Conexion.close();
                SentenciaSQL.close();
                return false;

            }

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            return false;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

}
