/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.DataShop;
import Core.KhachHang;
import Core.Voucher;
import Manager.ManagerBill;
import Manager.ManagerDataShop;
import Manager.ManagerKhachHang;
import Manager.ManagerOrder;
import Manager.ManagerTempData;
import Manager.ManagerVoucher;
import javax.swing.JOptionPane;

/**
 *
 * @author VINH DAT
 */
public class TienThua extends javax.swing.JFrame {

    /**
     * Creates new form TienThua
     */
    public TienThua() {
        initComponents();
        txtBill.setText(new TinhTien().getBill());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBill.setColumns(20);
        txtBill.setRows(5);
        jScrollPane1.setViewportView(txtBill);

        jLabel2.setText("Khách đưa");

        txtMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoneyActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnBack)))
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        ManagerBill aa = new ManagerBill();
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        ManagerKhachHang ee = new ManagerKhachHang();
        if (txtMoney.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập tiền khách đưa");
            return;
        }
        int diem = 0;
        double tien = cc.getMoney(bb.getTempTable());
        double tienkhachdua = Double.parseDouble(txtMoney.getText().toString().trim());
        if (tien > tienkhachdua) {
            JOptionPane.showMessageDialog(null, "Chưa đủ tiền");
            return;
        }
        JOptionPane.showMessageDialog(null, "Trả lại khách : " + (tienkhachdua - tien));
        if (bb.checkExitsKH()) {
            KhachHang kh = ee.findKH(bb.getTempKH());
            kh.setDiem(kh.getDiem() + (int) (0.03 * tien));
            ee.updateKH(kh);
            ee.closeConnection();
        }
        aa.updateTrend(bb.getTempTable());
        double tiengoc = cc.getMoneyGoc(bb.getTempTable());
        double tiensaugiam = cc.getMoney(bb.getTempTable());
        double diema = Double.parseDouble(bb.getTempDiem());
        String date = new Map().getDate();
        String day[] = date.split("-");
        int y = Integer.parseInt(day[0]);
        int m = Integer.parseInt(day[1]);
        int da = Integer.parseInt(day[2]);
        DataShop d = new DataShop(tiengoc, tiengoc - tiensaugiam - diema, diema, da, m, y);
        ManagerDataShop ff = new ManagerDataShop();
        ff.addNewDataShop(d);
        ff.closeConnection();
        new TinhTien().process();
        ManagerVoucher vv = new ManagerVoucher();
        if (bb.checkExitsVoucher()) {
            Voucher vo = vv.findVoucher(bb.getTempVoucher());
            if (vo.getSolandung() == 1) {
                vo.setDadung("đã dùng");
                vo.setThoidiemdung(new Map().getDateTime());
                vv.updateVoucher(vo);
            }
            vv.closeConnection();
        }
        if (bb.checkExitsDiem()) {
            int diemgiam = Integer.parseInt(bb.getTempDiem());
            KhachHang k = ee.findKH(bb.getTempKH());
            k.setDiem(k.getDiem() - diemgiam);
            ee.updateKH(k);
            ee.closeConnection();
        }
        bb.DeleteTemp();
        aa.closeConnection();
        bb.closeConnection();
        cc.closeConnection();
        this.hide();
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoneyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        TinhTien a = new TinhTien();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
        ManagerTempData bb = new ManagerTempData();
        bb.DeleteTemp();
        bb.closeConnection();
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
            java.util.logging.Logger.getLogger(TienThua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TienThua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TienThua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TienThua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TienThua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
