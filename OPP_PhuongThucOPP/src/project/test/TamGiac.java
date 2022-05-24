package project.test;

import project.model.PhuongThucOPP;

public class TamGiac {

	public static void main(String[] args) {
		PhuongThucOPP tamgiac1= new PhuongThucOPP(12, 10, 15);
		System.out.println("Chu vi tam giác là "+tamgiac1.chuVi());
		System.out.println("Diện tích tam giác là "+ tamgiac1.dientich());
		
		//Lỗi vì phương thức nuaChuVi không được dùng bên ngoài hay nó sẽ không có ở bên ngoài để sử dụng
	//	System.out.println("Nửa chu vi là "+tamgiac1.nuaChuVi());
	}

}
