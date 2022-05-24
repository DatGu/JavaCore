package project.test;

import project.model.NhanVienChinhThuc;
import project.model.NhanVienThoiVu;

public class NhanVienTest {

	public static void main(String[] args) {
		NhanVienChinhThuc ct=new NhanVienChinhThuc(328, "Phạm Tiến Đạt");
		NhanVienThoiVu tv=new NhanVienThoiVu(123, "Phạm Huy Hoàng");
		ct.tinhLuong();
		tv.tinhLuong();

	}

}
