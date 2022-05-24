package baitap;

import java.util.Scanner;

public class Bai1 {

	public static int UCLN(int a, int b)
	{
		if(a==0||b==0) return a+b;
		while(a!=b)
		{
			if(a>b) a=a-b;
			if(a<b) b=b-a;
		}
		return a;
	}
	
	public static int BCNN(int a, int b)
	{
		int max=(a<b)?b:a;
		for(; ;max++)
		{
			if(max%a==0&&max%b==0) break;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Mời bạn nhập số thứ nhất =");
		int a=sc.nextInt();
		System.out.print("Mời bạn nhập số thứ hai =");
		int b=sc.nextInt();
		System.out.println("Ước chung lớn nhất của 2 số đó là "+UCLN(a,b));
		System.out.println("Bội chung nhỏ nhất của 2 số đó là "+BCNN(a,b));
	}

}
