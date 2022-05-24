package project.model;

public class SanPham implements Comparable<SanPham>{
	private int ma;
	private String ten;
	private int gia;
	public SanPham(int ma, String ten, int gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}
	public SanPham() {
		super();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	
	
	public String toString() {
		return "Mã "+this.ma+" Tên "+this.ten+" Giá "+this.gia;
	}
	@Override
	public int compareTo(SanPham o) {
		//So sánh tên tăng dần
	//	return this.ten.compareToIgnoreCase(o.ten);
		
		//So sánh tên giảm dần
	//	return this.ten.compareToIgnoreCase(o.ten)*-1;
		
		//So Sánh Giá
		if(this.gia< o.gia) return -1;
		if(this.gia >o.gia) return 1;
		return 0;
	}
}
