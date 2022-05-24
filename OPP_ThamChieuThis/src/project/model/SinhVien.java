package project.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	
	public SinhVien(String hoTen, double diem)
	{
		//This dùng để trỏ đến Instance variable, ví dụ là biến thuộc tính của hàm SinhVien
		/*Dùng để phân biệt giữa Instance variable (Biến ngoài hàm) 
		và local variable(Biến trong hàm, chỉ dùng được trong hàm) có cùng tên*/
		this.hoTen=hoTen;
		this.diem=diem;
	}

}
