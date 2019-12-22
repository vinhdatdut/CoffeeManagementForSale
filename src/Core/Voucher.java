package Core;

public class Voucher {
	private String Ma;
	private Double Giam;
	private String ApDung;
	private String NgayBatDau;
	private String NgayKetThuc;
        private Double giamtoida;
        private int solandung;
        private String dadung;
        private String thoidiemdung;

        public int getSolandung() {
            return solandung;
        }

        public void setSolandung(int solandung) {
            this.solandung = solandung;
        }

        public String getDadung() {
            return dadung;
        }

        public void setDadung(String dadung) {
            this.dadung = dadung;
        }

        public String getThoidiemdung() {
            return thoidiemdung;
        }

        public void setThoidiemdung(String thoidiemdung) {
            this.thoidiemdung = thoidiemdung;
        }

        public Double getGiamtoida() {
            return giamtoida;
        }

        public void setGiamtoida(Double giamtoida) {
            this.giamtoida = giamtoida;
        }

	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public Double getGiam() {
		return Giam;
	}
	public void setGiam(Double giam) {
		Giam = giam;
	}
	public String getApDung() {
		return ApDung;
	}
	public void setApDung(String apDung) {
		ApDung = apDung;
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

        public Voucher(String Ma, Double Giam, String ApDung, String NgayBatDau, String NgayKetThuc, Double giamtoida, int solandung, String dadung, String thoidiemdung) {
            this.Ma = Ma;
            this.Giam = Giam;
            this.ApDung = ApDung;
            this.NgayBatDau = NgayBatDau;
            this.NgayKetThuc = NgayKetThuc;
            this.giamtoida = giamtoida;
            this.solandung = solandung;
            this.dadung = dadung;
            this.thoidiemdung = thoidiemdung;
        }

	public Voucher() {
		super();
	}
	
}
