package project.test;

import project.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		//Tạo đối tượng sv1. Thực hiện contructor mặc định
		SinhVien sv1= new SinhVien();
		
		//Tạo đối tượng sv2. Thực hiện cótructor có đối số
		SinhVien sv2= new SinhVien("Phạm Huy Hoàng", 9.5);
		
		//gọi hàm get
		System.out.println(sv1.getHoTen() +" "+ sv1.getDiem());
		System.out.println(sv2.getHoTen() +" "+ sv2.getDiem());
		
		//Gọi hàm set
		sv1.setDiem(20);
		sv2.setDiem(19);
		
		//Gọi hàm toString
		System.out.println(sv1);
		System.out.println(sv2);

	}

}
