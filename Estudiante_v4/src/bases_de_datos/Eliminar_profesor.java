package bases_de_datos;

import java.sql.*;

public class Eliminar_profesor {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;

    String resultado = "";

    public String getResultado() {
        return resultado;
    }

    public void eliminar_profesor_BD(String cedula_profesor) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();

            Statement SentenciaSQL = Conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet profesor = SentenciaSQL.executeQuery("select * from prof_mat where cedula_profesor='" + cedula_profesor + "'");

            while (profesor.next()) {
                profesor.deleteRow();
                resultado = "eliminado";
            }

            profesor = SentenciaSQL.executeQuery("select * from usuarios where usuario ='" + cedula_profesor + "'");

            if (profesor.next()) {
                profesor.deleteRow();
                resultado = "eliminado";
            }

            SentenciaSQL.executeQuery("select * from profesores where cedula_profesor ='" + cedula_profesor + "'");

            if (profesor.next()) {
                profesor.deleteRow();
                resultado = "eliminado";
            }

            System.out.println("profesor no registrado");
            profesor.close();
            Conexion.close();
            SentenciaSQL.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");

        } catch (SQLException e) {
            System.out.println(e);

        }
    }

}
