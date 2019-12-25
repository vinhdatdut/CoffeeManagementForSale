package Core;

public class Menu {
	private String MaMon;
	private String TenMon;
	private double DonGia;
	private String ChuThich;
        private int solandat;

        public int getSolandat() {
            return solandat;
        }

        public void setSolandat(int solandat) {
            this.solandat = solandat;
        }
        

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

        public Menu(String MaMon, String TenMon, double DonGia, String ChuThich, int solandat) {
            this.MaMon = MaMon;
            this.TenMon = TenMon;
            this.DonGia = DonGia;
            this.ChuThich = ChuThich;
            this.solandat = solandat;
        }
	
	public Menu() {
		super();
	}
	
	
}
