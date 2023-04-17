/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio_41;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juan Pablo
 */
public class INTER extends javax.swing.JFrame {
    ArrayList<Integer> array = new ArrayList<Integer>();
    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form INTER
     */
    public INTER() {
        initComponents();
        jList1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLN = new javax.swing.JLabel();
        TXTNUMERO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BTNBORRARTODO = new javax.swing.JButton();
        NGRANDE = new javax.swing.JTextField();
        BTNMAYOR = new javax.swing.JButton();
        BTNAGREGAR = new javax.swing.JButton();
        BTNBORRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 181, 106));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MAYOR VALOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        LBLN.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        LBLN.setForeground(new java.awt.Color(0, 0, 0));
        LBLN.setText("NUMERO QUE DESEAS AGREGAR:");
        jPanel2.add(LBLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 50));

        TXTNUMERO.setBackground(new java.awt.Color(70, 181, 106));
        TXTNUMERO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTNUMERO.setForeground(new java.awt.Color(0, 0, 0));
        TXTNUMERO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTNUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNUMEROActionPerformed(evt);
            }
        });
        jPanel2.add(TXTNUMERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 90, 50));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 430, -1));

        BTNBORRARTODO.setBackground(new java.awt.Color(70, 181, 106));
        BTNBORRARTODO.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNBORRARTODO.setForeground(new java.awt.Color(0, 0, 0));
        BTNBORRARTODO.setText("BORRAR TODO");
        BTNBORRARTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBORRARTODOActionPerformed(evt);
            }
        });
        jPanel2.add(BTNBORRARTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        NGRANDE.setBackground(new java.awt.Color(255, 255, 255));
        NGRANDE.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        NGRANDE.setForeground(new java.awt.Color(0, 0, 0));
        NGRANDE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NGRANDE.setBorder(null);
        jPanel2.add(NGRANDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 130, 60));

        BTNMAYOR.setBackground(new java.awt.Color(70, 181, 106));
        BTNMAYOR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNMAYOR.setForeground(new java.awt.Color(0, 0, 0));
        BTNMAYOR.setText("CALCULAR EL MAYOR");
        BTNMAYOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMAYORActionPerformed(evt);
            }
        });
        jPanel2.add(BTNMAYOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        BTNAGREGAR.setBackground(new java.awt.Color(70, 181, 106));
        BTNAGREGAR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNAGREGAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNAGREGAR.setText("AGREGAR");
        BTNAGREGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAGREGARMouseEntered(evt);
            }
        });
        BTNAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGARActionPerformed(evt);
            }
        });
        jPanel2.add(BTNAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        BTNBORRAR.setBackground(new java.awt.Color(70, 181, 106));
        BTNBORRAR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        BTNBORRAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNBORRAR.setText("BORRAR");
        BTNBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBORRARActionPerformed(evt);
            }
        });
        jPanel2.add(BTNBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTNUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNUMEROActionPerformed

    private void BTNBORRARTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBORRARTODOActionPerformed
        // TODO add your handling code here:
        array.removeAll(array);
        modelo.removeAllElements();
    }//GEN-LAST:event_BTNBORRARTODOActionPerformed

    private void BTNMAYORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMAYORActionPerformed
        // TODO add your handling code here:
        NGRANDE.setText(String.valueOf(Collections.max(array)));
        
    }//GEN-LAST:event_BTNMAYORActionPerformed

    private void BTNAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAGREGARActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(TXTNUMERO.getText());
        array.add(numero);
        modelo.addElement(numero);
        TXTNUMERO.setText("");
        NGRANDE.setText(String.valueOf(Collections.max(array)));

    }//GEN-LAST:event_BTNAGREGARActionPerformed

    private void BTNBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBORRARActionPerformed
        // TODO add your handling code here:
        array.remove(jList1.getSelectedIndex());
        modelo.remove(jList1.getSelectedIndex());
        
    }//GEN-LAST:event_BTNBORRARActionPerformed

    private void BTNAGREGARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAGREGARMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNAGREGARMouseEntered

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
            java.util.logging.Logger.getLogger(INTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAGREGAR;
    private javax.swing.JButton BTNBORRAR;
    private javax.swing.JButton BTNBORRARTODO;
    private javax.swing.JButton BTNMAYOR;
    private javax.swing.JLabel LBLN;
    private javax.swing.JTextField NGRANDE;
    private javax.swing.JTextField TXTNUMERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}