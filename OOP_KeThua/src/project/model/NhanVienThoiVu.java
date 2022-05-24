package project.model;

public class NhanVienThoiVu extends NhanVien {
	public NhanVienThoiVu()
	{
		super();
	}
	public NhanVienThoiVu(int ma, String ten)
	{
		super(ma, ten);
	}
	
	//Nếu không cần thêm hay sửa đổi gi thì ta không cần khai báo lại hàm tinhLuong
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("Đây là tính lương cho nhân viên thời vụ");
	}
}
