package Core;

public class KhachHang {
	private String MaKH;
	private String TenKH;
	private String GioiTinh;
	private String NgaySinh;
	private String sdt;
	private String email;
	private String DiaChi;
	private int diem;
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	public KhachHang(String maKH, String tenKH, String gioiTinh, String ngaySinh, String sdt, String email,
			String diaChi, int diem) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
		this.sdt = sdt;
		this.email = email;
		DiaChi = diaChi;
		this.diem = diem;
	}
	
	public KhachHang() {
	}
}
