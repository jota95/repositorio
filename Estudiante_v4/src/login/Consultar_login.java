package login;


import java.sql.*;

public class Consultar_login {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;
    
    String tipo_usuario;

    public String getTipo_usuario() {
        return tipo_usuario;
    }
    
    

    
    

    public boolean Consultar_login(String usuario,String passw) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement();
            ResultSet usuarioConsulta = SentenciaSQL.executeQuery("select * from usuarios where usuario='"+usuario+"' and pass='"+passw+"'");
            if (usuarioConsulta.next()) {            
                System.out.println("logiado");
                
                //  System.out.println(Nombre);                
                tipo_usuario= usuarioConsulta.getString("tipo");
           
                
                 System.out.println(tipo_usuario);  
                
                usuarioConsulta.close();
                Conexion.close();
                SentenciaSQL.close();
                return true;

            } else {

                usuarioConsulta.close();
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
