package administrador;


import bases_de_datos.Consultar_estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class consultar_estudiante extends javax.swing.JFrame {

    /**
     * Creates new form consultar_estudiante
     */
    public consultar_estudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_consultar = new javax.swing.JTextField();
        boton_consultar = new javax.swing.JButton();
        lb_nombre = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_notas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boton_regresar = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo del estudiante");

        boton_consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton_consultar.setText("Consultar");
        boton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultarActionPerformed(evt);
            }
        });

        lb_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nombre.setText("Nombre: ");

        lb_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_telefono.setText("Telefono: ");

        tabla_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_notas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Notas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Consultar Estudiante");

        boton_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton_regresar.setForeground(new java.awt.Color(255, 0, 0));
        boton_regresar.setText("Regresar");
        boton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_regresarActionPerformed(evt);
            }
        });

        tf_nombre.setEditable(false);

        tf_telefono.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tf_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton_consultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nombre)
                                    .addComponent(lb_telefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel5)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_regresar)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefono)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultarActionPerformed
       Consultar_estudiante con = new Consultar_estudiante();
        if(con.Consultar(tf_consultar.getText())==true){
        tf_nombre.setText(con.getNombre());
        tf_telefono.setText(con.getTelefono());
        llenar_tabla();
       
        }
        else{
           
            tf_nombre.setText("");
            tf_telefono.setText("");
            llenar_tabla();
            
            JOptionPane.showMessageDialog(rootPane, "Estudiante No registrado");
        }
    }//GEN-LAST:event_boton_consultarActionPerformed

    private void boton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_regresarActionPerformed
       this.dispose();
    }//GEN-LAST:event_boton_regresarActionPerformed

    
   
    
    
    public void llenar_tabla(){
        try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.tabla_notas.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            DriverManager.registerDriver(new org.postgresql.Driver());
            Connection conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba_est", "postgres", "12345");
            //Para ejecutar la consulta
            Statement s = conexion.createStatement();
            //Ejecutamos la consulta que escribimos en la caja de texto
            //y los datos lo almacenamos en un ResultSet
            ResultSet rs = s.executeQuery("select materia.codigo_materia ,materia.nombre_materia AS Materia , est_mat.nota_1 , est_mat.nota_2, est_mat.nota_3,est_mat.notas_final from est_mat,materia where codigo_estudiante = '" + tf_consultar.getText() + "' and est_mat.codigo_materia=materia.codigo_materia");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            

            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
                
            }
           
            
            //Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            
           
            
            rs.close();
            conexion.close();

            tabla_notas.getColumnModel().getColumn(0).setMaxWidth(0);
            tabla_notas.getColumnModel().getColumn(0).setMinWidth(0);
            tabla_notas.getColumnModel().getColumn(0).setPreferredWidth(0);
            
            setAnchoColumnas();

//            jtQuery.getColumnModel().getColumn(1).setMaxWidth(0);
//            jtQuery.getColumnModel().getColumn(1).setMinWidth(0);
//            jtQuery.getColumnModel().getColumn(1).setPreferredWidth(0);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    
    
    public void setAnchoColumnas(){        
       // JViewport scroll =  (JViewport) tabla_notas.getParent(); 
        int ancho = jScrollPane1.getWidth(); 
        int anchoColumna = 0; 
        TableColumnModel modeloColumna = tabla_notas.getColumnModel(); 
        TableColumn columnaTabla; 
        for (int i = 0; i < tabla_notas.getColumnCount(); i++) { 
            columnaTabla = modeloColumna.getColumn(i); 
            switch(i){ 
                
                case 1: anchoColumna = (40*ancho)/100; 
                columnaTabla.setPreferredWidth(anchoColumna); 
                        break; 
////                case 2: anchoColumna = (50*ancho)/100; 
////                        break; 
//                case 3: anchoColumna = (20*ancho)/100; 
//                        break; 
            }                      
                       
        } 
    } 
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultar_estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_consultar;
    private javax.swing.JButton boton_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JTable tabla_notas;
    private javax.swing.JTextField tf_consultar;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
