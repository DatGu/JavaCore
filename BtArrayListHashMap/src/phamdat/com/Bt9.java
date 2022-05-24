package phamdat.com;

import java.util.HashMap;
import java.util.Scanner;

public class Bt9 {
	private static void them(HashMap dss) {
		boolean ktra=false;
		int ma;
		
		System.out.println("Mời bạn thêm sách");
		System.out.println("Mã : ");
		ma=new Scanner(System.in).nextInt();
		do {
	    ktra=false;
		if(dss.containsKey(ma)==true)
		{
			System.out.println("Bạn đã nhập sách với mã này rồi. Mời nhập lại");
			ma=new Scanner(System.in).nextInt();
			ktra=true;
		}
		}while(ktra==true);
		System.out.println("Tên sách: ");
		String ten= new Scanner(System.in).nextLine();
		dss.put(ma, ten);
	}
 

	public static void main(String[] args) {
		HashMap<Integer, String> dss=new HashMap<Integer, String>();
		dss.put(123, "Cuốn sách mã 123");
		dss.put(345, "Cuốn sách mã 345");
		dss.put(789, "Cuốn sách mã 789");
		them(dss);
		

	}

}
