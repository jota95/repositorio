package bases_de_datos;

import java.sql.*;

public class Eliminar_estudiante {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;
    
    String resultado="";

    public String getResultado() {
        return resultado;
    }
    
    



    public void eliminar_estudiante_BD(String codigo_estudiante) {
        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();

            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet estudiante = SentenciaSQL.executeQuery("select * FROM est_mat WHERE codigo_estudiante= '" + codigo_estudiante + "'");

            while (estudiante.next()) {                
                estudiante.deleteRow();
                resultado="eliminado";
            }
            
            estudiante = SentenciaSQL.executeQuery("select * from usuarios where usuario ='" + codigo_estudiante + "'");
            
            if (estudiante.next()) {
                estudiante.deleteRow();
                resultado="eliminado";
            }
              
            
           estudiante = SentenciaSQL.executeQuery("select * from estudiantes where codigo_estudiante='" + codigo_estudiante + "'");
            
           if (estudiante.next()) {
                estudiante.deleteRow();
                resultado="eliminado";
            }
           
           else{
               resultado="no eliminado";
           }

                
                estudiante.close();
                Conexion.close();
                SentenciaSQL.close();
                
            

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            
        } catch (SQLException e) {
            System.out.println(e);
         
        }
    }

}
