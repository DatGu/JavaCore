package phamdat.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tl4Bai1 {
	
	public static void Themsv(ArrayList<String> dssv) {
		System.out.println("Mời bạn thêm sinh viên ");
		String str= new Scanner(System.in).nextLine();
		dssv.add(str);
		System.out.println("Thêm thành công");
	}
	
	public static void Xuat(ArrayList<String> dssv)  {
		System.out.println("Danh sách sinh viên là ");
		for(String i: dssv) System.out.println(i);
		
	}

	public static void Suasv(ArrayList<String> dssv) {

		System.out.println("Nhập Sinh Viên Cần Sửa ");
		String tentim=new Scanner(System.in).nextLine();
		int vitri= dssv.indexOf(tentim);
		boolean ktra=false;
		do {
		if(vitri==-1) 
		{
			System.out.println("Không tìm thấy tên này.Mời bạn nhập lại");
			tentim=new Scanner(System.in).nextLine();
			vitri= dssv.indexOf(tentim);
			ktra=true;
		}
		}while(ktra==true);
		    System.out.println("Sửa thành");
		    String tensua=new Scanner(System.in).nextLine();
		    dssv.set(vitri, tensua);
		    System.out.println("Sửa thành công");
		
	}
	
	public static void Xoasv(ArrayList<String> dssv) {
		boolean ktra=false;
		System.out.println("Nhập Sinh Viên Cần Xóa ");
		String tentim=new Scanner(System.in).nextLine();
		int vitri= dssv.indexOf(tentim);
		do {
			if(vitri==-1) 
			{
				System.out.println("Không tìm thấy tên này.Mời bạn nhập lại");
				tentim=new Scanner(System.in).nextLine();
				vitri= dssv.indexOf(tentim);
				ktra=true;
			}
			}while(ktra==true);
	    dssv.remove(vitri);
		System.out.println("Xóa thành công");
	}
	
	public static void SapXep(ArrayList<String> dssv) {
		Collections.sort(dssv);		
	}
	
	public static void main(String[] args) {
		ArrayList<String> dssv =new ArrayList<String>();
		dssv.add("Phạm Tiến Đạt");
		dssv.add("Phạm Thị A");
		dssv.add("Nguyễn Văn A");
		Themsv(dssv);
		Xuat(dssv);
		Suasv(dssv);
		Xuat(dssv);
		Xoasv(dssv);
		Xuat(dssv);
		SapXep(dssv);
		Xuat(dssv);

	}

}
