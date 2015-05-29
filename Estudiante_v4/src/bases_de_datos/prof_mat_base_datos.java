package bases_de_datos;

import clases.materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class prof_mat_base_datos {

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
    
    
    public void ingresar(String cedula_profesor, String codigo_materia){
        int numero_materias;
        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet est_mat = SentenciaSQL.executeQuery("SELECT * FROM est_mat");

            ResultSet prof_mat = SentenciaSQL.executeQuery("select count(cedula_profesor)as numero_materias from prof_mat where cedula_profesor='" + cedula_profesor + "'");
            
            if (prof_mat.next()) {

                numero_materias = prof_mat.getInt(1);
                if (numero_materias < 3) {
                    ResultSet insert_profesor = SentenciaSQL.executeQuery("select * from prof_mat");

                    insert_profesor.moveToInsertRow();
                    insert_profesor.updateString("cedula_profesor", cedula_profesor);
                    insert_profesor.updateString("codigo_materia", codigo_materia);         
                    insert_profesor.insertRow();
                    resultado="ok";
                

                
                }
                else{
                   resultado="no";// indica que a sucedido un error al momento de agregar materia
                }
            }
            
            
           

            prof_mat.close();
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
