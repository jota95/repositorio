package bases_de_datos;

import java.sql.*;

public class Consultar_estudiante {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;
    String codigo, nombre,telefono;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return codigo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    

    public boolean Consultar(String codigo_est) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement();
            ResultSet Personas = SentenciaSQL.executeQuery("select * from estudiantes where codigo_estudiante='"+codigo_est+"'");
            if (Personas.next()) {

                codigo = Personas.getString("codigo_estudiante");
                nombre = Personas.getString("nombre_estudiante");
                telefono = Personas.getString("telefono_estudiante");
                System.out.println(codigo_est);
                
                //  System.out.println(Nombre);
                Personas.close();
                Conexion.close();
                SentenciaSQL.close();
                return true;

            } else {

                Personas.close();
                Conexion.close();
                SentenciaSQL.close();
                return false;

            }

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");

            return false;

        } catch (SQLException e) {
          
            return false;

        }

    }

}
