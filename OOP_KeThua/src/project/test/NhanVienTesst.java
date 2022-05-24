package project.test;

import project.model.NhanVienChinhThuc;
import project.model.NhanVienThoiVu;

public class NhanVienTesst {

	public static void main(String[] args) {
		NhanVienChinhThuc ptd=new NhanVienChinhThuc(328, "Phạm Tiến Đạt");
		NhanVienThoiVu phh=new NhanVienThoiVu(123, "Phạm Huy Hoàng");
		ptd.tinhLuong();
		phh.tinhLuong();

	}

}
