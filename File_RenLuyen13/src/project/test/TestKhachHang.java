package project.test;

import java.util.ArrayList;
import java.util.Scanner;

import project.io.InOut;
import project.model.KhachHang;

public class TestKhachHang {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		ArrayList<KhachHang>dskh=new ArrayList<KhachHang>();
		boolean check=false;
		do {
			check=false;
			System.out.println("Mời bạn nhập thông tin khách hàng:");
			System.out.print("Mời bạn nhập mã khách hàng=");
			int ma=sc.nextInt();
			System.out.print("Mời bạn nhập họ tên khách Hàng=");
			String ten=sc2.nextLine();
			System.out.print("Mời bạn nhập năm sinh khách hàng=");
			int sinh=sc.nextInt();
			dskh.add(new KhachHang(ma, ten, sinh));
			System.out.println("Đã nhập xong thông tin khách hàng");
			System.out.println("Bạn có muốn nhập tiếp khách hàng khác???(c/k)");
			char ch=new Scanner(System.in).nextLine().charAt(0);
			if(ch=='c') check=true;
		}while(check);
		InOut.luuFile(dskh, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_RenLuyen13\\src\\project\\test\\data.txt");
		System.out.println("Lưu File thành công");
		ArrayList<KhachHang> dskhdoc=new ArrayList<KhachHang>();
		InOut.docFile(dskhdoc,"C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_RenLuyen13\\src\\project\\test\\\\data.txt" );
		System.out.println("Đọc File Thành Công");
		for(KhachHang kk:dskhdoc)
		{
			System.out.println(kk);
		}
	}

}
