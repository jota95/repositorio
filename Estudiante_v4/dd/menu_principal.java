
import administrador.nuevo_profesor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form menu_principal
     */
    public menu_principal() {
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
        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        item_nuevo = new javax.swing.JMenuItem();
        item_consultar = new javax.swing.JMenuItem();
        item_modificar = new javax.swing.JMenuItem();
        item_agregar_materia_estudiante = new javax.swing.JMenuItem();
        item_listar = new javax.swing.JMenuItem();
        item_eliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        item_nuevo_profesor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_de_cundinamarca.jpg"))); // NOI18N

        menu_archivo.setText("Estudiante");

        item_nuevo.setText("Nuevo Estudiante");
        item_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_nuevoActionPerformed(evt);
            }
        });
        menu_archivo.add(item_nuevo);

        item_consultar.setText("Consultar Estudiante");
        item_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_consultarActionPerformed(evt);
            }
        });
        menu_archivo.add(item_consultar);

        item_modificar.setText("Modificar Estudinte");
        item_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_modificarActionPerformed(evt);
            }
        });
        menu_archivo.add(item_modificar);

        item_agregar_materia_estudiante.setText("Agregar materia a estudiante");
        item_agregar_materia_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_agregar_materia_estudianteActionPerformed(evt);
            }
        });
        menu_archivo.add(item_agregar_materia_estudiante);

        item_listar.setText("Listar");
        item_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_listarActionPerformed(evt);
            }
        });
        menu_archivo.add(item_listar);

        item_eliminar.setText("Eliminar Estudiante");
        item_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_eliminarActionPerformed(evt);
            }
        });
        menu_archivo.add(item_eliminar);

        barra_menu.add(menu_archivo);

        jMenu2.setText("Profesor");

        item_nuevo_profesor.setText("Nuevo Profesor");
        item_nuevo_profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_nuevo_profesorActionPerformed(evt);
            }
        });
        jMenu2.add(item_nuevo_profesor);

        barra_menu.add(jMenu2);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_nuevoActionPerformed
        nuevo_estudiante est = new nuevo_estudiante();
       est.setVisible(true);
    }//GEN-LAST:event_item_nuevoActionPerformed

    private void item_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_eliminarActionPerformed
       eliminar_estudiante eliminar = new eliminar_estudiante();
       eliminar.setVisible(true);
    }//GEN-LAST:event_item_eliminarActionPerformed

    private void item_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_consultarActionPerformed
       consultar_estudiante consultar = new consultar_estudiante();
       consultar.setVisible(true);
    }//GEN-LAST:event_item_consultarActionPerformed

    private void item_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_modificarActionPerformed
       modificar_estudiante modificar = new modificar_estudiante();
       modificar.setVisible(true);
    }//GEN-LAST:event_item_modificarActionPerformed

    private void item_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_listarActionPerformed
       listar_estudiantes listar = new listar_estudiantes();
       listar.setVisible(true);
    }//GEN-LAST:event_item_listarActionPerformed

    private void item_agregar_materia_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_agregar_materia_estudianteActionPerformed
      asociar_est_mat aso = new asociar_est_mat();
     aso.setVisible(true);
    }//GEN-LAST:event_item_agregar_materia_estudianteActionPerformed

    private void item_nuevo_profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_nuevo_profesorActionPerformed
        nuevo_profesor profesor = new nuevo_profesor();
        profesor.setVisible(true);
    }//GEN-LAST:event_item_nuevo_profesorActionPerformed

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
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenuItem item_agregar_materia_estudiante;
    private javax.swing.JMenuItem item_consultar;
    private javax.swing.JMenuItem item_eliminar;
    private javax.swing.JMenuItem item_listar;
    private javax.swing.JMenuItem item_modificar;
    private javax.swing.JMenuItem item_nuevo;
    private javax.swing.JMenuItem item_nuevo_profesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu menu_archivo;
    // End of variables declaration//GEN-END:variables
}