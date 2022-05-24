package project.test;

import project.model.HinhChuNhat;
import project.model.HinhHoc;
import project.model.HinhVuong;

public class HinhHocTest {

	public static void main(String[] args) {
		//Tính đa hình theo kế thừa lớp
		HinhHoc h;
		h= new HinhChuNhat(4, 5);
		System.out.println("Chu Vi ="+h.chuVi());
		System.out.println("Diện Tích ="+h.dienTich());
		System.out.println("------------------------");
		h= new HinhVuong(5);
		System.out.println("Chu Vi ="+h.chuVi());
		System.out.println("Diện Tích ="+h.dienTich());

	}

}
