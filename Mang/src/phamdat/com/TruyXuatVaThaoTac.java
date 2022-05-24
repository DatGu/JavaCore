package phamdat.com;

import java.util.Scanner;

public class TruyXuatVaThaoTac {

	public static void main(String[] args) {
		int m[]= new int[5];
		//lấy độ dài của mảng
		int dodai= m.length;
		
		//Nhập Mảng
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< m.length; i++)
		{
			m[i]=sc.nextInt();
		}
		
		//Xuất mảng
		//1. Xuất thi chỉ số vị trí. i sẽ lấy theo chỉ số vị trí
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i]);
		}
		//2. Xuất mangt r theo giá trị. i sẽ lấy giá trị của từng phần tử trong mảng từ trái qua phải
		for (int i : m)
		{
			System.out.println(i);
		}

	}

}
