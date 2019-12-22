/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Core.Voucher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VINH DAT
 */
public class ManagerVoucher {

    private Connection conn;

    public Connection getConnection() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/caffeemanagement", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conn;
    }

    public void closeConnection() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Voucher findVoucher(String id) {
        try {
            String sql = " select * from voucher where Ma = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                Voucher v = new Voucher(RS.getString("Ma"), RS.getDouble("Giam"), RS.getString("ApDung"), RS.getString("NgayBatDau"), RS.getString("NgayKetThuc"), RS.getDouble("giamtoida"), RS.getInt("solandung"), RS.getString("dadung"), RS.getString("thoidiemdung"));
                return v;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateVoucher(Voucher v) {
        try {
            String sql = "update voucher set Giam = " + v.getGiam() + ",ApDung = '" + v.getApDung() + "',NgayBatDau='" + v.getNgayBatDau() + "',NgayKetThuc='" + v.getNgayKetThuc() + "',giamtoida=" + v.getGiamtoida() + ",solandung=" + v.getSolandung() + ",dadung='" + v.getDadung() + "',thoidiemdung='" + v.getThoidiemdung() + "' where Ma = '" + v.getMa() + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkExitsVoucher(String id) {
        try {
            String sql = " select * from voucher where Ma = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return false;
    }

    public boolean checkDaDungVoucher(String id) {
        try {
            String sql = " select dadung from voucher where Ma = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                if (RS.getString("dadung").equals("chưa")) {
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return true;
    }
}
