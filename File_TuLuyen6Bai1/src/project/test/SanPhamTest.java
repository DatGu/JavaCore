package project.test;

import java.util.ArrayList;
import java.util.Scanner;

import project.io.InOut;
import project.model.DanhMucSanPham;
import project.model.SanPham;

public class SanPhamTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		DanhMucSanPham QuanAo=new DanhMucSanPham(111, "Quần Áo");
		ArrayList<SanPham> QuanAoDoc=new ArrayList<SanPham>();
		boolean lap=false;
		do {
			System.out.println("Bạn muốn gì ");
			System.out.println("1.Add");
			System.out.println("21.Sửa Theo Mã");
			System.out.println("22.Sửa Theo Tên");
			System.out.println("31.Xóa Theo Mã");
			System.out.println("32.Xóa Theo Tên");
			System.out.println("41.Tìm Kiếm Theo Mã");
			System.out.println("42.Tìm Kiếm Theo Tên");
			System.out.println("51.Sắp Xếp Theo Mã");
			System.out.println("52.Sắp Xếp Theo Tên");
			System.out.println("6.Lưu File");
			System.out.println("7.Đọc File");
			System.out.println("Số khác>> Thoát");
			int hanhdong=sc.nextInt();
			switch(hanhdong)
			{
			case(1):
				System.out.print("Mời bạn nhập mã sản phẩm ");
				int ma=sc.nextInt();
				System.out.print("Mời bạn nhập tên sản phẩm ");
				String ten=sc2.nextLine();
				QuanAo.add(ma, ten);
				lap=true;
				break;
			case(21):
				System.out.println("Mời bạn nhập mã sản phẩm cần sửa");
				int ma1=sc.nextInt();
				QuanAo.suaTheoMa(ma1);
				lap=true;
				break;
			case(22):
				System.out.println("Mời bạn nhập tên sản phẩm cần sửa");
				String ten2=sc2.nextLine();
				QuanAo.suaTheoTen(ten2);
				lap=true;
				break;
			case(31):
				System.out.println("Mời bạn nhập mã sản phẩm cần xóa");
				int ma31=sc.nextInt();
				QuanAo.xoaSanPhamTheoMa(ma31);
				lap=true;
				break;
			case(32):
				System.out.println("Mời bạn nhập tên sản phẩm cần xóa");
				String ten32=sc2.nextLine();
				QuanAo.suaTheoTen(ten32);
				lap=true;
				break;
			case(41):
				System.out.println("Mời bạn nhập mã sản phẩm cần tìm");
				int ma41=sc2.nextInt();
				QuanAo.timSanPhamTheoMa(ma41);
				lap=true;
				break;
			case(42):
				System.out.println("Mời bạn nhập tên sản phẩm cần xóa");
				String ten42=sc2.nextLine();
				QuanAo.timSanPhamTheoTen(ten42);
				lap=true;
				break;
			case(51):
				QuanAo.sapXepTheoTen();
				lap=true;
				break;
			case(52):
				QuanAo.sapXepTheoMa();
				lap=true;
				break;
			case(6):
				InOut.luuFile(QuanAo.dssp, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_TuLuyen6Bai1\\src\\project\\io\\data.txt");
				lap=true;
				break;
			case(7):
				InOut.docFile(QuanAoDoc, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_TuLuyen6Bai1\\src\\project\\io\\data.txt");
				lap=true;
				break;
			default: 
				lap=false;
				System.out.println("BYEBYE");
			}
			
				
		}while(lap);
		
		
	
	}

}
