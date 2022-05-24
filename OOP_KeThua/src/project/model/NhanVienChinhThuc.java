package project.model;

//Khai báo lớp NhanVienChinhThuc kế thừ từ lớp NhanVien
public class NhanVienChinhThuc extends NhanVien {
	//Các Contuctor không kế thừa nên ta cần gọi lại
	public NhanVienChinhThuc()
	{
		//Hàm super gọi lại hàm của lớp cha
		super();
	}
	public NhanVienChinhThuc(int ma, String ten)
	{
		super(ma,ten);
	}
	
	//Nếu không cần thêm hay sửa đổi gi thì ta không cần khai báo lại hàm tinhLuong
	public void tinhLuong() {
		// dùng từ khóa super để gọi về lớp cha
		super.tinhLuong();
		System.out.println("Đây là tính lương của nhân viên chính thức ");
	}
}
