package bases_de_datos;

import clases.materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class agregar_materia_estudiante {

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
    
    
    
    

    public void ingresar(String codigo_estudiante, materia mat) {
        int numero_materias;
        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet est_mat = SentenciaSQL.executeQuery("SELECT * FROM est_mat");

            ResultSet est_mat = SentenciaSQL.executeQuery("select count(codigo_estudiante) as numero_materias from est_mat where codigo_estudiante='"+codigo_estudiante+"'");
            
            if (est_mat.next()) {
                
                numero_materias = est_mat.getInt(1);
                
                System.out.println(numero_materias);
                if (numero_materias < 6) {
               est_mat = SentenciaSQL.executeQuery("SELECT * FROM est_mat");
               
                est_mat.moveToInsertRow();
                est_mat.updateString("codigo_estudiante", codigo_estudiante);
                est_mat.updateString("codigo_materia", mat.getCodigo());
                est_mat.updateDouble(3, 0);
                est_mat.updateDouble(4, 0);
                est_mat.updateDouble(5, 0);
                est_mat.updateDouble(6, 0);

                est_mat.insertRow();
                
                resultado="ok"; // indica que se agregado la materia correctamete
                }
                else{
                   resultado="no";// indica que a sucedido un error al momento de agregar materia
                }
            }
            
            
           

            est_mat.close();
            Conexion.close();
            SentenciaSQL.close();
            System.out.println("Estudiante ingresado");
           

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            

        } catch (SQLException e) {
            System.out.println(e);
           

        }

    }

}
