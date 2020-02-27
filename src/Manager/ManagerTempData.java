/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

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
public class ManagerTempData {

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

    public String getTempTable() {
        try {
            String sql = " select tempTable from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                String s = RS.getString("tempTable");
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public String getTempMon() {
        try {
            String sql = " select tempMon from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                String s = RS.getString("tempMon");
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getTempKH() {
        try {
            String sql = " select tempKH from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                String s = RS.getString("tempKH");
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getTempVoucher() {
        try {
            String sql = " select tempVoucher from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                String s = RS.getString("tempVoucher");
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getTempDiem() {
        try {
            String sql = " select tempDiem from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                String s = RS.getString("tempDiem");
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public boolean checkExitsKH() {
        try {
            String sql = " select tempKH from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                if(RS.getString("tempKH").equals("0")){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return true;
    }
    public boolean checkExitsVoucher() {
        try {
            String sql = " select tempVoucher from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                if(RS.getString("tempVoucher").equals("0")){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return true;
    }
    public boolean checkExitsDiem() {
        try {
            String sql = " select tempDiem from tempdata";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                if(RS.getString("tempDiem").equals("0")){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return true;
    }

    public void DeleteTemp() {
        try {
            String sql = " update tempdata set tempKH='0', tempVoucher='0',tempDiem=0";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public void writeTempTable(String s) {
        try {
            String sql = " update tempdata set tempTable = '" + s + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeTempKH(String s) {
        try {
            String sql = " update tempdata set tempKH = '" + s + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeTempMon(String s) {
        try {
            String sql = " update tempdata set tempMon = '" + s + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writeTempVoucher(String s) {
        try {
            String sql = " update tempdata set tempVoucher = '" + s + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writeTempDiem(String s) {
        try {
            String sql = " update tempdata set tempDiem = '" + s + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
