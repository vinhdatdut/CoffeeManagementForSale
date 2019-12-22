package Core;

public class KM {
	private String Ma;
	private String TenKM;
	private String NgayBatDau;
	private String NgayKetThuc;
	private String DoiTuong;
	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public String getTenKM() {
		return TenKM;
	}
	public void setTenKM(String tenKM) {
		TenKM = tenKM;
	}
	public String getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(String ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}
	public String getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(String ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}
	public String getDoiTuong() {
		return DoiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		DoiTuong = doiTuong;
	}
	public KM(String ma, String tenKM, String ngayBatDau, String ngayKetThuc, String doiTuong) {
		super();
		Ma = ma;
		TenKM = tenKM;
		NgayBatDau = ngayBatDau;
		NgayKetThuc = ngayKetThuc;
		DoiTuong = doiTuong;
	}
	public KM() {
		super();
	}
	
	
}
