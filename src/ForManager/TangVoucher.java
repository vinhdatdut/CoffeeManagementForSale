/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForManager;

import Core.Voucher;
import Manager.ManagerVoucher;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author VINH DAT
 */
public class TangVoucher extends javax.swing.JFrame {

    /**
     * Creates new form AddNewKH
     */
    String file = "";
    int soEmail = 0;

    public TangVoucher() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        txtID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGiam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtend = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtgiamtoida = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        raall = new javax.swing.JRadioButton();
        rab = new javax.swing.JRadioButton();
        raf = new javax.swing.JRadioButton();
        txtList = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setText("File danh sách Email");

        jLabel2.setText("Giảm");

        jLabel5.setText("Ngày bắt đầu");

        jLabel6.setText("Ngày kết thúc");

        jLabel7.setText("Giảm tối đa");

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

        jLabel1.setText("Áp dụng cho");

        raall.setText("Tất cả");

        rab.setText("Thức uống");

        raf.setText("Thức ăn");

        btnSelect.setText("Chọn");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtID)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtgiamtoida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raall)
                                    .addComponent(txtstart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(rab)
                                        .addGap(32, 32, 32)
                                        .addComponent(raf)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(337, 337, 337))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtList, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSelect)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID)
                    .addComponent(txtList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(raall)
                            .addComponent(rab)
                            .addComponent(raf))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtgiamtoida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        if (txtList.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa chọn danh sách tặng voucher");
            return;
        }
        if (txtGiam.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập giảm");
            return;
        }
        if (!raall.isSelected() && !rab.isSelected() && !raf.isSelected()) {
            JOptionPane.showMessageDialog(null, "Chọn áp dụng cho");
            return;
        }
        if (txtstart.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập ngày bắt đầu");
            return;
        }
        if (txtend.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập ngày kết thúc");
            return;
        }
        if (txtgiamtoida.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập giảm tối đa");
            return;
        }
        Double giam = Double.parseDouble(txtGiam.getText().toString().trim());
        String ngaybatdau = txtstart.getText().toString().trim();
        String ngayketthuc = txtend.getText().toString().trim();
        double giamtoida = Double.parseDouble(txtgiamtoida.getText().toString().trim());
        String apdungcho = "";
        if (raall.isSelected()) {
            apdungcho = "ALL";
        }
        if (raf.isSelected()) {
            apdungcho = "F";
        }
        if (rab.isSelected()) {
            apdungcho = "B";
        }
        int result = JOptionPane.showConfirmDialog(null, "Bạn có thực sự muốn gửi voucher?", "Confirm Box", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            ArrayList<String> emailList = new ArrayList<String>();
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                try {
                    String s;
                    while ((s = br.readLine()) != null) {
                        emailList.add(s);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TangVoucher.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TangVoucher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String HOST_NAME = "smtp.gmail.com";

            int SSL_PORT = 465; // Port for SSL

            int TSL_PORT = 587; // Port for TLS/STARTTLS

            String APP_EMAIL = "vantoantruykich@gmail.com"; // your email

            String APP_PASSWORD = ""; // your password

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", HOST_NAME);
            props.put("mail.smtp.socketFactory.port", SSL_PORT);
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.port", SSL_PORT);

            // get Session
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(APP_EMAIL, APP_PASSWORD);
                }
            });
            for (String i : emailList) {
                int id = 0;
                do {
                    Random r = new Random();
                    id = r.nextInt(89999999) + 100000000;
                } while (new ManagerVoucher().checkExitsVoucher(id + ""));
                Voucher vo = new Voucher(id + "", giam, apdungcho, ngaybatdau, ngayketthuc, giamtoida, 1, "chưa", "1999-09-04 10:10:10");
                new ManagerVoucher().addNewVoucher(vo);
                try {
                    String RECEIVE_EMAIL = i;
                    MimeMessage message = new MimeMessage(session);
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(RECEIVE_EMAIL));
                    message.setFrom(new InternetAddress(APP_EMAIL));
                    message.setSubject("(NO REPLY) VOUCHER BLAS COFFEE");
                    String content = " BLAS COFFEE\n";
                    content += " Địa chỉ : 182 Nguyễn Xí, Liên Chiểu, Đà Nẵng\n";
                    content += " SĐT : 0965040999\n\n";
                    content += "BLAS COFFEE xin kính chào quý khách\n";
                    content += "Nhằm tri ân khách hàng trong thời gian vừa qua quý khách hàng đã đồng hành với BLAS COFFEE. "
                            + "BLAS COFFEE xin kính tặng quý khách voucher giảm giá " + (vo.getGiam()*100) + "% (";
                    if(vo.getGiamtoida()==0){
                        content+="Không giới hạn số tiền được giảm). Áp dụng cho ";
                    }else
                        content+="Giảm tối đa " + vo.getGiamtoida()+"đ). Áp dụng cho ";
                    if (vo.getApDung().equals("ALL")) {
                        content += "toàn bộ món.\n";
                    } else {
                        if (vo.getApDung().equals("F")) {
                            content += "tất cả thức uống.\n";
                        } else {
                            content += "tất cả đồ ăn.\n\n";
                        }
                    }
                    content += "Mã voucher : " + vo.getMa() + "\n";
                    content += "Voucher này có hiệu lực từ ngày " + vo.getNgayBatDau() + " đến trước ngày " + vo.getNgayKetThuc() + "\n\n";
                    content += "BLAS COFFEE kính chúc quý khách nhiều niềm vui, sức khỏe và thành công!\n\n";
                    content += "Đây là email được gửi tự động. Vui lòng KHÔNG REPLY lại email này.\n Chi tiết liên hệ : 0965040999";
                    message.setText(content);
                    Transport.send(message);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }
            JOptionPane.showMessageDialog(null, "Gửi thành công");
        }
        
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Main a = new Main();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = c.getSelectedFile();
            file = selectedFile.getAbsolutePath();
            txtList.setText(file);
        }
    }//GEN-LAST:event_btnSelectActionPerformed

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
            java.util.logging.Logger.getLogger(TangVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TangVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TangVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TangVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TangVoucher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton raall;
    private javax.swing.JRadioButton rab;
    private javax.swing.JRadioButton raf;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtList;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtgiamtoida;
    private javax.swing.JTextField txtstart;
    // End of variables declaration//GEN-END:variables
}