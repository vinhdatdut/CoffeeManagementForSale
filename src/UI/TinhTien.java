/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.Bill;
import Core.Order;
import Core.Voucher;
import Manager.ManagerBill;
import Manager.ManagerKhachHang;
import Manager.ManagerOrder;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author VINH DAT
 */
public class TinhTien extends javax.swing.JFrame {
    /**
     * Creates new form TinhTien
     */
    public boolean checkHaveVoucher(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempVoucher.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            try {
                if ((txt = br.readLine()) != null) {
                    if(!txt.equals(""))
                        return true;
                }
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void DeleteTempVoucher(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempVoucher.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.print("");
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TinhTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String readVoucher() {
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempVoucher.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            try {
                if ((txt = br.readLine()) != null) {
                    return txt;
                }
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public void writeVoucher(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempVoucher.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(txtVou.getText().toString());
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TinhTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean checkHaveKH(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempNameKH.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            try {
                if ((txt = br.readLine()) != null) {
                    if(!txt.equals(""))
                        return true;
                }
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void DeleteTempKH(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempNameKH.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.print("");
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TinhTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String readKH() {
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempNameKH.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            try {
                if ((txt = br.readLine()) != null) {
                    return txt;
                }
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public void writeNameKH(){
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempNameKH.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(txtID.getText().toString());
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TinhTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getBill(){
        String makh = readKH();
        Bill bill = new ManagerBill().findBill(new OrderUI().readTable());
        String kq = "";
        kq+="                        BLAS COFFEE\n";
        kq+="Địa chỉ : 182 Nguyễn Xí, Hòa Minh, Liên Chiểu, Đà Nẵng\n\n";
        kq+="                          HÓA ĐƠN\n\n";
        if (!makh.equals("")) {
            
            String tenkh= new ManagerKhachHang().getNameKH(makh);
            
            kq += "              Khách hàng : " + tenkh.toUpperCase() + "\n";
        }
        kq += "    Thời gian vào : " + bill.getThoiGianVao() + "\n";
        kq += "    Thời gian ra   : " + new Map().getDateTime() + "\n\n";
        kq+= new ManagerBill().TinhTien(new OrderUI().readTable());
        return kq;
    }
    public String process(){
        String makh = readKH();
        Bill bill = new ManagerBill().findBill(new OrderUI().readTable());
        String kq = "";
        kq+="                        BLAS COFFEE\n";
        kq+="Địa chỉ : 182 Nguyễn Xí, Hòa Minh, Liên Chiểu, Đà Nẵng\n\n";
        kq+="                          HÓA ĐƠN\n\n";
        if (!makh.equals("")) {
            if(!new ManagerKhachHang().checkExitsKH(makh)){
                JOptionPane.showMessageDialog(null, "Không tồn tại mã khách hàng này");
                return "";
            }
            
            String tenkh= new ManagerKhachHang().getNameKH(makh);
            
            kq += "              Khách hàng : " + tenkh.toUpperCase() + "\n";
        }
        kq += "    Thời gian vào : " + bill.getThoiGianVao() + "\n";
        kq += "    Thời gian ra   : " + new Map().getDateTime() + "\n\n";
        kq+= new ManagerBill().TinhTien(new OrderUI().readTable());
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\bill.txt";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(kq);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
            new ManagerOrder().deleteOrder(new OrderUI().readTable());
            this.hide();
            Map a = new Map();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ManagerBill().deleteBill(new OrderUI().readTable());
        return kq;
    }
    public TinhTien() {
        initComponents();
        btnTT.setBackground(Color.GREEN);
        btnDiem.setBackground(Color.yellow);
    }
    public String getDate() {
        String date = "" + java.time.LocalDateTime.now();
        String word[] = date.split("T");
        return word[0];
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
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnTT = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVou = new javax.swing.JTextField();
        btnDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã KH");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnTT.setText("Thanh toán");
        btnTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTActionPerformed(evt);
            }
        });

        btnBack.setText("Trở về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm thanh viên");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Voucher");

        btnDiem.setText("Dùng điểm ");
        btnDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTT)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addComponent(btnBack)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtVou))))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
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

    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
        // TODO add your handling code here:
        if(!txtID.getText().toString().trim().equals("")){
            if(!new ManagerKhachHang().checkExitsKH(txtID.getText().toString().trim())){
                JOptionPane.showMessageDialog(null, "Không tồn tại mã khách hàng này");
                return;
            }
            writeNameKH();
        }
        String v = txtVou.getText().toString().trim();
        if(!v.equals("")){
            if(!new Manager.ManagerVoucher().checkExitsVoucher(v)){
                JOptionPane.showMessageDialog(null, "Không tìm thấy voucher này");
                return;
            }
            String datenow = getDate();
            String datestartvoucher = new Manager.ManagerVoucher().findVoucher(v).getNgayBatDau();
            String dateendvoucher = new Manager.ManagerVoucher().findVoucher(v).getNgayKetThuc();
            if(datenow.compareTo(datestartvoucher)<0){
                JOptionPane.showMessageDialog(null, "Chưa tới ngày áp dụng được voucher này");
                return;
            }
            if(datenow.compareTo(datestartvoucher)<0){
                JOptionPane.showMessageDialog(null, "Chưa tới ngày áp dụng được voucher này");
                return;
            }
            if(datenow.compareTo(dateendvoucher)>0){
                JOptionPane.showMessageDialog(null, "Voucher đã quá ngày sử dụng");
                return;
            }
            if(new Manager.ManagerVoucher().checkDaDungVoucher(v)){
                JOptionPane.showMessageDialog(null, "Voucher này đã được sử dụng bởi người khác");
                return;
            }
            writeVoucher();
        }
        TienThua a = new TienThua();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnTTActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
        AddNewKH a = new AddNewKH();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddNewKH a = new AddNewKH();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().toString().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Không thể dùng điểm vì chưa nhập mã KH");
            return;
        }
        if(!new ManagerKhachHang().checkExitsKH(txtID.getText().toString().trim())){
            JOptionPane.showMessageDialog(null, "Không tồn tại mã khách hàng này");
            return;
        }
        writeNameKH();
        String v = txtVou.getText().toString().trim();
        if(!v.equals("")){
            if(!new Manager.ManagerVoucher().checkExitsVoucher(v)){
                JOptionPane.showMessageDialog(null, "Không tìm thấy voucher này");
                return;
            }
            String datenow = getDate();
            String datestartvoucher = new Manager.ManagerVoucher().findVoucher(v).getNgayBatDau();
            String dateendvoucher = new Manager.ManagerVoucher().findVoucher(v).getNgayKetThuc();
            if(datenow.compareTo(datestartvoucher)<0){
                JOptionPane.showMessageDialog(null, "Chưa tới ngày áp dụng được voucher này");
                return;
            }
            if(datenow.compareTo(datestartvoucher)<0){
                JOptionPane.showMessageDialog(null, "Chưa tới ngày áp dụng được voucher này");
                return;
            }
            if(datenow.compareTo(dateendvoucher)>0){
                JOptionPane.showMessageDialog(null, "Voucher đã quá ngày sử dụng");
                return;
            }
            if(new Manager.ManagerVoucher().checkDaDungVoucher(v)){
                JOptionPane.showMessageDialog(null, "Voucher này đã được sử dụng bởi người khác");
                return;
            }
            writeVoucher();
        }
        DungDiem a = new DungDiem();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnDiemActionPerformed

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
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TinhTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDiem;
    private javax.swing.JButton btnTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtVou;
    // End of variables declaration//GEN-END:variables
}
