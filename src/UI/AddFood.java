/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.Bill;
import Core.Menu;
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
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author VINH DAT
 */
public class AddFood extends javax.swing.JFrame {

    ManagerMenu dd = new ManagerMenu();
    /**
     * Creates new form AddFood
     */
    int dem=0;
    ArrayList<Menu> list = dd.findAllMenu();
    public void next() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        if (txtFind.getText().trim().length() == 0) {
            rowSorter.setRowFilter(null);
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtFind.getText()));
        }
        dd.closeConnection();
        Vector head = new Vector();
        Vector data = new Vector();
        head.add("Mã món");
        head.add("Tên món");
        head.add("Đơn giá");
        head.add("Số lần đặt");
        for (Menu i : list) {
            Vector row = new Vector();
            row.add(i.getMaMon());
            row.add(i.getTenMon());
            row.add(i.getDonGia());
            row.add(i.getSolandat());
            data.add(row);
        }
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setDataVector(data, head);
        TableColumn c = null;
        c=table.getColumnModel().getColumn(0);
        c.setPreferredWidth(30);
        c=table.getColumnModel().getColumn(1);
        c.setPreferredWidth(300);
        c=table.getColumnModel().getColumn(2);
        c.setPreferredWidth(100);
        c=table.getColumnModel().getColumn(3);
        c.setPreferredWidth(100);
        txtFind.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                if (txtFind.getText().trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtFind.getText().trim()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                if (txtFind.getText().trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtFind.getText().trim()));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }
    public AddFood() {
        initComponents();
        btnOK.setBackground(Color.GREEN);
        btnOK.setFont(new Font("arial",Font.BOLD,20));
        checkfood.setSelected(true);
        checkbeverage.setSelected(true);
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
        txtFind = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkfood = new javax.swing.JCheckBox();
        checkbeverage = new javax.swing.JCheckBox();

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
        jScrollPane1.setViewportView(table);

        label.setText("Số lượng");

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

        btnAdd.setText("+1");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setText("-1");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        jButton1.setText("Sắp xếp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        checkfood.setText("FOOD");
        checkfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkfoodActionPerformed(evt);
            }
        });

        checkbeverage.setText("BEVERAGE");
        checkbeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbeverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(checkfood)
                                .addGap(18, 18, 18)
                                .addComponent(checkbeverage))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkfood)
                                .addComponent(checkbeverage)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
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

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        ManagerBill aa = new ManagerBill();
        ManagerTempData bb = new ManagerTempData();
        ManagerOrder cc = new ManagerOrder();
        if(cc.checkTableEmpty(bb.getTempTable())){
            Bill bill = new Bill("",bb.getTempTable(),new Map().getDateTime(),"");
            aa.addNewBill(bill);
            aa.closeConnection();
        }
        
        String ban = bb.getTempTable();
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, " Vui lòng chọn món");
            return;
        }
        String mamon = table.getValueAt(row, 0).toString().trim();
        String TenMon = table.getValueAt(row, 1).toString().trim();
        if (txtSoLuong.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, " Vui lòng nhập số lượng");
            return;
        }
        double SoLuong = Double.parseDouble(txtSoLuong.getText().toString().trim());
        if(SoLuong<=0){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng phù hợp");
        }
        if(cc.HaveYetThisFoodInTable(TenMon, ban)){
            Order o = cc.findOrderByBanAndTenMon(ban, TenMon);
            o.setSoluong(o.getSoluong()+SoLuong);
            cc.updateSoLuongOrder(o);
        }else{
            Order order = new Order(ban, mamon, TenMon, SoLuong);
            cc.addNewOrder(order);
        }
        bb.closeConnection();
        cc.closeConnection();
        JOptionPane.showMessageDialog(null, " Đã thêm");
        this.hide();
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtSoLuong.getText().toString().trim().equals("")){
            txtSoLuong.setText("1");
        }else{
            txtSoLuong.setText(""+(Double.parseDouble(txtSoLuong.getText().toString().trim())+1));
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        if(!txtSoLuong.getText().toString().trim().equals("") && Double.parseDouble(txtSoLuong.getText().toString().trim())>1){
            txtSoLuong.setText(""+(Double.parseDouble(txtSoLuong.getText().toString().trim())-1));
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dem++;
        if(dem%2==1){
            if(checkfood.isSelected() && !checkbeverage.isSelected()){
                list = dd.findAllFoodSort1();
                dd.closeConnection();
                next();
            }
            if(!checkfood.isSelected() && checkbeverage.isSelected()){
                list = dd.findAllBeverageSort1();
                dd.closeConnection();
                next();
            }
            if(checkfood.isSelected() && checkbeverage.isSelected()){
                list = dd.findAllMenuSort1();
                dd.closeConnection();
                next();
            }
        }
        else{
            if(checkfood.isSelected() && !checkbeverage.isSelected()){
                list = dd.findAllFoodSort2();
                dd.closeConnection();
                next();
            }
            if(!checkfood.isSelected() && checkbeverage.isSelected()){
                list = dd.findAllBeverageSort2();
                dd.closeConnection();
                next();
            }
            if(checkfood.isSelected() && checkbeverage.isSelected()){
                list = dd.findAllMenuSort2();
                dd.closeConnection();
                next();
            }
        }
        next();
        dd.closeConnection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkfoodActionPerformed
        // TODO add your handling code here:
        if(checkfood.isSelected() && !checkbeverage.isSelected()){
            list = dd.findAllFood();
            dd.closeConnection();
            next();
        }
        if(!checkfood.isSelected() && checkbeverage.isSelected()){
            list = dd.findAllBeverage();
            dd.closeConnection();
            next();
        }
        if(checkfood.isSelected() && checkbeverage.isSelected()){
            list = dd.findAllMenu();
            dd.closeConnection();
            next();
        }
    }//GEN-LAST:event_checkfoodActionPerformed

    private void checkbeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbeverageActionPerformed
        // TODO add your handling code here:
        if(checkfood.isSelected() && !checkbeverage.isSelected()){
            list = dd.findAllFood();
            dd.closeConnection();
            next();
        }
        if(!checkfood.isSelected() && checkbeverage.isSelected()){
            list = dd.findAllBeverage();
            dd.closeConnection();
            next();
        }
        if(checkfood.isSelected() && checkbeverage.isSelected()){
            list = dd.findAllMenu();
            dd.closeConnection();
            next();
        }
    }//GEN-LAST:event_checkbeverageActionPerformed

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
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSub;
    private javax.swing.JCheckBox checkbeverage;
    private javax.swing.JCheckBox checkfood;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
