/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Core.Menu;
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
public class ManagerMenu {

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

    public ArrayList<Menu> findAllFood() {
        try {
            ArrayList<Menu> list = new ArrayList<>();
            String sql = " select * from menu";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            while (RS.next() == true) {
                Menu menu = new Menu(RS.getString("MaMon"), RS.getString("TenMon"), RS.getDouble("DonGia"), RS.getString("ChuThich"), RS.getInt("solandat"));
                list.add(menu);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public void addNewMenu(Menu m) {
        try {
            String sql = "insert into menu values('" + m.getMaMon() + "','" + m.getTenMon() + "'," + m.getDonGia() + ",'" + m.getChuThich() + "'," + m.getSolandat() + ")";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMenu(String id) {
        try {
            String sql = " delete from menu where MaMon = '" + id + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkExitsMenu(String id) {
        try {
            String sql = " select * from menu where MaMon = '" + id + "'";
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

    public void updateMenu(Menu m) {
        try {
            String sql = "update menu set TenMon= '" + m.getTenMon() + "', DonGia = " + m.getDonGia() + ", ChuThich = '" + m.getChuThich() + "', solandat = " + m.getSolandat() +" where MaMon= '" + m.getMaMon() + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Menu findMenu(String id) {
        try {
            String sql = " select * from menu where Mamon = '" + id + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                Menu m = new Menu(RS.getString("MaMon"), RS.getString("TenMon"), RS.getDouble("DonGia"), RS.getString("ChuThich"), RS.getInt("solandat"));
                return m;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
}
