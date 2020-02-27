/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.Order;
import Manager.ManagerBill;
import Manager.ManagerMenu;
import Manager.ManagerOrder;
import Manager.ManagerTempData;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VINH DAT
 */
public class OrderUI extends javax.swing.JFrame {

    /**
     * Creates new form OrderUI
     */
    public void next() {
        ManagerBill aa = new ManagerBill();
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        ManagerMenu dd = new ManagerMenu();
        txtTimeVao.setText("Thời gian vào : " + aa.getDateTime(bb.getTempTable()));
        txtTimeVao.setFont(new Font("arial", Font.BOLD, 20));
        txtTable.setText("Bàn " + bb.getTempTable());
        txtTable.setFont(new Font("arial", Font.BOLD, 30));
        btnMap.setFont(new Font("arial", Font.BOLD, 20));
        ArrayList<Order> list = cc.findOrder(bb.getTempTable());
        Vector head = new Vector();
        Vector data = new Vector();
        head.add("Mã món");
        head.add("Tên món");
        head.add("Đơn giá");
        head.add("Số lượng");
        head.add("Thành tiền");
        double s = 0;
        for (Order i : list) {
            Vector row = new Vector();
            row.add(i.getMamon());
            row.add(i.getTenMon());
            row.add(dd.getMoneyFood(i.getMamon()));
            row.add(i.getSoluong());
            row.add(i.getSoluong() * dd.getMoneyFood(i.getMamon()));
            s += i.getSoluong() * dd.getMoneyFood(i.getMamon());
            data.add(row);
            dd.closeConnection();
        }
        aa.closeConnection();
        bb.closeConnection();
        cc.closeConnection();
        Vector row = new Vector();
        row.add(null);
        row.add(null);
        row.add(null);
        row.add(null);
        row.add("TỔNG CỘNG : " + s + "đ");
        data.add(row);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setDataVector(data, head);
    }

    public OrderUI() {
        initComponents();
        btnCharge.setBackground(Color.GREEN);
        btnCharge.setFont(new Font("arial", Font.BOLD, 20));
        btnCancel.setBackground(Color.RED);
        btnCancel.setFont(new Font("arial", Font.BOLD, 20));
        btnAdd.setBackground(Color.GREEN);
        btnAdd.setFont(new Font("arial", Font.BOLD, 20));
        btnDeleteFood.setBackground(Color.RED);
        btnDeleteFood.setFont(new Font("arial", Font.BOLD, 20));
        btnUpdate.setBackground(Color.YELLOW);
        btnUpdate.setFont(new Font("arial", Font.BOLD, 20));
        next();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnCharge = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnChangeTable = new javax.swing.JButton();
        btnMap = new javax.swing.JButton();
        txtTable = new javax.swing.JLabel();
        btnGopDon = new javax.swing.JButton();
        btnTachDon = new javax.swing.JButton();
        txtTimeVao = new javax.swing.JLabel();
        btnDeleteFood = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnCharge.setText("Tính tiền");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm món");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy đơn");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChangeTable.setText("Chuyển bàn");
        btnChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTableActionPerformed(evt);
            }
        });

        btnMap.setText("MAP");
        btnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapActionPerformed(evt);
            }
        });

        txtTable.setText("Bàn");

        btnGopDon.setText("Gộp đơn");
        btnGopDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGopDonActionPerformed(evt);
            }
        });

        btnTachDon.setText("Tách đơn");
        btnTachDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachDonActionPerformed(evt);
            }
        });

        txtTimeVao.setText("Thời gian vào");

        btnDeleteFood.setText("Xóa món");
        btnDeleteFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa order");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnMap, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(txtTable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(txtTimeVao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(42, 42, 42)
                                .addComponent(btnDeleteFood)
                                .addGap(39, 39, 39)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addGap(38, 38, 38)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCharge)
                    .addComponent(btnChangeTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGopDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTachDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGopDon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTachDon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtTable)
                                .addGap(31, 31, 31)
                                .addComponent(txtTimeVao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

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

    private void tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tableComponentShown

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không thể tính tiền");
            return;
        }
        bb.closeConnection();
        cc.closeConnection();
        TinhTien a = new TinhTien();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnChargeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddFood a = new AddFood();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        ManagerBill aa = new ManagerBill();
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không thể hủy");
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Bạn có thực sự muốn hủy order này?", "Confirm Box", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            cc.deleteOrder(bb.getTempTable());
            aa.deleteBill(bb.getTempTable());
            JOptionPane.showMessageDialog(null, "Đã hủy order");
            Map a = new Map();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
            this.hide();
        }
        aa.closeConnection();
        bb.closeConnection();
        cc.closeConnection();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapActionPerformed
        // TODO add your handling code here:
        Map a = new Map();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMapActionPerformed

    private void btnChangeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTableActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không được chuyển");
            return;
        }
        bb.closeConnection();
        cc.closeConnection();
        ChuyenBan a = new ChuyenBan();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnChangeTableActionPerformed

    private void btnGopDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGopDonActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không được gộp");
            return;
        }
        bb.closeConnection();
        cc.closeConnection();
        GopDon a = new GopDon();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGopDonActionPerformed

    private void btnTachDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachDonActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không được tách");
            return;
        }
        bb.closeConnection();
        cc.closeConnection();
        TachDon a = new TachDon();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnTachDonActionPerformed

    private void btnDeleteFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không có gì để xóa");
            return;
        }
        int row = table.getSelectedRow();
        String s = table.getValueAt(row, 4).toString();
        if(s.contains("TỔNG CỘNG")){
            return;
        }
        System.out.println(s);
        if (row == -1) {
            JOptionPane.showMessageDialog(null, " Vui lòng chọn món để xóa khỏi order");
            return;
        }
        String TenMon = table.getValueAt(row, 1).toString().trim();
        cc.deleteFood(TenMon, bb.getTempTable());
        if (cc.checkTableEmpty(bb.getTempTable())) {
            new Manager.ManagerBill().deleteBill(bb.getTempTable());
        }
        bb.closeConnection();
        cc.closeConnection();
        JOptionPane.showMessageDialog(null, "Xóa thành công");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnDeleteFoodActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if (cc.checkTableEmpty(bb.getTempTable())) {
            JOptionPane.showMessageDialog(null, "Bàn trống không có gì để sửa");
            return;
        }
        bb.closeConnection();
        cc.closeConnection();
        SuaSL a = new SuaSL();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            OrderUI o = new OrderUI();

            public void run() {
                o.setTitle("Chi tiết order");
                o.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangeTable;
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnDeleteFood;
    private javax.swing.JButton btnGopDon;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnTachDon;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel txtTable;
    private javax.swing.JLabel txtTimeVao;
    // End of variables declaration//GEN-END:variables
}
