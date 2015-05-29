package administrador;


import bases_de_datos.Eliminar_estudiante;
import javax.swing.JOptionPane;




public class eliminar_estudiante extends javax.swing.JFrame {

    /**
     * Creates new form eliminar_estudiante
     */
    public eliminar_estudiante() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_eliminar = new javax.swing.JTextField();
        boton_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boton_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Codigo del estudiante");

        boton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Eliminar Estudiante");

        boton_regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_regresar.setForeground(new java.awt.Color(204, 0, 0));
        boton_regresar.setText("Regresar");
        boton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_regresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(tf_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(boton_eliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jLabel2))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(boton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_regresarActionPerformed
       this.dispose();
    }//GEN-LAST:event_boton_regresarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        Eliminar_estudiante elim = new Eliminar_estudiante();  
        elim.eliminar_estudiante_BD(tf_eliminar.getText());
        if (elim.getResultado().equals("eliminado")) {
            JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente");
            this.dispose();
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Estudiante no esta registrado");
        }
    }//GEN-LAST:event_boton_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(eliminar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminar_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminar_estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_eliminar;
    // End of variables declaration//GEN-END:variables
}
