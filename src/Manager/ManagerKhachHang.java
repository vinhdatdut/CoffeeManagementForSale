/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Core.KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VINH DAT
 */
public class ManagerKhachHang {
    
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
    
    public void addNewKH(KhachHang kh) {
        try {
            String sql = "insert into KhachHang values('" + kh.getMaKH() + "','" + kh.getTenKH() + "','" + kh.getGioiTinh() + "','" + kh.getNgaySinh() + "','" + kh.getSdt() + "','" + kh.getEmail() + "','" + kh.getDiaChi() + "'," + kh.getDiem() + ")";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<KhachHang> findAllKH() {
        try {
            ArrayList<KhachHang> list = new ArrayList<>();
            String sql = " select * from khachhang";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            while (RS.next() == true) {
                KhachHang k = new KhachHang(RS.getString("MaKH"), RS.getString("TenKhachHang"), RS.getString("GioiTinh"), RS.getString("NgaySinh"), RS.getString("sdt"), RS.getString("email"), RS.getString("DiaChi"), RS.getInt("Diem"));
                list.add(k);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public KhachHang findKH(String id) {
        try {
            String sql = " select * from khachhang where MaKH = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                KhachHang kh = new KhachHang(RS.getString("MaKH"), RS.getString("TenKhachHang"), RS.getString("GioiTinh"), RS.getString("NgaySinh"), RS.getString("sdt"), RS.getString("email"), RS.getString("DiaChi"), RS.getInt("Diem"));
                return kh;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateKH(KhachHang kh) {
        try {
            String sql = "update khachhang set TenKhachHang= '" + kh.getTenKH() + "', GioiTinh ='" + kh.getGioiTinh() + "', NgaySinh = '" + kh.getNgaySinh() + "',sdt='" + kh.getSdt() + "',email='" + kh.getEmail() + "',DiaChi = '" + kh.getDiaChi() + "',Diem = " + kh.getDiem() + " where MaKH= '" + kh.getMaKH() + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getDiemKH(String id) {
        try {
            String sql = " select Diem from khachhang where MaKH = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return RS.getInt("Diem");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }

    public boolean checkExitsKH(String id) {
        try {
            String sql = " select * from khachhang where MaKH = '" + id + "'";
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

    public String getNameKH(String id) {
        try {
            String sql = " select TenKhachHang from khachhang where MaKH = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return RS.getString("TenKhachHang");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return "";
    }
}
