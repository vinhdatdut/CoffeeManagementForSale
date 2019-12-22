package Core;

public class Order {
	private String ban;
	private String TenMon;
	private Double Soluong;
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
	public Order(String ban, String tenMon, Double soluong) {
		super();
		this.ban = ban;
		TenMon = tenMon;
		Soluong = soluong;
	}
	public Order() {
		super();
	}
	
}
