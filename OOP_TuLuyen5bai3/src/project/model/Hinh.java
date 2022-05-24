package project.model;

public abstract class Hinh {
	protected String mau;

	public Hinh(String mau) {
		super();
		this.mau = mau;
	}

	public Hinh() {
		super();
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}
	
	public abstract double dienTich();
	public abstract double chuVi();
	public abstract String thongTin();
}
