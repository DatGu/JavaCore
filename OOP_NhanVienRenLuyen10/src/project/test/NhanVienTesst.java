package project.test;

import project.model.NhanVien;

public class NhanVienTesst {

	public static void main(String[] args) {
		NhanVien nv1 =new NhanVien("Phạm", "Đạt", 328);
		NhanVien nv2 =new NhanVien("Phạm", "Hoàng", 111);
		System.out.println("Số sản phẩm của nv1 lớn hơn nv2 là "+nv1.lonHon(nv2));
		if(nv1.lonHon(nv2)) System.out.println("Nhân viên 1 nhiều hơn Nhân Viên 2 "+(nv1.getSp()-nv2.getSp())+" Sản phẩm");
		else System.out.println("Nhân viên 2 nhiều hơn Nhân Viên 1 "+(nv2.getSp()-nv1.getSp())+" Sản phẩm");
	}

}
