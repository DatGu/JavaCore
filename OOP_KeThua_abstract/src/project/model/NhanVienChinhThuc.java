package project.model;

public class NhanVienChinhThuc extends NhanVien {

	
	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		
	}

	//Phải khai báo lại abstract method dù là không dùng 
	public void tinhLuong() {
		System.out.println("Đây là hàm tính lương được bắt buộc có từ lớp cha");
	}

}
