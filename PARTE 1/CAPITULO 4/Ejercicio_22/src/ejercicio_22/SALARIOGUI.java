package ejercicio_22;

import java.text.DecimalFormat;

/**
 *
 * @author Juan Pablo
 */
public class SALARIOGUI extends javax.swing.JFrame {

    /**
     * Creates new form SALARIOGUI
     */
    public SALARIOGUI() {
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
        jLabel4 = new javax.swing.JLabel();
        TXTNOMBRE = new javax.swing.JTextField();
        TXTCOSTO = new javax.swing.JTextField();
        TXTHORAS = new javax.swing.JTextField();
        BTNCALCULAR = new javax.swing.JButton();
        TXTPRINT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SALARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 70));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HORAS TRABAJADAS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("COSTO POR HORA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        TXTNOMBRE.setBackground(new java.awt.Color(255, 255, 255));
        TXTNOMBRE.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTNOMBRE.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TXTNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, 30));

        TXTCOSTO.setBackground(new java.awt.Color(255, 255, 255));
        TXTCOSTO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTCOSTO.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TXTCOSTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 100, 30));

        TXTHORAS.setBackground(new java.awt.Color(255, 255, 255));
        TXTHORAS.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTHORAS.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TXTHORAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 30));

        BTNCALCULAR.setBackground(new java.awt.Color(0, 153, 153));
        BTNCALCULAR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNCALCULAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNCALCULAR.setText("CALCULAR");
        BTNCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCALCULARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCALCULAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 50));

        TXTPRINT.setBackground(new java.awt.Color(255, 255, 255));
        TXTPRINT.setColumns(20);
        TXTPRINT.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTPRINT.setForeground(new java.awt.Color(0, 0, 0));
        TXTPRINT.setLineWrap(true);
        TXTPRINT.setRows(5);
        TXTPRINT.setBorder(null);
        jPanel1.add(TXTPRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 380, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCALCULARActionPerformed
        // TODO add your handling code here:
        
        double costo = Double.parseDouble(TXTCOSTO.getText());
        double horas = Double.parseDouble(TXTHORAS.getText());
        String nombre = TXTNOMBRE.getText();
        
        SALARIO sl = new SALARIO();
        
        TXTPRINT.setText(sl.calcularsalario(nombre, costo, horas));
        
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
            java.util.logging.Logger.getLogger(SALARIOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALARIOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALARIOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALARIOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALARIOGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCALCULAR;
    private javax.swing.JTextField TXTCOSTO;
    private javax.swing.JTextField TXTHORAS;
    private javax.swing.JTextField TXTNOMBRE;
    private javax.swing.JTextArea TXTPRINT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
