package phamdat.com;

import java.util.Scanner;

public class UCLN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Mời bạn nhập số thứ nhất ");
		a= sc.nextInt();
		System.out.println("Mời bạn nhập số thứ hai ");
		b=sc.nextInt();
		while (a!=b)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		System.out.println("UCLN là "+ a);

	}

}
