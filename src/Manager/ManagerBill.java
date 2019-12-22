/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author VINH DAT
 */
public class ManagerBill {

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

    public void deleteBill(String ban) {
        try {
            String sql = " delete from bill where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Bill findBill(String ban) {
        try {
            String sql = " select * from bill where ban = '" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                Bill bill = new Bill(RS.getString("MaKhachHang"), RS.getString("ban"), RS.getString("ThoiGianVao"), RS.getString("ThoiGianRa"));
                return bill;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String TinhTien(String ban) {
        try {
            String kq = "";
            ArrayList<Order> list = new ArrayList<>();
            String sql = "select * from orderDB inner join menu on orderDB.TenMon=menu.TenMon where ban='" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            double tientong = 0;
            double tiengiam = 0;
            double giamtoida = 0;
            Voucher v = null;
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
                kq += RS.getString("TenMon") + " (" + RS.getString("DonGia") + "đ)\n";
                kq += "Số lượng: " + RS.getDouble("SoLuong") + "\n";
                kq += "Thành tiền: " + tien + "đ\n\n";
            }
            kq += "--------------------------------------------------\n";
            if (new TinhTien().checkHaveVoucher()) {
                kq += "Voucher : " + new TinhTien().readVoucher() + "\n";
                Voucher vo = new ManagerVoucher().findVoucher(new TinhTien().readVoucher());
                if (vo.getApDung().equals("ALL")) {
                    kq += "Giảm " + vo.getGiam() * 100 + "%" + " cho toàn bộ hóa đơn\n";
                    if (giamtoida == 0) {
                        kq += "Không giới hạn số tiền được giảm\n";
                    } else {
                        kq += "Giảm tối đa " + giamtoida + "đ\n";
                    }
                }
                if (vo.getApDung().equals("F")) {
                    kq += "Giảm " + v.getGiam() * 100 + "%" + " cho toàn bộ thức ăn\n";
                    if (giamtoida == 0) {
                        kq += "Không giới hạn số tiền được giảm\n";
                    } else {
                        kq += "Giảm tối đa " + giamtoida + "đ\n";
                    }
                }
                if (vo.getApDung().equals("B")) {
                    kq += "Giảm " + v.getGiam() * 100 + "%" + " cho toàn bộ thức uống\n";
                    if (giamtoida == 0) {
                        kq += "Không giới hạn số tiền được giảm\n";
                    } else {
                        kq += "Giảm tối đa " + giamtoida + "đ\n";
                    }
                }
                if (giamtoida == 0) {
                    kq += "-" + tiengiam + "đ\n";
                } else {
                    if (tiengiam < giamtoida) {
                        kq += "-" + tiengiam + "đ\n";
                    } else {
                        kq += "-" + giamtoida + "đ\n";
                    }
                }
                kq += "--------------------------------------------------\n";
            }
            int diem = 0;
            if (new DungDiem().checkHaveDiem()) {
                diem = Integer.parseInt(new DungDiem().readDiem());
                kq += " Đã sử dụng " + new DungDiem().readDiem() + " điểm tích lũy\n";
                kq += "--------------------------------------------------\n";
            }

            if (giamtoida == 0) {
                kq += "Tổng cộng: " + (tientong - tiengiam - diem) + "đ\n\n";
            } else {
                if (tiengiam < giamtoida) {
                    kq += "Tổng cộng: " + (tientong - tiengiam - diem) + "đ\n\n";
                } else {
                    kq += "Tổng cộng: " + (tientong - giamtoida - diem) + "đ\n\n";
                }
            }
            kq += "BLAS COFFEE xin chân thành cám ơn quý khách!\n";
            kq += "                 Hẹn gặp lại quý khách!";
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return "";
    }

    public void addNewBill(Bill bill) {
        try {
            String sql = "insert into bill(ban,ThoiGianVao) values('" + bill.getBan() + "','" + bill.getThoiGianVao() + "')";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateBanBill(String banmoi, String bancu) {
        try {
            String sql = "update bill set ban= '" + banmoi + "' where ban= '" + bancu + "'";
            Statement sta = getConnection().createStatement();
            sta.executeUpdate(sql);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDateTime(String ban) {
        try {
            String kq = "";
            ArrayList<Order> list = new ArrayList<>();
            String sql = "select ThoiGianVao from bill where ban='" + ban + "'";
            Statement sta = getConnection().createStatement();
            ResultSet RS = sta.executeQuery(sql);
            if (RS.next() == true) {
                return RS.getString("ThoiGianVao");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return "";
    }
}
