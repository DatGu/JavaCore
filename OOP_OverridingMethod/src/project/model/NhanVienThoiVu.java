package project.model;

public class NhanVienThoiVu extends NhanVien{

	public NhanVienThoiVu(int id, String name) {
		super(id, name);
	}
	public void tinhLuong()
	{
		System.out.println("Lương nhân viên thời vụ là 1000$");
	}
}
