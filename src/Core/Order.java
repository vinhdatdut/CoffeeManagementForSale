package Core;

public class Order {
	private String ban;
        private String mamon;
	private String TenMon;
	private Double Soluong;

        public String getMamon() {
            return mamon;
        }

        public void setMamon(String mamon) {
            this.mamon = mamon;
        }
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}
	public Double getSoluong() {
		return Soluong;
	}
	public void setSoluong(Double soluong) {
		Soluong = soluong;
	}
	public Order(String ban, String mamon, String tenMon, Double soluong) {
		super();
		this.ban = ban;
                this.mamon = mamon;
		TenMon = tenMon;
		Soluong = soluong;
	}
	public Order() {
		super();
	}
	
}
