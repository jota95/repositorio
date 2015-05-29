package administrador;

import bases_de_datos.Consultar_estudiante;
import bases_de_datos.agregar_materia_estudiante;
import clases.materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class asociar_est_mat extends javax.swing.JFrame {

    private final static String drv = "org.postgresql.Driver";//Dirver de conexion
    private final static String url = "jdbc:postgresql://localhost:5432/prueba_est"; // Ruta de conexion
    private final static String user = "postgres"; // nombre de la base de datos
    private final static String pass = "12345"; // Contraseña
    private static Connection Conexion;
    private static Statement SentenciaSQL;
    private DefaultComboBoxModel value;

    public asociar_est_mat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_codigo = new javax.swing.JTextField();
        boton_consultar = new javax.swing.JButton();
        combo_materias = new javax.swing.JComboBox();
        boton_guardar = new javax.swing.JButton();
        boton_regresar = new javax.swing.JButton();
        Materias = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_consultar.setText("OK");
        boton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultarActionPerformed(evt);
            }
        });

        combo_materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_materiasActionPerformed(evt);
            }
        });

        boton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton_guardar.setText("Agregar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton_regresar.setForeground(new java.awt.Color(204, 0, 0));
        boton_regresar.setText("Regresar");
        boton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_regresarActionPerformed(evt);
            }
        });

        Materias.setText("Materias");

        jLabel4.setText("Codigo Estudiante");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Materia a Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton_guardar)
                        .addGap(47, 47, 47)
                        .addComponent(boton_regresar)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(boton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Materias)
                                .addGap(18, 18, 18)
                                .addComponent(combo_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consultar)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Materias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultarActionPerformed
        Consultar_estudiante consultar = new Consultar_estudiante();
        if (consultar.Consultar(tf_codigo.getText()) == true) {
            cargarComboBD(tf_codigo.getText());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Estudiante no registrado");
        }
    }//GEN-LAST:event_boton_consultarActionPerformed

    private void combo_materiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_materiasActionPerformed
        materia aux = (materia) combo_materias.getSelectedItem();
        
    }//GEN-LAST:event_combo_materiasActionPerformed

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed

        if (!tf_codigo.getText().equals("")) {
            System.out.println("Campos llenos bien ");

            try {

                materia aux = (materia) combo_materias.getSelectedItem();
               

                materia mat = new materia(aux.getCodigo(), 0, 0, 0);
                mat.notafinal();

                agregar_materia_estudiante est_mat = new agregar_materia_estudiante();
                est_mat.ingresar(tf_codigo.getText(), mat);

                if (est_mat.getResultado().equals("ok")) {
                    JOptionPane.showMessageDialog(null, "Se agregado la materia al estudiante");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se puden agregar mas materias al "
                            + "estudiante \nya tiene 6 materias agregadas ");
                    this.dispose();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Solo se admiten numeros");
            }
        }
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void boton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_boton_regresarActionPerformed

    public void cargarComboBD(String consulta) {

        try {
            Class.forName(drv);
            Conexion = DriverManager.getConnection(url, user, pass);
            SentenciaSQL = Conexion.createStatement();
            Statement SentenciaSQL = Conexion.createStatement();
            ResultSet materias = SentenciaSQL.executeQuery(" SELECT materia.codigo_materia,materia.nombre_materia FROM materia WHERE materia.codigo_materia\n"
                    + "    NOT IN (SELECT est_mat.codigo_materia FROM est_mat where est_mat.codigo_estudiante='" + consulta + "') ");
            combo_materias.removeAllItems();

            value = new DefaultComboBoxModel();
            combo_materias.setModel(value);

            while (materias.next()) {
                // combo_materias.addItem(materias.getString(2));                
                //System.out.println(materias.getString(2));
                //combo_materias.addItem(new materia(materias.getString(1),materias.getString(2)));
                value.addElement(new materia(materias.getString(1), materias.getString(2)));
            }

            materias.close();
            Conexion.close();
            SentenciaSQL.close();
            System.out.println("Estudiante ingresado");

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada  ");

        } catch (SQLException e) {
            System.out.println(e);

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
            java.util.logging.Logger.getLogger(asociar_est_mat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asociar_est_mat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asociar_est_mat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asociar_est_mat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asociar_est_mat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Materias;
    private javax.swing.JButton boton_consultar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_regresar;
    private javax.swing.JComboBox combo_materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_codigo;
    // End of variables declaration//GEN-END:variables
}
