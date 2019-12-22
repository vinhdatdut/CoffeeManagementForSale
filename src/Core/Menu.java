package Core;

public class Menu {
	private String MaMon;
	private String TenMon;
	private double DonGia;
	private String ChuThich;
	public String getMaMon() {
		return MaMon;
	}
	public void setMaMon(String maMon) {
		MaMon = maMon;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	public String getChuThich() {
		return ChuThich;
	}
	public void setChuThich(String chuThich) {
		ChuThich = chuThich;
	}
	public Menu(String maMon, String tenMon, double donGia, String chuThich) {
		super();
		MaMon = maMon;
		TenMon = tenMon;
		DonGia = donGia;
		ChuThich = chuThich;
	}
	public Menu() {
		super();
	}
	
	
}
