package project.model;

public class KhachHang {
	private int ma;
	private String hoTen;
	private int namSinh;
	public KhachHang(int ma, String hoTen, int namSinh) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}
	public KhachHang() {
		super();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	@Override
	public String toString() {
		return this.ma+";"+this.hoTen+";"+this.namSinh;
	}
}
