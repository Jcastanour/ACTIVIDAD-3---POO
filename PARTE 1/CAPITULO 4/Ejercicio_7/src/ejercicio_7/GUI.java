/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio_7;

/**
 *
 * @author Juan Pablo
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTB = new javax.swing.JTextField();
        TXTA = new javax.swing.JTextField();
        BTNSALIR = new javax.swing.JButton();
        BTNCALCULAR = new javax.swing.JButton();
        TXTPRINT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MAYOR ENTRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("B:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("A:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        TXTB.setBackground(new java.awt.Color(102, 255, 255));
        TXTB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTB.setForeground(new java.awt.Color(0, 0, 0));
        TXTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBActionPerformed(evt);
            }
        });
        jPanel1.add(TXTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 155, 80, 40));

        TXTA.setBackground(new java.awt.Color(102, 255, 255));
        TXTA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTA.setForeground(new java.awt.Color(0, 0, 0));
        TXTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAActionPerformed(evt);
            }
        });
        jPanel1.add(TXTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 105, 80, 40));

        BTNSALIR.setBackground(new java.awt.Color(51, 255, 255));
        BTNSALIR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNSALIR.setForeground(new java.awt.Color(0, 0, 0));
        BTNSALIR.setText("SALIR");
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });
        jPanel1.add(BTNSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 155, 130, 40));

        BTNCALCULAR.setBackground(new java.awt.Color(51, 255, 255));
        BTNCALCULAR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNCALCULAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNCALCULAR.setText("CALCULAR");
        BTNCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCALCULARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCALCULAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 105, 130, 40));

        TXTPRINT.setBackground(new java.awt.Color(255, 255, 255));
        TXTPRINT.setColumns(20);
        TXTPRINT.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTPRINT.setForeground(new java.awt.Color(0, 0, 0));
        TXTPRINT.setLineWrap(true);
        TXTPRINT.setRows(5);
        TXTPRINT.setBorder(null);
        jPanel1.add(TXTPRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBActionPerformed

    private void TXTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void BTNCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCALCULARActionPerformed
        // TODO add your handling code here:
        double a = Double.parseDouble(TXTA.getText());
        double b = Double.parseDouble(TXTB.getText());
        
        MAYOR my = new MAYOR();
        
        TXTPRINT.setText(my.mayor(a, b));
        
        
    }//GEN-LAST:event_BTNCALCULARActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCALCULAR;
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JTextField TXTA;
    private javax.swing.JTextField TXTB;
    private javax.swing.JTextArea TXTPRINT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
