package project.model;

public class SinhVien implements IGiaiTri, IHocTap {
	private int ma;
	private String hoTen;
	
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

	public SinhVien(int ma, String hoTen) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
	}

	public void hocToan() {
		System.out.println("Hàm học toán kế thừa từ interface buộc phải có và khai báo lại");
		
	}

	public void hocVan() {
		System.out.println("Hàm học văn kế thừa từ interface buộc phải có và khai báo lại");		
	}

	public void choiGame() {
		System.out.println("Hàm chơi game kế thừa từ interface buộc phải có và khai báo lại");		
	}

	public void hatHo() {
		System.out.println("Hàm hát hò kế thừa từ interface buộc phải có và khai báo lại");		
	}
}
