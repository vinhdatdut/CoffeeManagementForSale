/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Core.DataShop;
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
public class ManagerDataShop {

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

    public void addNewDataShop(DataShop d) {
        try {
            String sql = "insert into datashop values(" + d.getDoanhthu() + "," + d.getTienvoucher() + "," + d.getGiamtichluy() + "," + d.getD() + "," + d.getM() + "," + d.getY() + ")";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DataShop findAll() {
        try {
            String sql = " select * from datashop";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double doanhthu = 0;
            double tienvoucher = 0;
            double giamtichluy = 0;
            while (RS.next() == true) {
                doanhthu += RS.getDouble("doanhthu");
                tienvoucher += RS.getDouble("tienvoucher");
                giamtichluy += RS.getDouble("giamtichluy");
            }
            DataShop d = new DataShop(doanhthu, tienvoucher, giamtichluy, 1999, 9, 4);
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public DataShop findAllByYear(int y) {
        try {
            String sql = " select * from datashop where y = " + y;
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double doanhthu = 0;
            double tienvoucher = 0;
            double giamtichluy = 0;
            while (RS.next() == true) {
                doanhthu += RS.getDouble("doanhthu");
                tienvoucher += RS.getDouble("tienvoucher");
                giamtichluy += RS.getDouble("giamtichluy");
            }
            DataShop d = new DataShop(doanhthu, tienvoucher, giamtichluy, 1999, 9, 4);
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public DataShop findAllByMonthYear(int m, int y) {
        try {
            String sql = " select * from datashop where y = " + y + " and m = " + m;
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double doanhthu = 0;
            double tienvoucher = 0;
            double giamtichluy = 0;
            while (RS.next() == true) {
                doanhthu += RS.getDouble("doanhthu");
                tienvoucher += RS.getDouble("tienvoucher");
                giamtichluy += RS.getDouble("giamtichluy");
            }
            DataShop d = new DataShop(doanhthu, tienvoucher, giamtichluy, 1999, 9, 4);
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public DataShop findAllByDayMonthYear(int d, int m, int y) {
        try {
            String sql = " select * from datashop where y = " + y + " and m = " + m + " and d = " + d;
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double doanhthu = 0;
            double tienvoucher = 0;
            double giamtichluy = 0;
            while (RS.next() == true) {
                doanhthu += RS.getDouble("doanhthu");
                tienvoucher += RS.getDouble("tienvoucher");
                giamtichluy += RS.getDouble("giamtichluy");
            }
            DataShop da = new DataShop(doanhthu, tienvoucher, giamtichluy, 1999, 9, 4);
            return da;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
}
