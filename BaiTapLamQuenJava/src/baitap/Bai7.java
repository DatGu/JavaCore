package baitap;

import java.util.Scanner;

public class Bai7 {

	public static int fibonaci(int n)
	{
		if(n<=2) return 1;
		return fibonaci(n-1)+fibonaci(n-2);
	}
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập vị trí số Fibonaci cần tìm ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Số tạo vị trí đó là "+fibonaci(n));

	}

}
