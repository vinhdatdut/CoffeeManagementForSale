package Manager;

import Core.Bill;
import Core.Order;
import Core.Voucher;
import UI.DungDiem;
import UI.TinhTien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author VINH DAT
 */
public class ManagerOrder {

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

    public ArrayList<Order> findOrder(String ban) {
        try {
            ArrayList<Order> list = new ArrayList<>();
            String sql = " select * from orderDB where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            while (RS.next() == true) {
                Order order = new Order(RS.getString("ban"), RS.getString("TenMon"), RS.getDouble("SoLuong"));
                list.add(order);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public Order findOrderByBanAndTenMon(String ban, String foodname) {
        try {
            String sql = " select * from orderDB where ban = '" + ban + "' and TenMon ='" + foodname + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            Order order = null;
            if (RS.next() == true) {
                order = new Order(RS.getString("ban"), RS.getString("TenMon"), RS.getDouble("SoLuong"));
            }
            return order;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public boolean checkTableEmpty(String name) {
        try {
            String sql = " select * from orderDB where ban = '" + name + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return true;
    }

    public void addNewOrder(Order order) {
        try {
            String sql = "insert into orderDB values('" + order.getBan() + "','" + order.getTenMon() + "'," + order.getSoluong() + ")";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean HaveYetThisFoodInTable(String namefood, String ban) {
        try {
            String sql = " select * from orderDB where ban = '" + ban + "' and TenMon ='" + namefood + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return false;
    }

    public void deleteFood(String namefood, String ban) {
        try {
            String sql = " delete from orderDB where ban = '" + ban + "' and TenMon ='" + namefood + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteOrder(String ban) {
        try {
            String sql = " delete from orderDB where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateBanOrder(String banmoi, String bancu) {
        try {
            String sql = "update orderDB set ban= '" + banmoi + "' where ban= '" + bancu + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSoLuongOrder(Order o) {
        try {
            String sql = "update orderDB set SoLuong= '" + o.getSoluong() + "' where ban= '" + o.getBan() + "' and TenMon = '" + o.getTenMon() + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int countFoodInOrder(String ban) {
        try {
            int dem = 0;
            String sql = " select * from orderDB where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            while (RS.next() == true) {
                dem++;
            }
            return dem;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }

    public double getMoney(String ban) {
        try {
            int diem = 0;
            if (new DungDiem().checkHaveDiem()) {
                diem = Integer.parseInt(new DungDiem().readDiem());
            }
            ArrayList<Order> list = new ArrayList<>();
            String sql = " select * from orderDB inner join menu on orderDB.TenMon=menu.TenMon where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double tientong = 0;
            Voucher v = null;
            double tiengiam = 0;
            double giamtoida = 0;
            while (RS.next() == true) {
                double giam = 0;

                if (new TinhTien().checkHaveVoucher()) {
                    v = new ManagerVoucher().findVoucher(new TinhTien().readVoucher());
                    giam = v.getGiam();
                    giamtoida = v.getGiamtoida();
                }
                double tien = 0;
                tien = RS.getDouble("DonGia") * RS.getDouble("SoLuong");
                if (new TinhTien().checkHaveVoucher()) {
                    if (v.getApDung().equals("ALL")) {
                        tiengiam += tien * giam;
                    }
                    if (v.getApDung().equals("F")) {
                        if (RS.getString("MaMon").toString().charAt(0) == 'F') {
                            tiengiam += tien * giam;
                        }
                    }
                    if (v.getApDung().equals("B")) {
                        if (RS.getString("MaMon").toString().charAt(0) == 'B') {
                            tiengiam += tien * giam;
                        }
                    }
                }
                tientong += RS.getDouble("DonGia") * RS.getDouble("SoLuong");
            }
            if (giamtoida != 0) {
                if (tiengiam < giamtoida) {
                    return tientong - tiengiam - diem;
                }
                return tientong - giamtoida - diem;
            }
            return tientong - tiengiam - diem;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }
}
