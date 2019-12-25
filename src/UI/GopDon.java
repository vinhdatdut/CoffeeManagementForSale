/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Manager.ManagerTempData;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author VINH DAT
 */
public class GopDon extends javax.swing.JFrame {

    /**
     * Creates new form GopDon
     */
    public GopDon() {
        initComponents();
    }
    public boolean checkChuyenBan(String ban){
        String word[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        for(String i:word){
            if(i.equals(ban))
                return true;
        }
        return false;
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
        txtTable = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập bàn cần gộp");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnBack.setText("Trở về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        if(txtTable.getText().toString().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập bàn cần gộp");
            this.hide();
            OrderUI a = new OrderUI();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
            return;
        }
        String ban = txtTable.getText().toString().trim();
        if(ban.equals(new ManagerTempData().getTempTable())){
            JOptionPane.showMessageDialog(null, "Không được chọn bàn đang ngồi");
            this.hide();
            OrderUI a = new OrderUI();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
            return;
        }
        if(!checkChuyenBan(ban)){
            JOptionPane.showMessageDialog(null, "Bàn không hợp lệ");
            this.hide();
            OrderUI a = new OrderUI();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
            return;
        }
        if(new Manager.ManagerOrder().checkTableEmpty(ban)){
            JOptionPane.showMessageDialog(null, "Không thể gộp với bàn trống");
            this.hide();
            OrderUI a = new OrderUI();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
            return;
        }
        if(checkChuyenBan(ban)){
            new Manager.ManagerBill().deleteBill(ban);
            new Manager.ManagerOrder().updateBanOrder(new ManagerTempData().getTempTable(), ban);
            JOptionPane.showMessageDialog(null, "Đã gộp");
            this.hide();
            Map a = new Map();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(GopDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GopDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GopDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GopDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GopDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
