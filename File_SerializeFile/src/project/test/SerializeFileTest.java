package project.test;

import java.util.ArrayList;

import project.model.KhachHang;
import project.oi.SerializeFileFactory;

public class SerializeFileTest {

	public static void main(String[] args) {
		ArrayList<KhachHang> dskh=new ArrayList<KhachHang>();
		dskh.add(new KhachHang(1, "Phạm A"));
		dskh.add(new KhachHang(1, "Phạm B"));
		dskh.add(new KhachHang(1, "Phạm C"));
		dskh.add(new KhachHang(1, "Phạm D"));
		dskh.add(new KhachHang(1, "Phạm E"));
		SerializeFileFactory.luuFile(dskh, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_SerializeFile\\src\\project\\data.dat");
		System.out.println("Đã lưu file");
		Object datadoc=SerializeFileFactory.docFile("C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_SerializeFile\\src\\project\\data.dat");
		ArrayList<KhachHang> dskhdoc=(ArrayList<KhachHang>) datadoc;
		for(KhachHang kh:dskhdoc)
		{
			System.out.println(kh.getHoTen());
		}
	}

}
