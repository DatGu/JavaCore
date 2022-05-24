package project.model;

public class NhanVienChinhThuc extends NhanVien{

	public NhanVienChinhThuc(int id, String name) {
		super(id, name);
	}
	public void tinhLuong()
	{
		System.out.println("Lương nhân viên chính thức là 1500$");
	}

}
