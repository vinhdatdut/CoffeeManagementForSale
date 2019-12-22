package Core;

public class Bill {
	private String MaKhachHang;
	private String ban;
	private String ThoiGianVao;
	private String ThoiGianRa;
	public String getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	public String getThoiGianVao() {
		return ThoiGianVao;
	}
	public void setThoiGianVao(String thoiGianVao) {
		ThoiGianVao = thoiGianVao;
	}
	public String getThoiGianRa() {
		return ThoiGianRa;
	}
	public void setThoiGianRa(String thoiGianRa) {
		ThoiGianRa = thoiGianRa;
	}
	public Bill(String maKhachHang, String ban, String thoiGianVao, String thoiGianRa) {
		super();
		MaKhachHang = maKhachHang;
		this.ban = ban;
		ThoiGianVao = thoiGianVao;
		ThoiGianRa = thoiGianRa;
	}
	public Bill() {
		super();
	}
	
	
}
