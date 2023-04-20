package ejercicio_40;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juan Pablo
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<Integer> array = new ArrayList<Integer>();
    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jlist.setModel(modelo);
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
        TLTNUMEROS = new javax.swing.JLabel();
        LBLN = new javax.swing.JLabel();
        TXTNUMERO = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList<>();
        BTNELIMINARTODO = new javax.swing.JButton();
        BTNA�ADIR = new javax.swing.JButton();
        BTNELIMINAR = new javax.swing.JButton();
        CUBO = new javax.swing.JLabel();
        RAIZ = new javax.swing.JLabel();
        CUADRADO = new javax.swing.JLabel();
        TXTCUBO = new javax.swing.JTextField();
        TXTRAIZ = new javax.swing.JTextField();
        TXTCUADRADO = new javax.swing.JTextField();
        BTNSALIR = new javax.swing.JButton();
        BTNCALCULAR = new javax.swing.JButton();
        BTNBORRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));

        TLTNUMEROS.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        TLTNUMEROS.setForeground(new java.awt.Color(0, 0, 0));
        TLTNUMEROS.setText("GRUPO DE NUMEROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(TLTNUMEROS)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TLTNUMEROS)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 80));

        LBLN.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        LBLN.setForeground(new java.awt.Color(0, 0, 0));
        LBLN.setText("NUMERO QUE DESEAS AGREGAR:");
        jPanel1.add(LBLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        TXTNUMERO.setBackground(new java.awt.Color(255, 0, 102));
        TXTNUMERO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTNUMERO.setForeground(new java.awt.Color(0, 0, 0));
        TXTNUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNUMEROActionPerformed(evt);
            }
        });
        jPanel1.add(TXTNUMERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, 50));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jlist.setBackground(new java.awt.Color(255, 255, 255));
        jlist.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jlist.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jlist);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, -1));

        BTNELIMINARTODO.setBackground(new java.awt.Color(255, 0, 102));
        BTNELIMINARTODO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNELIMINARTODO.setForeground(new java.awt.Color(0, 0, 0));
        BTNELIMINARTODO.setText("ELIMINAR TODOS");
        BTNELIMINARTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARTODOActionPerformed(evt);
            }
        });
        jPanel1.add(BTNELIMINARTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 150, 40));

        BTNA�ADIR.setBackground(new java.awt.Color(255, 0, 102));
        BTNA�ADIR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNA�ADIR.setForeground(new java.awt.Color(0, 0, 0));
        BTNA�ADIR.setText("A�ADIR");
        BTNA�ADIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNA�ADIRActionPerformed(evt);
            }
        });
        jPanel1.add(BTNA�ADIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 40));

        BTNELIMINAR.setBackground(new java.awt.Color(255, 0, 102));
        BTNELIMINAR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNELIMINAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNELIMINAR.setText("ELIMINAR");
        BTNELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 40));

        CUBO.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        CUBO.setForeground(new java.awt.Color(0, 0, 0));
        CUBO.setText("CUBO:");
        jPanel1.add(CUBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, -1));

        RAIZ.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        RAIZ.setForeground(new java.awt.Color(0, 0, 0));
        RAIZ.setText("RAIZ:");
        jPanel1.add(RAIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, -1));

        CUADRADO.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        CUADRADO.setForeground(new java.awt.Color(0, 0, 0));
        CUADRADO.setText("CUADRADO:");
        jPanel1.add(CUADRADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 150, -1));

        TXTCUBO.setBackground(new java.awt.Color(255, 255, 255));
        TXTCUBO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTCUBO.setForeground(new java.awt.Color(0, 0, 0));
        TXTCUBO.setBorder(null);
        TXTCUBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCUBOActionPerformed(evt);
            }
        });
        jPanel1.add(TXTCUBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 170, 50));

        TXTRAIZ.setBackground(new java.awt.Color(255, 255, 255));
        TXTRAIZ.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTRAIZ.setForeground(new java.awt.Color(0, 0, 0));
        TXTRAIZ.setBorder(null);
        TXTRAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTRAIZActionPerformed(evt);
            }
        });
        jPanel1.add(TXTRAIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 190, 50));

        TXTCUADRADO.setBackground(new java.awt.Color(255, 255, 255));
        TXTCUADRADO.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TXTCUADRADO.setForeground(new java.awt.Color(0, 0, 0));
        TXTCUADRADO.setBorder(null);
        TXTCUADRADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCUADRADOActionPerformed(evt);
            }
        });
        jPanel1.add(TXTCUADRADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 50));

        BTNSALIR.setBackground(new java.awt.Color(255, 0, 102));
        BTNSALIR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNSALIR.setForeground(new java.awt.Color(0, 0, 0));
        BTNSALIR.setText("SALIR");
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });
        jPanel1.add(BTNSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 110, 40));

        BTNCALCULAR.setBackground(new java.awt.Color(255, 0, 102));
        BTNCALCULAR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNCALCULAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNCALCULAR.setText("CALCULAR");
        BTNCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCALCULARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCALCULAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 110, 40));

        BTNBORRAR.setBackground(new java.awt.Color(255, 0, 102));
        BTNBORRAR.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        BTNBORRAR.setForeground(new java.awt.Color(0, 0, 0));
        BTNBORRAR.setText("BORRAR");
        BTNBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBORRARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTNUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNUMEROActionPerformed

    private void BTNELIMINARTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARTODOActionPerformed
        // TODO add your handling code here:
        modelo.removeAllElements();
        array.removeAll(array);
    }//GEN-LAST:event_BTNELIMINARTODOActionPerformed

    private void BTNA�ADIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNA�ADIRActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(TXTNUMERO.getText());
        array.add(numero);
        modelo.addElement(numero);
        TXTNUMERO.setText("");


    }//GEN-LAST:event_BTNA�ADIRActionPerformed

    private void BTNELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARActionPerformed
        // TODO add your handling code here:
        modelo.remove(jlist.getSelectedIndex());
        array.remove(jlist.getSelectedIndex());
    }//GEN-LAST:event_BTNELIMINARActionPerformed

    private void TXTCUBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCUBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCUBOActionPerformed

    private void TXTRAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTRAIZActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TXTRAIZActionPerformed

    private void TXTCUADRADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCUADRADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCUADRADOActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void BTNCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCALCULARActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#.0");
        OPERACIONES op = new OPERACIONES();
        double num = array.get(jlist.getSelectedIndex());
        TXTRAIZ.setText(df.format(op.calcularraiz(num)));
        TXTCUADRADO.setText(df.format(op.calcularcuadrado(num)));
        TXTCUBO.setText(df.format(op.calcularcubo(num)));
    }//GEN-LAST:event_BTNCALCULARActionPerformed

    private void BTNBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBORRARActionPerformed
        // TODO add your handling code here:
        TXTRAIZ.setText("");
        TXTCUADRADO.setText("");
        TXTCUBO.setText("");

    }//GEN-LAST:event_BTNBORRARActionPerformed

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
    private javax.swing.JButton BTNA�ADIR;
    private javax.swing.JButton BTNBORRAR;
    private javax.swing.JButton BTNCALCULAR;
    private javax.swing.JButton BTNELIMINAR;
    private javax.swing.JButton BTNELIMINARTODO;
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JLabel CUADRADO;
    private javax.swing.JLabel CUBO;
    private javax.swing.JLabel LBLN;
    private javax.swing.JLabel RAIZ;
    private javax.swing.JLabel TLTNUMEROS;
    private javax.swing.JTextField TXTCUADRADO;
    private javax.swing.JTextField TXTCUBO;
    private javax.swing.JTextField TXTNUMERO;
    private javax.swing.JTextField TXTRAIZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlist;
    // End of variables declaration//GEN-END:variables
}
