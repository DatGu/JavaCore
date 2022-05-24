package project.test;

import project.model.SinhVien;

public class OverloadingMethodTest {

	public static void main(String[] args) {
		//Contructor
		SinhVien sv1=new SinhVien(328, "Phạm Tiến Đạt", 10);
		
		//Method
		sv1.xetTotNghiep(10);
		sv1.xetTotNghiep();
		
		//parameter List
		System.out.println("Tổng 2 và 3 là "+sv1.sum(2,3));
		System.out.println("Tổng 2 và 3 và 5 và 6 là "+sv1.sum(2,3,5,6));

	}

}
