package project.test;

import project.model.IWork;
import project.model.NhanVien;
import project.model.SinhVien;

public class WorkTesst {

	public static void main(String[] args) {
		//Tính đa hình kế thừa interface
		IWork a1;
		a1=new NhanVien();
		a1.work();
		System.out.println("----------------");
		a1=new SinhVien();
		a1.work();

	}

}
