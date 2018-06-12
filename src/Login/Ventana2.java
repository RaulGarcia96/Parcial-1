package Login;

import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    
    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("freVentana2"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOpcion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblOpcion.setText("Selecciona Una Imagen:");
        lblOpcion.setName(""); // NOI18N

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Imagen 1", "Imagen 2", "Imagen 3" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(lblOpcion)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblimagen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblimagen)
                .addGap(18, 18, 18)
                .addComponent(lblOpcion)
                .addGap(18, 18, 18)
                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
            int op = jcbOpciones.getSelectedIndex();
        
        switch (op){
            case 0: JOptionPane.showMessageDialog(null, "No Hay Imagen Seleccionada", "Imagen Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("No Hay Opción Seleccionada");
                lblimagen.setText("No Hay Opción Seleccionada");
            break;
            case 1: JOptionPane.showMessageDialog(null, "Número 1", "Imagen Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Seleccionó La Imagen 1");
                lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.jpg")));
            break;
            case 2: JOptionPane.showMessageDialog(null, "Número 2", "Imagen Seleccionada" , JOptionPane.INFORMATION_MESSAGE); 
                lblOpcion.setText("Seleccionó La Imagen 2");
                lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen2.png")));
            break;
            case 3: JOptionPane.showMessageDialog(null, "Número 3", "Imagen Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Seleccionó La Imagen 3");
                lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen3.png")));
            break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
