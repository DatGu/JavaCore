package project.test;

import java.text.DecimalFormat;

import project.model.HinhChuNhat;
import project.model.HinhTron;
import project.model.HinhVuong;

public class KiemTraHinh {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#.##");
		HinhVuong hv=new HinhVuong("Đen", 3);
		System.out.println("Chu vi hình vuông là "+df.format(hv.chuVi()));
		System.out.println("Diện tích hình vuông là "+df.format(hv.dienTich()));
		System.out.println("Thông tin hình vuông là " +hv.thongTin());
		
		HinhChuNhat hcn=new HinhChuNhat("Đen", 3,4);
		System.out.println("Chu vi hình chữ nhật là "+df.format(hcn.chuVi()));
		System.out.println("Diện tích hình chữ nhật là "+df.format(hcn.dienTich()));
		System.out.println("Thông tin hình chữ nhật là " +hcn.thongTin());
		
		HinhTron ht=new HinhTron("Đen", 3);
		System.out.println("Chu vi hình tròn là "+df.format(ht.chuVi()));
		System.out.println("Diện tích hình tròn là "+df.format(ht.dienTich()));
		System.out.println("Thông tin hình tròn là " +ht.thongTin());
	}

}
