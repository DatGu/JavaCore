package phamdat.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Tl4Bai2 {
	
	public static void Themsv(HashMap dssv) {
		System.out.println("Mời bạn nhập tên sinh viên");
		String ten= new Scanner(System.in).nextLine();
		System.out.println("Mời bạn nhập mã của sinh viên đó");
		int ma= new Scanner(System.in).nextInt();
		boolean ktra=false;
		do {
			ktra=false;
			if(dssv.containsKey(ma)==true)
			{
				System.out.println("Bạn nhập mã trùng với một sinh viên khác rồi");
				System.out.println("Mời bạn nhập lại mã sv");
				ma= new Scanner(System.in).nextInt();
				ktra=true;
			}
			
		}while(ktra==true);
		dssv.put(ma, ten);
		System.out.println("Thêm Thành công");
	}

	public static void Xuatdssv(HashMap dssv) {
		System.out.println(dssv);
	}
	
	public static void Suasv(HashMap dssv) {
		System.out.println("Mời bạn nhập mã sv để sửa lại");
		int ma= new Scanner(System.in).nextInt();
		boolean ktra=false;
		do {
			ktra=false;
			if(dssv.containsKey(ma)==false)
				{
				System.out.println("Mã bạn nhập chưa có");
				System.out.println("Mời bạn nhập lại mã sv");
				ma= new Scanner(System.in).nextInt();
				ktra=true;
				}
			}while(ktra==true);
		System.out.println("Mời bạn nhập tên mới");
		String tenmoi= new Scanner(System.in).nextLine();
		dssv.replace(ma, tenmoi);
		System.out.println("Sửa thành công");
	}
	
	private static void Xoasv (HashMap dssv) {
		System.out.println("Mời bạn nhập mã sv cần xóa");
		int ma= new Scanner(System.in).nextInt();
		boolean ktra=false;
		do {
			ktra=false;
			if(dssv.containsKey(ma)==false)
				{
				System.out.println("Mã bạn nhập chưa có");
				System.out.println("Mời bạn nhập lại mã sv");
				ma= new Scanner(System.in).nextInt();
				ktra=true;
				}
			}while(ktra==true);
		dssv.remove(ma);
		System.out.println("Xóa thành công");
	}
	
	private static void Xuatten(HashMap dssv) {
		System.out.println(dssv.values());
	}
	
	private static void Xuatma(HashMap dssv) {
		System.out.println(dssv.keySet());
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> dssv= new HashMap<Integer, String>();
		dssv.put(121, "Phạm Tiến Đạt");
		dssv.put(344, "Nguyễn Thị A");
		dssv.put(543, "Phạm Văn A");
		dssv.put(645, "Đình Văn B");
		
		Themsv(dssv);
		Xuatdssv(dssv);
		Suasv(dssv);
		Xoasv(dssv);
		Xuatten(dssv);
		Xuatma(dssv);

	}

}
