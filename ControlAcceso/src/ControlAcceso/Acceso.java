/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlAcceso;

/**
 *
 * @author Lore
 */
public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Acceso
     */
    public Acceso() {
        initComponents();
        setLocationRelativeTo(null);
     setResizable(false);
    setTitle("Ventana principal");
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rut = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        RutAdmi = new javax.swing.JTextField();
        BotonAdmi = new javax.swing.JButton();
        ContraAdmi = new javax.swing.JPasswordField();
        OpcionAcce = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rut.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Rut.setText("Rut");

        Contraseña.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Contraseña.setText("Contraseña");

        RutAdmi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RutAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutAdmiActionPerformed(evt);
            }
        });
        RutAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RutAdmiKeyTyped(evt);
            }
        });

        BotonAdmi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BotonAdmi.setText("Ingresar");
        BotonAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdmiActionPerformed(evt);
            }
        });

        ContraAdmi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ContraAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraAdmiActionPerformed(evt);
            }
        });

        OpcionAcce.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        OpcionAcce.setText("Opciones");
        OpcionAcce.setMaximumSize(new java.awt.Dimension(89, 27));
        OpcionAcce.setMinimumSize(new java.awt.Dimension(89, 27));
        OpcionAcce.setPreferredSize(new java.awt.Dimension(89, 27));
        OpcionAcce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionAcceActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lore\\Documents\\NetBeansProjects\\ ControlAcceso\\nbproject\\logo utem.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(OpcionAcce, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Rut)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contraseña)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RutAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(ContraAdmi)
                    .addComponent(BotonAdmi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(OpcionAcce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rut)
                    .addComponent(RutAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseña)
                    .addComponent(ContraAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(BotonAdmi)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RutAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutAdmiActionPerformed

    private void ContraAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraAdmiActionPerformed

    private void OpcionAcceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionAcceActionPerformed
      Opciones obj=new Opciones();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_OpcionAcceActionPerformed

    private void BotonAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdmiActionPerformed
      Menu obj=new Menu();
      obj.setVisible(true);
      dispose();  
    }//GEN-LAST:event_BotonAdmiActionPerformed

    private void RutAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RutAdmiKeyTyped
        char n =evt.getKeyChar();
        if(n<'0' || n>'9') 
        {
            getToolkit().beep();
            evt.consume();}
    }//GEN-LAST:event_RutAdmiKeyTyped

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAdmi;
    private javax.swing.JPasswordField ContraAdmi;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton OpcionAcce;
    private javax.swing.JLabel Rut;
    private javax.swing.JTextField RutAdmi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
