package bases_de_datos;

import clases.materia;
import java.sql.*;
import java.util.ArrayList;

public class Modificar_estudiante {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    public void Modificar(String codigo_estudiante, ArrayList<materia> mat) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            for (int i = 0; i < mat.size(); i++) {
                ResultSet estudiante = SentenciaSQL.executeQuery("select * from est_mat where codigo_estudiante='" + codigo_estudiante + "'and codigo_materia='" + mat.get(i).getCodigo() + "' order by codigo_materia ASC");
                if (estudiante.next()) {// busqueda del documento si exite lo modifica con los nuevos datos
                    estudiante.updateDouble(3, mat.get(i).getNota1());
                    estudiante.updateDouble(4, mat.get(i).getNota2());
                    estudiante.updateDouble(5, mat.get(i).getNota3());
                    estudiante.updateDouble(6, mat.get(i).getNotafinal());

                    estudiante.updateRow();

                //estudiante.close();
                    //Conexion.close();
                    //SentenciaSQL.close();
                } else {
                    estudiante.close();
                    Conexion.close();
                    SentenciaSQL.close();

                }
            }
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
