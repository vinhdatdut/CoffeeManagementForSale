/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author VINH DAT
 */
public class DataShop {
    private double doanhthu;
    private double tienvoucher;
    private double giamtichluy;
    private int d;
    private int m;
    private int y;

    public DataShop() {
    }

    public DataShop(double doanhthu, double tienvoucher, double giamtichluy, int d, int m, int y) {
        this.doanhthu = doanhthu;
        this.tienvoucher = tienvoucher;
        this.giamtichluy = giamtichluy;
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }

    public double getTienvoucher() {
        return tienvoucher;
    }

    public void setTienvoucher(double tienvoucher) {
        this.tienvoucher = tienvoucher;
    }

    public double getGiamtichluy() {
        return giamtichluy;
    }

    public void setGiamtichluy(double giamtichluy) {
        this.giamtichluy = giamtichluy;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
}
